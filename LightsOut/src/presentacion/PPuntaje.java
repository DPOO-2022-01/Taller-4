package presentacion;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PPuntaje extends JPanel{
	private String jugador;
	private int jugadas;
	private FramePrincipal framePrincipal;

	public PPuntaje(FramePrincipal framePrincipal) {
		this.framePrincipal = framePrincipal;
		this.setLayout(new GridLayout());
		jugadas = framePrincipal.getTablero().darJugadas();
		JLabel showingMoves = new JLabel("Jugadas: " + jugadas);
		this.add(showingMoves);

		JLabel showingPlayer = new JLabel("Jugadas: " + this.jugador);
		this.add(showingPlayer);
		this.setBackground(Color.ORANGE);
	}

}