package proiect;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Achitare_client_interfata extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNume;
	private JTextField textNumar_card;
	private JTextField textLuna;
	private JTextField textAnul;
	private JTextField textCsv;

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
	public Achitare_client_interfata(String client, String cod_colet, ArrayList<Colet_clasa> colete) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformatie_gresita = new JLabel("Informatie gresita");
		lblInformatie_gresita.setForeground(Color.RED);
		lblInformatie_gresita.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInformatie_gresita.setBounds(209, 172, 114, 21);
		contentPane.add(lblInformatie_gresita);
		lblInformatie_gresita.setVisible(false);
		
		JLabel lblAchitare_colet = new JLabel("Achitare colet");
		lblAchitare_colet.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAchitare_colet.setBounds(209, 10, 125, 21);
		contentPane.add(lblAchitare_colet);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNume.setBounds(47, 41, 43, 13);
		contentPane.add(lblNume);
		
		textNume = new JTextField();
		textNume.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNume.setColumns(10);
		textNume.setBackground(Color.WHITE);
		textNume.setBounds(100, 41, 223, 19);
		contentPane.add(textNume);
		
		JLabel lblNumar_card = new JLabel("Numar card");
		lblNumar_card.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumar_card.setBounds(10, 70, 80, 13);
		contentPane.add(lblNumar_card);
		
		textNumar_card = new JTextField();
		textNumar_card.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNumar_card.setColumns(10);
		textNumar_card.setBackground(Color.WHITE);
		textNumar_card.setBounds(100, 70, 151, 19);
		contentPane.add(textNumar_card);
		
		JLabel lblLuna = new JLabel("Luna");
		lblLuna.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLuna.setBounds(54, 99, 36, 13);
		contentPane.add(lblLuna);
		
		textLuna = new JTextField();
		textLuna.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textLuna.setColumns(10);
		textLuna.setBackground(Color.WHITE);
		textLuna.setBounds(100, 99, 27, 19);
		contentPane.add(textLuna);
		
		JLabel lblAnul = new JLabel("Anul");
		lblAnul.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnul.setBounds(54, 128, 36, 13);
		contentPane.add(lblAnul);
		
		textAnul = new JTextField();
		textAnul.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAnul.setColumns(10);
		textAnul.setBackground(Color.WHITE);
		textAnul.setBounds(100, 128, 54, 19);
		contentPane.add(textAnul);
		
		JLabel lblCsv = new JLabel("CSV");
		lblCsv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCsv.setBounds(54, 159, 36, 13);
		contentPane.add(lblCsv);
		
		textCsv = new JTextField();
		textCsv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCsv.setColumns(10);
		textCsv.setBackground(Color.WHITE);
		textCsv.setBounds(100, 159, 43, 19);
		contentPane.add(textCsv);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Informatie_colet_client_interfata(client, cod_colet, colete).setVisible(true);
			}
		});
		btnInapoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInapoi.setBounds(10, 202, 85, 21);
		contentPane.add(btnInapoi);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(442, 204, 85, 21);
		contentPane.add(btnExit);
		
		JButton btnCard = new JButton("Card");
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	         	lblInformatie_gresita.setVisible(false);	
				int size;
				long nr;
				try {		
					nr = Long.parseLong(textNumar_card.getText());
					}
					catch(NumberFormatException e1)
					{
						nr = 0;
					}
				if (textNumar_card.getText().length() != 16 || nr == 0)
					lblInformatie_gresita.setVisible(true);
				
				try {		
					nr = Long.parseLong(textLuna.getText());
				}
				catch(NumberFormatException e1)
				{
					nr = 0;
				}
				if (nr < 1 || nr > 12)
					lblInformatie_gresita.setVisible(true);

				size = textAnul.getText().length();
				try {		
					nr = Long.parseLong(textAnul.getText());
				}
				catch(NumberFormatException e1)
				{
					nr = 0;
				}
				if (size != 4 || nr == 0)
					lblInformatie_gresita.setVisible(true);

				size = textCsv.getText().length();
				try {		
					nr = Long.parseLong(textCsv.getText());
				}
				catch(NumberFormatException e1)
				{
					nr = 0;
				}
				if (size != 3 || nr == 0)
					lblInformatie_gresita.setVisible(true);

				if (!lblInformatie_gresita.isVisible())
				{
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
					if (colet.getStatus().toString().equals("Aprobare"))
							colet.setStatus(Status.valueOf("Achitat"));
					if (colet.getStatus().toString().equals("Timp_prelungit"))
						colet.setStatus(Status.valueOf("Timp_prelungit_achitat"));
					if (colet.getStatus().toString().equals("Retur_achitare"))
						colet.setStatus(Status.valueOf("In_asteptare_expeditor"));
					colete.set(i, colet);
					try {
						Functii.Salvare_fisier_tot(colete);
					} catch (FileNotFoundException e2) {
						e2.printStackTrace();
					}
					dispose();
					new Informatie_colet_client_interfata(client, cod_colet, colete).setVisible(true);
				}
			}
		});
		btnCard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCard.setBounds(151, 202, 85, 21);
		contentPane.add(btnCard);
		
		JButton btnCash = new JButton("Cash");
		btnCash.addActionListener(new ActionListener() {
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
				if (colet.getStatus().toString().equals("Aprobare"))
					colet.setStatus(Status.valueOf("Achitat"));
				if (colet.getStatus().toString().equals("Timp_prelungit"))
					colet.setStatus(Status.valueOf("Timp_prelungit_achitat"));
				if (colet.getStatus().toString().equals("Retur_achitare"))
					colet.setStatus(Status.valueOf("In_asteptare_expeditor"));
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
		btnCash.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCash.setBounds(286, 204, 85, 21);
		contentPane.add(btnCash);
	}
}
