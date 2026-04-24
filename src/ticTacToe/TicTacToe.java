package ticTacToe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.util.Scanner;

public class TicTacToe extends JFrame{
	
	private ListaOrtogonal lista;
	private int turno = 1;
	private JButton[][] botones;
	private int jugadas = 0, puntosx = 0, puntoso = 0;
	private JLabel puntosX, puntosO;
	private final String archivo = "marcador.txt";
	
	public TicTacToe() 
	{		
		
		this.setSize(336,399);//TAMAÑO VENTANA
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER PROGRAMA AL CERRAR
		this.setLocationRelativeTo(null);//PONER EN CENTRO
		this.setMinimumSize(new Dimension(320,361));//TAMAÑO MINIMO 
		this.setMaximumSize(new Dimension(320,361));//TAMAÑO MAXIMO
		this.setTitle("LU VENTANA");//TITULO DE LA VENTANA		//.getContentPane().setBackground(Color.decode(getName()));
		this.setLayout(null);
		
		cargarMarcador();
		lista = new ListaOrtogonal(3, 3);
		lista.CrearLista();
		botones = new JButton[3][3];
		
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
		
		JPanel marcador = new JPanel();
		marcador.setLayout(new GridLayout(1, 2));
		marcador.setBackground(Color.GRAY);
		gato.add(marcador, BorderLayout.NORTH);
		
		puntosX = new JLabel("Jugador X: 0");
		puntosX.setForeground(Color.RED);
		puntosX.setFont(new Font("Full-Width",Font.BOLD,20));
		marcador.add(puntosX);
		
		puntosO = new JLabel("Jugador O: 0");
		puntosO.setForeground(Color.BLUE);
		puntosO.setFont(new Font("Full-Width",Font.BOLD,20));
		marcador.add(puntosO);
		
		actualizar();
		
		JButton reiniciar = new JButton("🔄 Reiniciar Partida");
		reiniciar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        reiniciar(); 
		    }
		});
		gato.add(reiniciar, BorderLayout.SOUTH);

		for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
            	
            	JButton boton = new JButton("  ");
            	boton.setFont(new Font("Full-Width",Font.BOLD,20));
            	boton.setMargin(new Insets(2,2,2,2));
            	
            	final int renglones = fila + 1;
            	final int columnas = col + 1;
            	
            	boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        turno(boton, renglones, columnas);
                    }
                });
            	
            	botones[fila][col] = boton;
            	center_panel.add(boton);
            }
		}
		gato.add(center_panel, BorderLayout.CENTER);
	}
	
	public void turno(JButton botonPres, int fila, int col) {
		
		boolean valid = lista.jugar(turno, fila, col);
		
		if(valid) {
			jugadas++;
			
			if(turno==1) {
				botonPres.setText(" X ");
				botonPres.setForeground(Color.RED);
			}else{
				botonPres.setText(" O ");
				botonPres.setForeground(Color.BLUE);
			}
			
			if (victory(turno)) {
                String ganador = (turno == 1) ? "X" : "O";
                JOptionPane.showMessageDialog(this, "El jugador " + ganador + " ha ganado");
                if (turno == 1) puntosx++; else puntoso++;
                guardarMarcador();
                actualizar();
                reiniciar();
            } else if (jugadas == 9) {
                JOptionPane.showMessageDialog(this, "Es un empate");
                reiniciar();
            } else {
                turno = (turno == 1) ? 2 : 1;
            }
		}
		
	}
	
	private boolean victory(int turno) {
        if (lista.jugadaHorizontal(turno)) return true;
        if (lista.jugadaVertical(turno)) return true;
        if (lista.jugadaDiagonal()) return true; 
        
        return false;
    }
	
	private void reiniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText("");
            }
        }
        lista = new ListaOrtogonal(3, 3);
        lista.CrearLista();
        turno = 1;
        jugadas = 0;
    }
	
	private void actualizar() {
		puntosX.setText("Jugador X: " + puntosx);
		puntosO.setText("Jugador O: " + puntoso);
	}
	
	private void guardarMarcador() {
		puntosX.setText("Jugador X: " + puntosx);
		puntosO.setText("Jugador O: " + puntoso);
        
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(puntosx + "," + puntoso);
            escritor.close();
        } catch (Exception e) {
            System.out.println("No se pudo guardar el archivo.");
        }
    }
    
    private void cargarMarcador() {
        try {
            File archivoTXT = new File(archivo);
            if (archivoTXT.exists()) {
                Scanner lector = new Scanner(archivoTXT);
                if (lector.hasNextLine()) {
                    String linea = lector.nextLine();
                    String[] puntos = linea.split(",");
                    puntosx = Integer.parseInt(puntos[0]);
                    puntoso = Integer.parseInt(puntos[1]);
                }
                lector.close();
            }
        } catch (Exception e) {
            System.out.println("No se encontró el archivo, iniciando en 0.");
        }
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe TicTacToe = new TicTacToe();{
			
		}
	}
}
