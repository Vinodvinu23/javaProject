import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Convertions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convertions window = new Convertions();
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
	public Convertions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Convertions");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(177, 22, 191, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JButton binarybtn = new JButton("Binary To Others");
		binarybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BinaryToOthers.main(null);
			}
		});
		binarybtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		binarybtn.setBounds(10, 88, 217, 41);
		frame.getContentPane().add(binarybtn);
		
		JButton decimalbtn = new JButton("Decimal To Others");
		decimalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalToOthers.main(null);
			}
		});
		decimalbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		decimalbtn.setBounds(275, 88, 239, 41);
		frame.getContentPane().add(decimalbtn);
		
		JButton octalbtn = new JButton("Octal To Others");
		octalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OctalToOthers.main(null);
			}
		});
		octalbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		octalbtn.setBounds(10, 178, 217, 41);
		frame.getContentPane().add(octalbtn);
		
		JButton hexabtn = new JButton("Hexa To Others");
		hexabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HexaToOthers.main(null);
			}
		});
		hexabtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		hexabtn.setBounds(275, 178, 239, 41);
		frame.getContentPane().add(hexabtn);
		
		JButton exitbtn = new JButton("Exit");
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fram = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","EXIT",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		exitbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		exitbtn.setBounds(275, 256, 239, 41);
		frame.getContentPane().add(exitbtn);
		
		JButton homebtn = new JButton("Home");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});
		homebtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		homebtn.setBounds(10, 256, 217, 41);
		frame.getContentPane().add(homebtn);
	}
}
