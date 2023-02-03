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

public class Guia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	Guia() {
		//Creación de la ventana y panel.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 100, 1781, 1176);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setTitle("¿Quién parece quién? | OnePiece Edition");
		setVisible(true);

		//Fondo de la ventana "Guía".
		JLabel FondoGuia = new JLabel("");
		FondoGuia.setIcon(new ImageIcon(Guia.class.getResource("/Imagenes/Guia.png")));
		FondoGuia.setBounds(-9, -35, 1797, 1185);
		contentPane.add(FondoGuia);

		//Botón para volver a la ventana inicial.
		JButton Volver = new JButton("New button");
		Volver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				new VentanaInicio();
			}
		});
		Volver.setBounds(10, 1093, 1755, 44);
		contentPane.add(Volver);
		Volver.setOpaque(false);
		Volver.setContentAreaFilled(false);
		Volver.setBorderPainted(false);
	}
}
