package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

public class PLightsOut extends JPanel{
	//Tablero contiene la matriz y las jugadass
	private BufferedImage luz;
	private PMenu menu;
	private JButton probando;
	private FramePrincipal fPrincipal;
		
	
	public PLightsOut(PMenu menu, FramePrincipal fPrincipal) {
		this.menu = menu;
		this.fPrincipal = fPrincipal;
		this.setLayout(new GridLayout());
		//Obtiene el tamaño  y la dificultad del JComboBox
		
		//Inicia el tablero con el tamaño seleccionado
		
		
		//Inicializa la imagen
		try {
			luz = ImageIO.read(getClass().getResourceAsStream("/luz.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
		repaint();
		probando = new JButton("Probando");
		probando.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pruebaEnlace();		
			}
		});
		
		//Prueba de conexión entre objetos
		this.add(probando);
		
	}
	
	//Forma en la que se hará la matriz de imagenes
//	public String verTablero() {
//		String grid = "";
//		boolean[][] table = tablero.darTablero(); 
//		for (int i = 0; i < table.length; i++) {
//			for (int j = 0; j < table[i].length; j++) {
//				if(table[i][j]) {
//					grid += "ON-";
//				} else {
//					grid += "OFF-";
//				}
//			}
//			grid += "\n";
//		}
//		return grid;
//	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(luz, 0, 0, luz.getWidth()*2,luz.getHeight()*2 , Color.YELLOW, null);
		int n = menu.getTamanio();
		for (int i = 0; i < n; i++) {
			
		}
	}
	
	public void pruebaEnlace() {
		System.out.println("Estoy en LightsOut y la dificultad es: " + menu.getDificultad());
		System.out.println("Estoy en LightsOut y el tamaño es: " + menu.getTamanio());
		System.out.println("Probando tablero en LightsOut: " + fPrincipal.getTablero().tableroIluminado());
	}

}
