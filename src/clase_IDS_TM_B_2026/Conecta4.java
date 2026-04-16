package clase_IDS_TM_B_2026;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Conecta4 extends JFrame{

	protected static final Component NULL = null;
	
	public Conecta4() 
	{		
		
		this.setSize(336,400);//TAMAÑO VENTANA
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER PROGRAMA AL CERRAR
		this.setLocationRelativeTo(null);//PONER EN CENTRO
		this.setMinimumSize(new Dimension(320,361));//TAMAÑO MINIMO 
		this.setMaximumSize(new Dimension(320,361));//TAMAÑO MAXIMO
		this.setTitle("LU VENTANA");//TITULO DE LA VENTANA		//.getContentPane().setBackground(Color.decode(getName()));
		this.setLayout(null);

		this.game();
		this.setVisible(true);//VER VENTANA					
	}
	
	public void game() {
		
		JPanel gato = new JPanel();
		gato.setSize(320,361);
		gato.setBackground(Color.black);
		gato.setLayout(new BorderLayout(5,5));
		this.add(gato);
		
		JPanel center_panel = new JPanel(); 
		center_panel.setLayout(new GridLayout(3,3,10,10));	
		center_panel.setBackground(Color.black);
		
		JButton pan1 = new JButton(" X ");
		pan1.setFont(new Font("Full-Width",Font.BOLD,20));
		pan1.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan1);
		
		JButton pan2 = new JButton(" O ");
		pan2.setFont(new Font("Full-Width",Font.BOLD,20));
		pan2.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan2);
		
		JButton pan3 = new JButton(" X ");
		pan3.setFont(new Font("Full-Width",Font.BOLD,20));
		pan3.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan3);
		
		JButton pan4 = new JButton(" O ");
		pan4.setFont(new Font("Full-Width",Font.BOLD,20));
		pan4.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan4);
		
		JButton pan5 = new JButton(" X ");
		pan5.setFont(new Font("Full-Width",Font.BOLD,20));
		pan5.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan5);
		
		JButton pan6 = new JButton(" O ");
		pan6.setFont(new Font("Full-Width",Font.BOLD,20));
		pan6.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan6);
		
		JButton pan7 = new JButton(" X ");
		pan7.setFont(new Font("Full-Width",Font.BOLD,20));
		pan7.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan7);
		
		JButton pan8 = new JButton(" O ");
		pan8.setFont(new Font("Full-Width",Font.BOLD,20));
		pan8.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan8);
		
		JButton pan9 = new JButton(" X ");
		pan9.setFont(new Font("Full-Width",Font.BOLD,20));
		pan9.setMargin(new Insets(2,2,2,2));
		center_panel.add(pan9);
		
		gato.add(center_panel);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conecta4 Conecta4 = new Conecta4();{
			
		}
	}
}
