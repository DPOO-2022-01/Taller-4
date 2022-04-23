package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
		//Inicializa la imagen
		try {
			luz = ImageIO.read(getClass().getResourceAsStream("/luz.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
		repaint();

		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				tomarPosicion(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		
	}
	
	@Override
	public void paint(Graphics g) {
		int n = menu.getTamanio();
		boolean[][] gameBoard = fPrincipal.getTablero().darTablero();
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				if(gameBoard[i][j]) {
					//Filas y columnas
					g.drawImage(luz, i * this.getWidth()/n, j * this.getHeight()/n, this.getWidth()/n, this.getHeight()/n, Color.YELLOW, null);
				} else {
					g.drawImage(luz, i * this.getWidth()/n, j * this.getHeight()/n, this.getWidth()/n, this.getHeight()/n, Color.LIGHT_GRAY, null);
				}
			}
		}
	}
	
	public void pruebaEnlace() {
		System.out.println("Estoy en LightsOut y la dificultad es: " + menu.getDificultad());
		System.out.println("Estoy en LightsOut y el tamaño es: " + menu.getTamanio());
		System.out.println("Probando tablero en LightsOut: " + fPrincipal.getTablero().tableroIluminado());
	}

	public void tomarPosicion(MouseEvent e) {
		int fila = e.getY()/(this.getHeight()/menu.getTamanio());
		int columna = e.getX()/(this.getWidth()/menu.getTamanio());
		fPrincipal.getTablero().jugar(columna, fila);
		if (fPrincipal.getTablero().tableroIluminado()) {
			JOptionPane.showMessageDialog(this, "¡Ganaste!");
		}
		repaint();
	}

}
