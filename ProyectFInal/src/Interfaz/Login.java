package Interfaz;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import java.awt.Window.Type;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

import Bot.Seleccionables;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField textPassw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	private JLabel lblContrasena;
	private JLabel lblNombre;
	private JLabel lblPais;
	private JLabel lblProfesion;
	private JLabel lblIniciarSesion;
	private JButton btnRegistrarse;
	private JLabel lblO;
	

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Iniciar Sesion");
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 470);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		btnRegistrarse = new JButton("Registrarse ");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registrarse r = new Registrarse();
				r.setVisible(true);
			}
		});
		
		
		btnRegistrarse.setBorder(null);
		btnRegistrarse.setToolTipText("");
		btnRegistrarse.setForeground(Color.BLUE);
		btnRegistrarse.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRegistrarse.setBackground(SystemColor.control);
		btnRegistrarse.setBounds(127, 379, 192, 31);
		contentPane.add(btnRegistrarse);
		
	    lblNombre = new JLabel("Nombre");
		lblNombre.setBackground(new Color(0, 255, 255));
		lblNombre.setForeground(new Color(0, 0, 0));
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNombre.setBounds(29, 70, 103, 16);
		contentPane.add(lblNombre);
		
		lblContrasena = new JLabel("Contrasena");
		lblContrasena.setBackground(new Color(0, 255, 255));
		lblContrasena.setForeground(new Color(0, 0, 0));
		lblContrasena.setFont(new Font("Arial", Font.PLAIN, 15));
		lblContrasena.setBounds(29, 134, 103, 16);
		contentPane.add(lblContrasena);
		
		lblPais = new JLabel("Pais");
		lblPais.setBackground(new Color(0, 255, 255));
		lblPais.setForeground(new Color(0, 0, 0));
		lblPais.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPais.setBounds(29, 196, 103, 16);
		contentPane.add(lblPais);
		
		lblProfesion = new JLabel("Profesion");
		lblProfesion.setBackground(new Color(0, 255, 255));
		lblProfesion.setForeground(new Color(0, 0, 0));
		lblProfesion.setFont(new Font("Arial", Font.PLAIN, 15));
		lblProfesion.setBounds(29, 254, 103, 16);
		contentPane.add(lblProfesion);
		
		lblO = new JLabel("O");
		lblO.setBounds(223, 350, 24, 16);
		contentPane.add(lblO);
		
		lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setForeground(Color.BLACK);
		lblIniciarSesion.setFont(new Font("Arial", Font.BOLD, 18));
		lblIniciarSesion.setBounds(128, 28, 134, 16);
		contentPane.add(lblIniciarSesion);
		
		textUser = new JTextField();
		textUser.setBounds(127, 70, 192, 22);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textPassw = new JPasswordField();
		textPassw.setBounds(127, 131, 192, 22);
		contentPane.add(textPassw);
		
		final JComboBox<String> comboCountry = new JComboBox<String>();
		comboCountry.setBounds(128, 199, 191, 22);
		String [] lista_Pais = Seleccionables.getPais();
		Seleccionables.llenarJComboBox(comboCountry, lista_Pais);
		contentPane.add(comboCountry);

		final JComboBox<String> comboWork = new JComboBox<String>();
		comboWork.setBounds(127, 254, 192, 22);
		String [] lista_Profesiones = Seleccionables.getProfesiones();
		Seleccionables.llenarJComboBox(comboWork, lista_Profesiones);
		contentPane.add(comboWork);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Obtencion de Variables
				
				String User = textUser.getText().toString();
				@SuppressWarnings("deprecation")
				String Password = textPassw.getText().toString();			
				comboCountry.getSelectedItem().toString();
				comboWork.getSelectedItem().toString();
				
			//Acceso como Administrador
			//Aca cuando se va a iniciar sesion, se necesita de datos ya inicializados para comprobar q el nombre y lo demas este correcto
				
				  if(UsuarioCliente(User, Password)&& 
						 comboCountry.getSelectedIndex()!=0 
			               &&
			             comboWork.getSelectedIndex()!=0){
					Principal p = new Principal();
					p.setVisible(true);
					dispose();
				}else
					JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
		  }
		});
		
		btnIniciarSesion.setFont(new Font("Arial", Font.PLAIN, 12));
		btnIniciarSesion.setBounds(127, 314, 192, 31);
		contentPane.add(btnIniciarSesion);	
	}
	
	
	
	public boolean UsuarioCliente(String User,String Password){
		boolean valido = false; 
		if(User.equalsIgnoreCase("cliente")&&Password.equalsIgnoreCase("123")){
			valido=true;
			}
	   return valido;
	}
	
	
	
}
