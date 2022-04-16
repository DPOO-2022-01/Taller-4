package presentacion;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class P_Menu extends JPanel{
	private JComboBox<String> menuTamanio;
	private String[] tamanio = {"5x5","6x6","7x7","8x8","9x9","10x10"};
	private JLabel txtTamanio;
	private JLabel txtDificultad;
	private ButtonGroup grupoDificultades;
	private JRadioButton botonFacil;
	private JRadioButton botonMedio;
	private JRadioButton botonDificil;
	
	
	public P_Menu() {

		this.setLayout(new GridBagLayout());
		//Tamaño
		this.txtTamanio = new JLabel("Tamaño: ");
		this.add(txtTamanio);
		this.menuTamanio = new JComboBox<>(tamanio);
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
		
		botonFacil.setBackground(Color.ORANGE);
		botonMedio.setBackground(Color.ORANGE);
		botonDificil.setBackground(Color.ORANGE);
		this.add(botonFacil);
		this.add(botonMedio);
		this.add(botonDificil);
		
		this.setBackground(Color.ORANGE);
		
	}
	
	
}
