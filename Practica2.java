package programa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Practica2 {

	private JFrame frame;
	private JTextField tnombre;
	private JTextField textField_1;
	private JTextField textcurp;

	ButtonGroup bg = new ButtonGroup();
	private JRadioButton rb1;
	private JRadioButton rb2;
	private JCheckBox cb1;
	private JCheckBox cb2;
	private JCheckBox cb3;

	public void validarrbtn() {
		if (rb1.isSelected()) {
			JOptionPane.showMessageDialog(null, "HOMBRE");
		}
		if (rb2.isSelected()) {
			JOptionPane.showMessageDialog(null, "MUJER");
		}
	}
	public void validarcb() {
		if(cb1.isSelected()) {
			JOptionPane.showMessageDialog(null, "MATUTINO");
		}
		if(cb2.isSelected()) {
			JOptionPane.showMessageDialog(null, "INTERMEDIO");
		}
		if(cb3.isSelected()) {
			JOptionPane.showMessageDialog(null, "VESPERTINO");
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica2 window = new Practica2();
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
	public Practica2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Century Gothic", Font.BOLD, 16));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1097, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("INSTITUTO TECNOLOGICO DE MEXICALI");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(328, 32, 399, 29);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NOMBRE");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(43, 103, 77, 13);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CARRERA");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(43, 254, 77, 13);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("CURP");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(43, 388, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);

		tnombre = new JTextField();
		tnombre.setBounds(123, 103, 235, 19);
		frame.getContentPane().add(tnombre);
		tnombre.setColumns(10);

		JList listcarrera = new JList();
		listcarrera.setBackground(Color.WHITE);
		listcarrera.setFont(new Font("Century Gothic", Font.BOLD, 12));
		listcarrera.setModel(new AbstractListModel() {
			String[] values = new String[] { "SISTEMAS", "QUIMICA", "INDUSTRIAL", "GESTION", "ELECTRONICA",
					"MECATRONICA", "MECANICA", "CONTABILIDAD" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listcarrera.setBounds(121, 187, 159, 150);
		frame.getContentPane().add(listcarrera);

		textcurp = new JTextField();
		textcurp.setBounds(121, 387, 221, 19);
		frame.getContentPane().add(textcurp);
		textcurp.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("GENERO");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_4.setBounds(824, 106, 90, 13);
		frame.getContentPane().add(lblNewLabel_4);

		rb2 = new JRadioButton("M");
		rb2.setForeground(Color.WHITE);
		rb2.setBackground(Color.BLACK);
		rb2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		rb2.setBounds(888, 162, 45, 21);
		frame.getContentPane().add(rb2);

		rb1 = new JRadioButton("H");
		rb1.setBackground(Color.BLACK);
		rb1.setForeground(Color.WHITE);
		rb1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		rb1.setBounds(795, 162, 51, 21);
		frame.getContentPane().add(rb1);
	

		JLabel lblNewLabel_5 = new JLabel("TURNO");
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(824, 303, 69, 13);
		frame.getContentPane().add(lblNewLabel_5);

		cb1 = new JCheckBox("MATUTINO");
		cb1.setFont(new Font("Century Gothic", Font.BOLD, 14));
		cb1.setBackground(Color.BLACK);
		cb1.setForeground(Color.WHITE);
		cb1.setBounds(675, 362, 97, 21);
		frame.getContentPane().add(cb1);

		cb2 = new JCheckBox("INTERMEDIO");
		cb2.setFont(new Font("Century Gothic", Font.BOLD, 14));
		cb2.setBackground(Color.BLACK);
		cb2.setForeground(Color.WHITE);
		cb2.setBounds(800, 362, 114, 21);
		frame.getContentPane().add(cb2);

		cb3 = new JCheckBox("VESPERTINO");
		cb3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		cb3.setBackground(Color.BLACK);
		cb3.setForeground(Color.WHITE);
		cb3.setBounds(937, 362, 120, 21);
		frame.getContentPane().add(cb3);

		bg.add(rb1);
		bg.add(rb2);
		
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(484, 473, 114, 49);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String nombre, carrera, curp;
				nombre = tnombre.getText();
				carrera = (String) listcarrera.getSelectedValue();
				curp = textcurp.getText();
				JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nCarrera: " + carrera + "\nCurp: " + curp);
				validarrbtn();
				validarcb();
			}

		});
		frame.getContentPane().add(btnNewButton);

	}
}
