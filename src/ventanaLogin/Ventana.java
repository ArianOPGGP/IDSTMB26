package ventanaLogin;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	protected static final Component NULL = null;

	public Ventana() 
	{		
		Image pog = Toolkit.getDefaultToolkit().getImage("Pog.png");
		
		this.setSize(1619,941);//TAMAÑO VENTANA
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER PROGRAMA AL CERRAR
		this.setLocationRelativeTo(null);//PONER EN CENTRO
		this.setMinimumSize(new Dimension(500,500));//TAMAÑO MINIMO 
		this.setMaximumSize(new Dimension(500,500));//TAMAÑO MAXIMO
		this.setTitle("LE VENTANA");//TITULO DE LA VENTANA
		//this.setBackground(Color.LIGHT_GRAY);
		this.setIconImage(pog);
		//this.getContentPane().setBackground(Color.decode(getName()));
		this.setLayout(null);
		//this.setOpacity(100);
				
		this.menu();
		this.router("login");
		//this.users();
		this.setVisible(true);//VER VENTANA					
	}
	
	public void login()
	{
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
		
		JLabel usuario_icon = new JLabel();
		usuario_icon.setOpaque(false);
		usuario_icon.setLocation(40, 175);
		usuario_icon.setSize(40,30);
		usuario_icon.setIcon(new ImageIcon(Ventana.class.getResource("/Imagenes/cuenta.png")));
		contenedor.add(usuario_icon);
		
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
		
		JLabel usuario_icon_contra = new JLabel();
		usuario_icon_contra.setOpaque(false);
		usuario_icon_contra.setLocation(40, 260);
		usuario_icon_contra.setSize(40,30);
		usuario_icon_contra.setIcon(new ImageIcon(Ventana.class.getResource("/Imagenes/cerrar-con-llave.png")));
		contenedor.add(usuario_icon_contra);
		
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
		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String username_val = username.getText();
				String contra_val = contraseña.getText();
				
				if (username_val.equals("")) {
					username.setBorder(BorderFactory.createLineBorder(Color.RED));
				}else {
					username.setBorder(BorderFactory.createLineBorder(Color.BLUE));
				}
				
				if (contra_val.equals("")) {
					contraseña.setBorder(BorderFactory.createLineBorder(Color.RED));
				}else {
					contraseña.setBorder(BorderFactory.createLineBorder(Color.BLUE));
				}
				if(username_val.equals("USUARIO") && contra_val.equals("CONTRITA")){
					JOptionPane.showMessageDialog(NULL, "Bienvenido",contra_val, JOptionPane.OK_OPTION);
				}else if(!username_val.equals("USUARIO") && !contra_val.equals("CONTRITA")){
					JOptionPane.showMessageDialog(NULL, "USUARIO O CONTRASEÑA INCORRECTOS",contra_val, JOptionPane.OK_OPTION);
				}
				
				
			}		
		});
		
		JButton registro = new JButton("Crear una cuenta");
		registro.setLocation(170,420);
		registro.setSize(160,50);
		registro.setFont(new Font("Arial",Font.BOLD,15));
		registro.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(registro);
		registro.addActionListener(e ->{
			this.router("registro");
		});
		
		JLabel logito = new JLabel();
		logito.setOpaque(false);
		logito.setLocation(100, 0);
		logito.setSize(1000,600);
		logito.setIcon(new ImageIcon(Ventana.class.getResource("/Imagenes/edificio-de-oficinas.png")));
		contenedor.add(logito);
		
	}
	
	public void registro()
	{
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
		
		JLabel cheki = new JLabel();
		cheki.setSize(350, 30);
		cheki.setOpaque(false);
		cheki.setLocation(80, 305);
		cheki.setHorizontalAlignment(JLabel.CENTER);
		register_contenedor.add(cheki);
		
		JLabel terminos = new JLabel("Términos");
		terminos.setBounds(68, 320, 350, 60);
		terminos.setOpaque(false);
		terminos.setHorizontalAlignment(JLabel.CENTER);
		terminos.setFont(new Font("Arial",Font.BOLD,30));
		terminos.setForeground(Color.BLACK);
		register_contenedor.add(terminos);
		
		JRadioButton accept_terms = new JRadioButton("Acepto los TyC");
		accept_terms.setBounds(98, 370, 120, 20);
		accept_terms.setOpaque(false);
		accept_terms.setForeground(Color.BLACK);
		register_contenedor.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("Rechazo los TyC");
		reject_terms.setBounds(269, 370, 120, 20);
		reject_terms.setOpaque(false);
		reject_terms.setForeground(Color.BLACK);
		register_contenedor.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(reject_terms);
		terms.add(accept_terms);
		
		JLabel cheki2 = new JLabel();
		cheki2.setSize(350, 30);
		cheki2.setOpaque(false);
		cheki2.setLocation(80, 365);
		cheki2.setHorizontalAlignment(JLabel.CENTER);
		register_contenedor.add(cheki2);
		
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
		
		final boolean[] prefers= {false};
		dulce_op.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				prefers[0]=true;
			}
			
		});
		
		salado_op.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				prefers[0]=true;
			}
			
		});
		
		salud_op.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				prefers[0]=true;
			}
			
		});
		
		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String username_val = username2.getText();
				String contra_val = biogra.getText();
				
				if (username_val.equals("")) {
					username2.setBorder(BorderFactory.createLineBorder(Color.RED));
				}else {
					username2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
				}
				
				if (contra_val.equals("")) {
					biogra.setBorder(BorderFactory.createLineBorder(Color.RED));
				}else {
					biogra.setBorder(BorderFactory.createLineBorder(Color.BLUE));
				}
				if (prefers[0]==false) {
					cheki.setBorder(BorderFactory.createLineBorder(Color.RED));

				}else {
					cheki.setBorder(BorderFactory.createLineBorder(Color.BLUE));
				}
				if (accept_terms.isSelected()) {
					cheki2.setBorder(BorderFactory.createLineBorder(Color.BLUE));

				}else {
					cheki2.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				
				
			}		
		});
	}
	
	public void users()
	{
		JPanel users = new JPanel();
		users.setSize(1000,500);
		users.setLocation(100, 50);
		users.setBackground(Color.WHITE);
		users.setLayout(null);
		this.add(users);
		
		JLabel users_title = new JLabel ("USUARIOS");
		users_title.setBounds(400, 30, 300, 40);
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setOpaque(true);
		users_title.setFont(new Font("Arial",Font.BOLD,40));
		users_title.setBackground(new Color(255, 172, 0));
		users.add(users_title);
		
		JButton export = new JButton("Exportar");
		export.setBounds(30, 120, 100, 40);
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(130, 120, 100, 40);
		users.add(add);
		
		Object [] table_head = {"No. contrl","Nombre","Apellidos","Semestre","Promedio","Acciones"};
		
		Object [][] table_content = 
		{
		        {"2023001","Juan","Pérez López","3","8.7","Editar"},
		        {"2023002","María","García Hernández","5","9.1","Editar"},
		        {"2023003","Carlos","Ramírez Torres","2","8.3","Editar"},
		        {"2023004","Ana","Martínez Cruz","6","9.5","Editar"},
		        {"2023005","Luis","Hernández Soto","1","8.9","Editar"},
		        {"2023006","Sofía","Morales Díaz","4","9.3","Editar"},
		        {"2023007","Diego","Castro Ruiz","2","7.8","Editar"},
		        {"2023008","Valeria","Ortega Méndez","3","9.0","Editar"},
		        {"2023009","Miguel","Navarro Campos","5","8.5","Editar"},
		        {"2023010","Fernanda","Ríos Delgado","6","9.7","Editar"},
		        {"2023011","Jorge","Vega Castillo","4","8.2","Editar"},
		        {"2023012","Camila","Paredes Núñez","1","9.4","Editar"},
		        {"2023013","Andrés","Silva Romero","3","7.9","Editar"},
		        {"2023014","Daniela","Cruz Herrera","2","8.8","Editar"},
		        {"2023015","Ricardo","Flores Medina","3","8.6","Editar"},
		        {"2023016","Paola","Guzmán Reyes","4","9.2","Editar"},
		        {"2023017","Emiliano","Mendoza Lara","2","7.7","Editar"},
		        {"2023018","Ximena","Salazar Peña","5","9.6","Editar"},
		        {"2023019","Brandon","Ibarra Sánchez","1","8.1","Editar"},
		        {"2023020","Natalia","Cortés Fuentes","6","9.8","Editar"},
		        {"2023021","Hugo","León Vargas","3","8.4","Editar"},
		        {"2023022","Renata","Escobar Molina","2","9.0","Editar"},
		        {"2023023","Iván","Aguilar Rojas","4","7.9","Editar"},
		        {"2023024","Lucía","Benítez Cárdenas","5","8.7","Editar"},
		        {"2023025","Alonso","Miranda Campos","1","8.3","Editar"},
		        {"2023026","Regina","Santos Cabrera","6","9.4","Editar"},
		        {"2023027","Gael","Domínguez Herrera","2","7.6","Editar"},
		        {"2023028","Elena","Valdez Márquez","3","9.1","Editar"},
		        {"2023029","Matías","Suárez Ponce","4","8.0","Editar"},
		        {"2023030","Diana","Chávez Lozano","5","9.5","Editar"},
		        {"2023031","Sebastián","Mejía Navarro","1","8.2","Editar"},
		        {"2023032","Carla","Ramos Silva","6","9.7","Editar"},
		        {"2023033","Fernando","Delgado Ortiz","3","7.8","Editar"},
		        {"2023034","Andrea","Prieto Castillo","4","8.9","Editar"},
		};
		
		JTable users_table = new JTable(table_content, table_head);
		JScrollPane scrollPane = new JScrollPane(users_table);
		scrollPane.setBounds(30, 170, 800, 200);
		//scrollPane.setBorder(BorderFactory.createLineBorder(Color.RED));
		users.add(scrollPane);
		
	}
	
	public void calculadora() {
		
		JPanel calc = new JPanel();
		calc.setSize(250,400);
		calc.setLocation(100, 50);
		calc.setBackground(Color.black);
		calc.setLayout(null);
		this.add(calc);
		
		JLabel calcu = new JLabel();
		calcu.setText("Calculadora:");
		calcu.setOpaque(false);
		calcu.setBounds(10, 7, 185, 30);
		calcu.setFont(new Font("Arial",Font.BOLD,20));
		calcu.setForeground(Color.white);
		calc.add(calcu);
		
		JTextField result = new JTextField();
		result.setBounds(10, 40, 230, 50);
		result.setFont(new Font("Arial",Font.BOLD,26));
		calc.add(result);
		
		JButton numcam = new JButton("+/-");
		numcam.setBounds(10, 340, 50, 50);
		numcam.setFont(new Font("Full-Width",Font.BOLD,20));
		numcam.setMargin(new Insets(2,2,2,2));
		calc.add(numcam);
		
		JButton num0 = new JButton("0");
		num0.setBounds(70, 340, 50, 50);
		num0.setFont(new Font("Full-Width",Font.BOLD,20));
		num0.setMargin(new Insets(2,2,2,2));
		calc.add(num0);
		
		JButton numpunt = new JButton(".");
		numpunt.setBounds(130, 340, 50, 50);
		numpunt.setFont(new Font("Full-Width",Font.BOLD,20));
		numpunt.setMargin(new Insets(2,2,2,2));
		calc.add(numpunt);

		JButton numigu = new JButton("=");
		numigu.setBounds(190, 340, 50, 50);
		numigu.setFont(new Font("Full-Width",Font.BOLD,20));
		numigu.setMargin(new Insets(2,2,2,2));
		numigu.setBackground(new Color(214, 79, 45));
		numigu.setForeground(Color.BLACK);
		calc.add(numigu);

		JButton num1 = new JButton("1");
		num1.setBounds(10, 280, 50, 50);
		num1.setFont(new Font("Full-Width",Font.BOLD,20));
		num1.setMargin(new Insets(2,2,2,2));
		calc.add(num1);
		
		JButton num2 = new JButton("2");
		num2.setBounds(70, 280, 50, 50);
		num2.setFont(new Font("Full-Width",Font.BOLD,20));
		num2.setMargin(new Insets(2,2,2,2));
		calc.add(num2);
		
		JButton num3 = new JButton("3");
		num3.setBounds(130, 280, 50, 50);
		num3.setFont(new Font("Full-Width",Font.BOLD,20));
		num3.setMargin(new Insets(2,2,2,2));
		calc.add(num3);

		JButton numas = new JButton("+");
		numas.setBounds(190, 280, 50, 50);
		numas.setFont(new Font("Full-Width",Font.BOLD,20));
		numas.setMargin(new Insets(2,2,2,2));
		calc.add(numas);
		
		JButton num4 = new JButton("4");
		num4.setBounds(10, 220, 50, 50);
		num4.setFont(new Font("Full-Width",Font.BOLD,20));
		num4.setMargin(new Insets(2,2,2,2));
		calc.add(num4);
		
		JButton num5 = new JButton("5");
		num5.setBounds(70, 220, 50, 50);
		num5.setFont(new Font("Full-Width",Font.BOLD,20));
		num5.setMargin(new Insets(2,2,2,2));
		calc.add(num5);
		
		JButton num6 = new JButton("6");
		num6.setBounds(130, 220, 50, 50);
		num6.setFont(new Font("Full-Width",Font.BOLD,20));
		num6.setMargin(new Insets(2,2,2,2));
		calc.add(num6);

		JButton numens = new JButton("-");
		numens.setBounds(190, 220, 50, 50);
		numens.setFont(new Font("Full-Width",Font.BOLD,20));
		numens.setMargin(new Insets(2,2,2,2));
		calc.add(numens);
		
		JButton num7 = new JButton("7");
		num7.setBounds(10, 160, 50, 50);
		num7.setFont(new Font("Full-Width",Font.BOLD,20));
		num7.setMargin(new Insets(2,2,2,2));
		calc.add(num7);
		
		JButton num8 = new JButton("8");
		num8.setBounds(70, 160, 50, 50);
		num8.setFont(new Font("Full-Width",Font.BOLD,20));
		num8.setMargin(new Insets(2,2,2,2));
		calc.add(num8);
		
		JButton num9 = new JButton("9");
		num9.setBounds(130, 160, 50, 50);
		num9.setFont(new Font("Full-Width",Font.BOLD,20));
		num9.setMargin(new Insets(2,2,2,2));
		calc.add(num9);

		JButton numpor = new JButton("X");
		numpor.setBounds(190, 160, 50, 50);
		numpor.setFont(new Font("Full-Width",Font.BOLD,20));
		numpor.setMargin(new Insets(2,2,2,2));
		calc.add(numpor);
		
		JButton numC = new JButton("C");
		numC.setBounds(10, 100, 170, 50);
		numC.setBackground(new Color(95, 205, 217));
		numC.setFont(new Font("Full-Width",Font.BOLD,20));
		numC.setMargin(new Insets(2,2,2,2));
		numC.setForeground(Color.BLACK);
		calc.add(numC);

		JButton numdiv = new JButton("÷");
		numdiv.setBounds(190, 100, 50, 50);
		numdiv.setFont(new Font("Full-Width",Font.BOLD,20));
		numdiv.setMargin(new Insets(2,2,2,2));
		calc.add(numdiv);
		
		
	}
	
	public void calculadora2() {
		
		JPanel calc2 = new JPanel();
		calc2.setSize(250,400);
		calc2.setBackground(Color.black);
		calc2.setLayout(new BorderLayout(5,5));
		this.add(calc2);
		
		JPanel center_panel = new JPanel(); 
		center_panel.setLayout(new GridLayout(4,3,5,5));	
		center_panel.setBackground(Color.black);

		JButton num7 = new JButton("7");
		num7.setFont(new Font("Full-Width",Font.BOLD,20));
		num7.setMargin(new Insets(2,2,2,2));
		center_panel.add(num7);
		
		JButton num8 = new JButton("8");
		num8.setFont(new Font("Full-Width",Font.BOLD,20));
		num8.setMargin(new Insets(2,2,2,2));
		center_panel.add(num8);
		
		JButton num9 = new JButton("9");
		num9.setFont(new Font("Full-Width",Font.BOLD,20));
		num9.setMargin(new Insets(2,2,2,2));
		center_panel.add(num9);
		
		JButton num4 = new JButton("4");
		num4.setFont(new Font("Full-Width",Font.BOLD,20));
		num4.setMargin(new Insets(2,2,2,2));
		center_panel.add(num4);
		
		JButton num5 = new JButton("5");
		num5.setFont(new Font("Full-Width",Font.BOLD,20));
		num5.setMargin(new Insets(2,2,2,2));
		center_panel.add(num5);
		
		JButton num6 = new JButton("6");
		num6.setFont(new Font("Full-Width",Font.BOLD,20));
		num6.setMargin(new Insets(2,2,2,2));
		center_panel.add(num6);
		
		JButton num1 = new JButton("1");
		num1.setFont(new Font("Full-Width",Font.BOLD,20));
		num1.setMargin(new Insets(2,2,2,2));
		center_panel.add(num1);
		
		JButton num2 = new JButton("2");
		num2.setFont(new Font("Full-Width",Font.BOLD,20));
		num2.setMargin(new Insets(2,2,2,2));
		center_panel.add(num2);
		
		JButton num3 = new JButton("3");
		num3.setFont(new Font("Full-Width",Font.BOLD,20));
		num3.setMargin(new Insets(2,2,2,2));
		center_panel.add(num3);

		JButton numcam = new JButton("+/-");
		numcam.setFont(new Font("Full-Width",Font.BOLD,20));
		numcam.setMargin(new Insets(2,2,2,2));
		center_panel.add(numcam);
		
		JButton num0 = new JButton("0");
		num0.setFont(new Font("Full-Width",Font.BOLD,20));
		num0.setMargin(new Insets(2,2,2,2));
		center_panel.add(num0);
		
		JButton numpunt = new JButton(".");
		numpunt.setFont(new Font("Full-Width",Font.BOLD,20));
		numpunt.setMargin(new Insets(2,2,2,2));
		center_panel.add(numpunt);
		
		JPanel end_panel = new JPanel();
		end_panel.setLayout(new GridLayout(4,1,5,5));
		end_panel.setBackground(Color.black);

		JButton numpor = new JButton("       X       ");
		numpor.setFont(new Font("Full-Width",Font.BOLD,20));
		numpor.setMargin(new Insets(2,2,2,2));
		end_panel.add(numpor);
		
		JButton numens = new JButton("-");
		numens.setFont(new Font("Full-Width",Font.BOLD,20));
		numens.setMargin(new Insets(2,2,2,2));
		end_panel.add(numens);
		
		JButton numas = new JButton("+");
		numas.setFont(new Font("Full-Width",Font.BOLD,20));
		numas.setMargin(new Insets(2,2,2,2));
		end_panel.add(numas);		
		
		JButton numigu = new JButton("=");
		numigu.setFont(new Font("Full-Width",Font.BOLD,20));
		numigu.setMargin(new Insets(2,2,2,2));
		numigu.setBackground(new Color(214, 79, 45));
		numigu.setForeground(Color.BLACK);
		end_panel.add(numigu);
		
		JPanel ariba_panel = new JPanel();
		ariba_panel.setLayout(new GridLayout(2,1));
		ariba_panel.setBackground(Color.black);
		JPanel nort_panel = new JPanel(); 
		nort_panel.setLayout(new FlowLayout(0,3,2));
		nort_panel.setBackground(Color.black);
		
		JTextField resultado = new JTextField("0.00");
		resultado.setFont(new Font("Arial",Font.BOLD,26));
		resultado.setHorizontalAlignment(JTextField.RIGHT);
		ariba_panel.add(resultado);
		
		JButton numc = new JButton("       "
				+ "MC"
				+ "       ");
		numc.setFont(new Font("Full-Width",Font.BOLD,20));
		numc.setMargin(new Insets(2,2,2,2));
		nort_panel.add(numc);		
		
		JButton nummmas = new JButton("       "
				+ "M+"
				+ "       ");
		nummmas.setFont(new Font("Full-Width",Font.BOLD,20));
		nummmas.setMargin(new Insets(2,2,2,2));
		nort_panel.add(nummmas);		
		
		JButton numC = new JButton("       "
				+ "C"
				+ "       ");
		numC.setBackground(new Color(95, 205, 217));
		numC.setFont(new Font("Full-Width",Font.BOLD,20));
		numC.setMargin(new Insets(2,2,2,2));
		numC.setForeground(Color.BLACK);
		nort_panel.add(numC);

		JButton numdiv = new JButton("       "
				+ "÷"
				+ "       ");
		numdiv.setFont(new Font("Full-Width",Font.BOLD,20));
		numdiv.setMargin(new Insets(2,2,2,2));
		nort_panel.add(numdiv);
		
		ariba_panel.add(nort_panel);
		
		calc2.add(ariba_panel,BorderLayout.NORTH);
		calc2.add(center_panel,BorderLayout.CENTER);
		calc2.add(end_panel,BorderLayout.EAST);

	}
	
	public void taxes() {
		
		JPanel taxi = new JPanel();
		taxi.setSize(250,400);
		taxi.setBackground(Color.white);
		taxi.setLayout(new BorderLayout(30,30));
		this.add(taxi);
		
		JPanel top_panel_taxi = new JPanel();
		top_panel_taxi.setLayout(new FlowLayout());
		top_panel_taxi.setAlignmentX(LEFT_ALIGNMENT);
		
		JLabel interes = new JLabel("InteréS");
		interes.setOpaque(false);
		interes.setFont(new Font("Arial",Font.BOLD,30));
		interes.setForeground(Color.BLACK);
		interes.setAlignmentX(LEFT_ALIGNMENT);
		top_panel_taxi.add(interes);
				
		JPanel center_panel_taxi = new JPanel(); 
		center_panel_taxi.setLayout(new BorderLayout(5,5));
		center_panel_taxi.setBackground(new Color(39, 245, 87));
		
		JPanel center_center_panel_taxi = new JPanel(); 
		center_center_panel_taxi.setLayout(new GridLayout(3,2,5,5));
		
		JLabel capital = new JLabel("Capital: ");
		capital.setOpaque(false);
		capital.setFont(new Font("Arial",Font.BOLD,15));
		capital.setForeground(Color.BLACK);
		center_center_panel_taxi.add(capital);
		
		JTextField capital_result = new JTextField("1500     ");
		capital_result.setFont(new Font("Arial",Font.BOLD,26));
		center_center_panel_taxi.add(capital_result);
		
		JLabel tiempo = new JLabel("Tiempo: ");
		tiempo.setOpaque(false);
		tiempo.setFont(new Font("Arial",Font.BOLD,15));
		tiempo.setForeground(Color.BLACK);
		center_center_panel_taxi.add(tiempo);
		
		JTextField tiempo_result = new JTextField("2        ");
		tiempo_result.setFont(new Font("Arial",Font.BOLD,26));
		center_center_panel_taxi.add(tiempo_result);
		
		JLabel tasa = new JLabel("Tasa interés: ");
		tasa.setOpaque(false);
		tasa.setFont(new Font("Arial",Font.BOLD,15));
		tasa.setForeground(Color.BLACK);
		center_center_panel_taxi.add(tasa);
		
		JTextField tasa_result = new JTextField("0.1      ");
		tasa_result.setFont(new Font("Arial",Font.BOLD,26));
		center_center_panel_taxi.add(tasa_result);
		
		JPanel calc_interes_panel = new JPanel();
		calc_interes_panel.setLayout(new FlowLayout());
		
		JLabel calcular_interes = new JLabel("Calcular Interés ");
		interes.setOpaque(false);
		interes.setFont(new Font("Arial",Font.BOLD,15));
		interes.setForeground(Color.BLACK);
		calc_interes_panel.add(calcular_interes);
		
		JPanel boton_interes_panel = new JPanel();
		boton_interes_panel.setLayout(new FlowLayout(1,30,10));
		
		JButton calcular = new JButton("Calcular");
		calcular.setFont(new Font("Full-Width",Font.BOLD,20));
		calcular.setMargin(new Insets(2,2,2,2));
		boton_interes_panel.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Full-Width",Font.BOLD,20));
		cancelar.setMargin(new Insets(2,2,2,2));
		boton_interes_panel.add(cancelar);
		
		center_panel_taxi.add(calc_interes_panel,BorderLayout.NORTH);
		center_panel_taxi.add(center_center_panel_taxi,BorderLayout.CENTER);
		center_panel_taxi.add(boton_interes_panel,BorderLayout.SOUTH);
		
		
		JPanel south_panel_taxi = new JPanel();
		south_panel_taxi.setLayout(new GridLayout(2,1,5,5));
		south_panel_taxi.setBackground(new Color(222, 0, 62));
		
		JPanel interes_panel = new JPanel();
		interes_panel.setLayout(new FlowLayout());
		
		JLabel interes_total = new JLabel("Interés: ");
		interes_total.setOpaque(false);
		interes_total.setFont(new Font("Arial",Font.BOLD,15));
		interes_total.setForeground(Color.BLACK);
		interes_panel.add(interes_total);
		
		JTextField interes_total_result = new JTextField("315.00002");
		interes_total_result.setFont(new Font("Arial",Font.BOLD,26));
		interes_panel.add(interes_total_result);
		
		JPanel monto_panel = new JPanel();
		monto_panel.setLayout(new FlowLayout());
		
		JLabel monto_total = new JLabel("Monto: ");
		monto_total.setOpaque(false);
		monto_total.setFont(new Font("Arial",Font.BOLD,15));
		monto_total.setForeground(Color.BLACK);
		monto_panel.add(monto_total);
		
		JTextField monto_total_result = new JTextField("1815.00002");
		monto_total_result.setFont(new Font("Arial",Font.BOLD,26));
		monto_panel.add(monto_total_result);
		
		south_panel_taxi.add(interes_panel,BorderLayout.NORTH);
		south_panel_taxi.add(monto_panel,BorderLayout.SOUTH);
		
		taxi.add(top_panel_taxi,BorderLayout.NORTH);
		taxi.add(center_panel_taxi,BorderLayout.CENTER);
		taxi.add(south_panel_taxi,BorderLayout.SOUTH);
		
	}
	
	public void pintar() {
		
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.drawLine(0, 0, 100, 100);
                
                g2d.setColor(Color.RED);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawLine(200, 200, 400, 200);
                g2d.drawRect(250, 250, 100, 100);
                
                g2d.setColor(Color.GREEN);
                g2d.drawOval(150, 100, 70, 70);
                
                g2d.setColor(Color.BLUE);
                g2d.setStroke(new BasicStroke(5));
                g2d.drawArc(300, 100, 100, 100, 90, 90);
                g2d.drawPolygon(new int[] {200,100,300}, new int[] {100,300,300}, 3);
                
                g2d.setColor(Color.ORANGE);
                g2d.fillRect(150, 250, 50, 150);
                g2d.fillOval(100, 40, 65, 77);
                
                g2d.setColor(Color.RED);
                g2d.fillArc(200, 50, 80, 90, -50, 160);
                
                g2d.fillPolygon(new int[] {30,50,80,74,20}, new int[] {20,80,70,85,100}, 5);
                
                BufferedImage image;
				try {
					image = ImageIO.read(new File("src/Imagenes/naturaleza.png"));
					g2d.drawImage(image, 300, 100, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
            }
        };
        
        pane.setBounds(0, 0, 700, 500);
        this.add(pane);
		
	}
	
	public void pintar2() {
		
		
		JPanel casa = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.setColor(new Color(39, 166, 245));//CIELO
                g2d.fillRect(0, 0, 700, 600);
                
                g2d.setColor(new Color(34, 122, 16));//PASTO
                g2d.fillPolygon(new int[] {0,0,700,700}, new int[] {550,600,600,550},4);
                
                g2d.setColor(new Color(33, 8, 204));//CASA
                g2d.fillPolygon(new int[] {50,50,650,650}, new int[] {200,550,550,200},4);

                g2d.setColor(new Color(255, 255, 255));//VENTANA
                g2d.fillPolygon(new int[] {350,350,550,550}, new int[] {300,450,450,300},4);
                
                g2d.setColor(new Color(39, 166, 245, 100));//VENTANA AZULITA
                g2d.fillPolygon(new int[] {350,350,550,550}, new int[] {300,450,450,300},4);
                
                g2d.setColor(new Color(145, 95, 52));//MARCO VENTANA
                g2d.setStroke(new BasicStroke(5));
                g2d.drawPolygon(new int[] {350, 350, 550, 550}, new int[] {300, 450, 450, 300}, 4);
                g2d.drawLine(450, 300, 450, 450);
                g2d.drawLine(350, 375, 550, 375);
                
                g2d.setColor(new Color(189, 72, 72));//CHIMENEA
                g2d.fillPolygon(new int[] {120,120,200,200}, new int[] {50,200,200,50},4);
                g2d.fillPolygon(new int[] {100,100,220,220}, new int[] {30,50,50,30},4);
                
                g2d.setColor(new Color(186, 32, 32));//TECHO
                g2d.fillPolygon(new int[] {20,350,680}, new int[] {200,50,200},3);
                
                g2d.setColor(new Color(92, 61, 17));//TRONCO
                g2d.fillPolygon(new int[] {600,650,650,600}, new int[] {300,300,550,550},4);
                
                g2d.setColor(new Color(12, 117, 38));//HOJAS
                g2d.fillArc(600, 200, 150, 150, 0, 360);
                g2d.fillArc(500, 200, 150, 150, 0, 360);
                g2d.fillArc(550, 120, 150, 150, 0, 360);
                
                g2d.setStroke(new BasicStroke(1));
                for (int x = 2; x < 690; x += 25) { //FOR PARA HACER LA VALLA
                	g2d.setColor(new Color(160, 120, 90));
                    g2d.fillRect(x, 470, 20, 80);
                    
                    g2d.fillPolygon(new int[] {x,x+10,x+20}, new int[] {470,460,470},3);
                } 
                
            	g2d.setColor(new Color(160, 90, 90));
                g2d.fillRect(0, 490, 700, 5); // MADERA HORIZONTAL ARRIBA
                g2d.fillRect(0, 520, 700, 5); // MADERA HORIZONTAL ABAJO
                
                g2d.setColor(new Color(145, 95, 52));//PUERTA
                g2d.fillPolygon(new int[] {100,100,250,250}, new int[] {300,550,550,300},4);
                
                g2d.setColor(new Color(255, 238, 0));//PERILLA
                g2d.fillArc(120, 425, 10, 10, 0, 360);
                
                g2d.setColor(new Color(255, 255, 0));//SOL
                g2d.fillArc(-30, -30, 100, 100, 0, 360);

		
            }
		};
		casa.setBounds(0, 0, 700, 600);
		this.add(casa);
	}
	
	public void router(String target) {
		//String origin = "";
		
		this.getContentPane().removeAll();
		
		if(target.equals("login"))
			this.login();
		
		if(target.equals("registro"))
			this.registro();
		
		if(target.equals("recovery"))
			this.recovery();
		
		if(target.equals("alta"))
			this.alta();
		
		if(target.equals("baja"))
			this.baja();
		
		if(target.equals("consultar"))
			this.consultar();
		
		if(target.equals("usuario_como"))
			this.usuario_como();
		
		if(target.equals("acceder_como"))
			this.acceder_como();
		
		if(target.equals("contra_olvida"))
			this.contra_olvida();
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
		
	}
	
	public void mario() {
		
		JPanel reino = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(new Color(179, 238, 254));//CIELO
                g2d.fillRect(0, 0, 1600, 900);
                
                g2d.setColor(new Color(253, 145, 99));//CUBO
                g2d.fillRect(270,100,100,100);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRect(270, 100, 100, 100);
                g2d.fillArc(275, 105, 7, 7, 0, 360);
                g2d.fillArc(360, 105, 7, 7, 0, 360);
                g2d.fillArc(275, 190, 7, 7, 0, 360);
                g2d.fillArc(360, 190, 7, 7, 0, 360);

                g2d.setColor(new Color(253, 145, 99));//CUBO
                g2d.fillRect(370,100,100,100);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRect(370, 100, 100, 100);
                g2d.fillArc(375, 105, 7, 7, 0, 360);
                g2d.fillArc(460, 105, 7, 7, 0, 360);
                g2d.fillArc(375, 190, 7, 7, 0, 360);
                g2d.fillArc(460, 190, 7, 7, 0, 360);
                
                g2d.setColor(new Color(253, 145, 99));//CUBO
                g2d.fillRect(80,320,100,100);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRect(80, 320, 100, 100);
                g2d.fillArc(85, 325, 7, 7, 0, 360);
                g2d.fillArc(170, 325, 7, 7, 0, 360);
                g2d.fillArc(85, 410, 7, 7, 0, 360);
                g2d.fillArc(170, 410, 7, 7, 0, 360);
                
                g2d.setColor(new Color(253, 145, 99));//CUBO
                g2d.fillRect(1450,200,100,100);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRect(1450, 200, 100, 100);
                g2d.fillArc(1455, 205, 7, 7, 0, 360);
                g2d.fillArc(1540, 205, 7, 7, 0, 360);
                g2d.fillArc(1455, 290, 7, 7, 0, 360);
                g2d.fillArc(1540, 290, 7, 7, 0, 360);

                
                g2d.setColor(new Color(252, 197, 190));//PISO
                g2d.setStroke(new BasicStroke(1));
                g2d.fillRect(0, 800, 1600, 100);
                g2d.setColor(new Color(233, 149, 121));
                g2d.setStroke(new BasicStroke(1));
                g2d.fillRect(0, 820, 1600, 100);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRect(-10, 800, 1620, 20);
                g2d.setStroke(new BasicStroke(4));
                g2d.setColor(new Color(0, 0, 0));
                for (int x = 10,z = 70; x < 16200; x += 50,z +=50) { //FOR PARA RALLAS DEL PISO
                	g2d.drawLine(x, 830, z, 890);
                }
                
                g2d.setColor(new Color(132, 192, 255));//OBSTACULOS
                g2d.setStroke(new BasicStroke(1));
                g2d.fillRect(570, 310, 300, 490);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRect(570, 310, 300, 490);
                g2d.fillRect(870, 360, 50, 440);
                g2d.setColor(new Color(181, 198, 208));
                g2d.setStroke(new BasicStroke(1));
                g2d.fillArc(575, 315, 30, 30, 0, 360);
                g2d.fillArc(835, 315, 30, 30, 0, 360);
                
                g2d.setColor(new Color(255, 195, 184));//OBSTACULOS
                g2d.setStroke(new BasicStroke(1));
                g2d.fillRect(370, 520, 300, 280);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRect(370, 520, 300, 280);
                g2d.fillRect(670, 570, 50, 230);
                g2d.setColor(new Color(181, 198, 208));
                g2d.setStroke(new BasicStroke(1));
                g2d.fillArc(375, 525, 30, 30, 0, 360);
                g2d.fillArc(635, 525, 30, 30, 0, 360);
                g2d.fillArc(375, 765, 30, 30, 0, 360);
                g2d.fillArc(635, 765, 30, 30, 0, 360);
                
                g2d.setColor(new Color(81, 217, 107));//OBSTACULOS
                g2d.setStroke(new BasicStroke(1));
                g2d.fillRect(1380, 520, 300, 280);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRect(1380, 520, 300, 280);
                g2d.setColor(new Color(181, 198, 208));
                g2d.setStroke(new BasicStroke(1));
                g2d.fillArc(1385, 525, 30, 30, 0, 360);
                g2d.fillArc(1385, 765, 30, 30, 0, 360);
                
                g2d.setColor(new Color(91, 207, 110));//ARBOL
                g2d.fillArc(50, 650, 100, 100, 0, 360);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawArc(50, 650, 100, 100, 0, 360);
                g2d.setColor(new Color(91, 207, 110));
                g2d.setStroke(new BasicStroke(1));
                g2d.fillPolygon(new int[] {20, 20, 100, 180, 180}, new int[] {800, 700, 750, 700, 800}, 5);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawPolygon(new int[] {20, 20, 100, 180, 180}, new int[] {800, 700, 750, 700, 800}, 5);
                
                g2d.setColor(new Color(26, 134, 23));//TUBERIA
                g2d.fillRoundRect(1060, 520, 200, 100, 50, 50);
                g2d.fillRect(1080, 620, 160, 180);
                g2d.setColor(new Color(0, 0, 0));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawRect(1080, 620, 160, 180);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawRoundRect(1060, 520, 200, 100, 50, 50);
                
                g2d.setColor(new Color(255, 255, 255));//NUBE
                g2d.fillArc(1050, 150, 100, 100, 0, 360);
                g2d.fillArc(1100, 150, 100, 100, 0, 360);
                g2d.fillArc(1150, 150, 100, 100, 0, 360);

                BufferedImage image;
				try {
					image = ImageIO.read(new File("src/Imagenes/mario.png"));
					g2d.drawImage(image, 820, 615,150,200, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				BufferedImage image_2;
				try {
					image_2 = ImageIO.read(new File("src/Imagenes/pirana.png"));
					g2d.drawImage(image_2, 1086, 325,150,200, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedImage image_3;
				try {
					image_3 = ImageIO.read(new File("src/Imagenes/signo-de-interrogacion.png"));
					g2d.drawImage(image_3, 270, 100,100,100, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
		};
		reino.setBounds(0, 0, 1600, 900);
		this.add(reino);
	}
	
	public void recovery() {
		
		JPanel contenedor_recovery = new JPanel();
		contenedor_recovery.setOpaque(true);
		contenedor_recovery.setBackground(new Color(15, 194, 6));
		contenedor_recovery.setSize(500,500);
		contenedor_recovery.setLocation(0, 0);
		contenedor_recovery.setLayout(null);
		this.add(contenedor_recovery);
						
		JLabel lblTitulo = new JLabel("Recuperar Cuenta");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setBounds(140, 50, 250, 30);
		contenedor_recovery.add(lblTitulo);

		JTextArea txtInstrucciones = new JTextArea("Ingresa tu correo electrónico y te enviaremos las instrucciones para recuperar tu contraseña.");
		txtInstrucciones.setForeground(Color.BLACK);
		txtInstrucciones.setFont(new Font("Arial", Font.PLAIN, 14));
		txtInstrucciones.setBounds(85, 100, 330, 40);
		txtInstrucciones.setOpaque(false);     
		txtInstrucciones.setEditable(false);   
		txtInstrucciones.setFocusable(false);
		txtInstrucciones.setLineWrap(true);
		txtInstrucciones.setWrapStyleWord(true); 
		contenedor_recovery.add(txtInstrucciones);

		JLabel lblCorreo = new JLabel("Correo Electrónico:");
		lblCorreo.setForeground(Color.BLACK);
		lblCorreo.setFont(new Font("Arial", Font.BOLD, 14));
		lblCorreo.setBounds(100, 180, 300, 20);
		contenedor_recovery.add(lblCorreo);

		JTextField txtCorreo = new JTextField();
		txtCorreo.setBounds(100, 210, 300, 35);
		contenedor_recovery.add(txtCorreo);

		JButton btnEnviar = new JButton("Enviar Enlace de Recuperación");
		btnEnviar.setFont(new Font("Arial", Font.BOLD, 14));
		btnEnviar.setBounds(100, 280, 300, 40);
		contenedor_recovery.add(btnEnviar);

	}
	
	public void alta() {
			
			JPanel contenedor_alta = new JPanel();
			contenedor_alta.setOpaque(true);
			contenedor_alta.setBackground(new Color(15, 194, 6));
			contenedor_alta.setSize(500,500);
			contenedor_alta.setLocation(0, 0);
			contenedor_alta.setLayout(null);
			this.add(contenedor_alta);

			JLabel lblTitulo = new JLabel("Alta de Nuevo Usuario");
			lblTitulo.setForeground(Color.WHITE);
			lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
			lblTitulo.setBounds(100, 20, 300, 30);
			contenedor_alta.add(lblTitulo);
			
			JLabel lblUsuario = new JLabel("Nombre de usuario:");
			lblUsuario.setForeground(Color.WHITE);
			lblUsuario.setFont(new Font("Arial", Font.BOLD, 14));
			lblUsuario.setBounds(40, 70, 200, 20);
			contenedor_alta.add(lblUsuario);
			
			JTextField txtUsuario = new JTextField();
			txtUsuario.setBounds(40, 95, 220, 30);
			contenedor_alta.add(txtUsuario);
			
			JLabel lblPassword = new JLabel("Contraseña:");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
			lblPassword.setBounds(40, 135, 200, 20);
			contenedor_alta.add(lblPassword);
			
			JPasswordField txtPassword = new JPasswordField();
			txtPassword.setBounds(40, 160, 220, 30);
			contenedor_alta.add(txtPassword);
			
			JLabel lblCorreo = new JLabel("Correo electrónico:");
			lblCorreo.setForeground(Color.WHITE);
			lblCorreo.setFont(new Font("Arial", Font.BOLD, 14));
			lblCorreo.setBounds(40, 200, 200, 20);
			contenedor_alta.add(lblCorreo);
			
			JTextField txtCorreo = new JTextField();
			txtCorreo.setBounds(40, 225, 220, 30);
			contenedor_alta.add(txtCorreo);
			
			JLabel lblDescripcion = new JLabel("Breve descripción:");
			lblDescripcion.setForeground(Color.WHITE);
			lblDescripcion.setFont(new Font("Arial", Font.BOLD, 14));
			lblDescripcion.setBounds(40, 265, 200, 20);
			contenedor_alta.add(lblDescripcion);
			
			JTextArea txtDescripcion = new JTextArea();
			txtDescripcion.setLineWrap(true);
			txtDescripcion.setWrapStyleWord(true);
			JScrollPane scrollDescripcion = new JScrollPane(txtDescripcion);
			scrollDescripcion.setBounds(40, 290, 220, 80);
			contenedor_alta.add(scrollDescripcion);
			
			JLabel lblFotoTexto = new JLabel("Foto de perfil");
			lblFotoTexto.setForeground(Color.WHITE);
			lblFotoTexto.setFont(new Font("Arial", Font.BOLD, 14));
			lblFotoTexto.setBounds(310, 70, 140, 20);
			contenedor_alta.add(lblFotoTexto);
			
			JLabel lblEspacioFoto = new JLabel("Sin imagen");
			lblEspacioFoto.setOpaque(true);
			lblEspacioFoto.setBackground(Color.LIGHT_GRAY);
			lblEspacioFoto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
			lblEspacioFoto.setBounds(310, 95, 140, 160);
			contenedor_alta.add(lblEspacioFoto);
			
			JButton btnSubirFoto = new JButton("Subir Foto");
			btnSubirFoto.setBounds(320, 265, 120, 30);
			contenedor_alta.add(btnSubirFoto);
			
			JButton btnRegistrar = new JButton("Registrar Usuario");
			btnRegistrar.setFont(new Font("Arial", Font.BOLD, 14));
			btnRegistrar.setBounds(150, 400, 200, 40);
			contenedor_alta.add(btnRegistrar);
							

		}

	public void baja() {
		
		JPanel contenedor_baja = new JPanel();
		contenedor_baja.setOpaque(true);
		contenedor_baja.setBackground(new Color(15, 194, 6));
		contenedor_baja.setSize(500,500);
		contenedor_baja.setLocation(0, 0);
		contenedor_baja.setLayout(null);
		this.add(contenedor_baja);
						
		JLabel lblTituloBaja = new JLabel("Dar de Baja Usuario");
		lblTituloBaja.setForeground(Color.WHITE);
		lblTituloBaja.setFont(new Font("Arial", Font.BOLD, 22));
		lblTituloBaja.setBounds(100, 30, 300, 30);
		contenedor_baja.add(lblTituloBaja);
		
		JLabel lblUsuarioBaja = new JLabel("Ingresa el Nombre de Usuario o Num. Control:");
		lblUsuarioBaja.setForeground(Color.WHITE);
		lblUsuarioBaja.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsuarioBaja.setBounds(75, 90, 350, 20);
		contenedor_baja.add(lblUsuarioBaja);
		
		JTextField txtUsuarioBaja = new JTextField();
		txtUsuarioBaja.setBounds(75, 115, 350, 35);
		contenedor_baja.add(txtUsuarioBaja);
		
		JLabel lblMotivo = new JLabel("Motivo de la baja (Opcional):");
		lblMotivo.setForeground(Color.WHITE);
		lblMotivo.setFont(new Font("Arial", Font.BOLD, 14));
		lblMotivo.setBounds(75, 170, 350, 20);
		contenedor_baja.add(lblMotivo);
		
		JTextArea txtMotivo = new JTextArea();
		txtMotivo.setLineWrap(true);
		txtMotivo.setWrapStyleWord(true);
		JScrollPane scrollMotivo = new JScrollPane(txtMotivo);
		scrollMotivo.setBounds(75, 195, 350, 80);
		contenedor_baja.add(scrollMotivo);
		
		JTextArea txtAdvertencia = new JTextArea("¡Atención! Al dar de baja a este usuario, todos sus datos serán eliminados del sistema permanentemente. Esta acción no se puede deshacer.");
		txtAdvertencia.setForeground(Color.YELLOW);
		txtAdvertencia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		txtAdvertencia.setBounds(75, 300, 350, 50);
		txtAdvertencia.setOpaque(false);
		txtAdvertencia.setEditable(false);
		txtAdvertencia.setFocusable(false);
		txtAdvertencia.setLineWrap(true);
		txtAdvertencia.setWrapStyleWord(true);
		contenedor_baja.add(txtAdvertencia);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCancelar.setBounds(75, 380, 150, 40);
		contenedor_baja.add(btnCancelar);
		
		JButton btnConfirmarBaja = new JButton("Confirmar Baja");
		btnConfirmarBaja.setFont(new Font("Arial", Font.BOLD, 14));
		btnConfirmarBaja.setForeground(Color.RED);
		btnConfirmarBaja.setBounds(275, 380, 150, 40);
		contenedor_baja.add(btnConfirmarBaja);
	}
	
	public void consultar() {
			
			JPanel contenedor_consultar = new JPanel();
			contenedor_consultar.setOpaque(true);
			contenedor_consultar.setBackground(new Color(15, 194, 6));
			contenedor_consultar.setSize(500,500);
			contenedor_consultar.setLocation(0, 0);
			contenedor_consultar.setLayout(null);
			this.add(contenedor_consultar);

			JLabel lblTituloBuscar = new JLabel("Búsqueda de Usuarios");
			lblTituloBuscar.setForeground(Color.WHITE);
			lblTituloBuscar.setFont(new Font("Arial", Font.BOLD, 22));
			lblTituloBuscar.setBounds(100, 20, 300, 30);
			contenedor_consultar.add(lblTituloBuscar);

			JLabel lblCriterio = new JLabel("Ingresa nombre o número de control:");
			lblCriterio.setForeground(Color.WHITE);
			lblCriterio.setFont(new Font("Arial", Font.BOLD, 14));
			lblCriterio.setBounds(50, 70, 300, 20);
			contenedor_consultar.add(lblCriterio);

			JTextField txtBuscar = new JTextField();
			txtBuscar.setBounds(50, 95, 270, 30);
			contenedor_consultar.add(txtBuscar);

			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setFont(new Font("Arial", Font.BOLD, 12));
			btnBuscar.setBounds(330, 95, 120, 30);
			contenedor_consultar.add(btnBuscar);

			String[] columnasBusqueda = {"Num Control", "Usuario", "Correo", "Estado"};

			Object[][] datosBusqueda = {
			    {"10191823", "Zuma", "zuma@sistema.com", "Activo"},
			    {"80195823", "Ari", "ari@sistema.com", "Activo"},
			    {"83191323", "Rodri", "rodri@sistema.com", "Inactivo"},
			    {"463171323", "Abaro", "abaro@sistema.com", "Activo"},
			    {"73946719", "Mendoz", "mendoz@sistema.com", "Suspendido"},
			    {"11223344", "Luna", "luna@sistema.com", "Activo"},
			    {"55667788", "Sol", "sol@sistema.com", "Inactivo"}
			};

			JTable tablaResultados = new JTable(datosBusqueda, columnasBusqueda);

			JScrollPane scrollTabla = new JScrollPane(tablaResultados);
			scrollTabla.setBounds(50, 150, 400, 230); // x, y, ancho, alto
			contenedor_consultar.add(scrollTabla);

			JButton btnLimpiar = new JButton("Limpiar Resultados");
			btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 12));
			btnLimpiar.setBounds(175, 400, 150, 35);
			contenedor_consultar.add(btnLimpiar);
		}
	
	public void usuario_como() {
		
		JPanel contenedor_usuario_como = new JPanel();
		contenedor_usuario_como.setOpaque(true);
		contenedor_usuario_como.setBackground(new Color(15, 194, 6));
		contenedor_usuario_como.setSize(500,500);
		contenedor_usuario_como.setLocation(0, 0);
		contenedor_usuario_como.setLayout(null);
		this.add(contenedor_usuario_como);
						
		JLabel lblTituloAyuda = new JLabel("Ayuda: ¿Cómo crear un usuario?");
		lblTituloAyuda.setForeground(Color.WHITE);
		lblTituloAyuda.setFont(new Font("Arial", Font.BOLD, 22));
		lblTituloAyuda.setBounds(50, 30, 400, 30);
		contenedor_usuario_como.add(lblTituloAyuda);

		String textoInstrucciones = 
		    "Sigue estos sencillos pasos para registrar un nuevo usuario en el sistema:\n\n" +
		    "1. Nombre de usuario: Escribe un nombre único. Este será usado para iniciar sesión.\n\n" +
		    "2. Contraseña: Crea una clave segura. Por tu seguridad, los caracteres se ocultarán.\n\n" +
		    "3. Correo electrónico: Ingresa una dirección válida para futuras recuperaciones.\n\n" +
		    "4. Descripción y Foto (Opcional): Puedes agregar detalles extra y subir una imagen de perfil haciendo clic en 'Subir Foto'.\n\n" +
		    "5. Finalizar: Una vez llenos los datos, presiona el botón 'Registrar Usuario'.";

		JTextArea txtInstrucciones = new JTextArea(textoInstrucciones);
		txtInstrucciones.setForeground(Color.WHITE);
		txtInstrucciones.setFont(new Font("Arial", Font.PLAIN, 14));
		txtInstrucciones.setBounds(50, 90, 400, 270);

		txtInstrucciones.setOpaque(false);
		txtInstrucciones.setEditable(false);
		txtInstrucciones.setFocusable(false);
		txtInstrucciones.setLineWrap(true);
		txtInstrucciones.setWrapStyleWord(true);
		contenedor_usuario_como.add(txtInstrucciones);

		JButton btnEntendido = new JButton("Entendido / Volver");
		btnEntendido.setFont(new Font("Arial", Font.BOLD, 14));
		btnEntendido.setBounds(150, 390, 200, 40);
		contenedor_usuario_como.add(btnEntendido);
	}

	public void acceder_como() {
		
		JPanel contenedor_acceder_como = new JPanel();
		contenedor_acceder_como.setOpaque(true);
		contenedor_acceder_como.setBackground(new Color(15, 194, 6));
		contenedor_acceder_como.setSize(500,500);
		contenedor_acceder_como.setLocation(0, 0);
		contenedor_acceder_como.setLayout(null);
		this.add(contenedor_acceder_como);
						
		JLabel lblTituloAyudaBusqueda = new JLabel("Ayuda: ¿Cómo buscar usuarios?");
		lblTituloAyudaBusqueda.setForeground(Color.WHITE);
		lblTituloAyudaBusqueda.setFont(new Font("Arial", Font.BOLD, 22));
		lblTituloAyudaBusqueda.setBounds(50, 30, 400, 30);
		contenedor_acceder_como.add(lblTituloAyudaBusqueda);

		String textoInstruccionesBusqueda = 
		    "Para encontrar a un usuario registrado en el sistema, sigue estos pasos:\n\n" +
		    "1. Navegación: Dirígete al menú principal y selecciona la opción para ir a la pantalla de 'Búsqueda de Usuarios'.\n\n" +
		    "2. Criterio de búsqueda: En el campo de texto, ingresa el Nombre de Usuario o el Número de Control exacto de la persona que deseas encontrar.\n\n" +
		    "3. Acción: Presiona el botón 'Buscar'.\n\n" +
		    "4. Resultados: Si el usuario existe, sus datos aparecerán en la tabla inferior. Si la lista de resultados es muy larga, puedes usar la barra de desplazamiento lateral para verlos todos.\n\n" +
		    "5. Nueva búsqueda: Si deseas buscar a otra persona, presiona 'Limpiar Resultados' para vaciar la tabla.";

		JTextArea txtInstruccionesBusqueda = new JTextArea(textoInstruccionesBusqueda);
		txtInstruccionesBusqueda.setForeground(Color.WHITE);
		txtInstruccionesBusqueda.setFont(new Font("Arial", Font.PLAIN, 14));
		txtInstruccionesBusqueda.setBounds(50, 90, 400, 270);

		txtInstruccionesBusqueda.setOpaque(false);
		txtInstruccionesBusqueda.setEditable(false);
		txtInstruccionesBusqueda.setFocusable(false);
		txtInstruccionesBusqueda.setLineWrap(true);
		txtInstruccionesBusqueda.setWrapStyleWord(true);
		contenedor_acceder_como.add(txtInstruccionesBusqueda);

		JButton btnEntendidoBusqueda = new JButton("Entendido / Volver");
		btnEntendidoBusqueda.setFont(new Font("Arial", Font.BOLD, 14));
		btnEntendidoBusqueda.setBounds(150, 390, 200, 40);
		contenedor_acceder_como.add(btnEntendidoBusqueda);
	}

	public void contra_olvida() {
		
		JPanel contenedor_contra_olvida = new JPanel();
		contenedor_contra_olvida.setOpaque(true);
		contenedor_contra_olvida.setBackground(new Color(15, 194, 6));
		contenedor_contra_olvida.setSize(500,500);
		contenedor_contra_olvida.setLocation(0, 0);
		contenedor_contra_olvida.setLayout(null);
		this.add(contenedor_contra_olvida);
						
		JLabel title_contra_olvida = new JLabel();
		title_contra_olvida.setText("¿Qué pasa si olvidé mi contraseña?");
		title_contra_olvida.setSize(400, 50);
		title_contra_olvida.setOpaque(false);
		title_contra_olvida.setLocation(50, 30);
		title_contra_olvida.setFont(new Font("Arial", Font.BOLD, 22));
		title_contra_olvida.setHorizontalAlignment(JLabel.CENTER);
		title_contra_olvida.setForeground(Color.WHITE); 
		contenedor_contra_olvida.add(title_contra_olvida);

		String textoRecuperacion = 
		    "¡No te preocupes! Es muy fácil recuperar el acceso a tu cuenta. Solo sigue estos pasos:\n\n" +
		    "1. Pantalla de inicio: Ve a la pantalla principal donde normalmente inicias sesión.\n\n" +
		    "2. Opción de recuperación: Haz clic en la opción que dice 'Recuperar Cuenta'.\n\n" +
		    "3. Ingresa tus datos: Escribe el correo electrónico con el que te registraste en el sistema.\n\n" +
		    "4. Revisa tu correo: Te enviaremos un mensaje con las instrucciones detalladas y un enlace seguro.\n\n";
		
		JTextArea txtInstruccionesContra = new JTextArea(textoRecuperacion);
		txtInstruccionesContra.setForeground(Color.WHITE);
		txtInstruccionesContra.setFont(new Font("Arial", Font.PLAIN, 14));
		txtInstruccionesContra.setBounds(50, 100, 400, 260);

		txtInstruccionesContra.setOpaque(false);
		txtInstruccionesContra.setEditable(false);
		txtInstruccionesContra.setFocusable(false);
		txtInstruccionesContra.setLineWrap(true);
		txtInstruccionesContra.setWrapStyleWord(true);
		contenedor_contra_olvida.add(txtInstruccionesContra);

		JButton btnEntendidoContra = new JButton("Entendido / Volver");
		btnEntendidoContra.setFont(new Font("Arial", Font.BOLD, 14));
		btnEntendidoContra.setBounds(150, 390, 200, 40);
		contenedor_contra_olvida.add(btnEntendidoContra);
	}
	
	public void menu() {
		JMenu archivo = new JMenu("Archivo");
				
				JMenuItem nuevo = new JMenuItem("Nuevo");
				JMenuItem abrir = new JMenuItem("Abrir");
				JMenuItem guardar = new JMenuItem("Guardar");
				JMenuItem cerrar = new JMenuItem("Cerrar");
				
				archivo.add(nuevo);
				archivo.addSeparator();
				archivo.add(abrir);
				archivo.addSeparator();
				archivo.add(guardar);
				archivo.addSeparator();
				archivo.add(cerrar);
				archivo.addSeparator();	
				
				
				JMenu cuenta = new JMenu("Cuenta");
				
				JMenuItem acceder_top = new JMenuItem("Acceder");
				acceder_top.addActionListener(e ->{
					this.router("login");
				});
				JMenuItem registrarse_top = new JMenuItem("Registrarse");
				registrarse_top.addActionListener(e ->{
					this.router("registro");
				});
				JMenuItem recovery_top = new JMenuItem("Recuperar");
				recovery_top.addActionListener(e ->{
					this.router("recovery");
				});
				
				cuenta.add(acceder_top);
				cuenta.add(registrarse_top);
				cuenta.add(recovery_top);
				
				JMenu usuarios = new JMenu("Usuarios");
				
				JMenuItem alta_top = new JMenuItem("Alta");
				alta_top.addActionListener(e ->{
					this.router("alta");
				});
				JMenuItem baja_top = new JMenuItem("Baja");
				baja_top.addActionListener(e ->{
					this.router("baja");
				});
				JMenuItem consultar_top = new JMenuItem("Consultar");
				consultar_top.addActionListener(e ->{
					this.router("consultar");
				});

				usuarios.add(alta_top);
				usuarios.add(baja_top);
				usuarios.add(consultar_top);
				
				JMenu ayuda = new JMenu("Ayuda");
				
				JMenuItem usuario_como_top = new JMenuItem("¿Cómo crear un usuario?");
				usuario_como_top.addActionListener(e ->{
					this.router("usuario_como");
				});
				JMenuItem acceder_como_top = new JMenuItem("¿Cómo acceder al sistema?");
				acceder_como_top.addActionListener(e ->{
					this.router("acceder_como");
				});
				JMenuItem contra_olvida_top = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
				contra_olvida_top.addActionListener(e ->{
					this.router("contra_olvida");
				});

				ayuda.add(usuario_como_top);
				ayuda.add(acceder_como_top);
				ayuda.add(contra_olvida_top);
				
				JMenuBar opciones = new JMenuBar();
				opciones.add(archivo);
				opciones.add(cuenta);
				opciones.add(usuarios);
				opciones.add(ayuda);
				this.setJMenuBar(opciones);
	}
}
