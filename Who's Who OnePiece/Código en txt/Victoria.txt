package Juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Victoria extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static int Puntuacion;

	public Victoria() {

		//Obtenemos la puntuación y la convertimos en String para poder imprimirla en un JLabel.
		String Puntos = String.valueOf(Puntuacion);
		
		//Creación de la ventana y panel.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 100, 1754, 1118);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		System.out.println("Puntuación: "+Puntuacion);
		setResizable(false);
		setTitle("¿Quién parece quién? | OnePiece Edition");
		setVisible(true);

		//Casilla para mostrar la puntuación.
		JLabel Intentos = new JLabel("");
		Intentos.setForeground(Color.BLACK);
		Intentos.setBounds(1204, 646, 81, 83);
		Intentos.setFont(new Font("Impact", Font.PLAIN, 60));
		contentPane.add(Intentos);
		Intentos.setText(Puntos);

		//Fondo de la ventana.
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(Victoria.class.getResource("/Imagenes/Victoria.png")));
		Fondo.setBounds(0, -53, 1741, 1163);
		contentPane.add(Fondo);

		//Botón inferior para volver al inicio.
		JButton Volver = new JButton("");
		Volver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new VentanaInicio();
			}
		});
		Volver.setBounds(10, 1024, 1771, 55);
		contentPane.add(Volver);
		Volver.setOpaque(false);
		Volver.setContentAreaFilled(false);
		Volver.setBorderPainted(false);
	}
	//Setter creado para obtener la puntuación de la clase "VentanaJuego".
	public static void setPuntuacion(int puntuacion) {
		Puntuacion = puntuacion;
	}
}
