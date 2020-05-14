import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel label = new JLabel("Calculadora");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 22, SpringLayout.NORTH, contentPane);
		label.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Numero 1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_1, 58, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_1, 43, SpringLayout.WEST, contentPane);
		label_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Numero 2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_2, 0, SpringLayout.NORTH, label_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_2, -56, SpringLayout.EAST, contentPane);
		label_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		contentPane.add(label_2);
		
		textField1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField1, 6, SpringLayout.SOUTH, label_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField1, 26, SpringLayout.WEST, contentPane);
		textField1.setColumns(10);
		contentPane.add(textField1);
		
		textField2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField2, 0, SpringLayout.NORTH, textField1);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField2, -30, SpringLayout.EAST, contentPane);
		textField2.setColumns(10);
		contentPane.add(textField2);
		
		JButton button = new JButton("Limpiar Campos");
		sl_contentPane.putConstraint(SpringLayout.NORTH, button, 32, SpringLayout.SOUTH, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, label, 8, SpringLayout.EAST, button);
		sl_contentPane.putConstraint(SpringLayout.WEST, button, 162, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField2, 29, SpringLayout.EAST, button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField1.setText(null);
				textField2.setText(null);
				textField3.setText(null);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.EAST, textField1, -21, SpringLayout.WEST, button);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Suma");
		sl_contentPane.putConstraint(SpringLayout.WEST, button_1, 9, SpringLayout.WEST, textField1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, resultado;
				
				try {
					num1 = Double.parseDouble(textField1.getText());
					num2 = Double.parseDouble(textField2.getText());
					resultado= num1+num2;
					
					textField3.setText(Double.toString(resultado));
				} catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Error !");
				}
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Resta");
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_1, 0, SpringLayout.NORTH, button_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, button_1, -6, SpringLayout.WEST, button_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_2, 45, SpringLayout.SOUTH, button);
		sl_contentPane.putConstraint(SpringLayout.WEST, button_2, 136, SpringLayout.WEST, contentPane);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1, num2, resultado;
				
				try {
					num1 = Double.parseDouble(textField1.getText());
					num2 = Double.parseDouble(textField2.getText());
					resultado= num1-num2;
					
					textField3.setText(Double.toString(resultado));
				} catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Error !");
				}
			}
		});
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Multiplicaci\u00F3n");
		sl_contentPane.putConstraint(SpringLayout.EAST, button_3, -111, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button_2, -6, SpringLayout.WEST, button_3);
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_3, 45, SpringLayout.SOUTH, button);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1, num2, resultado;
				
				try {
					num1 = Double.parseDouble(textField1.getText());
					num2 = Double.parseDouble(textField2.getText());
					resultado= num1*num2;
					
					textField3.setText(Double.toString(resultado));
				} catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Error !");
				}
			}
		});
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Divisi\u00F3n");
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_4, 0, SpringLayout.NORTH, button_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, button_4, 6, SpringLayout.EAST, button_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, button_4, -10, SpringLayout.EAST, contentPane);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1, num2, resultado;
				
				try {
					num1 = Double.parseDouble(textField1.getText());
					num2 = Double.parseDouble(textField2.getText());
					resultado= num1/num2;
					
					textField3.setText(Double.toString(resultado));
				} catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Error !");
				}
			}
		});
		contentPane.add(button_4);
		
		JLabel label_3 = new JLabel("Resultado");
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, label_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_3, 170, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_3, -58, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_3, -186, SpringLayout.EAST, contentPane);
		label_3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		contentPane.add(label_3);
		
		textField3 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField3, 1, SpringLayout.SOUTH, label_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField3, 149, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField3, -179, SpringLayout.EAST, contentPane);
		textField3.setColumns(10);
		contentPane.add(textField3);
	}

}
