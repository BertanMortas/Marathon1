package marathonsoru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireCevreFormu {

	private JFrame frame;
	private JTextField txtYaricap;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireCevreFormu window = new DaireCevreFormu();
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
	public DaireCevreFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Daire cevre hesaplama formu");
		lblNewLabel.setBounds(28, 30, 264, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("daire yarıcapını giriniz");
		lblNewLabel_1.setBounds(28, 70, 175, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtYaricap = new JTextField();
		txtYaricap.setText("Yaricap");
		txtYaricap.setBounds(28, 110, 130, 26);
		frame.getContentPane().add(txtYaricap);
		txtYaricap.setColumns(10);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Daire d = new Daire();
				
				lblSonuc.setText("Dairenin çevresi: "+d.cevrehesapla(Integer.valueOf(txtYaricap.getText())));
				
				
				
				
			}
		});
		btnNewButton.setBounds(263, 159, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		lblSonuc = new JLabel("Sonuc");
		lblSonuc.setBounds(41, 220, 297, 16);
		frame.getContentPane().add(lblSonuc);
	}

}
