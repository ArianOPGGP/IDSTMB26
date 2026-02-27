package clase_IDS_TM_B_2026;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() 
	{		
		Image pog = Toolkit.getDefaultToolkit().getImage("Pog.png");
		
		this.setSize(1050,540);//TAMAÑO VENTANA
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER PROGRAMA AL CERRAR
		this.setLocationRelativeTo(null);//PONER EN CENTRO
		this.setMinimumSize(new Dimension(500,500));//TAMAÑO MINIMO 
		this.setMaximumSize(new Dimension(500,500));//TAMAÑO MAXIMO
		this.setTitle("LE VENTANA");//TITULO DE LA VENTANA
		this.setBackground(Color.LIGHT_GRAY);
		this.setIconImage(pog);
		//this.getContentPane().setBackground(Color.decode(getName()));
		this.setLayout(null);
		//this.setOpacity(100);
				
		this.calculadora();
		
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
	
	
}
