package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import Bot.Bot;
import Bot.Seleccionables;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class ProjectChat extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textEscrito;
	private DefaultTableModel model;
	private JScrollPane scrollPane;
	private JLabel lblListaDeAmigos;
	private JButton btnMostrarInformacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectChat frame = new ProjectChat();
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
	public ProjectChat() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\christian\\Desktop\\Mis_Cosas\\Universidad\\Curso 2\\DPPO\\eclipse-jee-kepler-R-win32-x86_64\\eclipse\\Proyecto\\ProyectFInal\\Img\\Iconos\\icons8-abrir-carpeta-50.png"));
		setTitle("Proyecto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 622);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Editar Proyecto");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAadirAmigo = new JMenuItem("A\u00F1adir Amigo");
		mntmAadirAmigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BusquedaAvanzada a = new BusquedaAvanzada();
				a.setVisible(true);
			}
		});
		mntmAadirAmigo.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmAadirAmigo);
		
		JMenuItem mntmEliminarProyecto = new JMenuItem("Eliminar Proyecto");
		mntmEliminarProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//eliminar el proyecto donde se tiene 
			}
		});
		mntmEliminarProyecto.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmEliminarProyecto);
		
		JMenu mnCerrarProyecto = new JMenu("Cerrar Proyecto");
		menuBar.add(mnCerrarProyecto);
		
		JMenuItem mntmTerminar = new JMenuItem("Terminar");
		mntmTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Principal p = new Principal();
				p.setVisible(true);
			}
		});
		mntmTerminar.setHorizontalAlignment(SwingConstants.LEFT);
		mnCerrarProyecto.add(mntmTerminar);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Visible();
				VisibleChat();
				VisibleButon();
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setVisible(false);
		scrollPane.setBounds(487, 83, 197, 415);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		scrollPane.setViewportView(table);
		
		JComboBox<String> comboProject = new JComboBox<String>();
		comboProject.setBounds(29, 50, 426, 25);
	/*	
	   String [] lista_Projects = Seleccionables.getProject();
		if(lista_Projects.isEmpty()){
			JOptionPane.showMessageDialog(null, "No Tienes proyectos creados");	
		}else
			Seleccionables.llenarJComboBox(comboProject, lista_Projects);*/
		contentPane.add(comboProject);
		
		JLabel lblProyectosActuales = new JLabel("Lista de Proyectos");
		lblProyectosActuales.setFont(new Font("Arial", Font.PLAIN, 21));
		lblProyectosActuales.setBounds(32, 12, 188, 25);
		contentPane.add(lblProyectosActuales);
		
		lblListaDeAmigos = new JLabel("Lista de Amigos");
		lblListaDeAmigos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblListaDeAmigos.setVisible(false);
		lblListaDeAmigos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeAmigos.setBounds(487, 54, 197, 16);
		contentPane.add(lblListaDeAmigos);
		
		btnMostrarInformacion = new JButton("Mostrar Informacion");
		btnMostrarInformacion.setVisible(false);
		btnMostrarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//tomar valor de la tabla y pasarlo a info amigo
			}
		});
		btnMostrarInformacion.setBounds(487, 511, 200, 25);
		contentPane.add(btnMostrarInformacion);
		
		final JTextArea txtrAcaSeria = new JTextArea();
		txtrAcaSeria.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrAcaSeria.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		txtrAcaSeria.setBackground(Color.WHITE);
		txtrAcaSeria.setEditable(false);
		txtrAcaSeria.setBounds(29, 96, 426, 378);
		contentPane.add(txtrAcaSeria);
		
		textEscrito = new JTextField();
		textEscrito.setFont(new Font("Arial", Font.PLAIN, 20));
		textEscrito.setBorder(null);
		textEscrito.setBounds(31, 477, 324, 25);
		contentPane.add(textEscrito);
		textEscrito.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> conversacion = new ArrayList<>();

				//respuestas predeterminadas
				conversacion.add(Bot.Respuesta(textEscrito.getText().toString()));
				for(int i = 0 ; i < conversacion.size() ; i++){
				   txtrAcaSeria.setText(conversacion.get(i));
				}
				textEscrito.setText("");
				
			}
		});
		btnEnviar.setBounds(358, 474, 97, 34);
		contentPane.add(btnEnviar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 508, 324, 2);
		contentPane.add(separator);
	}
	
	private void Visible() {
		// TODO Auto-generated method stub
		if(scrollPane.isVisible()){
			scrollPane.setVisible(false);
		}else
			scrollPane.setVisible(true);
	}
	
	private void VisibleButon() {
		// TODO Auto-generated method stub
		if(btnMostrarInformacion.isVisible()){
			btnMostrarInformacion.setVisible(false);
		}else
			btnMostrarInformacion.setVisible(true);
	}
	
	private void VisibleChat() {
		// TODO Auto-generated method stub
		if(lblListaDeAmigos.isVisible()){
			lblListaDeAmigos.setVisible(false);
		}else
			lblListaDeAmigos.setVisible(true);
	}
}
