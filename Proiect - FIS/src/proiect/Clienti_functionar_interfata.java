package proiect;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Clienti_functionar_interfata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
	 * @throws IOException 
	 */
	public Clienti_functionar_interfata(ArrayList<Colet_clasa> colete) throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClienti = new JLabel("Clienti");
		lblClienti.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblClienti.setBounds(188, 10, 59, 21);
		contentPane.add(lblClienti);
		
		String str;
		String[] str1;
		try (BufferedReader reader = new BufferedReader(new FileReader("account.txt"))) {
			ArrayList<String> clienti = new ArrayList<String>();
			clienti.add("Toti");
			while((str = reader.readLine()) != null)
			{
				str1 = str.split(";");
				if (str1[2].equals("client"))
				{
					clienti.add(str1[0]);
				}
			}
			
			JComboBox<?> comboBoxClienti = new JComboBox<Object>(clienti.toArray());
			comboBoxClienti.setBounds(40, 59, 184, 21);
			contentPane.add(comboBoxClienti);
			
			JButton btnAfisare_colete_client = new JButton("Afisare colete client");
			btnAfisare_colete_client.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					new Colete_functionar_interfata(colete, comboBoxClienti.getSelectedItem().toString()).setVisible(true);
				}
			});
			btnAfisare_colete_client.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnAfisare_colete_client.setBounds(120, 232, 193, 21);
			contentPane.add(btnAfisare_colete_client);
		}
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Autentificare_interfata(colete).setVisible(true);
			}
		});
		btnInapoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInapoi.setBounds(10, 232, 76, 21);
		contentPane.add(btnInapoi);
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIesire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIesire.setBounds(350, 232, 76, 21);
		contentPane.add(btnIesire);
		
		JButton btnAdaugare_client = new JButton("Adaugare client");
		btnAdaugare_client.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Adaugare_client_functionar_interfata(colete).setVisible(true);
			}
		});
		btnAdaugare_client.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdaugare_client.setBounds(274, 59, 152, 21);
		contentPane.add(btnAdaugare_client);
	}
}
