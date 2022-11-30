package marathonsoru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenCevreFormu {

	private JFrame frame;
	private JTextField txtKisaKenar;
	private JTextField txtUzunKenar;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenCevreFormu window = new DikdortgenCevreFormu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DikdortgenCevreFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dikdörtgen cevre hesaplama formu");
		lblNewLabel.setBounds(42, 26, 268, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hesaplanacak kenarları giriniz");
		lblNewLabel_1.setBounds(42, 66, 230, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setText("Kisa kenar");
		txtKisaKenar.setBounds(42, 94, 130, 26);
		frame.getContentPane().add(txtKisaKenar);
		txtKisaKenar.setColumns(10);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setText("Uzun kenar");
		txtUzunKenar.setBounds(42, 132, 130, 26);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(42, 227, 321, 16);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Dikdortgen dk = new Dikdortgen();
				
				lblSonuc.setText("Dikdörtgen alanı: "+dk.cevrehesapla(Integer.valueOf(txtUzunKenar.getText()), Integer.valueOf(txtKisaKenar.getText())));
				
				
			}
		});
		btnNewButton.setBounds(246, 171, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
