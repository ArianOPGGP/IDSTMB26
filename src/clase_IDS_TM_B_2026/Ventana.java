package clase_IDS_TM_B_2026;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		// TODO Auto-generated constructor stub.
		
		Image pog = Toolkit.getDefaultToolkit().getImage("Pog.png");
		
		this.setSize(1050,540);//TAMAÑO VENTANA
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER PROGRAMA AL CERRAR
		this.setLocationRelativeTo(null);//PONER EN CENTRO
		this.setMinimumSize(new Dimension(500,500));//TAMAÑO MINIMO 
		this.setMaximumSize(new Dimension(500,500));//TAMAÑO MAXIMO
		this.setTitle("LOG IN");//TITULO DE LA VENTANA
		this.setBackground(Color.LIGHT_GRAY);
		this.setIconImage(pog);
		this.setLayout(null);
		//this.setOpacity(100);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(new Color(15, 194, 6));
		contenedor.setSize(500,500);
		contenedor.setLocation(0, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_login = new JLabel();
		title_login.setText("Iniciar sesion");
		title_login.setSize(350, 50);
		title_login.setOpaque(false);
		title_login.setLocation(68, 60);
		title_login.setFont(new Font("Arial",Font.BOLD,50));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		title_login.setForeground(Color.BLACK);
		contenedor.add(title_login);
		
		JLabel usuario = new JLabel();
		usuario.setText("Usuario:");
		usuario.setSize(350, 30);
		usuario.setOpaque(false);
		usuario.setLocation(40, 140);
		usuario.setFont(new Font("Arial",Font.BOLD,20));
		usuario.setForeground(Color.BLACK);
		contenedor.add(usuario);
		
		JTextField username = new JTextField();
		username.setSize(400,30);
		username.setLocation(40, 175);
		username.setFont(new Font("Arial",Font.BOLD,26));
		contenedor.add(username);
		
		JLabel contra = new JLabel();
		contra.setText("Contraseña:");
		contra.setSize(350, 30);
		contra.setOpaque(false);
		contra.setLocation(40, 225);
		contra.setFont(new Font("Arial",Font.BOLD,20));
		contra.setForeground(Color.BLACK);
		contenedor.add(contra);
		
		JPasswordField contraseña = new JPasswordField();
		contraseña.setSize(400,30);
		contraseña.setLocation(40, 260);
		contraseña.setFont(new Font("Arial",Font.BOLD,26));
		contenedor.add(contraseña);
		
		JCheckBox recordar = new JCheckBox();
		recordar.setText("Recordarme");
		recordar.setSize(100,20);
		recordar.setOpaque(false);
		recordar.setLocation(40, 300);
		recordar.setFont(new Font("Arial",Font.BOLD,10));
		recordar.setForeground(Color.BLACK);
		contenedor.add(recordar);
		
		JButton olvidar = new JButton();
		olvidar.setText("¿Has olvidado la contraseña?");
		olvidar.setLocation(260,300);
		olvidar.setSize(200,20);
		olvidar.setFont(new Font("Arial",Font.BOLD,10));
		olvidar.setHorizontalAlignment(JLabel.CENTER);
		olvidar.setOpaque(false);
		olvidar.setBorderPainted(false);
		olvidar.setContentAreaFilled(false);
		olvidar.setForeground(Color.BLACK);
		contenedor.add(olvidar);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(170,350);
		acceder.setSize(160,50);
		acceder.setFont(new Font("Arial",Font.BOLD,29));
		acceder.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(acceder);
		
		JPanel register_contenedor = new JPanel();
		register_contenedor.setOpaque(true);
		register_contenedor.setBackground(new Color(3, 153, 56));
		register_contenedor.setSize(500,500);
		register_contenedor.setLocation(550, 0);
		register_contenedor.setLayout(null);
		this.add(register_contenedor);
		
		JLabel Regist = new JLabel();
		Regist.setText("Registro");
		Regist.setSize(350, 65);
		Regist.setOpaque(false);
		Regist.setLocation(68, 5);
		Regist.setFont(new Font("Arial",Font.BOLD,50));
		Regist.setHorizontalAlignment(JLabel.CENTER);
		Regist.setForeground(Color.BLACK);
		register_contenedor.add(Regist);
		
		JLabel usuario2 = new JLabel();
		usuario2.setText("Usuario:");
		usuario2.setSize(350, 30);
		usuario2.setOpaque(false);
		usuario2.setLocation(68, 60);
		usuario2.setFont(new Font("Arial",Font.BOLD,20));
		usuario2.setForeground(Color.BLACK);
		register_contenedor.add(usuario2);
		
		JTextField username2 = new JTextField();
		username2.setSize(350,30);
		username2.setLocation(68, 90);
		username2.setFont(new Font("Arial",Font.BOLD,26));
		register_contenedor.add(username2);
		
		JLabel bio_tag = new JLabel("Biografía");
		bio_tag.setBounds(68, 115, 350, 60);
		bio_tag.setOpaque(false);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setFont(new Font("Arial",Font.BOLD,30));
		bio_tag.setForeground(Color.BLACK);
		register_contenedor.add(bio_tag);
		
		JTextArea biogra = new JTextArea();
		biogra.setBounds(68, 170, 350, 100);
		register_contenedor.add(biogra);
		
		JLabel pref = new JLabel("Preferencias");
		pref.setBounds(68, 265, 350, 60);
		pref.setOpaque(false);
		pref.setHorizontalAlignment(JLabel.CENTER);
		pref.setFont(new Font("Arial",Font.BOLD,30));
		pref.setForeground(Color.BLACK);
		register_contenedor.add(pref);
		
		JCheckBox dulce_op = new JCheckBox("Dulce");
		dulce_op.setBounds(330, 308, 100, 20);
		dulce_op.setOpaque(false);
		dulce_op.setFont(new Font("Arial",Font.BOLD,10));
		dulce_op.setForeground(Color.BLACK);
		register_contenedor.add(dulce_op);
		
		JCheckBox salado_op = new JCheckBox("Salado");
		salado_op.setBounds(210, 308, 100, 20);
		salado_op.setOpaque(false);
		salado_op.setFont(new Font("Arial",Font.BOLD,10));
		salado_op.setForeground(Color.BLACK);
		register_contenedor.add(salado_op);
		
		JCheckBox salud_op = new JCheckBox("Saludable");
		salud_op.setBounds(90, 308, 100, 20);
		salud_op.setOpaque(false);
		salud_op.setFont(new Font("Arial",Font.BOLD,10));
		salud_op.setForeground(Color.BLACK);
		//salud_op.setBorderPainted(true);  PARA PONERLE BORDE
		//salud_op.setBorder(BorderFactory.createLineBorder(Color.RED));
		register_contenedor.add(salud_op);
		
		JLabel terminos = new JLabel("Términos");
		terminos.setBounds(68, 320, 350, 60);
		terminos.setOpaque(false);
		terminos.setHorizontalAlignment(JLabel.CENTER);
		terminos.setFont(new Font("Arial",Font.BOLD,30));
		terminos.setForeground(Color.BLACK);
		register_contenedor.add(terminos);
		
		JRadioButton accept_terms = new JRadioButton("Acepto los TyC");
		accept_terms.setBounds(98, 370, 200, 20);
		accept_terms.setOpaque(false);
		accept_terms.setForeground(Color.BLACK);
		register_contenedor.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("Rechazo los TyC");
		reject_terms.setBounds(269, 370, 200, 20);
		reject_terms.setOpaque(false);
		reject_terms.setForeground(Color.BLACK);
		register_contenedor.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(reject_terms);
		terms.add(accept_terms);
		
		String [] colonias = {"Camino real","La fuente","Villas del encanto"};
		
		JComboBox list = new JComboBox(colonias);
		list.setBounds(150, 410, 200, 20);
		register_contenedor.add(list);
		

		JButton crear = new JButton();
		crear.setText("Crear cuenta");
		crear.setLocation(135,440);
		crear.setSize(230,50);
		crear.setFont(new Font("Arial",Font.BOLD,29));
		crear.setHorizontalAlignment(JLabel.CENTER);
		register_contenedor.add(crear);
		
		this.setVisible(true);//VER VENTANA
		register_contenedor.repaint();
		
	}

}
