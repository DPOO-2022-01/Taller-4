package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import uniandes.dpoo.taller4.modelo.Tablero;

public class Frame_Principal extends JFrame{
	Tablero LightsOut;
	P_Luces lucesTablero;
	
	
	public Frame_Principal() {
		this.setTitle("LightsOut Game");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		
		P_Menu p_Menu = new P_Menu();
		this.add(p_Menu, BorderLayout.NORTH);
		
		P_Puntaje p_Puntaje = new P_Puntaje();
		this.add(p_Puntaje, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		Frame_Principal juego = new Frame_Principal();
		juego.setVisible(true);
		
	}
}
