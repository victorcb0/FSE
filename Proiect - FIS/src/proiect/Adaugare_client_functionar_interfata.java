package proiect;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adaugare_client_functionar_interfata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUtilizator;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Autentificare_interfata.main(args);
	}

	/**
	 * Create the frame.
	 */
	public Adaugare_client_functionar_interfata(ArrayList<Colet_clasa> colete) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompleteaza = new JLabel("Completeaza casetele");
		lblCompleteaza.setForeground(Color.RED);
		lblCompleteaza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCompleteaza.setBounds(159, 127, 137, 19);
		contentPane.add(lblCompleteaza);
		lblCompleteaza.setVisible(false);
		
		JLabel lblClient_nou = new JLabel("Client nou");
		lblClient_nou.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClient_nou.setBounds(187, 10, 76, 19);
		contentPane.add(lblClient_nou);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					new Clienti_functionar_interfata(colete).setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnInapoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInapoi.setBounds(10, 151, 85, 21);
		contentPane.add(btnInapoi);
		
		JButton btnAdauga_client = new JButton("Adauga client");
		btnAdauga_client.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCompleteaza.setVisible(false);
				if (!(textUtilizator.getText().isBlank() || String.valueOf(passwordField.getPassword()).isBlank()))
				{
					try {
						FileWriter fw = new FileWriter("Account.txt", true);
						fw.write("\n" + textUtilizator.getText() + ";" + String.valueOf(passwordField.getPassword()) + ";" + "client");
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					dispose();
					try {
						new Clienti_functionar_interfata(colete).setVisible(true);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				else
					lblCompleteaza.setVisible(true);
			}
		});
		btnAdauga_client.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdauga_client.setBounds(156, 151, 137, 21);
		contentPane.add(btnAdauga_client);
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIesire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIesire.setBounds(353, 151, 76, 21);
		contentPane.add(btnIesire);
		
		JLabel lblUtilizator = new JLabel("Utilizator");
		lblUtilizator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUtilizator.setBounds(80, 58, 59, 21);
		contentPane.add(lblUtilizator);
		
		textUtilizator = new JTextField();
		textUtilizator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textUtilizator.setColumns(10);
		textUtilizator.setBounds(149, 58, 171, 22);
		contentPane.add(textUtilizator);
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParola.setBounds(80, 100, 59, 21);
		contentPane.add(lblParola);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(149, 101, 171, 21);
		contentPane.add(passwordField);

	}
}
