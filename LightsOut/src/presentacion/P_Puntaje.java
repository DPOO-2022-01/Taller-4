package presentacion;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class P_Puntaje extends JPanel{
	private String jugador;
	private int jugadas;
	private JTextField nameJugador;
	private JTextField numJugadas;
	
	public P_Puntaje() {
		this.setLayout(new GridLayout());
		JLabel showingMoves = new JLabel("Jugadas: " + this.jugadas);
		this.add(showingMoves);
		
		JLabel showingPlayer = new JLabel("Jugadas: " + this.jugador);
		this.add(showingPlayer);
		this.setBackground(Color.GRAY);
	}
		
}
