package clase_IDS_TM_B_2026;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.MatteBorder;

public class Examen_3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtJhonDoe;
	private JTextField txtCalle;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen_3 window = new Examen_3();
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
	public Examen_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 255));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(2, 1, 10, 1));
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setBackground(new Color(0, 128, 255));
		panel_1.add(panel_4);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel_4.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_5.setBackground(new Color(0, 128, 255));
		panel_1.add(panel_5);
		
		JLabel lblNewLabel_1 = new JLabel("[SIN BASE DE DATOS]");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 255));
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_6, BorderLayout.CENTER);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[] {0, 1};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.insets = new Insets(0, 0, 5, 0);
		gbc_panel_14.fill = GridBagConstraints.BOTH;
		gbc_panel_14.gridx = 0;
		gbc_panel_14.gridy = 0;
		panel_14.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
		panel_6.add(panel_14, gbc_panel_14);
		panel_14.setLayout(new GridLayout(2, 2, 0, 10));
		
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_7 = (FlowLayout) panel_17.getLayout();
		flowLayout_7.setVgap(0);
		flowLayout_7.setHgap(0);
		panel_14.add(panel_17);
		
		JLabel lblNewLabel_11 = new JLabel("Documento:    ");
		panel_17.add(lblNewLabel_11);
		
		textField_1 = new JTextField();
		textField_1.setText("123456");
		panel_17.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) panel_18.getLayout();
		flowLayout_8.setHgap(0);
		flowLayout_8.setVgap(0);
		panel_18.setBackground(new Color(255, 255, 255));
		panel_14.add(panel_18);
		
		JLabel lblNewLabel_11_1 = new JLabel("Nombres:     ");
		panel_18.add(lblNewLabel_11_1);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("JHON DOE");
		txtJhonDoe.setColumns(10);
		panel_18.add(txtJhonDoe);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_9 = (FlowLayout) panel_19.getLayout();
		flowLayout_9.setHgap(0);
		flowLayout_9.setVgap(0);
		panel_14.add(panel_19);
		
		JLabel lblNewLabel_11_2 = new JLabel("Direccion:      ");
		panel_19.add(lblNewLabel_11_2);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setColumns(10);
		panel_19.add(txtCalle);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_10 = (FlowLayout) panel_20.getLayout();
		flowLayout_10.setHgap(0);
		flowLayout_10.setVgap(0);
		panel_14.add(panel_20);
		
		JLabel lblNewLabel_11_3 = new JLabel("Teléfono:      ");
		panel_20.add(lblNewLabel_11_3);
		
		textField_4 = new JTextField();
		textField_4.setText("5554433");
		textField_4.setColumns(10);
		panel_20.add(textField_4);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.insets = new Insets(0, 0, 5, 0);
		gbc_panel_15.fill = GridBagConstraints.BOTH;
		gbc_panel_15.gridx = 0;
		gbc_panel_15.gridy = 1;
		panel_15.setBorder(BorderFactory.createTitledBorder("Datos de Factura"));
		panel_6.add(panel_15, gbc_panel_15);
		panel_15.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_21 = new JPanel();
		FlowLayout flowLayout_12 = (FlowLayout) panel_21.getLayout();
		flowLayout_12.setVgap(0);
		panel_21.setBackground(new Color(255, 255, 255));
		panel_15.add(panel_21);
		
		JLabel lblNewLabel_12 = new JLabel("No° Factura:     ");
		panel_21.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("1");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_21.add(lblNewLabel_13);
		
		JPanel panel_22 = new JPanel();
		FlowLayout flowLayout_14 = (FlowLayout) panel_22.getLayout();
		flowLayout_14.setVgap(0);
		panel_22.setBackground(new Color(255, 255, 255));
		panel_15.add(panel_22);
		
		JLabel lblNewLabel_14 = new JLabel("Fecha:     ");
		panel_22.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("22021/50/21");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_22.add(lblNewLabel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.gridx = 0;
		gbc_panel_16.gridy = 2;
		panel_6.add(panel_16, gbc_panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		panel_16.add(panel_23, BorderLayout.NORTH);
		panel_23.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_11 = (FlowLayout) panel_25.getLayout();
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_23.add(panel_25);
		
		JButton btnNewButton_4 = new JButton("Ver listado de facturas");
		btnNewButton_4.setIcon(new ImageIcon(Examen_3.class.getResource("/Imagenes/lista.png")));
		panel_25.add(btnNewButton_4);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_13 = (FlowLayout) panel_27.getLayout();
		flowLayout_13.setAlignment(FlowLayout.RIGHT);
		panel_23.add(panel_27);
		
		JButton btnNewButton_2 = new JButton("Añadir");
		btnNewButton_2.setIcon(new ImageIcon(Examen_3.class.getResource("/Imagenes/agregar.png")));
		panel_27.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.setIcon(new ImageIcon(Examen_3.class.getResource("/Imagenes/menos.png")));
		panel_27.add(btnNewButton_3);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(255, 255, 255));
		panel_16.add(panel_24, BorderLayout.SOUTH);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Producto", "Cantidad", "Valor", "Sub Total"},
				{"Agua", "2", "500", "1000.00"},
				{"Cereal", "5", "1000", "5000.00"},
				{"Leche", "2", "300", "600.00"},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		));
		table.setToolTipText("");
		panel_24.add(table);
		
		JPanel panel_7 = new JPanel();
		panel_3.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_3 = (FlowLayout) panel_10.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_8.add(panel_10);
		
		JLabel lblNewLabel_2 = new JLabel("           SubTotal:           ");
		panel_10.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("6600.00");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_10.add(lblNewLabel_3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_4 = (FlowLayout) panel_11.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_8.add(panel_11);
		
		JLabel lblNewLabel_4 = new JLabel("% Descuento:    ");
		panel_11.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setText("5");
		panel_11.add(textField);
		textField.setColumns(3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		panel_11.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_5 = new JLabel("            Valor descontado: ");
		panel_11.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("330.00");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_11.add(lblNewLabel_6);
		
		JPanel panel_12 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_12.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_12.setBackground(new Color(255, 255, 255));
		panel_8.add(panel_12);
		
		JLabel lblNewLabel_7 = new JLabel("IVA 19%:       ");
		panel_12.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("1254.00");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_12.add(lblNewLabel_8);
		
		JPanel panel_13 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_13.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_13.setBackground(new Color(255, 255, 255));
		panel_8.add(panel_13);
		
		JLabel lblNewLabel_9 = new JLabel("Total Factura: ");
		panel_13.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("     7524.00");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_13.add(lblNewLabel_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_2 = (FlowLayout) panel_9.getLayout();
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		panel_7.add(panel_9, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		panel_9.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		panel_9.add(btnNewButton_1);
	}

}
