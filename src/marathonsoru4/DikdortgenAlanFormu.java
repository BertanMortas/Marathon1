package marathonsoru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenAlanFormu {

	private JFrame frame;
	private JTextField txtUzunKenar;
	private JTextField txtKsaKenar;
	private JLabel lblSonuc ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenAlanFormu window = new DikdortgenAlanFormu();
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
	public DikdortgenAlanFormu() {
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
		
		JLabel lblNewLabel = new JLabel("dikdortgen alan hesaplama formu");
		lblNewLabel.setBounds(43, 26, 242, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hesaplanacak kenarları giriniz");
		lblNewLabel_1.setBounds(43, 65, 210, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setText("uzun kenar");
		txtUzunKenar.setBounds(43, 108, 130, 26);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		JButton btnNewButton = new JButton("hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dikdortgen dk = new Dikdortgen();
				
				
				
				lblSonuc.setText("Dikdörtgen alanı: "+dk.alanhesapla(Integer.valueOf(txtUzunKenar.getText()), Integer.valueOf(txtKsaKenar.getText())));
				
				
			}
		});
		btnNewButton.setBounds(226, 151, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		 lblSonuc = new JLabel("sonuc");
		lblSonuc.setBounds(43, 206, 347, 16);
		frame.getContentPane().add(lblSonuc);
		
		txtKsaKenar = new JTextField();
		txtKsaKenar.setText("kısa kenar");
		txtKsaKenar.setBounds(43, 132, 130, 26);
		frame.getContentPane().add(txtKsaKenar);
		txtKsaKenar.setColumns(10);
	}

}
