package Controle;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Marca extends JFrame {
	
	Connection con = null;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marca frame = new Marca();
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
	public Marca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		 Connection con = null; con = DAO.conectar(); if (con != null) {
			  System.out.println("Banco conectado"); } else {
			  System.out.println("Erro de conexão"); }
		
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Marca.class.getResource("/icones/iconfinder_price-tag_1291777.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos produtos = new Produtos();
				produtos.setVisible(true);
				
			}
		});
		btnNewButton_2.setToolTipText("Produtos");
		btnNewButton_2.setBounds(311, 160, 90, 90);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quantidade quantidade = new Quantidade();
				quantidade.setVisible(true);
							
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Marca.class.getResource("/icones/iconfinder_stock_4172394.png")));
		btnNewButton.setToolTipText("Quantidade");
		btnNewButton.setBounds(10, 160, 90, 90);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Marca.class.getResource("/icones/iconfinder_price-tag_3339033.png")));
		btnNewButton_1.setToolTipText("Preco");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preco preco = new Preco();
				preco.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(159, 160, 90, 90);
		contentPane.add(btnNewButton_1);
		
}
}




 