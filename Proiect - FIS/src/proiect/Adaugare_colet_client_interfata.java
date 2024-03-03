package proiect;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Adaugare_colet_client_interfata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNume_expeditor;
	private JTextField textPrenume_expeditor;
	private JTextField textNr_telefon_expeditor;
	private JTextField textAdresa_expeditor;
	private JTextField textAdresa_destinatar;
	private JTextField textNr_telefon_destinatar;
	private JTextField textPrenume_destinatar;
	private JTextField textNume_destinatar;

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
	public Adaugare_colet_client_interfata(String client, ArrayList<Colet_clasa> colete) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("Rute.txt"))) {
			String str = reader.readLine();
			String[] str1 = str.split(" ");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 691, 334);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblCompleteaza = new JLabel("Completeaza casetele");
			lblCompleteaza.setForeground(Color.RED);
			lblCompleteaza.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCompleteaza.setBounds(269, 246, 144, 21);
			contentPane.add(lblCompleteaza);
			lblCompleteaza.setVisible(false);

			JLabel lblAdaugare_informatie_colet = new JLabel("Adaugare informatie colet");
			lblAdaugare_informatie_colet.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblAdaugare_informatie_colet.setBounds(236, 10, 202, 21);
			contentPane.add(lblAdaugare_informatie_colet);
			
			JPanel panelExpeditor = new JPanel();
			panelExpeditor.setBounds(10, 73, 302, 176);
			contentPane.add(panelExpeditor);
			panelExpeditor.setLayout(null);
			
			textAdresa_expeditor = new JTextField();
			textAdresa_expeditor.setBounds(130, 109, 155, 19);
			panelExpeditor.add(textAdresa_expeditor);
			textAdresa_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textAdresa_expeditor.setColumns(10);
			
			textNr_telefon_expeditor = new JTextField();
			textNr_telefon_expeditor.setBounds(130, 77, 155, 19);
			panelExpeditor.add(textNr_telefon_expeditor);
			textNr_telefon_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textNr_telefon_expeditor.setColumns(10);
			
			textPrenume_expeditor = new JTextField();
			textPrenume_expeditor.setBounds(130, 45, 155, 19);
			panelExpeditor.add(textPrenume_expeditor);
			textPrenume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textPrenume_expeditor.setColumns(10);
			
			textNume_expeditor = new JTextField();
			textNume_expeditor.setBounds(130, 13, 155, 19);
			panelExpeditor.add(textNume_expeditor);
			textNume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textNume_expeditor.setColumns(10);
			
			JLabel lblNume_expeditor = new JLabel("Nume");
			lblNume_expeditor.setBounds(75, 18, 45, 13);
			panelExpeditor.add(lblNume_expeditor);
			lblNume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblPrenume_expeditor = new JLabel("Prenume");
			lblPrenume_expeditor.setBounds(57, 49, 63, 13);
			panelExpeditor.add(lblPrenume_expeditor);
			lblPrenume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblNr_telefon_expeditor = new JLabel("Numar de telefon");
			lblNr_telefon_expeditor.setBounds(10, 80, 110, 13);
			panelExpeditor.add(lblNr_telefon_expeditor);
			lblNr_telefon_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblAdresa_expeditor = new JLabel("Adresa");
			lblAdresa_expeditor.setBounds(75, 111, 45, 13);
			panelExpeditor.add(lblAdresa_expeditor);
			lblAdresa_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblOras_expeditor = new JLabel("Oras");
			lblOras_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblOras_expeditor.setBounds(85, 142, 40, 13);
			panelExpeditor.add(lblOras_expeditor);
			
			JComboBox<?> comboBoxOras_expeditor = new JComboBox<Object>(str1);
			comboBoxOras_expeditor.setEditable(true);
			comboBoxOras_expeditor.setBounds(130, 140, 155, 21);
			panelExpeditor.add(comboBoxOras_expeditor);
			
			JLabel lblInformatii_expeditor = new JLabel("Informatii expeditor");
			lblInformatii_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblInformatii_expeditor.setBounds(112, 54, 134, 21);
			contentPane.add(lblInformatii_expeditor);
			
			JPanel panelDestinatar = new JPanel();
			panelDestinatar.setLayout(null);
			panelDestinatar.setBounds(347, 73, 310, 176);
			contentPane.add(panelDestinatar);
			
			textAdresa_destinatar = new JTextField();
			textAdresa_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textAdresa_destinatar.setColumns(10);
			textAdresa_destinatar.setBounds(137, 106, 155, 19);
			panelDestinatar.add(textAdresa_destinatar);
			
			textNr_telefon_destinatar = new JTextField();
			textNr_telefon_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textNr_telefon_destinatar.setColumns(10);
			textNr_telefon_destinatar.setBounds(137, 74, 155, 19);
			panelDestinatar.add(textNr_telefon_destinatar);
			
			textPrenume_destinatar = new JTextField();
			textPrenume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textPrenume_destinatar.setColumns(10);
			textPrenume_destinatar.setBounds(137, 42, 155, 19);
			panelDestinatar.add(textPrenume_destinatar);
			
			textNume_destinatar = new JTextField();
			textNume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textNume_destinatar.setColumns(10);
			textNume_destinatar.setBounds(137, 10, 155, 19);
			panelDestinatar.add(textNume_destinatar);
			
			JLabel lblNume_destinatar = new JLabel("Nume");
			lblNume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNume_destinatar.setBounds(84, 15, 43, 13);
			panelDestinatar.add(lblNume_destinatar);
			
			JLabel lblPrenume_destinatar = new JLabel("Prenume");
			lblPrenume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPrenume_destinatar.setBounds(64, 46, 63, 13);
			panelDestinatar.add(lblPrenume_destinatar);
			
			JLabel lblNr_telefon_destinatar = new JLabel("Numar de telefon");
			lblNr_telefon_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNr_telefon_destinatar.setBounds(10, 77, 117, 13);
			panelDestinatar.add(lblNr_telefon_destinatar);
			
			JLabel lblAdresa_destinatar = new JLabel("Adresa");
			lblAdresa_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblAdresa_destinatar.setBounds(76, 108, 51, 13);
			panelDestinatar.add(lblAdresa_destinatar);
			
			JLabel lblOras_destinatie = new JLabel("Oras destinatie");
			lblOras_destinatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblOras_destinatie.setBounds(33, 139, 94, 13);
			panelDestinatar.add(lblOras_destinatie);
			
			JComboBox<?> comboBoxOras_destinatie = new JComboBox<Object>(str1);
			comboBoxOras_destinatie.setEditable(true);
			comboBoxOras_destinatie.setBounds(137, 135, 155, 21);
			panelDestinatar.add(comboBoxOras_destinatie);
			
			JLabel lblInformatii_destinatar = new JLabel("Informatii destinatar");
			lblInformatii_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblInformatii_destinatar.setBounds(442, 54, 144, 21);
			contentPane.add(lblInformatii_destinatar);
			
			JButton btnInapoi = new JButton("Inapoi");
			btnInapoi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					new Colete_client_interfata(client, colete).setVisible(true);
				}
			});
			btnInapoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnInapoi.setBounds(10, 271, 85, 21);
			contentPane.add(btnInapoi);
			
			JButton btnIesire = new JButton("Iesire");
			btnIesire.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnIesire.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnIesire.setBounds(581, 269, 76, 21);
			contentPane.add(btnIesire);
			
			JButton btnAdauga = new JButton("Adauga");
			btnAdauga.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblCompleteaza.setVisible(false);
					if (!(textNume_expeditor.getText().isBlank() || textPrenume_expeditor.getText().isBlank() || 
							textNr_telefon_expeditor.getText().isBlank() || textAdresa_expeditor.getText().isBlank() ||
							comboBoxOras_expeditor.getSelectedItem().toString().isBlank() || textNume_destinatar.getText().isBlank() ||
							textPrenume_destinatar.getText().isBlank() || textNr_telefon_destinatar.getText().isBlank() ||
							textAdresa_destinatar.getText().isBlank() || comboBoxOras_destinatie.getSelectedItem().toString().isBlank()))
					{
						String[] str = colete.get(colete.size() - 1).getNume_colet().split("t");
						int nr_colet = Integer.parseInt(str[1]) + 1;
						String str2 = String.format("%02d", nr_colet);
						colete.add(new Colet_clasa(textNume_expeditor.getText(), textPrenume_expeditor.getText(), textNr_telefon_expeditor.getText(), 
								textAdresa_expeditor.getText(), comboBoxOras_expeditor.getSelectedItem().toString(), textNume_destinatar.getText(), textPrenume_destinatar.getText(), 
								textNr_telefon_destinatar.getText(), textAdresa_destinatar.getText(), comboBoxOras_destinatie.getSelectedItem().toString(),  
								Status.valueOf("In_proces"), 0, Categorie_speciala.valueOf("Niciuna"), 0, 0, 0, client, "colet" + str2, "0", null, null, null,
								null, 0, comboBoxOras_expeditor.getSelectedItem().toString()));
						try {
							colete.get(colete.size() - 1).Salvare_fisier();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						dispose();
						new Colete_client_interfata(client, colete).setVisible(true);
					}
					else
						lblCompleteaza.setVisible(true);
				}
			});

			btnAdauga.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnAdauga.setBounds(304, 269, 85, 21);
			contentPane.add(btnAdauga);
			
		}
	}
}
