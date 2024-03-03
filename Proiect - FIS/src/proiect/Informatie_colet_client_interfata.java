package proiect;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Informatie_colet_client_interfata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAdresa_expeditor;
	private JTextField textNr_telefon_expeditor;
	private JTextField textPrenume_expeditor;
	private JTextField textNume_expeditor;
	private JTextField textOras_expeditor;
	private JTextField textAdresa_destinatar;
	private JTextField textNr_telefon_destinatar;
	private JTextField textPrenume_destinatar;
	private JTextField textNume_destinatar;
	private JTextField textOras_destinatie;
	private JTextField textGreutate;
	private JTextField textCategorie;
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
	private JTextField textLocatie;
	private JTextField textStatus;

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
	public Informatie_colet_client_interfata(String client, String cod_colet, ArrayList<Colet_clasa> colete) {
		Colet_clasa colet = null;
		int pret_suplimentar = 0;
		Calendar calendar = Calendar.getInstance();
		int i;
		for (i = 0; i < colete.size(); i++)
		{
			if (colete.get(i).getNume_colet().equals(cod_colet))
			{
				colet = colete.get(i);
				break;
			}
		}
		
		if (colet.getStatus().toString().equals("Timp_prelungit"))
		{
			calendar = colet.getData_limita();
			Calendar calendar_actual = Calendar.getInstance();
			long date = calendar.getTimeInMillis() - calendar_actual.getTimeInMillis();
			if (date < 0)
			{
				colete.get(i).setStatus(Status.valueOf("Refuz"));
				try {
					Functii.Salvare_fisier_tot(colete);
				} catch (FileNotFoundException e2) {
					e2.printStackTrace();
				}
			}
		}
		
		if (colet.getStatus().toString().equals("Timp_prelungit"))
		{
			calendar = Calendar.getInstance();
			int zile = (int) (-(colet.getData_limita().getTimeInMillis() - calendar.getTimeInMillis()) + 7 * 1000 * 60 * 60 * 24) 
					/ (1000 * 60 * 60 * 24); 
			if (colet.getCategorie().toString().equals("Niciuna"))
				pret_suplimentar = (int) ((zile * 10  + colet.getGreutate()) * 1);
			else if (colet.getCategorie().toString().equals("Fragil"))
				pret_suplimentar =  (int) ((zile * 10  + colet.getGreutate()) * 1.25);
			else if (colet.getCategorie().toString().equals("Pretios"))
				pret_suplimentar =  (int) ((zile * 10  + colet.getGreutate()) * 1.50);
			else if (colet.getCategorie().toString().equals("Periculos"))
				pret_suplimentar =  (int) ((zile * 10  + colet.getGreutate()) * 1.75);
			colete.get(i).setPret_suplimentar(pret_suplimentar);
			try {
				Functii.Salvare_fisier_tot(colete);
			} catch (FileNotFoundException e2) {
				e2.printStackTrace();
			}
		}
		
		if (colet.getStatus().toString().equals("Retur_achitare"))
		{
			calendar = Calendar.getInstance();
			int zile = (int) (-(colet.getData_limita().getTimeInMillis() - calendar.getTimeInMillis()) + 7 * 1000 * 60 * 60 * 24) 
					/ (1000 * 60 * 60 * 24); 
			if (zile > 0)
			{
				if (colet.getCategorie().toString().equals("Niciuna"))
					pret_suplimentar = colet.getPret() + (int) ((zile * 10  + colet.getGreutate()) * 1);
				else if (colet.getCategorie().toString().equals("Fragil"))
					pret_suplimentar = colet.getPret() +  (int) ((zile * 10  + colet.getGreutate()) * 1.25);
				else if (colet.getCategorie().toString().equals("Pretios"))
					pret_suplimentar = colet.getPret() +  (int) ((zile * 10  + colet.getGreutate()) * 1.50);
				else if (colet.getCategorie().toString().equals("Periculos"))
					pret_suplimentar = colet.getPret() +  (int) ((zile * 10  + colet.getGreutate()) * 1.75);
				colete.get(i).setPret_suplimentar(pret_suplimentar);
			}
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformatie_colet = new JLabel("Informatie colet");
		lblInformatie_colet.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInformatie_colet.setBounds(279, 10, 125, 21);
		contentPane.add(lblInformatie_colet);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Colete_client_interfata(client, colete).setVisible(true);
			}
		});
		btnInapoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInapoi.setBounds(10, 498, 85, 21);
		contentPane.add(btnInapoi);
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIesire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIesire.setBounds(607, 498, 76, 21);
		contentPane.add(btnIesire);
		
		JLabel lblInformatie_expeditor = new JLabel("Informatii expeditor");
		lblInformatie_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformatie_expeditor.setBounds(112, 41, 134, 21);
		contentPane.add(lblInformatie_expeditor);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 60, 302, 176);
		contentPane.add(panel);
		
		textAdresa_expeditor = new JTextField();
		textAdresa_expeditor.setBackground(Color.WHITE);
		textAdresa_expeditor.setText(colet.getAdresa_expeditor());
		textAdresa_expeditor.setEditable(false);
		textAdresa_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAdresa_expeditor.setColumns(10);
		textAdresa_expeditor.setBounds(130, 109, 155, 19);
		panel.add(textAdresa_expeditor);
		
		textNr_telefon_expeditor = new JTextField();
		textNr_telefon_expeditor.setBackground(Color.WHITE);
		textNr_telefon_expeditor.setText(colet.getNr_telefon_expeditor());
		textNr_telefon_expeditor.setEditable(false);
		textNr_telefon_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNr_telefon_expeditor.setColumns(10);
		textNr_telefon_expeditor.setBounds(130, 77, 155, 19);
		panel.add(textNr_telefon_expeditor);
		
		textPrenume_expeditor = new JTextField();
		textPrenume_expeditor.setBackground(Color.WHITE);
		textPrenume_expeditor.setText(colet.getPrenume_expeditor());
		textPrenume_expeditor.setEditable(false);
		textPrenume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPrenume_expeditor.setColumns(10);
		textPrenume_expeditor.setBounds(130, 45, 155, 19);
		panel.add(textPrenume_expeditor);
		
		textNume_expeditor = new JTextField();
		textNume_expeditor.setBackground(Color.WHITE);
		textNume_expeditor.setText(colet.getNume_expeditor());
		textNume_expeditor.setEditable(false);
		textNume_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNume_expeditor.setColumns(10);
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
		textOras_expeditor.setBackground(Color.WHITE);
		textOras_expeditor.setBounds(130, 139, 155, 19);
		panel.add(textOras_expeditor);
		textOras_expeditor.setText(colet.getOras_expeditor());
		textOras_expeditor.setEditable(false);
		textOras_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOras_expeditor.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(347, 60, 310, 176);
		contentPane.add(panel_1);
		
		textAdresa_destinatar = new JTextField();
		textAdresa_destinatar.setBackground(Color.WHITE);
		textAdresa_destinatar.setText(colet.getAdresa_destinatar());
		textAdresa_destinatar.setEditable(false);
		textAdresa_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAdresa_destinatar.setColumns(10);
		textAdresa_destinatar.setBounds(137, 106, 155, 19);
		panel_1.add(textAdresa_destinatar);
		
		textNr_telefon_destinatar = new JTextField();
		textNr_telefon_destinatar.setBackground(Color.WHITE);
		textNr_telefon_destinatar.setText(colet.getNr_telefon_destinatar());
		textNr_telefon_destinatar.setEditable(false);
		textNr_telefon_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNr_telefon_destinatar.setColumns(10);
		textNr_telefon_destinatar.setBounds(137, 74, 155, 19);
		panel_1.add(textNr_telefon_destinatar);
		
		textPrenume_destinatar = new JTextField();
		textPrenume_destinatar.setBackground(Color.WHITE);
		textPrenume_destinatar.setText(colet.getPrenume_destinatar());
		textPrenume_destinatar.setEditable(false);
		textPrenume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPrenume_destinatar.setColumns(10);
		textPrenume_destinatar.setBounds(137, 42, 155, 19);
		panel_1.add(textPrenume_destinatar);
		
		textNume_destinatar = new JTextField();
		textNume_destinatar.setBackground(Color.WHITE);
		textNume_destinatar.setText(colet.getNume_destinatar());
		textNume_destinatar.setEditable(false);
		textNume_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNume_destinatar.setColumns(10);
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
		
		textOras_destinatie = new JTextField();
		textOras_destinatie.setBackground(Color.WHITE);
		textOras_destinatie.setText(colet.getOras_destinatie());
		textOras_destinatie.setEditable(false);
		textOras_destinatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOras_destinatie.setColumns(10);
		textOras_destinatie.setBounds(137, 138, 155, 19);
		panel_1.add(textOras_destinatie);
		
		JLabel lblInformatie_destinatar = new JLabel("Informatii destinatar");
		lblInformatie_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformatie_destinatar.setBounds(442, 41, 144, 21);
		contentPane.add(lblInformatie_destinatar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 260, 302, 230);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblGreutate = new JLabel("Greutate");
		lblGreutate.setBounds(58, 13, 58, 13);
		panel_2.add(lblGreutate);
		lblGreutate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblCategorie = new JLabel("Categorie");
		lblCategorie.setBounds(47, 41, 69, 18);
		panel_2.add(lblCategorie);
		lblCategorie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblTimp = new JLabel("Timp");
		lblTimp.setBounds(81, 70, 35, 24);
		panel_2.add(lblTimp);
		lblTimp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblDistanta = new JLabel("Distanta");
		lblDistanta.setBounds(58, 108, 58, 13);
		panel_2.add(lblDistanta);
		lblDistanta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblPret = new JLabel("Pret");
		lblPret.setBounds(81, 141, 35, 13);
		panel_2.add(lblPret);
		lblPret.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textGreutate = new JTextField();
		textGreutate.setBackground(Color.WHITE);
		textGreutate.setText(String.valueOf(colet.getGreutate()));
		textGreutate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textGreutate.setEditable(false);
		textGreutate.setBounds(126, 13, 155, 19);
		panel_2.add(textGreutate);
		textGreutate.setColumns(10);
		
		textCategorie = new JTextField();
		textCategorie.setBackground(Color.WHITE);
		textCategorie.setText(String.valueOf(colet.getCategorie()));
		textCategorie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCategorie.setEditable(false);
		textCategorie.setColumns(10);
		textCategorie.setBounds(126, 45, 155, 19);
		panel_2.add(textCategorie);
		
		textTimp = new JTextField();
		textTimp.setBackground(Color.WHITE);
		textTimp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textTimp.setText(String.valueOf(colet.getTimp()));
		textTimp.setEditable(false);
		textTimp.setColumns(10);
		textTimp.setBounds(126, 77, 155, 19);
		panel_2.add(textTimp);
		
		textDistanta = new JTextField();
		textDistanta.setBackground(Color.WHITE);
		textDistanta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDistanta.setText(String.valueOf(colet.getDistanta()));
		textDistanta.setEditable(false);
		textDistanta.setColumns(10);
		textDistanta.setBounds(126, 109, 155, 19);
		panel_2.add(textDistanta);
		
		textPret = new JTextField();
		textPret.setBackground(Color.WHITE);
		textPret.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPret.setText(String.valueOf(colet.getPret()));
		textPret.setEditable(false);
		textPret.setColumns(10);
		textPret.setBounds(126, 141, 155, 19);
		panel_2.add(textPret);
		
		JLabel lblPretSuplimentar = new JLabel("Pret suplimentar");
		lblPretSuplimentar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPretSuplimentar.setBounds(10, 170, 106, 13);
		panel_2.add(lblPretSuplimentar);
		
		textPret_suplimentar = new JTextField();
		textPret_suplimentar.setText(String.valueOf(colet.getPret_suplimentar()));
		textPret_suplimentar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPret_suplimentar.setEditable(false);
		textPret_suplimentar.setColumns(10);
		textPret_suplimentar.setBackground(Color.WHITE);
		textPret_suplimentar.setBounds(126, 170, 155, 19);
		panel_2.add(textPret_suplimentar);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatus.setBounds(70, 201, 46, 13);
		panel_2.add(lblStatus);
		
		textStatus = new JTextField();
		textStatus.setText(colet.getStatus().toString());
		textStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textStatus.setEditable(false);
		textStatus.setColumns(10);
		textStatus.setBackground(Color.WHITE);
		textStatus.setBounds(126, 201, 155, 19);
		panel_2.add(textStatus);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(347, 260, 310, 230);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNume_colet = new JLabel("Nume colet");
		lblNume_colet.setBounds(51, 47, 71, 17);
		panel_3.add(lblNume_colet);
		lblNume_colet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblCod = new JLabel("Cod");
		lblCod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCod.setBounds(97, 79, 25, 17);
		panel_3.add(lblCod);
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClient.setBounds(87, 15, 35, 17);
		panel_3.add(lblClient);
		
		textClient = new JTextField();
		textClient.setBackground(Color.WHITE);
		textClient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textClient.setText(colet.getClient());
		textClient.setEditable(false);
		textClient.setColumns(10);
		textClient.setBounds(132, 14, 155, 19);
		panel_3.add(textClient);
		
		textNume_colet = new JTextField();
		textNume_colet.setBackground(Color.WHITE);
		textNume_colet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNume_colet.setText(colet.getNume_colet());
		textNume_colet.setEditable(false);
		textNume_colet.setColumns(10);
		textNume_colet.setBounds(132, 47, 155, 19);
		panel_3.add(textNume_colet);
		
		textCod = new JTextField();
		textCod.setBackground(Color.WHITE);
		textCod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCod.setText(colet.getCod());
		textCod.setEditable(false);
		textCod.setColumns(10);
		textCod.setBounds(132, 80, 155, 19);
		panel_3.add(textCod);
		
		JLabel lblData_de_pornire = new JLabel("Data de pornire");
		lblData_de_pornire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblData_de_pornire.setBounds(24, 108, 98, 13);
		panel_3.add(lblData_de_pornire);
		
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
		
		if (colet.getStatus().toString().equals("Aprobare") || colet.getStatus().toString().equals("Timp_prelungit") || 
				colet.getStatus().toString().equals("Retur_achitare"))
		{
			JButton btnAproba = new JButton("Aproba");
			btnAproba.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					new Achitare_client_interfata(client, cod_colet, colete).setVisible(true);
				}
			});
			btnAproba.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnAproba.setBounds(203, 500, 85, 21);
			contentPane.add(btnAproba);
			
			JButton btnRefuz = new JButton("Refuz");
			btnRefuz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i;
					for (i = 0; i < colete.size(); i++)
					{
						if (colete.get(i).getNume_colet().equals(cod_colet))
						{
							break;
						}
					}
					colete.get(i).setStatus(Status.valueOf("Refuz"));
					dispose();
					try {
						Functii.Salvare_fisier_tot(colete);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					dispose();
					new Informatie_colet_client_interfata(client, cod_colet, colete).setVisible(true);
				}
			});
			btnRefuz.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnRefuz.setBounds(409, 500, 85, 21);
			contentPane.add(btnRefuz);
		}
		
		JLabel lblDate_colet = new JLabel("Date colet");
		lblDate_colet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate_colet.setBounds(294, 240, 76, 21);
		contentPane.add(lblDate_colet);


		if (colet.getStatus().toString().equals("In_asteptare_destinatar"))
		{
			calendar = colet.getData_limita();
			Calendar calendar_actual = Calendar.getInstance();
			long date = calendar.getTimeInMillis() - calendar_actual.getTimeInMillis();
			if (date < 0)
			{
				JButton btnPrelungire_timp = new JButton("Prelungire timp");
				btnPrelungire_timp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int i;
						long date;
						Calendar calendar = Calendar.getInstance();
						for (i = 0; i < colete.size(); i++)
						{
							if (colete.get(i).getNume_colet().equals(cod_colet))
							{
								break;
							}
						}
						colete.get(i).setStatus(Status.valueOf("Timp_prelungit"));
						date = calendar_actual.getTimeInMillis() + 518400000;
						calendar.setTimeInMillis(date);
						colete.get(i).setData_limita(calendar);
						try {
							Functii.Salvare_fisier_tot(colete);
						} catch (FileNotFoundException e2) {
							e2.printStackTrace();
						}
						dispose();
						new Informatie_colet_client_interfata(client, cod_colet, colete).setVisible(true);
					}
				});
				btnPrelungire_timp.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnPrelungire_timp.setBounds(200, 498, 144, 21);
				contentPane.add(btnPrelungire_timp);
				
				JButton btnRetur = new JButton("Retur");
				btnRetur.addActionListener(new ActionListener() {
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
						String[] ruta = null;
						String[] orar = null;
						int pret_suplimentar = 0;
						Calendar calendar = Calendar.getInstance();
						try {
							ruta = Algoritmul_lui_Dijkstra.Parcurs(colet.getOras_destinatie(), colet.getOras_expeditor());
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						colet.setRuta(ruta[0]);
						colet.setDistanta(Double.parseDouble(ruta[1]));
						colet.setTimp(Integer.parseInt(ruta[2]));
						orar = ruta[4].split(":");
						calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 
								Integer.valueOf(orar[0]), 0);
						colet.setData_de_pornire(calendar);
						calendar = Calendar.getInstance();
						calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), 
								Integer.valueOf(orar[0]), Integer.valueOf(ruta[2]));
						colet.setData_de_sosire(calendar);
						calendar = Calendar.getInstance();
						calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH) + 8);
						colet.setData_limita(calendar);
						colet.setStatus(Status.valueOf("In_tranzit_retur"));
						if (colet.getCategorie().toString().equals("Niciuna"))
							pret_suplimentar = (int) ((colet.getDistanta() * 0.25 + colet.getGreutate()) * 1);
						else if (colet.getCategorie().toString().equals("Fragil"))
							pret_suplimentar = (int) ((colet.getDistanta() * 0.25 + colet.getGreutate()) * 1.25);
						else if (colet.getCategorie().toString().equals("Pretios"))
							pret_suplimentar = (int) ((colet.getDistanta() * 0.25 + colet.getGreutate()) * 1.50);
						else if (colet.getCategorie().toString().equals("Periculos"))
							pret_suplimentar = (int) ((colet.getDistanta() * 0.25 + colet.getGreutate()) * 1.75);
						colet.setPret_suplimentar(pret_suplimentar);
						colete.set(i, colet);
						try {
							Functii.Salvare_fisier_tot(colete);
						} catch (FileNotFoundException e2) {
							e2.printStackTrace();
						}
						dispose();
						new Informatie_colet_client_interfata(client, cod_colet, colete).setVisible(true);
					}
				});
				btnRetur.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnRetur.setBounds(373, 498, 85, 21);
				contentPane.add(btnRetur);
			}
		}
	}
}
