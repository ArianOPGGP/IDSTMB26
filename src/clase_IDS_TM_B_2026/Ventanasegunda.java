package clase_IDS_TM_B_2026;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JRadioButton;

public class Ventanasegunda {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanasegunda window = new Ventanasegunda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventanasegunda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 30));
		frame.getContentPane().setBackground(new Color(0, 255, 64));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 64));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Registro de Usuarios ");
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 128, 0));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 64));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_18 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_18.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_18.setBackground(new Color(0, 255, 255));
		panel_18.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.add(panel_18, BorderLayout.NORTH);
		
		JLabel lblNewLabel_6 = new JLabel("Datos Generales");
		lblNewLabel_6.setBackground(new Color(0, 255, 255));
		panel_18.add(lblNewLabel_6);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(0, 255, 255));
		panel_2.add(panel_19, BorderLayout.CENTER);
		panel_19.setLayout(new GridLayout(6, 2, 5, 5));
		
		JPanel panel_20 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_20.getLayout();
		flowLayout_2.setVgap(20);
		flowLayout_2.setHgap(10);
		panel_20.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_20);
		
		JLabel lblNewLabel_7 = new JLabel("Nombres:");
		lblNewLabel_7.setBackground(new Color(0, 255, 255));
		panel_20.add(lblNewLabel_7);
		
		JPanel panel_21 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_21.getLayout();
		flowLayout_3.setVgap(20);
		flowLayout_3.setHgap(10);
		panel_21.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_21);
		
		textField = new JTextField("Juan Carlos");
		panel_21.add(textField);
		textField.setColumns(10);
		
		JPanel panel_22 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_22.getLayout();
		flowLayout_4.setVgap(20);
		flowLayout_4.setHgap(10);
		panel_22.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_22);
		
		JLabel lblNewLabel_7_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_7_1.setBackground(Color.CYAN);
		panel_22.add(lblNewLabel_7_1);
		
		JPanel panel_23 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_23.getLayout();
		flowLayout_5.setVgap(20);
		flowLayout_5.setHgap(10);
		panel_23.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_23);
		
		textField_1 = new JTextField("Arcila");
		panel_23.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_24 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_24.getLayout();
		flowLayout_6.setVgap(20);
		flowLayout_6.setHgap(10);
		panel_24.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_24);
		
		JLabel lblNewLabel_8 = new JLabel("Apellido Materno:");
		panel_24.add(lblNewLabel_8);
		
		JPanel panel_25 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_25.getLayout();
		flowLayout_7.setVgap(20);
		flowLayout_7.setHgap(10);
		panel_25.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_25);
		
		textField_2 = new JTextField("Díaz");
		panel_25.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_26 = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) panel_26.getLayout();
		flowLayout_8.setVgap(20);
		flowLayout_8.setHgap(10);
		panel_26.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_26);
		
		JLabel lblNewLabel_9 = new JLabel("Fecha de Nacimiento:");
		panel_26.add(lblNewLabel_9);
		
		JPanel panel_27 = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) panel_27.getLayout();
		flowLayout_9.setVgap(20);
		flowLayout_9.setHgap(0);
		panel_27.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_27);
		
		textField_3 = new JTextField();
		textField_3.setText("07/01/1990");
		panel_27.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Ventanasegunda.class.getResource("/clase_IDS_TM_B_2026/calendario.png")));
		panel_27.add(btnNewButton_3);
		
		JPanel panel_28 = new JPanel();
		FlowLayout flowLayout_10 = (FlowLayout) panel_28.getLayout();
		flowLayout_10.setVgap(20);
		flowLayout_10.setHgap(10);
		panel_28.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_28);
		
		JLabel lblNewLabel_10 = new JLabel("Sexo:");
		panel_28.add(lblNewLabel_10);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_29);
		panel_29.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(0, 255, 255));
		panel_29.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(new Color(0, 255, 255));
		panel_29.add(rdbtnNewRadioButton_1);
		
		ButtonGroup sexo = new ButtonGroup();
		sexo.add(rdbtnNewRadioButton_1);
		sexo.add(rdbtnNewRadioButton);
		
		JPanel panel_30 = new JPanel();
		FlowLayout flowLayout_12 = (FlowLayout) panel_30.getLayout();
		flowLayout_12.setVgap(20);
		flowLayout_12.setHgap(10);
		panel_30.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_30);
		
		JLabel lblNewLabel_11 = new JLabel("Nacionalidad:");
		panel_30.add(lblNewLabel_11);
		
		JPanel panel_31 = new JPanel();
		FlowLayout flowLayout_13 = (FlowLayout) panel_31.getLayout();
		flowLayout_13.setVgap(20);
		flowLayout_13.setHgap(10);
		panel_31.setBackground(new Color(0, 255, 255));
		panel_19.add(panel_31);
		
		String [] paises = {"Perú","México","USA","Brasil","Colombia"};
		
		JComboBox comboBox = new JComboBox(paises);
		panel_31.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_6.setBackground(new Color(255, 128, 128));
		FlowLayout flowLayout = (FlowLayout) panel_6.getLayout();
		flowLayout.setAlignOnBaseline(true);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel(" Perfil del Usuario");
		panel_6.add(lblNewLabel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 128, 128));
		panel_3.add(panel_7, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Ventanasegunda.class.getResource("/clase_IDS_TM_B_2026/hombre.png")));
		panel_7.add(lblNewLabel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 128, 128));
		panel_3.add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new GridLayout(2, 1, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 128));
		panel_8.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Fecha de Nacimiento");
		chckbxNewCheckBox_1.setBackground(new Color(255, 128, 128));
		panel_8.add(chckbxNewCheckBox_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 0, 0));
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		FlowLayout flowLayout_14 = (FlowLayout) panel_14.getLayout();
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		panel_14.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_14.setBackground(new Color(255, 0, 0));
		panel_4.add(panel_14, BorderLayout.NORTH);
		
		JLabel lblNewLabel_3 = new JLabel("Datos Opcionales");
		lblNewLabel_3.setBackground(new Color(255, 0, 0));
		panel_14.add(lblNewLabel_3);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 0, 0));
		panel_4.add(panel_15, BorderLayout.CENTER);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 0, 0));
		panel_15.add(panel_16, BorderLayout.NORTH);
		panel_16.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Descripcion");
		panel_16.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Preferencias");
		panel_16.add(lblNewLabel_5);
		
		JPanel panel_17 = new JPanel();
		panel_15.add(panel_17, BorderLayout.CENTER);
		panel_17.setLayout(new GridLayout(1, 2, 50, 100));

		TextArea textArea = new TextArea();
		textArea.setText("Hola amigos de youtube gracias por compartir mis videos.");
		panel_17.add(textArea);

		List list = new List();
		list.setMultipleMode(true);
		list.add("Cantar");
		list.add("Escuchar Música");
		list.add("Leer");
		list.add("Deportes");
		list.add("Salir");
		list.add("Pistear");
		list.add("Bailar");
		list.add("Otros");
		panel_17.add(list);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(30, 50));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 255, 255));
		panel_5.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(3, 1, 70, 70));
		
		JButton btnNewButton = new JButton("Nuevo ");
		btnNewButton.setIcon(new ImageIcon(Ventanasegunda.class.getResource("/clase_IDS_TM_B_2026/boton-agregar.png")));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		panel_9.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setIcon(new ImageIcon(Ventanasegunda.class.getResource("/clase_IDS_TM_B_2026/guardar-el-archivo.png")));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		panel_9.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setIcon(new ImageIcon(Ventanasegunda.class.getResource("/clase_IDS_TM_B_2026/boton.png")));
		panel_9.add(btnNewButton_1);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 255, 255));
		panel_5.add(panel_10, BorderLayout.NORTH);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 255, 255));
		panel_5.add(panel_11, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 255, 255));
		panel_5.add(panel_12, BorderLayout.WEST);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 255, 255));
		panel_5.add(panel_13, BorderLayout.EAST);
	}

}
