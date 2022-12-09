package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Solicitud extends JFrame {

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
					Solicitud frame = new Solicitud();
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
	public Solicitud() {
		setTitle("Solicitud de Amistad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 513);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 56, 478, 340);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		scrollPane.setViewportView(table);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(SystemColor.menu);
		btnAceptar.setBounds(22, 421, 97, 25);
		contentPane.add(btnAceptar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(SystemColor.menu);
		btnEliminar.setBounds(190, 421, 97, 25);
		contentPane.add(btnEliminar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.menu);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Principal p = new Principal();
				p.setVisible(true);
			}
		});
		btnCancelar.setBounds(367, 421, 97, 25);
		contentPane.add(btnCancelar);
		
		JLabel lblListadoDeSolicitudes = new JLabel("Listado de Solicitudes Entrantes");
		lblListadoDeSolicitudes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblListadoDeSolicitudes.setBounds(12, 27, 261, 31);
		contentPane.add(lblListadoDeSolicitudes);
		setLocationRelativeTo(null);
	}
}
