package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.Border;

import uniandes.dpoo.taller4.modelo.Tablero;

public class FramePrincipal extends JFrame{
	PLightsOut juego;
	Tablero tablero;
	
	//Constructor
	public FramePrincipal() {
		this.setTitle("LightsOut Game");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		PMenu pMenu = new PMenu();
		this.add(pMenu, BorderLayout.NORTH);
		
		tablero = new Tablero(pMenu.getTamanio());
		
		juego = new PLightsOut(pMenu, this);
		this.add(juego, BorderLayout.CENTER);
		
		POpciones popciones = new POpciones();
		this.add(popciones, BorderLayout.EAST);
		
	}
	
	//Getters
	
	public Tablero getTablero() {
		return tablero;
	}
	
	
	public static void main(String[] args) {
		FramePrincipal ventana = new FramePrincipal();
		ventana.setVisible(true);
	}

}
