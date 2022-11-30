package marathonsoru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareCevreFormu {

	private JFrame frame;
	private JTextField txtKenarGiriniz;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareCevreFormu window = new KareCevreFormu();
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
	public KareCevreFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Kare cevre hesaplama formu");
		lblNewLabel.setBounds(55, 30, 285, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("hesaplanaca karanin kenarını giriniz\n");
		lblNewLabel_1.setBounds(55, 68, 241, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtKenarGiriniz = new JTextField();
		txtKenarGiriniz.setText("kenar giriniz");
		txtKenarGiriniz.setBounds(44, 96, 130, 26);
		frame.getContentPane().add(txtKenarGiriniz);
		txtKenarGiriniz.setColumns(10);
		
		lblSonuc = new JLabel("sonuc");
		lblSonuc.setBounds(55, 215, 285, 16);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnNewButton = new JButton("hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				KareHesaplama kh = new KareHesaplama();
				
				lblSonuc.setText("karenin cevresi: "+kh.karecevrehesapla(Integer.valueOf(txtKenarGiriniz.getText())));
				
				
				
			}
		});
		btnNewButton.setBounds(194, 142, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
