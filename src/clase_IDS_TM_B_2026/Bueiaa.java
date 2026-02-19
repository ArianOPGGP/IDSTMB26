package clase_IDS_TM_B_2026;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Bueiaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);//VER VENTANA
		ventana.setSize(500,500);//TAMAÑO VENTANA
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER PROGRAMA AL CERRAR
		ventana.setLocationRelativeTo(null);//PONER EN CENTRO
		ventana.setMinimumSize(new Dimension(500,500));//TAMAÑO MINIMO 
		ventana.setMaximumSize(new Dimension(800,800));//TAMAÑO MAXIMO
		ventana.setTitle("Hola");//TITULO DE LA VENTANA
		ventana.setBackground(Color.black);
		ventana.setOpacity(100);
		
		
	}

}
