package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;

import Bot.Seleccionables;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class BusquedaAvanzada extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusquedaAvanzada frame = new BusquedaAvanzada();
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
	public BusquedaAvanzada() {
		setResizable(false);
		setFont(null);
		setForeground(Color.LIGHT_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\christian\\Desktop\\Mis_Cosas\\Universidad\\Curso 2\\DPPO\\eclipse-jee-kepler-R-win32-x86_64\\eclipse\\Proyecto\\ProyectFInal\\Img\\Iconos\\\u00EDndice.png"));
		setTitle("Busqueda Avanzada");
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 577);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 96, 554, 370);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		model.addColumn("Nombre");
		model.addColumn("Profesion");
		scrollPane.setViewportView(table);
		
		final JComboBox<String> comboFiltro = new JComboBox<String>();
		comboFiltro.setBackground(Color.WHITE);
		comboFiltro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int opc = (int)comboFiltro.getSelectedIndex();
				switch(opc){
				case 1:
					System.out.println("FUNCIONA el 1");
					break;
				case 2:
					System.out.println("FUNCIONA el 2");
					break;
				case 3:
					System.out.println("FUNCIONA el 3");
					break;
				}
			}
		});
		comboFiltro.setBounds(111, 40, 431, 32);
		String [] lista_Opciones = Seleccionables.getOptions();
		Seleccionables.llenarJComboBox(comboFiltro, lista_Opciones);
		contentPane.add(comboFiltro);
		
		JButton btnCerrarSesion = new JButton("Cerrar ");
		btnCerrarSesion.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCerrarSesion.setBackground(Color.WHITE);
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCerrarSesion.setBounds(363, 479, 168, 38);
		contentPane.add(btnCerrarSesion);
		
		JButton btnMostrarInformacion = new JButton("Mostrar Informacion");
		btnMostrarInformacion.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMostrarInformacion.setBackground(Color.WHITE);
		btnMostrarInformacion.setBounds(22, 479, 189, 38);
		contentPane.add(btnMostrarInformacion);
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
