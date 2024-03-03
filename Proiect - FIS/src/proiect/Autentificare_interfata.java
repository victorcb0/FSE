package proiect;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Autentificare_interfata extends JFrame {

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
		try (BufferedReader reader1 = new BufferedReader(new FileReader("Colete.txt"))) {
			ArrayList<Colet_clasa> colete = new ArrayList<Colet_clasa>();
			String str1;
			String[] str2;
			String[] str3, str4, str5;
			str1 = reader1.readLine();
			while ((str1 = reader1.readLine()) != null)
			{
				str2 = str1.split(";");
				str3 = str2[20].split("/");
				str4 = str2[21].split("/");
				str5 = str2[22].split("/");
				Calendar calendar1 = Calendar.getInstance(), calendar2 = Calendar.getInstance(), calendar3 = Calendar.getInstance();
				if (!str3[0].equals("null"))
					calendar1.set(Integer.parseInt(str3[4]), Integer.parseInt(str3[3]), Integer.parseInt(str3[2]), Integer.parseInt(str3[0]), 
						Integer.parseInt(str3[1]));
				else
					calendar1 = null;
				if (!str4[0].equals("null"))
					calendar2.set(Integer.parseInt(str4[4]), Integer.parseInt(str4[3]), Integer.parseInt(str4[2]), Integer.parseInt(str4[0]), 
						Integer.parseInt(str4[1]));
				else
					calendar2 = null;
				if (!str5[0].equals("null"))
					calendar3.set(Integer.parseInt(str5[2]), Integer.parseInt(str5[1]), Integer.parseInt(str5[0]));
				else
					calendar3 = null;
				colete.add(new Colet_clasa(str2[0], str2[1], str2[2], str2[3], str2[4], str2[5], str2[6], str2[7], str2[8], str2[9],
						Status.valueOf(str2[10]), Double.parseDouble(str2[11]), Categorie_speciala.valueOf(str2[12]), Integer.parseInt(str2[13]), 
						Double.parseDouble(str2[14]), Integer.parseInt(str2[15]), str2[16], str2[17], str2[18], str2[19], calendar1, calendar2,
						calendar3, Integer.parseInt(str2[23]), str2[24]));
			}
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Autentificare_interfata frame = new Autentificare_interfata(colete);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	/**
	 * Create the frame.
	 */
	public Autentificare_interfata(ArrayList<Colet_clasa> colete) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLog_In = new JLabel("Log In");
		lblLog_In.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLog_In.setBounds(180, 23, 59, 21);
		contentPane.add(lblLog_In);
		
		JLabel lblUtilizator = new JLabel("Utilizator");
		lblUtilizator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUtilizator.setBounds(54, 74, 59, 21);
		contentPane.add(lblUtilizator);
		
		textUtilizator = new JTextField();
		textUtilizator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textUtilizator.setBounds(123, 74, 171, 22);
		contentPane.add(textUtilizator);
		textUtilizator.setColumns(10);
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParola.setBounds(54, 116, 59, 21);
		contentPane.add(lblParola);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(123, 117, 171, 21);
		contentPane.add(passwordField);
		
		JLabel lblCredentiale_gresite = new JLabel("Utilizator sau parola gresita");
		lblCredentiale_gresite.setForeground(Color.RED);
		lblCredentiale_gresite.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCredentiale_gresite.setBounds(123, 144, 171, 17);
		contentPane.add(lblCredentiale_gresite);
		lblCredentiale_gresite.setVisible(false);
		
		JButton btnAutentificare = new JButton("Autentificare");
		btnAutentificare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					try (BufferedReader reader = new BufferedReader(new FileReader("Account.txt"))) {
						String str;
						String[] str1;
						while ((str = reader.readLine()) != null)
						{
							str1 = str.split(";");
							if(str1[0].equals(textUtilizator.getText()) && str1[1].equals(String.valueOf(passwordField.getPassword())))
							{
								lblCredentiale_gresite.setVisible(false);
								if(str1[2].equals("client"))
								{
									dispose();
									new Colete_client_interfata(str1[0], colete).setVisible(true);
								}
								else if((str1[2].equals("functionar")))
								{
									dispose();
									new Clienti_functionar_interfata(colete).setVisible(true);
								}
								else if((str1[2].equals("curier")))
								{
									dispose();
									new Colete_curier_interfata(colete).setVisible(true);
								}
								break;
							}
							else
							{
								lblCredentiale_gresite.setVisible(true);
							}
						}
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAutentificare.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAutentificare.setBounds(143, 171, 125, 21);
		contentPane.add(btnAutentificare);
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIesire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIesire.setBounds(351, 171, 75, 21);
		contentPane.add(btnIesire);
		
	}
}
