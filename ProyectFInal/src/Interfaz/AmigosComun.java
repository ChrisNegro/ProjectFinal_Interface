package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class AmigosComun extends JFrame {

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
					AmigosComun frame = new AmigosComun();
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
	public AmigosComun() {
		setResizable(false);
		setBackground(SystemColor.desktop);
		setTitle("Amigos en comun");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 582);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 63, 320, 406);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		scrollPane.setViewportView(table);
		
		JButton btnMandarSolicitud = new JButton("Enviar Solicitud");
		btnMandarSolicitud.setBackground(SystemColor.menu);
		btnMandarSolicitud.setForeground(Color.BLACK);
		btnMandarSolicitud.setFont(new Font("Arial", Font.BOLD, 14));
		btnMandarSolicitud.setBounds(12, 482, 157, 40);
		contentPane.add(btnMandarSolicitud);
		
		final JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBackground(SystemColor.menu);
		btnCerrar.setForeground(Color.BLACK);
		btnCerrar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCerrar.setBounds(181, 482, 151, 40);
		contentPane.add(btnCerrar);
		
		JLabel lblAmigosEnComun = new JLabel("Amigos en Comun");
		lblAmigosEnComun.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAmigosEnComun.setBounds(71, 25, 194, 25);
		contentPane.add(lblAmigosEnComun);
		setLocationRelativeTo(null);
	}
}
