import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinaryToOthers {

	private JFrame frame;
	private JTextField binary;
	private JTextField decimal;
	private JTextField octal;
	private JTextField hexa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinaryToOthers window = new BinaryToOthers();
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
	public BinaryToOthers() {
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
		
		JLabel lblNewLabel = new JLabel("Enter Binary Number :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 11, 168, 36);
		frame.getContentPane().add(lblNewLabel);
		
		binary = new JTextField();
		binary.setFont(new Font("Tahoma", Font.BOLD, 15));
		binary.setBounds(191, 12, 136, 30);
		frame.getContentPane().add(binary);
		binary.setColumns(10);
		
		JLabel lblDecimal = new JLabel("Decimal :");
		lblDecimal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDecimal.setBounds(114, 46, 78, 36);
		frame.getContentPane().add(lblDecimal);
		
		JLabel lblOctal = new JLabel("Octal :");
		lblOctal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal.setBounds(124, 93, 66, 36);
		frame.getContentPane().add(lblOctal);
		
		JLabel lblHexaDecimal = new JLabel("Hexa Decimal :");
		lblHexaDecimal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHexaDecimal.setBounds(70, 130, 111, 36);
		frame.getContentPane().add(lblHexaDecimal);
		
		decimal = new JTextField();
		decimal.setFont(new Font("Tahoma", Font.BOLD, 15));
		decimal.setColumns(10);
		decimal.setBounds(191, 53, 136, 30);
		frame.getContentPane().add(decimal);
		
		octal = new JTextField();
		octal.setFont(new Font("Tahoma", Font.BOLD, 15));
		octal.setColumns(10);
		octal.setBounds(191, 93, 136, 30);
		frame.getContentPane().add(octal);
		
		hexa = new JTextField();
		hexa.setFont(new Font("Tahoma", Font.BOLD, 15));
		hexa.setColumns(10);
		hexa.setBounds(191, 134, 136, 30);
		frame.getContentPane().add(hexa);
		
		JLabel lblOctal_1 = new JLabel("(2)");
		lblOctal_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1.setBounds(337, 11, 31, 36);
		frame.getContentPane().add(lblOctal_1);
		
		JLabel lblOctal_1_1 = new JLabel("(10)");
		lblOctal_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_1.setBounds(337, 49, 31, 36);
		frame.getContentPane().add(lblOctal_1_1);
		
		JLabel lblOctal_1_2 = new JLabel("(8)");
		lblOctal_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_2.setBounds(337, 93, 31, 36);
		frame.getContentPane().add(lblOctal_1_2);
		
		JLabel lblOctal_1_3 = new JLabel("(16)");
		lblOctal_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_3.setBounds(337, 130, 31, 36);
		frame.getContentPane().add(lblOctal_1_3);
		
		JButton decimalbtn = new JButton("Decimal To Others");
		decimalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalToOthers.main(null);
			}
		});
		decimalbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		decimalbtn.setBounds(10, 240, 239, 41);
		frame.getContentPane().add(decimalbtn);
		
		JButton octalbtn = new JButton("Octal To Others");
		octalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OctalToOthers.main(null);
			}
		});
		octalbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		octalbtn.setBounds(291, 240, 217, 41);
		frame.getContentPane().add(octalbtn);
		
		JButton hexabtn = new JButton("Hexa To Others");
		hexabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HexaToOthers.main(null);
			}
		});
		hexabtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		hexabtn.setBounds(10, 292, 239, 41);
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
		exitbtn.setBounds(291, 292, 217, 41);
		frame.getContentPane().add(exitbtn);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=Integer.parseInt(binary.getText(), 2);
				decimal.setText(Integer.toString(b));
				octal.setText(Integer.toOctalString(b));
				String h=Integer.toHexString(b);
				hexa.setText(h.toUpperCase());
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConvert.setBounds(291, 188, 157, 41);
		frame.getContentPane().add(btnConvert);
		
		JButton homebtn = new JButton("Home");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});
		homebtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		homebtn.setBounds(92, 188, 157, 41);
		frame.getContentPane().add(homebtn);
	}
}
