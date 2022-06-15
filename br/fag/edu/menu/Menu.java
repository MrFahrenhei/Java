package br.fag.edu.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.fag.edu.Calculadora;
import br.fag.edu.games.TicTacToe;

public class Menu extends JFrame{


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Menu();
	}

	/**
	 * Create the application.
	 */
	public Menu() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProgramas = new JMenu("Programas");
		mnProgramas.setMnemonic('p');
		menuBar.add(mnProgramas);
		
		JMenuItem mntmCalculadora = new JMenuItem("Calculadora");
		mntmCalculadora.setMnemonic('c');
		mntmCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Calculadora();
			}
		});
		mnProgramas.add(mntmCalculadora);
		
		JMenuItem mntmTicTacToe = new JMenuItem("Jogo");
		mntmTicTacToe.setMnemonic('j');
		mntmTicTacToe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TicTacToe();
			}
		});
		
		mnProgramas.add(mntmTicTacToe);
		
		setSize(500,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
	}

}
