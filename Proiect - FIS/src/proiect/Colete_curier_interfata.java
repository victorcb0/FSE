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

public class Colete_curier_interfata extends JFrame {

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
	public Colete_curier_interfata(ArrayList<Colet_clasa> colete) {
		
		ArrayList<String> cod_colete = new ArrayList<String>();
		for (int i = 0; i < colete.size(); i++)
		{
			cod_colete.add(colete.get(i).getNume_colet());
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
		
		JComboBox<Object> comboBoxColete = new JComboBox<Object>(cod_colete.toArray());
		comboBoxColete.setBounds(120, 59, 184, 21);
		contentPane.add(comboBoxColete);
		
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
		
		JButton btnModificare_informatii_colet = new JButton("Modificare informatii colet");
		btnModificare_informatii_colet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Informatii_colet_curier_interfata(colete, comboBoxColete.getSelectedItem().toString()).setVisible(true);
			}
		});
		btnModificare_informatii_colet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModificare_informatii_colet.setBounds(109, 232, 213, 21);
		contentPane.add(btnModificare_informatii_colet);
		
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
