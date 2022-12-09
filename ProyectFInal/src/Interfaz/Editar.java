package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import Bot.Bot;
import Bot.Seleccionables;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Editar extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar frame = new Editar();
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
	public Editar() {
		setTitle("Editar Amigo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Nombre y Apellido");
		label.setFont(new Font("Arial", Font.PLAIN, 17));
		label.setBounds(12, 69, 150, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Profesion");
		label_1.setFont(new Font("Arial", Font.PLAIN, 17));
		label_1.setBounds(12, 133, 150, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Pais");
		label_2.setFont(new Font("Arial", Font.PLAIN, 17));
		label_2.setBounds(12, 209, 150, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Carga de Trabajo");
		label_3.setFont(new Font("Arial", Font.PLAIN, 17));
		label_3.setBounds(12, 280, 150, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Informacion de la Persona");
		label_4.setBounds(117, 13, 167, 16);
		contentPane.add(label_4);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(181, 69, 239, 22);
		contentPane.add(textNombre);
		
		JComboBox<String> comboBoxPais = new JComboBox<String>();
		comboBoxPais.setBounds(181, 209, 239, 22);
		String [] lista_Pais = Seleccionables.getPais();
		Seleccionables.llenarJComboBox(comboBoxPais, lista_Pais);
		contentPane.add(comboBoxPais);
		
		JComboBox<String> comboBoxTrabajo = new JComboBox<String>();
		comboBoxTrabajo.setBounds(181, 280, 239, 22);
		String [] lista_CargaTrabajo = Seleccionables.getCarga_Trabajo();
		Seleccionables.llenarJComboBox(comboBoxTrabajo, lista_CargaTrabajo);
		contentPane.add(comboBoxTrabajo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(323, 352, 97, 25);
		contentPane.add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal p = new Principal();
				p.setVisible(true);
				dispose();
			}
		});
		btnGuardar.setBounds(12, 352, 97, 25);
		contentPane.add(btnGuardar);
		
		JComboBox<String> comboProfesion = new JComboBox<String>();
		String [] lista_Profesiones = Seleccionables.getProfesiones();
		Seleccionables.llenarJComboBox(comboProfesion, lista_Profesiones);
		//comboProfesion.addItem(Seleccionables.getProfesiones());
	
		comboProfesion.setBounds(181, 131, 239, 22);
		contentPane.add(comboProfesion);
	}
}
