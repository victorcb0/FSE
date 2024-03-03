package proiect;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Informatii_colet_curier_interfata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAdresa_destinatar;
	private JTextField textNr_telefon_destinatar;
	private JTextField textPrenume_destinatar;
	private JTextField textNume_destinatar;
	private JTextField textOras_destinatie;
	private JTextField textAdresa_expeditor;
	private JTextField textNr_telefon_expeditor;
	private JTextField textPrenume_expeditor;
	private JTextField textNume_expeditor;
	private JTextField textOras_expeditor;
	private JTextField textClient;
	private JTextField textNume_colet;
	private JTextField textCod;
	private JTextField textStatus;
	private JTextField textData_de_pornire;
	private JTextField textData_de_sosire;

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
	public Informatii_colet_curier_interfata(ArrayList<Colet_clasa> colete, String cod_colet) {
		
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
		setBounds(100, 100, 702, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(357, 60, 310, 176);
		contentPane.add(panel_1);
		
		textAdresa_destinatar = new JTextField();
		textAdresa_destinatar.setText(colet.getAdresa_destinatar());
		textAdresa_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAdresa_destinatar.setEditable(false);
		textAdresa_destinatar.setColumns(10);
		textAdresa_destinatar.setBackground(Color.WHITE);
		textAdresa_destinatar.setBounds(137, 106, 155, 19);
		panel_1.add(textAdresa_destinatar);
		
		textNr_telefon_destinatar = new JTextField();
		textNr_telefon_destinatar.setText(colet.getNr_telefon_destinatar());
		textNr_telefon_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNr_telefon_destinatar.setEditable(false);
		textNr_telefon_destinatar.setColumns(10);
		textNr_telefon_destinatar.setBackground(Color.WHITE);
		textNr_telefon_destinatar.setBounds(137, 74, 155, 19);
		panel_1.add(textNr_telefon_destinatar);
		
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
		
		textOras_destinatie = new JTextField();
		textOras_destinatie.setText(colet.getOras_destinatie());
		textOras_destinatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOras_destinatie.setEditable(false);
		textOras_destinatie.setColumns(10);
		textOras_destinatie.setBackground(Color.WHITE);
		textOras_destinatie.setBounds(137, 138, 155, 19);
		panel_1.add(textOras_destinatie);
		
		JLabel lblInformatie_destinatar = new JLabel("Informatii destinatar");
		lblInformatie_destinatar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformatie_destinatar.setBounds(452, 41, 144, 21);
		contentPane.add(lblInformatie_destinatar);
		
		JLabel lblInformatie_colet = new JLabel("Informatie colet");
		lblInformatie_colet.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInformatie_colet.setBounds(289, 10, 125, 21);
		contentPane.add(lblInformatie_colet);
		
		JLabel lblInformatie_expeditor = new JLabel("Informatii expeditor");
		lblInformatie_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformatie_expeditor.setBounds(122, 41, 134, 21);
		contentPane.add(lblInformatie_expeditor);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(20, 60, 302, 176);
		contentPane.add(panel);
		
		textAdresa_expeditor = new JTextField();
		textAdresa_expeditor.setText(colet.getAdresa_expeditor());
		textAdresa_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAdresa_expeditor.setEditable(false);
		textAdresa_expeditor.setColumns(10);
		textAdresa_expeditor.setBackground(Color.WHITE);
		textAdresa_expeditor.setBounds(130, 109, 155, 19);
		panel.add(textAdresa_expeditor);
		
		textNr_telefon_expeditor = new JTextField();
		textNr_telefon_expeditor.setText(colet.getNr_telefon_expeditor());
		textNr_telefon_expeditor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNr_telefon_expeditor.setEditable(false);
		textNr_telefon_expeditor.setColumns(10);
		textNr_telefon_expeditor.setBackground(Color.WHITE);
		textNr_telefon_expeditor.setBounds(130, 77, 155, 19);
		panel.add(textNr_telefon_expeditor);
		
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
		
		JLabel lblDate_colet = new JLabel("Date colet");
		lblDate_colet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate_colet.setBounds(304, 240, 76, 21);
		contentPane.add(lblDate_colet);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(357, 260, 310, 144);
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
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Colete_curier_interfata(colete).setVisible(true);
			}
		});
		btnInapoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInapoi.setBounds(10, 420, 85, 21);
		contentPane.add(btnInapoi);
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIesire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnIesire.setBounds(607, 420, 76, 21);
		contentPane.add(btnIesire);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(20, 271, 302, 133);
		contentPane.add(panel_2);
		
		JLabel lblLocatie = new JLabel("Locatie");
		lblLocatie.setBounds(81, 12, 46, 13);
		panel_2.add(lblLocatie);
		lblLocatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		String[] str = colet.getRuta().split(" ");
		int i;
		for (i = 0; i < str.length; i++)
		{
			if (str[i].equals(colet.getLocatie()))
				break;
		}
		JComboBox<Object> comboBoxLocatie = new JComboBox<Object>(str);
		comboBoxLocatie.setSelectedIndex(i);
		if (colet.getStatus().toString().equals("In_tranzit_direct") || colet.getStatus().toString().equals("In_tranzit_retur"))
		{
			comboBoxLocatie.setBounds(137, 10, 155, 21);
			panel_2.add(comboBoxLocatie);
		}
		else 
		{
			JTextField textLocatie = new JTextField();
			textLocatie.setText(colet.getLocatie());
			textLocatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textLocatie.setEditable(false);
			textLocatie.setColumns(10);
			textLocatie.setBackground(Color.WHITE);
			textLocatie.setBounds(137, 10, 155, 21);
			panel_2.add(textLocatie);
		}
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStatus.setBounds(81, 41, 46, 13);
		panel_2.add(lblStatus);
		
		textStatus = new JTextField();
		textStatus.setText(colet.getStatus().toString());
		textStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textStatus.setEditable(false);
		textStatus.setColumns(10);
		textStatus.setBackground(Color.WHITE);
		textStatus.setBounds(137, 41, 155, 19);
		panel_2.add(textStatus);
		
		JLabel lblData_de_pornire = new JLabel("Data de pornire");
		lblData_de_pornire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblData_de_pornire.setBounds(29, 70, 98, 13);
		panel_2.add(lblData_de_pornire);
		
		Calendar calendar = Calendar.getInstance();
		calendar = colet.getData_de_pornire();
		String str1;
		if (calendar == null)
			str1 = null;
		else
			str1 = String.format("%02d:%02d %02d.%02d.%04d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
					calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
		textData_de_pornire = new JTextField();
		textData_de_pornire.setText(str1);
		textData_de_pornire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textData_de_pornire.setEditable(false);
		textData_de_pornire.setColumns(10);
		textData_de_pornire.setBackground(Color.WHITE);
		textData_de_pornire.setBounds(137, 71, 155, 19);
		panel_2.add(textData_de_pornire);
		
		JLabel lblData_de_sosire = new JLabel("Data de sosire");
		lblData_de_sosire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblData_de_sosire.setBounds(37, 103, 90, 13);
		panel_2.add(lblData_de_sosire);
		
		calendar = colet.getData_de_sosire();
		if (calendar == null)
			str1 = null;
		else
			str1 = String.format("%02d:%02d %02d.%02d.%04d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
					calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
		textData_de_sosire = new JTextField();
		textData_de_sosire.setText(str1);
		textData_de_sosire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textData_de_sosire.setEditable(false);
		textData_de_sosire.setColumns(10);
		textData_de_sosire.setBackground(Color.WHITE);
		textData_de_sosire.setBounds(137, 103, 155, 19);
		panel_2.add(textData_de_sosire);
		
		JLabel lblUpdate_locatie = new JLabel("Update locatie");
		lblUpdate_locatie.setForeground(Color.GREEN);
		lblUpdate_locatie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUpdate_locatie.setBounds(290, 403, 90, 17);
		contentPane.add(lblUpdate_locatie);
		lblUpdate_locatie.setVisible(false);
		
		if (colet.getStatus().toString().equals("In_tranzit_direct") || colet.getStatus().toString().equals("In_tranzit_retur"))
		{
			JButton btnUpdate_locatie = new JButton("Update locatie");
			btnUpdate_locatie.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblUpdate_locatie.setVisible(false);
					int i;
					for (i = 0; i < colete.size(); i++)
					{
						if (colete.get(i).getNume_colet().equals(cod_colet))
						{
							break;
						}
					}
					colete.get(i).setLocatie(comboBoxLocatie.getSelectedItem().toString());
					if (colete.get(i).getStatus().toString().equals("In_tranzit_direct"))
						if (colete.get(i).getLocatie().equals(colete.get(i).getOras_destinatie()))
							colete.get(i).setStatus(Status.valueOf("In_asteptare_destinatar"));
					if (colete.get(i).getStatus().toString().equals("In_tranzit_retur"))
						if (colete.get(i).getLocatie().equals(colete.get(i).getOras_expeditor()))
							colete.get(i).setStatus(Status.valueOf("Retur_achitare"));
					try {
						Functii.Salvare_fisier_tot(colete);
					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}
					lblUpdate_locatie.setVisible(true);
					dispose();
					new Informatii_colet_curier_interfata(colete, cod_colet).setVisible(true);
				}
			});
			btnUpdate_locatie.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnUpdate_locatie.setBounds(274, 420, 134, 21);
			contentPane.add(btnUpdate_locatie);
		}
	}
}
