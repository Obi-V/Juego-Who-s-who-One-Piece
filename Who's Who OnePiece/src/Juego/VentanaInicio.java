package Juego;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class VentanaInicio extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaInicio() {
		
		//Creación de la ventana y panel.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 100, 1797, 1158);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setTitle("¿Quién parece quién? | OnePiece Edition");
		setVisible(true);

		//Botón para empezar el juego.
		JButton Empezar = new JButton("");
		Empezar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();//Cierra la ventana.
				new VentanaJuego();//Crea la ventana de juego e inicia el proceso.
			}
		});
		Empezar.setBounds(724, 678, 355, 134);
		contentPane.add(Empezar);
		Empezar.setOpaque(false);
		Empezar.setContentAreaFilled(false);
		Empezar.setBorderPainted(false);

		//Fondo de la ventana.
		JLabel Inicio = new JLabel("");
		Inicio.setIcon(new ImageIcon(VentanaInicio.class.getResource("/Imagenes/Inicio.png")));
		Inicio.setBounds(-20, 0, 1801, 1159);
		contentPane.add(Inicio);

		//Botón de iniciar la ventana "Guía".
		JButton btnGuia = new JButton("");
		btnGuia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Guia();
			}
		});
		btnGuia.setBounds(816, 878, 145, 73);
		contentPane.add(btnGuia);
		btnGuia.setOpaque(false);
		btnGuia.setContentAreaFilled(false);
		btnGuia.setBorderPainted(false);
	}
}