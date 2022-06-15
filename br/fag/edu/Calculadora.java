package br.fag.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {
	private Double selected1, selected2, result;
	private String operator, simbolo, resultString;
	private JFrame frame;
	private JTextField textField;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Calculadora();
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initComponents();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initComponents() {
		
		JPanel northPanel = new JPanel();
		getContentPane().add(northPanel, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Calculadora");
		northPanel.add(lblTitle);
		
		JPanel westPanel = new JPanel();
		getContentPane().add(westPanel, BorderLayout.WEST);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("1");
			}
		});
		westPanel.add(btnOne);
		
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("2");
			}
		});
		westPanel.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("3");
			}
		});
		westPanel.add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("4");
			}
		});
		westPanel.add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("5");
			}
		});
		westPanel.add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("6");
			}
		});
		westPanel.add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("7");
			}
		});
		westPanel.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("8");
			}
		});
		westPanel.add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("9");
			}
		});
		westPanel.add(btnNine);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVal("0");
			}
		});
		westPanel.add(btnZero);
		
		JPanel southPanel = new JPanel();
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		JButton btnSum = new JButton("Somar");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegarOperacao("+");
			}
		});
		southPanel.add(btnSum);
		
		JButton btnSub = new JButton("Subtrair");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegarOperacao("-");
			}
		});
		southPanel.add(btnSub);
		
		JButton btnSplit = new JButton("Dividir");
		btnSplit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegarOperacao("/");
			}
		});
		southPanel.add(btnSplit);
		
		JButton btnTimes = new JButton("Multiplicar");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pegarOperacao("*");
			}
		});
		southPanel.add(btnTimes);
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showResult();
			}
		});
		southPanel.add(btnResultado);
		
		JPanel eastPanel = new JPanel();
		getContentPane().add(eastPanel, BorderLayout.EAST);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		eastPanel.add(resultado);
		resultado.setColumns(10);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparTexto();
			}
		});
		eastPanel.add(btnClear);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	

	protected void addVal(String num) {
		resultado.setText(resultado.getText()+num);
	}
	protected void pegarOperacao(String operator) {
		simbolo = operator;
		selected1 = Double.parseDouble(resultado.getText());
		resultado.setText("");
	}
	protected void showResult() {
		selected2 = Double.parseDouble(resultado.getText());
		switch(simbolo){
			case "+":
				result = selected1 + selected2;
				resultString = Double.toString(result);
				resultado.setText(resultString);
			break;
			case "-":
				result = selected1 - selected2;
				resultString = Double.toString(result);
				resultado.setText(resultString);
			break;
			case "*":
				result = selected1 * selected2;
				 resultString = Double.toString(result);
				resultado.setText(resultString);
				break;
			case "/":
				result = selected1 / selected2;
				 resultString = Double.toString(result);
				resultado.setText(resultString);
				break;
				
		}
		
	}
	protected void limparTexto() {
		resultado.setText("");
	}

	
}
