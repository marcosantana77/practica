package programa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class Practica1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica1 window = new Practica1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Practica1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 833, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("INSTITUTO TECNOLOGICO DE MEXICALI");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel.setBounds(254, 32, 319, 13);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NOMBRE");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_1.setBounds(40, 116, 88, 13);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CARRERA");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_2.setBounds(40, 212, 63, 13);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("CURP");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNewLabel_3.setBounds(40, 303, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnNewButton.setBounds(365, 383, 115, 40);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String nombre, carrera, curp;
				nombre = textField.getText();
				carrera = textField_1.getText();
				curp = textField_2.getText();

				JOptionPane.showMessageDialog(null, "NOMBRE: " + nombre + "\nCARRERA: " + carrera + "\nCURP: " + curp);
			}

		});
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(118, 115, 195, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(113, 211, 200, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(113, 302, 200, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
