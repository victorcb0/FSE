package proiect;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Colete_client_interfata extends JFrame {

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
	public Colete_client_interfata(String client, ArrayList<Colet_clasa> colete) {
		ArrayList<String> cod_colete = new ArrayList<String>();
		for (int i = 0; i < colete.size(); i++)
		{
			if(colete.get(i).getClient().equals(client))
			{
				cod_colete.add(colete.get(i).getNume_colet());
			}
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblColete = new JLabel("Colete");
		lblColete.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblColete.setBounds(188, 10, 59, 21);
		contentPane.add(lblColete);
		
		JButton btnAdaugare_colet = new JButton("Adaugare colet");
		btnAdaugare_colet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					new Adaugare_colet_client_interfata(client, colete).setVisible(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAdaugare_colet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdaugare_colet.setBounds(284, 57, 142, 21);
		contentPane.add(btnAdaugare_colet);
		
		JButton btnInapoi = new JButton("Inapoi");
		btnInapoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInapoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Autentificare_interfata(colete).setVisible(true);
			}
		});
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
			
		JComboBox<?> comboBoxColete = new JComboBox<Object>(cod_colete.toArray());
		comboBoxColete.setBounds(37, 59, 184, 21);
		contentPane.add(comboBoxColete);
		
		JButton btnAfisare_informatii_colet = new JButton("Afisare informatii colet");
		btnAfisare_informatii_colet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Informatie_colet_client_interfata(client, comboBoxColete.getSelectedItem().toString(), colete).setVisible(true);
			}
		});
		btnAfisare_informatii_colet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAfisare_informatii_colet.setBounds(120, 232, 194, 21);
		contentPane.add(btnAfisare_informatii_colet);
	}
}
