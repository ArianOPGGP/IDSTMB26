package clase_IDS_TM_B_2026;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		// TODO Auto-generated constructor stub.
		
		Image pog = Toolkit.getDefaultToolkit().getImage("Pog.png");
		
		this.setSize(500,500);//TAMAÑO VENTANA
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER PROGRAMA AL CERRAR
		this.setLocationRelativeTo(null);//PONER EN CENTRO
		this.setMinimumSize(new Dimension(500,500));//TAMAÑO MINIMO 
		this.setMaximumSize(new Dimension(500,500));//TAMAÑO MAXIMO
		this.setTitle("LOG IN");//TITULO DE LA VENTANA
		this.setBackground(Color.LIGHT_GRAY);
		this.setIconImage(pog);
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
		title_login.setOpaque(true);
		title_login.setLocation(68, 60);
		title_login.setBackground(new Color(15, 194, 6));
		title_login.setFont(new Font("Arial",Font.BOLD,50));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		title_login.setForeground(Color.BLACK);
		contenedor.add(title_login);
		
		JLabel usuario = new JLabel();
		usuario.setText("Usuario:");
		usuario.setSize(350, 30);
		usuario.setOpaque(true);
		usuario.setLocation(40, 140);
		usuario.setBackground(new Color(15, 194, 6));
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
		contra.setOpaque(true);
		contra.setLocation(40, 225);
		contra.setBackground(new Color(15, 194, 6));
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
		recordar.setOpaque(true);
		recordar.setLocation(40, 300);
		recordar.setBackground(new Color(15, 194, 6));
		recordar.setFont(new Font("Arial",Font.BOLD,10));
		recordar.setForeground(Color.BLACK);
		contenedor.add(recordar);
		
		JButton olvidar = new JButton();
		olvidar.setText("¿Has olvidado la contraseña?");
		olvidar.setLocation(260,300);
		olvidar.setSize(200,20);
		olvidar.setFont(new Font("Arial",Font.BOLD,10));
		olvidar.setHorizontalAlignment(JLabel.CENTER);
		olvidar.setBackground(new Color(15, 194, 6));
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
		
		
		this.setVisible(true);//VER VENTANA

		
	}

}
