package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoAmigo extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textProfesion;
	private JTextField textPais;
	private JTextField textCarga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoAmigo frame = new InfoAmigo(Usuario,Profesion,Pais);
					frame.setVisible(true);
		     		} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static String Usuario;
	public static String Profesion;
	public static String Pais;
//public static int Carga;

	/**
	 * Create the frame.
	 */
	public InfoAmigo(String Usuario, String Profesion, String Pais ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nombre y Apellido");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(12, 69, 150, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblProfesion = new JLabel("Profesion");
		lblProfesion.setFont(new Font("Arial", Font.PLAIN, 17));
		lblProfesion.setBounds(12, 133, 150, 16);
		contentPane.add(lblProfesion);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Arial", Font.PLAIN, 17));
		lblPais.setBounds(12, 209, 150, 16);
		contentPane.add(lblPais);
		
		JLabel lblCargaDeTrabajo = new JLabel("Carga de Trabajo");
		lblCargaDeTrabajo.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCargaDeTrabajo.setBounds(12, 280, 150, 16);
		contentPane.add(lblCargaDeTrabajo);
		
		JLabel lblInformacionDeLa = new JLabel("Informacion de la Persona");
		lblInformacionDeLa.setBounds(181, 13, 167, 16);
		contentPane.add(lblInformacionDeLa);
		
		textNombre = new JTextField();
		textNombre.setText(Usuario);
		textNombre.setBorder(null);
		textNombre.setEnabled(false);
		textNombre.setEditable(false);
		textNombre.setBounds(218, 67, 239, 22);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textProfesion = new JTextField();
		textProfesion.setText(Profesion);
		textProfesion.setBorder(null);
		textProfesion.setEnabled(false);
		textProfesion.setEditable(false);
		textProfesion.setColumns(10);
		textProfesion.setBounds(218, 131, 239, 22);
		contentPane.add(textProfesion);
		
		textPais = new JTextField();
		textPais.setText(Pais);
		textPais.setBorder(null);
		textPais.setEnabled(false);
		textPais.setEditable(false);
		textPais.setColumns(10);
		textPais.setBounds(218, 207, 239, 22);
		contentPane.add(textPais);
		
		textCarga = new JTextField();
		//castear a string ya q es un Entero textCarga.setText(Carga);
		textCarga.setBorder(null);
		textCarga.setEnabled(false);
		textCarga.setEditable(false);
		textCarga.setColumns(10);
		textCarga.setBounds(218, 278, 239, 22);
		contentPane.add(textCarga);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnTerminar.setBounds(12, 369, 150, 32);
		contentPane.add(btnTerminar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//PARAMETROS 
				dispose();
				Editar e = new Editar();
				e.setVisible(true);
			}
		});
		btnEditar.setBounds(378, 370, 150, 31);
		contentPane.add(btnEditar);
	}

}
