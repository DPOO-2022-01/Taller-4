package presentacion;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class POpciones extends JPanel{
	private JButton reiniciar;
	private JButton nuevo;
	private JButton cambiarJugador;
	private JButton top10;
	
	public POpciones() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		reiniciar = new JButton("Reiniciar");
		add(reiniciar);
		
		nuevo = new JButton("Nuevo");
		add(nuevo);
		
		cambiarJugador = new JButton("Cambiar jugador");
		add(cambiarJugador);
		
		top10 = new JButton("Top 10");
		add(top10);	
		
		
	}
	
}
