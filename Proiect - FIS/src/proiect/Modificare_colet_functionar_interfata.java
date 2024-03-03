package proiect;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modificare_colet_functionar_interfata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textAdresa_expeditor;
	private JTextField textNr_de_telefon_expeditor;
	private JTextField textPrenume_expeditor;
	private JTextField textNume_expeditor;
	private JTextField textOras_expeditor;
	private JTextField textAdresa_destinatar;
	private JTextField textNr_de_telefon_destinatar;
	private JTextField textPrenume_destinatar;
	private JTextField textNume_destinatar;
	private JTextField textOras_destinatie_destinatar;
	private JTextField textGreutate;
	private JTextField textTimp;
	private JTextField textDistanta;
	private JTextField textPret;
	private JTextField textClient;
	private JTextField textNume_colet;
	private JTextField textCod;
	private JTextField textPret_suplimentar;
	private JTextField textData_de_pornire;
	private JTextField textData_de_sosire;
	private JTextField textData_limita;
	private JTextField textStatus;
	private JTextField textLocatie;

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
	public Modificare_colet_functionar_interfata(ArrayList<Colet_clasa> colete, String client, String cod_colet) throws IOException {

		Colet_clasa colet = null;
		for (int i = 0; i < colete.size(); i++)
		{
			if (colete.get(i).getNume_colet().equals(cod_colet))
			{
				colet = colete.get(i);
				break;
			}
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 588);
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBounds(10, 10, 693, 500);
		getContentPane().add(contentPane);
		
		JLabel lblInformatie_colet = new JLabel("Informatie colet");
		lblInformatie_colet.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInformatie_colet.setBounds(279, 10, 125, 21);
		contentPane.add(lblInformatie_colet);
		
		JLabel lblInformatie_expeditor = new JLabel("Informatii expeditor");
		lblInformatie_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformatie_expeditor.setBounds(112, 41, 134, 21);
		contentPane.add(lblInformatie_expeditor);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 60, 302, 176);
		contentPane.add(panel);
		
		textAdresa_expeditor = new JTextField();
		textAdresa_expeditor.setText(colet.getAdresa_expeditor());
		textAdresa_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAdresa_expeditor.setEditable(false);
		textAdresa_expeditor.setColumns(10);
		textAdresa_expeditor.setBackground(Color.WHITE);
		textAdresa_expeditor.setBounds(130, 109, 155, 19);
		panel.add(textAdresa_expeditor);
		
		textNr_de_telefon_expeditor = new JTextField();
		textNr_de_telefon_expeditor.setText(colet.getNr_telefon_expeditor());
		textNr_de_telefon_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNr_de_telefon_expeditor.setEditable(false);
		textNr_de_telefon_expeditor.setColumns(10);
		textNr_de_telefon_expeditor.setBackground(Color.WHITE);
		textNr_de_telefon_expeditor.setBounds(130, 77, 155, 19);
		panel.add(textNr_de_telefon_expeditor);
		
		textPrenume_expeditor = new JTextField();
		textPrenume_expeditor.setText(colet.getPrenume_expeditor());
		textPrenume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPrenume_expeditor.setEditable(false);
		textPrenume_expeditor.setColumns(10);
		textPrenume_expeditor.setBackground(Color.WHITE);
		textPrenume_expeditor.setBounds(130, 45, 155, 19);
		panel.add(textPrenume_expeditor);
		
		textNume_expeditor = new JTextField();
		textNume_expeditor.setText(colet.getNume_expeditor());
		textNume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNume_expeditor.setEditable(false);
		textNume_expeditor.setColumns(10);
		textNume_expeditor.setBackground(Color.WHITE);
		textNume_expeditor.setBounds(130, 13, 155, 19);
		panel.add(textNume_expeditor);
		
		JLabel lblNume_expeditor = new JLabel("Nume");
		lblNume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNume_expeditor.setBounds(75, 18, 45, 13);
		panel.add(lblNume_expeditor);
		
		JLabel lblPrenume_expeditor = new JLabel("Prenume");
		lblPrenume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrenume_expeditor.setBounds(57, 49, 63, 13);
		panel.add(lblPrenume_expeditor);
		
		JLabel lblNr_telefon_expeditor = new JLabel("Numar de telefon");
		lblNr_telefon_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNr_telefon_expeditor.setBounds(10, 80, 110, 13);
		panel.add(lblNr_telefon_expeditor);
		
		JLabel lblAdresa_expeditor = new JLabel("Adresa");
		lblAdresa_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdresa_expeditor.setBounds(75, 111, 45, 13);
		panel.add(lblAdresa_expeditor);
		
		JLabel lblOras_expeditor = new JLabel("Oras");
		lblOras_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOras_expeditor.setBounds(85, 142, 40, 13);
		panel.add(lblOras_expeditor);
		
		textOras_expeditor = new JTextField();
		textOras_expeditor.setText(colet.getOras_expeditor());
		textOras_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOras_expeditor.setEditable(false);
		textOras_expeditor.setColumns(10);
		textOras_expeditor.setBackground(Color.WHITE);
		textOras_expeditor.setBounds(130, 139, 155, 19);
		panel.add(textOras_expeditor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(347, 60, 310, 176);
		contentPane.add(panel_1);
		
		textAdresa_destinatar = new JTextField();
		textAdresa_destinatar.setText(colet.getAdresa_destinatar());
		textAdresa_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAdresa_destinatar.setEditable(false);
		textAdresa_destinatar.setColumns(10);
		textAdresa_destinatar.setBackground(Color.WHITE);
		textAdresa_destinatar.setBounds(137, 106, 155, 19);
		panel_1.add(textAdresa_destinatar);
		
		textNr_de_telefon_destinatar = new JTextField();
		textNr_de_telefon_destinatar.setText(colet.getNr_telefon_destinatar());
		textNr_de_telefon_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNr_de_telefon_destinatar.setEditable(false);
		textNr_de_telefon_destinatar.setColumns(10);
		textNr_de_telefon_destinatar.setBackground(Color.WHITE);
		textNr_de_telefon_destinatar.setBounds(137, 74, 155, 19);
		panel_1.add(textNr_de_telefon_destinatar);
		
		textPrenume_destinatar = new JTextField();
		textPrenume_destinatar.setText(colet.getPrenume_destinatar());
		textPrenume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPrenume_destinatar.setEditable(false);
		textPrenume_destinatar.setColumns(10);
		textPrenume_destinatar.setBackground(Color.WHITE);
		textPrenume_destinatar.setBounds(137, 42, 155, 19);
		panel_1.add(textPrenume_destinatar);
		
		textNume_destinatar = new JTextField();
		textNume_destinatar.setText(colet.getNume_destinatar());
		textNume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNume_destinatar.setEditable(false);
		textNume_destinatar.setColumns(10);
		textNume_destinatar.setBackground(Color.WHITE);
		textNume_destinatar.setBounds(137, 10, 155, 19);
		panel_1.add(textNume_destinatar);
		
		JLabel lblNume_destinatar = new JLabel("Nume");
		lblNume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNume_destinatar.setBounds(84, 15, 43, 13);
		panel_1.add(lblNume_destinatar);
		
		JLabel lblPrenume_destinatar = new JLabel("Prenume");
		lblPrenume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrenume_destinatar.setBounds(64, 46, 63, 13);
		panel_1.add(lblPrenume_destinatar);
		
		JLabel lblNr_telefon_destinatar = new JLabel("Numar de telefon");
		lblNr_telefon_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNr_telefon_destinatar.setBounds(10, 77, 117, 13);
		panel_1.add(lblNr_telefon_destinatar);
		
		JLabel lblAdresa_destinatar = new JLabel("Adresa");
		lblAdresa_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdresa_destinatar.setBounds(76, 108, 51, 13);
		panel_1.add(lblAdresa_destinatar);
		
		JLabel lblOras_destinatie = new JLabel("Oras destinatie");
		lblOras_destinatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOras_destinatie.setBounds(33, 139, 94, 13);
		panel_1.add(lblOras_destinatie);
		
		textOras_destinatie_destinatar = new JTextField();
		textOras_destinatie_destinatar.setText(colet.getOras_destinatie());
		textOras_destinatie_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOras_destinatie_destinatar.setEditable(false);
		textOras_destinatie_destinatar.setColumns(10);
		textOras_destinatie_destinatar.setBackground(Color.WHITE);
		textOras_destinatie_destinatar.setBounds(137, 138, 155, 19);
		panel_1.add(textOras_destinatie_destinatar);
		
		JLabel lblInformatie_destinatar = new JLabel("Informatii destinatar");
		lblInformatie_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformatie_destinatar.setBounds(442, 41, 144, 21);
		contentPane.add(lblInformatie_destinatar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 260, 302, 230);
		contentPane.add(panel_2);
		
		JLabel lblGreutate = new JLabel("Greutate");
		lblGreutate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGreutate.setBounds(58, 13, 58, 13);
		panel_2.add(lblGreutate);
		
		JLabel lblCategorie = new JLabel("Categorie");
		lblCategorie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategorie.setBounds(47, 41, 69, 18);
		panel_2.add(lblCategorie);
		
		JLabel lblTimp = new JLabel("Timp");
		lblTimp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTimp.setBounds(81, 70, 35, 24);
		panel_2.add(lblTimp);
		
		JLabel lblDistanta = new JLabel("Distanta");
		lblDistanta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDistanta.setBounds(58, 108, 58, 13);
		panel_2.add(lblDistanta);
		
		JLabel lblPret = new JLabel("Pret");
		lblPret.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPret.setBounds(81, 141, 35, 13);
		panel_2.add(lblPret);
		
		textGreutate = new JTextField();
		if (colet.getStatus().toString().equals("In_proces"))
		{
			textGreutate.setEditable(true);
			textGreutate.setText("0");
		}
		else
		{
			textGreutate.setEditable(false);
			textGreutate.setText(String.valueOf(colet.getGreutate()));
		}
		textGreutate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textGreutate.setColumns(10);
		textGreutate.setBackground(Color.WHITE);
		textGreutate.setBounds(126, 13, 155, 19);
		panel_2.add(textGreutate);
		
		textTimp = new JTextField();
		textTimp.setEditable(false);
		textTimp.setText(String.valueOf(colet.getTimp()));	
		textTimp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textTimp.setColumns(10);
		textTimp.setBackground(Color.WHITE);
		textTimp.setBounds(126, 77, 155, 19);
		panel_2.add(textTimp);
		
		textDistanta = new JTextField();
		textDistanta.setEditable(false);
		textDistanta.setText(String.valueOf(colet.getDistanta()));
		textDistanta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDistanta.setColumns(10);
		textDistanta.setBackground(Color.WHITE);
		textDistanta.setBounds(126, 109, 155, 19);
		panel_2.add(textDistanta);
		
		textPret = new JTextField();
		textPret.setText(String.valueOf(colet.getPret()));
		textPret.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPret.setEditable(false);
		textPret.setColumns(10);
		textPret.setBackground(Color.WHITE);
		textPret.setBounds(126, 141, 155, 19);
		panel_2.add(textPret);
		
		JLabel lblPret_suplimentar = new JLabel("Pret suplimentar");
		lblPret_suplimentar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPret_suplimentar.setBounds(10, 170, 106, 13);
		panel_2.add(lblPret_suplimentar);
		
		textPret_suplimentar = new JTextField();
		textPret_suplimentar.setText(String.valueOf(colet.getPret_suplimentar()));
		textPret_suplimentar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPret_suplimentar.setEditable(false);
		textPret_suplimentar.setColumns(10);
		textPret_suplimentar.setBackground(Color.WHITE);
		textPret_suplimentar.setBounds(126, 170, 155, 19);
		panel_2.add(textPret_suplimentar);
		
		textStatus = new JTextField();
		textStatus.setText(String.valueOf(colet.getStatus()));
		textStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textStatus.setEditable(false);
		textStatus.setColumns(10);
		textStatus.setBackground(Color.WHITE);
		textStatus.setBounds(126, 201, 155, 19);
		panel_2.add(textStatus);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatus.setBounds(70, 201, 46, 13);
		panel_2.add(lblStatus);
		
		String[] categorie = { "Niciuna","Fragil", "Pretios", "Periculos"};
		JComboBox<Object> comboBoxCategorie = new JComboBox<Object>(categorie);
		if (colet.getStatus().toString().equals("In_proces"))
		{
			comboBoxCategorie.setEditable(true);
			comboBoxCategorie.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxCategorie.setBackground(Color.WHITE);
			comboBoxCategorie.setBounds(126, 42, 155, 21);
			panel_2.add(comboBoxCategorie);
		}
		else
		{
			JTextField t1 = new JTextField(String.valueOf(colet.getCategorie()));
			t1.setEditable(false);
			t1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			t1.setBackground(Color.WHITE);
			t1.setBounds(126, 42, 155, 21);
			panel_2.add(t1);
		}

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(347, 260, 310, 230);
		contentPane.add(panel_3);
		
		JLabel lblNume_colet = new JLabel("Nume colet");
		lblNume_colet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNume_colet.setBounds(51, 47, 71, 17);
		panel_3.add(lblNume_colet);
		
		JLabel lblCod = new JLabel("Cod");
		lblCod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCod.setBounds(97, 79, 25, 17);
		panel_3.add(lblCod);
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClient.setBounds(87, 15, 35, 17);
		panel_3.add(lblClient);
		
		textClient = new JTextField();
		textClient.setText(colet.getClient());
		textClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textClient.setEditable(false);
		textClient.setColumns(10);
		textClient.setBackground(Color.WHITE);
		textClient.setBounds(132, 14, 155, 19);
		panel_3.add(textClient);
		
		textNume_colet = new JTextField();
		textNume_colet.setText(colet.getNume_colet());
		textNume_colet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNume_colet.setEditable(false);
		textNume_colet.setColumns(10);
		textNume_colet.setBackground(Color.WHITE);
		textNume_colet.setBounds(132, 47, 155, 19);
		panel_3.add(textNume_colet);
		
		textCod = new JTextField();
		textCod.setText(colet.getCod());
		textCod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCod.setEditable(false);
		textCod.setColumns(10);
		textCod.setBackground(Color.WHITE);
		textCod.setBounds(132, 80, 155, 19);
		panel_3.add(textCod);
		
		JLabel lblData_de_pornire = new JLabel("Data de pornire");
		lblData_de_pornire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblData_de_pornire.setBounds(24, 108, 98, 13);
		panel_3.add(lblData_de_pornire);
		
		Calendar calendar = Calendar.getInstance();
		calendar = colet.getData_de_pornire();
		String str;
		if (calendar == null)
			str = null;
		else
			str = String.format("%02d:%02d %02d.%02d.%04d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
					calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
		textData_de_pornire = new JTextField();
		textData_de_pornire.setText(str);
		textData_de_pornire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textData_de_pornire.setEditable(false);
		textData_de_pornire.setColumns(10);
		textData_de_pornire.setBackground(Color.WHITE);
		textData_de_pornire.setBounds(132, 109, 155, 19);
		panel_3.add(textData_de_pornire);
		
		JLabel lblData_de_sosire = new JLabel("Data de sosire");
		lblData_de_sosire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblData_de_sosire.setBounds(32, 141, 90, 13);
		panel_3.add(lblData_de_sosire);
		
		calendar = colet.getData_de_sosire();
		if (calendar == null)
			str = null;
		else
			str = String.format("%02d:%02d %02d.%02d.%04d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
					calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
		textData_de_sosire = new JTextField();
		textData_de_sosire.setText(str);
		textData_de_sosire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textData_de_sosire.setEditable(false);
		textData_de_sosire.setColumns(10);
		textData_de_sosire.setBackground(Color.WHITE);
		textData_de_sosire.setBounds(132, 141, 155, 19);
		panel_3.add(textData_de_sosire);
		
		JLabel lblData_limita = new JLabel("Data limita");
		lblData_limita.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblData_limita.setBounds(55, 170, 67, 13);
		panel_3.add(lblData_limita);
		
		calendar = colet.getData_limita();
		if (calendar == null)
			str = null;
		else
			str = String.format("%02d.%02d.%04d", calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
		textData_limita = new JTextField();
		textData_limita.setText(str);
		textData_limita.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textData_limita.setEditable(false);
		textData_limita.setColumns(10);
		textData_limita.setBackground(Color.WHITE);
		textData_limita.setBounds(132, 170, 155, 19);
		panel_3.add(textData_limita);
		
		JLabel lblLocatie = new JLabel("Locatie");
		lblLocatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLocatie.setBounds(76, 201, 46, 13);
		panel_3.add(lblLocatie);
		
		textLocatie = new JTextField();
		textLocatie.setText(colet.getLocatie());
		textLocatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textLocatie.setEditable(false);
		textLocatie.setColumns(10);
		textLocatie.setBackground(Color.WHITE);
		textLocatie.setBounds(132, 201, 155, 19);
		panel_3.add(textLocatie);
		
		JLabel lblDate_colet = new JLabel("Date colet");
		lblDate_colet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate_colet.setBounds(294, 240, 76, 21);
		contentPane.add(lblDate_colet);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.setBounds(10, 520, 85, 21);
		getContentPane().add(btnInapoi);
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Colete_functionar_interfata(colete, client).setVisible(true);
			}
		});
		btnInapoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		if (colet.getStatus().toString().equals("In_proces"))
		{
			JButton btnAdaugare_informatii = new JButton("Adaugare informatii");
			btnAdaugare_informatii.setBounds(250, 520, 183, 21);
			getContentPane().add(btnAdaugare_informatii);
			btnAdaugare_informatii.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Colet_clasa colet = null;
					int i;
					for (i = 0; i < colete.size(); i++)
					{
						if (colete.get(i).getNume_colet().equals(cod_colet))
						{
							colet = colete.get(i);
							break;
						}
					}
					String greutate;
					String categorie1;
					greutate = textGreutate.getText();
					categorie1 = comboBoxCategorie.getSelectedItem().toString();
					colet.setGreutate(Double.valueOf(greutate));
					colet.setCategorie(Categorie_speciala.valueOf(categorie1));
					String[] ruta = null;
					String[] categorie = null;
					String[] orar = null;
					int pret = 0;
					Calendar calendar = Calendar.getInstance();
					boolean val = false;
					try {
						ruta = Algoritmul_lui_Dijkstra.Parcurs(colet.getOras_expeditor(), colet.getOras_destinatie());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					categorie = ruta[3].split("/");
					for(int j = 0; j < categorie.length; j++)
					{
						if (colet.getCategorie().toString().equals(categorie[j]))
							val = true;
					}
					if (val && (colet.getOras_expeditor().equals(colet.getOras_destinatie()) != true))
					{
						colet.setRuta(ruta[0]);
						colet.setDistanta(Double.parseDouble(ruta[1]));
						colet.setTimp(Integer.parseInt(ruta[2]));
						orar = ruta[4].split(":");
						calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH) + 1, 
								Integer.valueOf(orar[0]), 0);
						colet.setData_de_pornire(calendar);
						calendar = Calendar.getInstance();
						calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH) + 1, 
								Integer.valueOf(orar[0]), Integer.valueOf(ruta[2]));
						colet.setData_de_sosire(calendar);
						calendar = Calendar.getInstance();
						calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH) + 4);
						colet.setData_limita(calendar);
						colet.setStatus(Status.valueOf("Aprobare"));
						if (colet.getGreutate() == 0 && colet.getDistanta() == 0)
							pret = 0;
						else if (colet.getCategorie().toString().equals("Niciuna"))
							pret = (int) ((colet.getDistanta() * 0.25 + colet.getGreutate()) * 1);
						else if (colet.getCategorie().toString().equals("Fragil"))
							pret = (int) ((colet.getDistanta() * 0.25 + colet.getGreutate()) * 1.25);
						else if (colet.getCategorie().toString().equals("Pretios"))
							pret = (int) ((colet.getDistanta() * 0.25 + colet.getGreutate()) * 1.50);
						else if (colet.getCategorie().toString().equals("Periculos"))
							pret = (int) ((colet.getDistanta() * 0.25 + colet.getGreutate()) * 1.75);
						colet.setPret(pret);
						colete.set(i, colet);
					}
					else
					{
						colet.setStatus(Status.valueOf("Respins"));
					}
					try {
						Functii.Salvare_fisier_tot(colete);
					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}
					dispose();
					try {
						new Modificare_colet_functionar_interfata(colete, client, cod_colet).setVisible(true);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
			btnAdaugare_informatii.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.setBounds(607, 520, 76, 21);
		getContentPane().add(btnIesire);
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIesire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		if (colet.getStatus().toString().equals("In_asteptare_destinatar") || colet.getStatus().toString().equals("Timp_prelungit_achitat") ||
				colet.getStatus().toString().equals("In_asteptare_expeditor"))
		{
			JButton btnColet_ridicat = new JButton("Colet ridicat");
			btnColet_ridicat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i;
					for (i = 0; i < colete.size(); i++)
					{
						if (colete.get(i).getNume_colet().equals(cod_colet))
						{
							break;
						}
					}
					colete.get(i).setStatus(Status.valueOf("Transmis"));
					try {
						Functii.Salvare_fisier_tot(colete);
					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}
					dispose();
					try {
						new Modificare_colet_functionar_interfata(colete, client, cod_colet).setVisible(true);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
			btnColet_ridicat.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnColet_ridicat.setBounds(283, 520, 124, 21);
			getContentPane().add(btnColet_ridicat);
		}
		
		if (colet.getStatus().toString().equals("Achitat"))
		{
			JButton btnAdaugare_cod = new JButton("Adaugare cod");
			btnAdaugare_cod.setBounds(250, 520, 183, 21);
			getContentPane().add(btnAdaugare_cod);
			btnAdaugare_cod.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i;
					for (i = 0; i < colete.size(); i++)
					{
						if (colete.get(i).getNume_colet().equals(cod_colet))
						{
							break;
						}
					}
					String[] str = colete.get(i).getNume_colet().split("t");
					int nr = Integer.parseInt(str[1]);
					colete.get(i).setCod("c" + nr);
					colete.get(i).setStatus(Status.valueOf("In_tranzit_direct"));
					try {
						Functii.Salvare_fisier_tot(colete);
					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}
					dispose();
					try {
						new Modificare_colet_functionar_interfata(colete, client, cod_colet).setVisible(true);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
			btnAdaugare_cod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		}
	}
}
