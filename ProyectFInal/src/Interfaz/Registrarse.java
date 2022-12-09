package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

import Bot.Seleccionables;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField textPassConf;
	private JPasswordField textPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
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
	public Registrarse() {
		setTitle("Regristo de Cuenta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de Usuario");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(12, 68, 161, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Arial", Font.PLAIN, 14));
		lblContrasena.setBounds(12, 140, 161, 16);
		contentPane.add(lblContrasena);
		
		JLabel lblConfirmarContrasena = new JLabel("Confirmar Contrase\u00F1a");
		lblConfirmarContrasena.setFont(new Font("Arial", Font.PLAIN, 14));
		lblConfirmarContrasena.setBounds(12, 223, 161, 16);
		contentPane.add(lblConfirmarContrasena);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPais.setBounds(12, 303, 161, 16);
		contentPane.add(lblPais);
		
		JLabel lblProfesion = new JLabel("Profesion");
		lblProfesion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblProfesion.setBounds(12, 381, 161, 16);
		contentPane.add(lblProfesion);
		
		textUser = new JTextField();
		textUser.setBounds(208, 65, 211, 22);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textPassConf = new JPasswordField();
		textPassConf.setBounds(208, 223, 211, 22);
		contentPane.add(textPassConf);
		
		textPass = new JPasswordField();
		textPass.setBounds(208, 137, 211, 22);
		contentPane.add(textPass);
		
		final JComboBox<String> comboCountry = new JComboBox<String>();
		comboCountry.setBounds(208, 303, 211, 22);
		String [] lista_Pais = Seleccionables.getPais();
		Seleccionables.llenarJComboBox(comboCountry, lista_Pais);
		contentPane.add(comboCountry);
		
		final JComboBox<String> comboWork = new JComboBox<String>();
		comboWork.setBounds(208, 381, 211, 22);
		String [] lista_Profesiones = Seleccionables.getProfesiones();
		Seleccionables.llenarJComboBox(comboWork, lista_Profesiones);
		contentPane.add(comboWork);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				//Tomar Datos
				int indexContry = comboCountry.getSelectedIndex();
				int indexWork = comboWork.getSelectedIndex();
				String Pass = textPass.getText().toString();
			    String PassConf = textPassConf.getText().toString();
			    
				//Validar q el nombre de usuario no exista
				 if(CorrectDates(indexContry , indexWork , Pass , PassConf)){
					
					 //Guardar Datos 
					 
					 Login l = new Login();
					 l.setVisible(true);
					
					 dispose();
				 }else
					 JOptionPane.showMessageDialog(null,"Datos Incorrectos");
			}
		});
		
		btnConfirmar.setBounds(354, 455, 101, 25);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		btnCancelar.setBounds(27, 455, 101, 25);
		contentPane.add(btnCancelar);
		
		JLabel lblIntroduzcaLosDatos = new JLabel("Introduzca los datos");
		lblIntroduzcaLosDatos.setFont(new Font("Arial", Font.PLAIN, 16));
		lblIntroduzcaLosDatos.setBounds(150, 13, 211, 16);
		contentPane.add(lblIntroduzcaLosDatos);
		

	}
	
	private boolean CorrectDates(int comboCountry, int comboWork, String textPass, String textPassConf){
		boolean done = false;
		if(comboCountry!=0 && comboWork!=0 && textPass.equals(textPassConf)){
			done = true;
		}
		return done;
	}
	
}
