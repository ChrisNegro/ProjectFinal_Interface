package Interfaz;



import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;

import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JSeparator;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;

import Bot.Bot;

import javax.swing.ImageIcon;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textEscrito;
	private DefaultTableModel model;
	private JScrollPane scrollPane;
	private JLabel lblListaDeConectados;
	private JButton btnMostrarInformacion;
	private Component btnNewButton;
	private JLabel lblO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		
		setForeground(Color.BLUE);
		setName("Princ");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\christian\\Desktop\\Mis_Cosas\\Universidad\\Curso 2\\DPPO\\eclipse-jee-kepler-R-win32-x86_64\\eclipse\\Proyecto\\ProyectFInal\\Img\\Iconos\\icons8-weixing-64.png"));
		setBackground(Color.LIGHT_GRAY);
		setTitle("Ventana Principal");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 633);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Solicitudes Entrantes");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmMostrarSolicitudesDe = new JMenuItem("Mostrar Solicitudes de Amistad");
		mntmMostrarSolicitudesDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Solicitud s = new Solicitud();
				s.setVisible(true);
			}
		});
		mnNewMenu.add(mntmMostrarSolicitudesDe);
		
		JMenuItem mntmAmigosEnComun = new JMenuItem("Amigos en Comun");
		mntmAmigosEnComun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AmigosComun A = new AmigosComun();
				A.setVisible(true);
			}
		});
		mnNewMenu.add(mntmAmigosEnComun);
		
		JMenu mnProyectos = new JMenu("Proyectos");
		menuBar.add(mnProyectos);
		
		JMenuItem mntmProyectosActuales = new JMenuItem("Lista de Proyectos");
		mntmProyectosActuales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProjectChat pc = new ProjectChat();
				pc.setVisible(true);
				dispose();
			}
		});
		mnProyectos.add(mntmProyectosActuales);
		
		JMenuItem mntmNuevoProyecto = new JMenuItem("Crear Proyecto");
		mnProyectos.add(mntmNuevoProyecto);
		
		JMenuItem menuItem = new JMenuItem("Busqueda Avanzada");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BusquedaAvanzada a = new BusquedaAvanzada();
				a.setVisible(true);
			}
		});
		mnProyectos.add(menuItem);
		
		JMenu mnCerrar = new JMenu("Finalizar");
		menuBar.add(mnCerrar);
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar Sesion");
		mntmCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		});
		mnCerrar.add(mntmCerrarSesion);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Visible();
				VisibleChat();
				VisibleButton();
				VisibleButon();
				VisibleO();
			}
		});
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setVisible(false);
		scrollPane.setBounds(11, 44, 219, 407);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(SystemColor.text);
		table.setForeground(SystemColor.desktop);
		model = new DefaultTableModel();
		model.addColumn("Nombre");
	//	final ArrayList<?> Amigos //seria la lista de amigos de la persona 
		
		scrollPane.setViewportView(table);
		
		final JTextArea txtrAcaSeria = new JTextArea();
		txtrAcaSeria.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		txtrAcaSeria.setBackground(Color.WHITE);
		txtrAcaSeria.setForeground(Color.BLACK);
		txtrAcaSeria.setEditable(false);
		txtrAcaSeria.setFont(new Font("Arial", Font.PLAIN, 19));
		txtrAcaSeria.setBounds(242, 44, 413, 445);
		contentPane.add(txtrAcaSeria);
		
		textEscrito = new JTextField();
		textEscrito.setFont(new Font("Arial", Font.PLAIN, 20));
		textEscrito.setBorder(null);
		textEscrito.setBounds(243, 489, 330, 35);
		contentPane.add(textEscrito);
		textEscrito.setColumns(10);
		
		btnMostrarInformacion = new JButton("Mostrar Informacion");
		btnMostrarInformacion.setVisible(false);
		btnMostrarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//tomar el item de la tabla y sacar toda su informacion y pasar por parametro a editar
				//tomar valor de la tabla y luego mostrar ventana de editar
				//InfoAmigo e = new InfoAmigo(PARAMETROS);
				//e.setVisible(true);
				//dispose();
			}
		});
		btnMostrarInformacion.setBorder(null);
		btnMostrarInformacion.setToolTipText("");
		btnMostrarInformacion.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMostrarInformacion.setBackground(SystemColor.control);
		btnMostrarInformacion.setBounds(26, 526, 197, 25);
		contentPane.add(btnMostrarInformacion);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.WHITE);
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEnviar.setForeground(Color.BLACK);
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
		btnEnviar.setBounds(572, 487, 84, 42);
		contentPane.add(btnEnviar);
		
		lblListaDeConectados = new JLabel("Lista de Conectados");
		lblListaDeConectados.setFont(new Font("Arial", Font.PLAIN, 14));
		lblListaDeConectados.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeConectados.setVisible(false);
		lblListaDeConectados.setBounds(26, 13, 188, 26);
		contentPane.add(lblListaDeConectados);
		
		btnNewButton = new JButton("Enviar Solicitud");
		btnNewButton.setVisible(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(23, 464, 200, 25);
		contentPane.add(btnNewButton);
		
		lblO = new JLabel("O");
		lblO.setVisible(false);
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(90, 502, 56, 16);
		contentPane.add(lblO);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(243, 527, 340, 2);
		contentPane.add(separator);
		

	}
	
	//Visibilidad
	protected void VisibleButton() {
		// TODO Auto-generated method stub
		if(btnNewButton.isVisible()){
			btnNewButton.setVisible(false);
		}else
			btnNewButton.setVisible(true);
	}

	private void VisibleO() {
		if(lblO.isVisible())
			lblO.setVisible(false);
		else
			lblO.setVisible(true);	
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
		if(lblListaDeConectados.isVisible()){
			lblListaDeConectados.setVisible(false);
		}else
			lblListaDeConectados.setVisible(true);
	}

	private void LlenarTablaAsignatura(final ArrayList<?> Amigos) {
		model.setRowCount(0);
		if(Amigos == null || Amigos.isEmpty()){
			JOptionPane.showMessageDialog(null, "No tienes amigos");
		}
		else{
	    //llenar tabla
		for(Object a : Amigos){/*
			Object[] fila = new Object[6];
			fila[0] = a.get().toString();
		}
			model.addRow(fila);
		*/}
	}					
  }
}
