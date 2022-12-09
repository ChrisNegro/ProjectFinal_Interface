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

public class AdminPrincipal extends JFrame {

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
					AdminPrincipal frame = new AdminPrincipal();
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
	public AdminPrincipal() {
		setTitle("Panel de Administracion");
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBuscar.setBounds(12, 13, 59, 28);
		contentPane.add(lblBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 64, 521, 370);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		model.addColumn("Nombre");
		model.addColumn("Profesion");
		scrollPane.setViewportView(table);
		
		final JComboBox<String> comboFiltro = new JComboBox<String>();
		comboFiltro.setBounds(67, 17, 338, 22);
		String [] lista_Opciones = Seleccionables.getOptions();
		Seleccionables.llenarJComboBox(comboFiltro, lista_Opciones);
		contentPane.add(comboFiltro);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		});
		btnCerrarSesion.setBounds(379, 448, 135, 25);
		contentPane.add(btnCerrarSesion);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(comboFiltro.getSelectedIndex()){
				case 1:
					//Mostrar comunidades o proyectos para luego mostrar sus integrantes
					break;
				case 2:
					//Los Forevers Alone que no tienen amigos
					break;
				case 3:
					//Los Populares hijos de papa que todos son sus amigos
					break;
				}
			}
		});
		btnBuscar.setBounds(417, 16, 97, 25);
		contentPane.add(btnBuscar);
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
