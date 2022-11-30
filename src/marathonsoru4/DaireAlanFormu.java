package marathonsoru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireAlanFormu {

	private JFrame frame;
	private JTextField txtYaricap;
	private JLabel lblSonuc ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireAlanFormu window = new DaireAlanFormu();
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
	public DaireAlanFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Daire alan hesaplama formu");
		lblNewLabel.setBounds(39, 33, 273, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Yarı capını giriniz");
		lblNewLabel_1.setBounds(39, 68, 183, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtYaricap = new JTextField();
		txtYaricap.setText("Yaricap");
		txtYaricap.setBounds(25, 96, 130, 26);
		frame.getContentPane().add(txtYaricap);
		txtYaricap.setColumns(10);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Daire d = new Daire();
				
				
				lblSonuc.setText("Dairenin alanı: "+d.alanhesapla(Integer.valueOf(txtYaricap.getText())));
				
			}
		});
		btnNewButton.setBounds(229, 141, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(39, 217, 337, 16);
		frame.getContentPane().add(lblSonuc);
	}

}
