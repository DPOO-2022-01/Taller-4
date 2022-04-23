package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Tablero;

public class POpciones extends JPanel{
	private JButton reiniciar;
	private JButton nuevo;
	private JButton cambiarJugador;
	private JButton top10;
	private FramePrincipal fPrincipal;
	private PMenu pMenu;
	private PLightsOut lightsOut;
	
	public POpciones(FramePrincipal fPrincipal, PMenu pMenu, PLightsOut lightsOut) {
		this.fPrincipal = fPrincipal;
		this.pMenu = pMenu;
		this.lightsOut = lightsOut;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		nuevo = new JButton("Nuevo");
		nuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnNuevo(pMenu.getTamanio(),pMenu.getDificultad());
			}
		});
		
		reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnReiniciar();
			}
		});
		
		top10 = new JButton("Top 10");
		top10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnTop10();
				
			}
		});
		
		cambiarJugador = new JButton("Cambiar jugador");
		cambiarJugador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
			
		add(nuevo);
		add(reiniciar);
		add(top10);
		add(cambiarJugador);
	}
	
	public void btnNuevo(int tamanio, int dificultad) {
		fPrincipal.tablero = new Tablero(tamanio);
		fPrincipal.tablero.desordenar(dificultad);
		lightsOut.repaint();
		
	}
	
	public void btnReiniciar() {
		fPrincipal.getTablero().reiniciar();
		lightsOut.repaint();
	}
	
	public void btnTop10() {
		JFrame ventanaTop = new JFrame();
		ventanaTop.setTitle("Top 10 - LightsOut");
		ventanaTop.setSize(400,400);
		ventanaTop.setVisible(true);
		
	}
	
	public void btnCambiarJugador() {
		
	}
}
