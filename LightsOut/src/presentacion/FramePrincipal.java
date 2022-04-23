package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.border.Border;

import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;

public class FramePrincipal extends JFrame{
	PLightsOut juego;
	Tablero tablero;
	PMenu pMenu;
	Top10 top10;
	
	//Constructor
	public FramePrincipal() {
		this.setTitle("LightsOut Game");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		
		PMenu pMenu = new PMenu();
		this.add(pMenu, BorderLayout.NORTH);
		
		tablero = new Tablero(pMenu.getTamanio());
		top10 = new Top10();
		
		juego = new PLightsOut(pMenu, this);
		this.add(juego, BorderLayout.CENTER);
		
		POpciones popciones = new POpciones(this, pMenu, juego);
		this.add(popciones, BorderLayout.EAST);
		
		PPuntaje pPuntaje = new PPuntaje(this);
		this.add(pPuntaje, BorderLayout.SOUTH);
	}
	
	//Getters
	
	public Tablero getTablero() {
		return tablero;
	}
	
	public PMenu getpMenu() {
		return pMenu;
	}
	
	public Top10 getTop10() {
		return top10;
	}

	public static void main(String[] args) {
		FramePrincipal ventana = new FramePrincipal();
		ventana.setVisible(true);
	}

}
