package marathonsoru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareAlanFormu {

	private JFrame frame;
	private JTextField txtKenar;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareAlanFormu window = new KareAlanFormu();
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
	public KareAlanFormu() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Hesaplanacak karenin kenarını giriniz");
		lblNewLabel_1.setBounds(44, 79, 307, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kare alan hesaplama");
		lblNewLabel_2.setBounds(43, 33, 144, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtKenar = new JTextField();
		txtKenar.setText("kenar giriniz");
		txtKenar.setBounds(44, 111, 130, 26);
		frame.getContentPane().add(txtKenar);
		txtKenar.setColumns(10);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				KareHesaplama kh = new KareHesaplama();
				
		int gelensonuc=kh.karealanhesapla(Integer.valueOf(txtKenar.getText()));
				
				lblSonuc.setText("karenin alanı"+gelensonuc);
				
			//	lblSonuc.setText(kh.karealanhesapla(txtKenar.getSelectedText()));
				//getselectedtext yanlış !!!!!
				
			}
		});
		btnNewButton.setBounds(234, 145, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		lblSonuc = new JLabel("sonuc");
		lblSonuc.setBounds(44, 198, 170, 16);
		frame.getContentPane().add(lblSonuc);
	}
}
