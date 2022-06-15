package br.fag.edu.games;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TicTacToe extends JFrame{
	
	private JFrame frame;
	Random randomic = new Random();
	
	private int [][] matriz;
	private int winner = 0;
	private int points = 0;
	private int j = 0,i = 0;
	
	private String line1,line2,line3;
	private String col1, col2, col3;
	private String diagonal1,diagonal2;
	private String[][]vetorDisplay = new String[3][3];
	private JTextField textFieldPainel;
	private JButton btnRefresh;
	
	//primeira linha 
	private JButton btnAA;
	private JButton btnAB;
	private JButton btnAC;
	
	//segunda linha
	private JButton btnBA;
	private JButton btnBB;
	private JButton btnBC;
	
	//terceira linha
	private JButton btnCA;
	private JButton btnCB;
	private JButton btnCC;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new TicTacToe();
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {initialize();}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		btnAA = new JButton("");
		btnAA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAA.setText(Play());
				vetorDisplay[0][0]="X";
				btnAA.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnAA.setBounds(10, 11, 138, 110);
		getContentPane().add(btnAA);
		
		btnAB = new JButton("");
		btnAB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAB.setText(Play());
				vetorDisplay[0][1]="X";
				btnAB.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnAB.setBounds(158, 11, 138, 110);
		getContentPane().add(btnAB);
		
		btnAC = new JButton("");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAC.setText(Play());
				vetorDisplay[0][2]="X";
				btnAC.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnAC.setBounds(306, 11, 138, 110);
		getContentPane().add(btnAC);
		
		btnBA = new JButton("");
		btnBA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBA.setText(Play());
				vetorDisplay[1][0]="X";
				btnBA.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnBA.setBounds(10, 132, 138, 110);
		getContentPane().add(btnBA);
		
		btnBB = new JButton("");
		btnBB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBB.setText(Play());
				vetorDisplay[1][1]="X";
				btnBB.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnBB.setBounds(158, 132, 138, 110);
		getContentPane().add(btnBB);
		
		btnBC = new JButton("");
		btnBC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBC.setText(Play());
				vetorDisplay[1][2]="X";
				btnBC.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnBC.setBounds(306, 132, 138, 110);
		getContentPane().add(btnBC);
		
		btnCA = new JButton("");
		btnCA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCA.setText(Play());
				vetorDisplay[2][0]="X";
				btnCA.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnCA.setBounds(10, 253, 138, 110);
		getContentPane().add(btnCA);
		
		btnCB = new JButton("");
		btnCB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCB.setText(Play());
				vetorDisplay[2][1]="X";
				btnCB.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnCB.setBounds(158, 253, 138, 110);
		getContentPane().add(btnCB);
		
		btnCC = new JButton("");
		btnCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCC.setText(Play());
				vetorDisplay[2][2]="X";
				btnCC.setEnabled(false);
				Verify();
				Skynet(vetorDisplay);
				Winner();
			}
		});
		btnCC.setBounds(306, 253, 138, 110);
		getContentPane().add(btnCC);
		
		btnRefresh = new JButton("Reiniciar");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cleanButtons();
			}
		});
		btnRefresh.setBounds(10, 374, 138, 42);
		getContentPane().add(btnRefresh);
		
		textFieldPainel = new JTextField();
		textFieldPainel.setBounds(158, 374, 286, 42);
		getContentPane().add(textFieldPainel);
		textFieldPainel.setColumns(10);
		
		setSize(470, 470);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	
	protected String Play() {
		String selected = "X";
		return selected;
	}
	protected void Verify() {
		points = 0;
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				if(vetorDisplay[i][j]=="X"|vetorDisplay[i][j]=="O") {
					points+=1;
				}
			}
		}
	}
	protected void Winner() {
		diagonal1 = vetorDisplay[0][0]+vetorDisplay[1][1]+vetorDisplay[2][2];
		diagonal2 = vetorDisplay[0][2]+vetorDisplay[1][1]+vetorDisplay[2][0];
		
		line1 = vetorDisplay[0][0]+vetorDisplay[0][1]+vetorDisplay[0][2];
		line2 = vetorDisplay[1][0]+vetorDisplay[1][1]+vetorDisplay[1][2];
		line3 = vetorDisplay[2][0]+vetorDisplay[2][1]+vetorDisplay[2][2];
		
		col1 = vetorDisplay[0][0]+vetorDisplay[1][0]+vetorDisplay[2][0];
		col2 = vetorDisplay[0][1]+vetorDisplay[1][1]+vetorDisplay[2][1];
		col3 = vetorDisplay[0][2]+vetorDisplay[1][2]+vetorDisplay[2][2];
		
		if(line1.equals("XXX")|line2.equals("XXX")|line3.equals("XXX")|
				col1.equals("XXX")|col2.equals("XXX")|col3.equals("XXX")|
				diagonal1.equals("XXX")|diagonal2.equals("XXX")) {
			
			textFieldPainel.setText("YOU WIN, 'X' PLAYER");
			turnOFFButton();
			
		}else if(line1.equals("OOO")|line2.equals("OOO")|line3.equals("OOO")|
				col1.equals("OOO")|col2.equals("OOO")|col3.equals("OOO")|
				diagonal1.equals("OOO")|diagonal2.equals("OOO")) {
			
			textFieldPainel.setText("YOU WIN, 'O' PLAYER");
			turnOFFButton();
			
		}else if (points == 9) {
			textFieldPainel.setText("Nobody won, :/");
			turnOFFButton();
		}
		
		
	}
	protected void turnOFFButton() {
		//primeira linha
		btnAA.setEnabled(false);
		btnAB.setEnabled(false);
		btnAC.setEnabled(false);
		
		//segunda linha
		btnBA.setEnabled(false);
		btnBB.setEnabled(false);
		btnBC.setEnabled(false);
		
		//terceira linha
		btnCA.setEnabled(false);
		btnCB.setEnabled(false);
		btnCC.setEnabled(false);
	}
	protected void Skynet(String[][]vetorDisplay) {
		int position = randomic.nextInt(9);
		boolean check = false;
		while(check != true) {
			if(!(points==9)) {
				position = randomic.nextInt(9);
				check = checkFilledSpace(position, vetorDisplay);
			}else {
				check = true;
			}
		}
	}
	
	protected void cleanButtons() {
		//primeira linha
		btnAA.setText("");
		btnAA.setEnabled(true);
		
		btnAB.setText("");
		btnAB.setEnabled(true);
		
		btnAC.setText("");
		btnAC.setEnabled(true);
				
		//segunda linha
		btnBA.setText("");
		btnBA.setEnabled(true);
		
		btnBB.setText("");
		btnBB.setEnabled(true);
		
		btnBC.setText("");
		btnBC.setEnabled(true);
				
		//terceira linha
		btnCA.setText("");
		btnCA.setEnabled(true);
		
		btnCB.setText("");
		btnCB.setEnabled(true);
		
		btnCC.setText("");
		btnCC.setEnabled(true);
		
		//outro botoes
		clearPositions();
		textFieldPainel.setText("");
	}
	protected void clearPositions() {
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				vetorDisplay[i][j] = "";
			}
		}
	}
	protected boolean checkFilledSpace(int filledPosition, String [][] vetorDisplay) {
		switch(filledPosition) {
		case 1:
			if(vetorDisplay[0][0] == "X" || vetorDisplay[0][0] == "O") {
				return false;
			}else {
				vetorDisplay[0][0] = "O";
				btnAA.setText("O");
				btnAA.setEnabled(false);
				return true;
			}
		case 2:
			if(vetorDisplay[0][1] == "X" || vetorDisplay[0][1] == "O") {
				return false;
			}else {
				vetorDisplay[0][1] = "O";
				btnAB.setText("O");
				btnAB.setEnabled(false);
				return true;
			}
		case 3:
			if(vetorDisplay[0][2] == "X" || vetorDisplay[0][2] == "O") {
				return false;
			}else {
				vetorDisplay[0][2] = "O";
				btnAC.setText("O");
				btnAC.setEnabled(false);
				return true;
			}
		case 4:
			if(vetorDisplay[1][0] == "X" || vetorDisplay[1][0] == "O") {
				return false;
			}else {
				vetorDisplay[1][0] = "O";
				btnBA.setText("O");
				btnBA.setEnabled(false);
				return true;
			}
		case 5:
			if(vetorDisplay[1][1] == "X" || vetorDisplay[1][1] == "O") {
				return false;
			}else {
				vetorDisplay[1][1] = "O";
				btnBB.setText("O");
				btnBB.setEnabled(false);
				return true;
			}
		case 6:
			if(vetorDisplay[1][2] == "X" || vetorDisplay[1][2] == "O") {
				return false;
			}else {
				vetorDisplay[1][2] = "O";
				btnBC.setText("O");
				btnBC.setEnabled(false);
				return true;
			}
		case 7:
			if(vetorDisplay[2][0] == "X" || vetorDisplay[2][0] == "O") {
				return false;
			}else {
				vetorDisplay[2][0] = "O";
				btnCA.setText("O");
				btnCA.setEnabled(false);
				return true;
			}
		case 8:
			if(vetorDisplay[2][1] == "X" || vetorDisplay[2][1] == "O") {
				return false;
			}else {
				vetorDisplay[2][1] = "O";
				btnCB.setText("O");
				btnCB.setEnabled(false);
				return true;
			}
		case 9:
			if(vetorDisplay[2][2] == "X" || vetorDisplay[2][2] == "O") {
				return false;
			}else {
				vetorDisplay[2][2] = "O";
				btnCC.setText("O");
				btnCC.setEnabled(false);
				return true;
			}
		default:
			return false;
		}
	}
}
