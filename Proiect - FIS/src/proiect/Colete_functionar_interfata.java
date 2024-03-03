package proiect;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Colete_functionar_interfata extends JFrame {

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
	 */
	public Colete_functionar_interfata(ArrayList<Colet_clasa> colete, String client) {
		
		ArrayList<String> cod_colete = new ArrayList<String>();
		if(client.equals("Toti"))
		{
			for (int i = 0; i < colete.size(); i++)
			{
				cod_colete.add(colete.get(i).getNume_colet());
			}
		}
		else
		{	
			for (int i = 0; i < colete.size(); i++)
			{
				if(colete.get(i).getClient().equals(client))
				{
					cod_colete.add(colete.get(i).getNume_colet());
				}
			}
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblColete = new JLabel("Colete");
		lblColete.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblColete.setBounds(188, 10, 59, 21);
		contentPane.add(lblColete);
		
		JComboBox<?> comboBoxColete = new JComboBox<Object>(cod_colete.toArray());
		comboBoxColete.setBounds(120, 59, 184, 21);
		contentPane.add(comboBoxColete);
		
		JButton btnModificare_informatii_colet = new JButton("Modificare informatii colet");
		btnModificare_informatii_colet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					new Modificare_colet_functionar_interfata(colete, client, comboBoxColete.getSelectedItem().toString()).setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnModificare_informatii_colet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificare_informatii_colet.setBounds(109, 232, 213, 21);
		contentPane.add(btnModificare_informatii_colet);
		
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
	}

}
