package Juego;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaJuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRespondeAqu;
	private static int Puntuación;
    
	public VentanaJuego() {
		
        new DB(); //Crea la base de datos, instanciándo los personajes y guardándolos(Se puede omitir en caso de no necesitar crear el fichero).
		
		Personajes X=  (Personajes) DB.getRandom();//Obtener un objeto aleatorio desde la base de datos con el método personalizado DB.getRandom (Casteado a la clase "Personajes").
		System.out.println(X); //Imprimir por consola el personaje aleatorio para comprobar que está correcto.

		//Creación de la ventana y panel.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 100, 1797, 1119);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setTitle("¿Quién parece quién? | OnePiece Edition");
		setVisible(true);

		//Casilla para responder, más adelante se le añade un evento.
		txtRespondeAqu = new JTextField();
		txtRespondeAqu.setBackground(Color.BLACK);
		txtRespondeAqu.setForeground(Color.RED);
		txtRespondeAqu.setFont(new Font("Dubai", Font.BOLD, 59));
		txtRespondeAqu.setHorizontalAlignment(SwingConstants.CENTER);
		txtRespondeAqu.setText("RESPONDE AQUÍ");
		txtRespondeAqu.setBounds(1275, 1000, 461, 85);
		contentPane.add(txtRespondeAqu);
		txtRespondeAqu.setColumns(10);
		txtRespondeAqu.setOpaque(false);
		txtRespondeAqu.setBorder(null);

		//Botón para reiniciar la partida (Elige otro personaje).
		JButton Reiniciar = new JButton("REINICIAR PARTIDA");
		Reiniciar.setBackground(new Color(102, 255, 255));
		Reiniciar.setFont(new Font("Dubai Medium", Font.BOLD, 26));
		Reiniciar.setBorderPainted(false);
		Reiniciar.addActionListener(new ActionListener() {//Evento que se dispara al clicar.
			public void actionPerformed(ActionEvent e) {
				dispose(); //Cierra la ventana.
				new VentanaJuego(); //Crea una nueva ventana del juego iniciando todo el proceso.
			}
		});
		Reiniciar.setBounds(-3, 0, 589, 31);
		contentPane.add(Reiniciar);

		//Botón para volver al menú inicial.
		JButton Volver = new JButton("VOLVER AL MENU DE INICIO");
		Volver.setBackground(Color.ORANGE);
		Volver.setFont(new Font("Dubai Medium", Font.BOLD, 28));
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new VentanaInicio();//Crea una nueva ventana de inicio.
			}
		});
		Volver.setBounds(581, 0, 533, 31);
		contentPane.add(Volver);
		Volver.setBorderPainted(false);
 
		//Botón para terminar el programa.
		JButton Terminar = new JButton("TERMINAR JUEGO");
		Terminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //Cierra la ventana y termina la aplicación.
			}
		});
		Terminar.setBackground(new Color(255, 0, 51));
		Terminar.setFont(new Font("Dubai Medium", Font.BOLD, 26));
		Terminar.setBounds(1093, 0, 688, 31);
		contentPane.add(Terminar);
		Terminar.setBorderPainted(false);

		//Botones para las preguntas.
		JButton Pregunta1 = new JButton("");
		Pregunta1.setFont(new Font("Dubai", Font.BOLD, 43));
		Pregunta1.setBackground(new Color(255, 255, 204));
		Pregunta1.setBounds(1225, 385, 523, 99);
		contentPane.add(Pregunta1);
		Pregunta1.setOpaque(false);//Método para hacer los botones transparentes.
		Pregunta1.setContentAreaFilled(false);
		Pregunta1.setBorderPainted(false);//Método para que los botones no tengan bordes.

		JButton Pregunta2 = new JButton("");
		Pregunta2.setFont(new Font("Dubai", Font.BOLD, 43));
		Pregunta2.setBackground(new Color(255, 255, 204));
		Pregunta2.setBounds(1225, 487, 523, 99);
		contentPane.add(Pregunta2);
		Pregunta2.setOpaque(false);
		Pregunta2.setContentAreaFilled(false);
		Pregunta2.setBorderPainted(false);

		JButton Pregunta3 = new JButton("");
		Pregunta3.setFont(new Font("Dubai", Font.BOLD, 43));
		Pregunta3.setBackground(new Color(255, 255, 204));
		Pregunta3.setBounds(1225, 583, 523, 92);
		contentPane.add(Pregunta3);
		Pregunta3.setOpaque(false);
		Pregunta3.setContentAreaFilled(false);
		Pregunta3.setBorderPainted(false);

		JButton Pregunta4 = new JButton("");
		Pregunta4.setFont(new Font("Dubai", Font.BOLD, 43));
		Pregunta4.setBackground(new Color(255, 255, 204));
		Pregunta4.setBounds(1225, 680, 523, 99);
		contentPane.add(Pregunta4);
		Pregunta4.setOpaque(false);
		Pregunta4.setContentAreaFilled(false);
		Pregunta4.setBorderPainted(false);

		JButton Pregunta5 = new JButton("");
		Pregunta5.setFont(new Font("Dubai", Font.BOLD, 43));
		Pregunta5.setBackground(new Color(255, 255, 204));
		Pregunta5.setBounds(1225, 785, 523, 92);
		contentPane.add(Pregunta5);
		Pregunta5.setOpaque(false);
		Pregunta5.setContentAreaFilled(false);
		Pregunta5.setBorderPainted(false);

		JButton Pregunta6 = new JButton("");
		Pregunta6.setFont(new Font("Dubai", Font.BOLD, 43));
		Pregunta6.setBackground(new Color(255, 255, 204));
		Pregunta6.setBounds(1225, 877, 523, 107);
		contentPane.add(Pregunta6);
		Pregunta6.setOpaque(false);
		Pregunta6.setContentAreaFilled(false);
		Pregunta6.setBorderPainted(false);

		JLabel Respuesta = new JLabel("");
		Respuesta.setForeground(Color.YELLOW);
		Respuesta.setBounds(1288, 273, 472, 119);
		Respuesta.setFont(new Font("Dubai", Font.BOLD, 80));
		contentPane.add(Respuesta);
		Respuesta.setOpaque(false);

		//Dibujos de cruz para tachar al clicar, son invisibles hasta que se se clicke en ellos.
		JLabel Cruz1 = new JLabel("");
		Cruz1.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz1.setBounds(94, 110, 248, 223);
		contentPane.add(Cruz1);
		Cruz1.setVisible(false);

		JLabel Cruz2 = new JLabel("");
		Cruz2.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz2.setBounds(398, 85, 248, 223);
		contentPane.add(Cruz2);
		Cruz2.setVisible(false);

		JLabel Cruz3 = new JLabel("");
		Cruz3.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz3.setBounds(741, 85, 248, 223);
		contentPane.add(Cruz3);
		Cruz3.setVisible(false);

		JLabel Cruz4 = new JLabel("");
		Cruz4.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz4.setBounds(82, 439, 248, 223);
		contentPane.add(Cruz4);
		Cruz4.setVisible(false);

		JLabel Cruz5 = new JLabel("");
		Cruz5.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz5.setBounds(425, 439, 248, 223);
		contentPane.add(Cruz5);
		Cruz5.setVisible(false);

		JLabel Cruz6 = new JLabel("");
		Cruz6.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz6.setBounds(741, 452, 248, 223);
		contentPane.add(Cruz6);
		Cruz6.setVisible(false);

		JLabel Cruz7 = new JLabel("");
		Cruz7.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz7.setBounds(82, 810, 248, 223);
		contentPane.add(Cruz7);
		Cruz7.setVisible(false);

		JLabel Cruz8 = new JLabel("");
		Cruz8.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz8.setBounds(400, 848, 225, 223);
		contentPane.add(Cruz8);
		Cruz8.setVisible(false);

		JLabel Cruz9 = new JLabel("");
		Cruz9.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Cruz.png")));
		Cruz9.setBounds(726, 825, 248, 223);
		contentPane.add(Cruz9);
		Cruz9.setVisible(false);

		
		//Botones para accionar al clicar las imagenes en cruz invisibles por defecto.
		JButton btnCruz1 = new JButton("");
		btnCruz1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz1.setVisible(true);//Al clicar la cruz se vuelve visible.
			}
		});

		btnCruz1.setBounds(131, 105, 182, 271);
		contentPane.add(btnCruz1);
		btnCruz1.setOpaque(false);
		btnCruz1.setContentAreaFilled(false);
		btnCruz1.setBorderPainted(false);

		JButton btnCruz2 = new JButton("");
		btnCruz2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz2.setVisible(true);
			}
		});
		btnCruz2.setBounds(437, 85, 149, 291);
		contentPane.add(btnCruz2);
		btnCruz2.setOpaque(false);
		btnCruz2.setContentAreaFilled(false);
		btnCruz2.setBorderPainted(false);

		JButton btnCruz3 = new JButton("");
		btnCruz3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz3.setVisible(true);
			}
		});
		btnCruz3.setBounds(785, 85, 142, 291);
		contentPane.add(btnCruz3);
		btnCruz3.setOpaque(false);
		btnCruz3.setContentAreaFilled(false);
		btnCruz3.setBorderPainted(false);

		JButton btnCruz4 = new JButton("");
		btnCruz4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz4.setVisible(true);
			}
		});
		btnCruz4.setBounds(117, 455, 158, 282);
		contentPane.add(btnCruz4);
		btnCruz4.setOpaque(false);
		btnCruz4.setContentAreaFilled(false);
		btnCruz4.setBorderPainted(false);

		JButton btnCruz5 = new JButton("");
		btnCruz5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz5.setVisible(true);
			}
		});
		btnCruz5.setBounds(418, 468, 240, 269);
		contentPane.add(btnCruz5);
		btnCruz5.setOpaque(false);
		btnCruz5.setContentAreaFilled(false);
		btnCruz5.setBorderPainted(false);

		JButton btnCruz6 = new JButton("");
		btnCruz6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz6.setVisible(true);
			}
		});
		btnCruz6.setBounds(785, 468, 142, 269);
		contentPane.add(btnCruz6);
		btnCruz6.setOpaque(false);
		btnCruz6.setContentAreaFilled(false);
		btnCruz6.setBorderPainted(false);

		JButton btnCruz7 = new JButton("");
		btnCruz7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz7.setVisible(true);
			}
		});
		btnCruz7.setBounds(117, 810, 158, 270);
		contentPane.add(btnCruz7);
		btnCruz7.setOpaque(false);
		btnCruz7.setContentAreaFilled(false);
		btnCruz7.setBorderPainted(false);

		JButton btnCruz8 = new JButton("");
		btnCruz8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz8.setVisible(true);
			}
		});
		btnCruz8.setBounds(398, 865, 205, 215);
		contentPane.add(btnCruz8);
		btnCruz8.setOpaque(false);
		btnCruz8.setContentAreaFilled(false);
		btnCruz8.setBorderPainted(false);

		JButton btnCruz9 = new JButton("");
		btnCruz9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cruz9.setVisible(true);
			}
		});
		btnCruz9.setBounds(725, 836, 225, 244);
		contentPane.add(btnCruz9);
		btnCruz9.setOpaque(false);
		btnCruz9.setContentAreaFilled(false);
		btnCruz9.setBorderPainted(false);

		//Imagen de fondo.
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(VentanaJuego.class.getResource("/Imagenes/Fondo.png")));
		Fondo.setHorizontalAlignment(SwingConstants.LEFT);
		Fondo.setBounds(7, 37, 1782, 1092);
		contentPane.add(Fondo);

		//Código que se acciona si se clica en los botones de las preguntas.
		Pregunta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (X.isHumano() == false) {  //Comprueba con un getter de la clase Personajes, si el personaje elegido es humano o no.
					Respuesta.setText("FALSO"); //Si no es humano en el panel de respuesta dibujará "FALSO" en caso contrario "VERDADERO".
				} else {
					Respuesta.setText("VERDADERO");
				}
				Puntuación = Puntuación + 1; // Al accionarse suma 1 a la puntuación.
				System.out.println(Puntuación); //Imprime en la consola la puntuación (para ver si está correcto).
			}
		});
		Pregunta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (X.isPoderes() == false) {
					Respuesta.setText("FALSO");
				} else {
					Respuesta.setText("VERDADERO");
				}
				Puntuación = Puntuación + 1;
				System.out.println(Puntuación);
			}
		});
		Pregunta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (X.isArmas() == false) {
					Respuesta.setText("FALSO");
				} else {
					Respuesta.setText("VERDADERO");
				}
				Puntuación = Puntuación + 1;
				System.out.println(Puntuación);
			}
		});
		Pregunta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (X.isMasculino() == false) {
					Respuesta.setText("FALSO");
				} else {
					Respuesta.setText("VERDADERO");
				}
				Puntuación = Puntuación + 1;
				System.out.println(Puntuación);
			}
		});
		Pregunta5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (X.isNadar() == false) {
					Respuesta.setText("FALSO");
				} else {
					Respuesta.setText("VERDADERO");
				}
				Puntuación = Puntuación + 1;
				System.out.println(Puntuación);
			}
		});
		Pregunta6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (X.isFuerte() == false) {
					Respuesta.setText("FALSO");
				} else {
					Respuesta.setText("VERDADERO");
				}
				Puntuación = Puntuación + 1;
				System.out.println(Puntuación);
			}
		});
		
		//Código que se ejecuta al pulsar "Enter" en la caja de respuestas.
		txtRespondeAqu.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) { //Hace que la acción que dispara el evento sea "Enter".
					if (txtRespondeAqu.getText().toUpperCase().equals(X.getNombre())) {//Comprueba si el texto de la caja tiene el mismo valor que el nombre del personaje elegido.
						dispose(); //Si es correcto cierra la ventana.
						Victoria.setPuntuacion(Puntuación); //Introduce la puntuación con un setter en la clase Victoria.
						new Victoria(); //Crea la ventana de Victoria.
						Puntuación = 0;//Resetea la puntuación.
					} else {
						Respuesta.setText("FALLASTE");//En caso de que no sea correcto imprime "FALLASTE" en el panel de respuesta.	
						Puntuación=Puntuación+2;
					}
				}
			}
		});
	}
}