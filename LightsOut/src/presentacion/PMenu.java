package presentacion;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PMenu extends JPanel{
	private JComboBox<String> menuTamanio;
	private String[] arrayTamanio = {"5x5","6x6","7x7","8x8","9x9","10x10"};
	private JLabel txtTamanio;
	private JLabel txtDificultad;
	private ButtonGroup grupoDificultades;
	private JRadioButton botonFacil;
	private JRadioButton botonMedio;
	private JRadioButton botonDificil;
	
	private int tamanio = 5;
	private int dificultad = 5;
	
	//Getters

	public int getTamanio() {
		String tamanio = menuTamanio.getSelectedItem().toString();
		String[] initTamanio = tamanio.split("x");
		return Integer.parseInt(initTamanio[0]);
	}
	

	
	public int getDificultad() {
		return dificultad;
	}



	public PMenu() {

		this.setLayout(new GridBagLayout());
		//Tamaño
		this.txtTamanio = new JLabel("Tamaño: ");
		this.add(txtTamanio);
		this.menuTamanio = new JComboBox<>(arrayTamanio);
		this.add(menuTamanio);
		//Dificultad
		this.txtDificultad = new JLabel("Dificultad: ");
		this.add(txtDificultad);
		//Grupo de botones
		this.grupoDificultades = new ButtonGroup();
		
		this.botonFacil = new JRadioButton("Fácil", true);
		this.botonMedio = new JRadioButton("Medio", false);
		this.botonDificil = new JRadioButton("Difícil", false);
		
		this.grupoDificultades.add(botonFacil);
		this.grupoDificultades.add(botonMedio);
		this.grupoDificultades.add(botonDificil);
		
		
		//Action Listeners
		
			//Para JComboBox
		menuTamanio.addActionListener(event -> {
			Object selected = menuTamanio.getSelectedItem();
			String strTamanio = selected.toString();
			String[] splitTamanio = strTamanio.split("x");
			tamanio = Integer.parseInt(splitTamanio[0]);
			System.out.println("Selected Item  = " + tamanio);
			
		});
		
		
		
			//Para RadioButtons
		botonFacil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Este es el fácil en Pmenu");
				dificultad = 5*1;
				System.out.println(getDificultad());
			}
		});
		
		botonMedio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dificultad = 5*2;
				System.out.println("Este es el medio en PMenu");
				System.out.println(getDificultad());
			}
		});
		
		botonDificil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dificultad = 5*3;
				System.out.println("Este es el difícil en PMenu");
				System.out.println(getDificultad());
				
				
			}
		});
		
		
		botonFacil.setBackground(Color.ORANGE);
		botonMedio.setBackground(Color.ORANGE);
		botonDificil.setBackground(Color.ORANGE);
		this.add(botonFacil);
		this.add(botonMedio);
		this.add(botonDificil);
		
		this.setBackground(Color.ORANGE);
	}
	
	public static void main(String[] args) {
		PMenu menu = new PMenu();
		menu.getTamanio();
		menu.getDificultad();
	}
}