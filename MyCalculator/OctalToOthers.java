import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OctalToOthers {

	private JFrame frame;
	private JTextField octal;
	private JTextField binary;
	private JTextField decimal;
	private JTextField hexa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OctalToOthers window = new OctalToOthers();
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
	public OctalToOthers() {
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
		
		JLabel lblNewLabel = new JLabel("Enter Octal Number :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 11, 168, 36);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblDecimal = new JLabel("Binary :");
		lblDecimal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDecimal.setBounds(114, 46, 78, 36);
		frame.getContentPane().add(lblDecimal);
		
		JLabel lblOctal = new JLabel("Decimal :");
		lblOctal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal.setBounds(103, 93, 66, 36);
		frame.getContentPane().add(lblOctal);
		
		JLabel lblHexaDecimal = new JLabel("Hexa Decimal :");
		lblHexaDecimal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHexaDecimal.setBounds(71, 140, 111, 36);
		frame.getContentPane().add(lblHexaDecimal);
		
		
		JLabel lblOctal_1 = new JLabel("(2)");
		lblOctal_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1.setBounds(337, 46, 31, 36);
		frame.getContentPane().add(lblOctal_1);
		
		JLabel lblOctal_1_1 = new JLabel("(8)");
		lblOctal_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_1.setBounds(337, 11, 31, 36);
		frame.getContentPane().add(lblOctal_1_1);
		
		JLabel lblOctal_1_2 = new JLabel("(10)");
		lblOctal_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_2.setBounds(337, 88, 31, 36);
		frame.getContentPane().add(lblOctal_1_2);
		
		JLabel lblOctal_1_3 = new JLabel("(16)");
		lblOctal_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_3.setBounds(337, 140, 31, 36);
		frame.getContentPane().add(lblOctal_1_3);
		
		JButton binarybtn = new JButton("Binary To Others");
		binarybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BinaryToOthers.main(null);
			}
		});
		binarybtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		binarybtn.setBounds(10, 242, 239, 41);
		frame.getContentPane().add(binarybtn);
		
		JButton decimalbtn = new JButton("Decimal To Others");
		decimalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalToOthers.main(null);
			}
		});
		decimalbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		decimalbtn.setBounds(291, 242, 217, 41);
		frame.getContentPane().add(decimalbtn);
		
		JButton hexabtn = new JButton("Hexa To Others");
		hexabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HexaToOthers.main(null);
			}
		});
		hexabtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		hexabtn.setBounds(10, 294, 239, 41);
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
		exitbtn.setBounds(291, 294, 217, 41);
		frame.getContentPane().add(exitbtn);
		
		
		JButton convertbtn = new JButton("Convert");
		convertbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o=Integer.parseInt(octal.getText(), 8);
				decimal.setText(Integer.toString(o));
				binary.setText(Integer.toBinaryString(o));
				String h=Integer.toHexString(o);
				hexa.setText(h.toUpperCase());
			}
		});
		convertbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		convertbtn.setBounds(291, 190, 157, 41);
		frame.getContentPane().add(convertbtn);
		
		octal = new JTextField();
		octal.setFont(new Font("Tahoma", Font.BOLD, 15));
		octal.setColumns(10);
		octal.setBounds(188, 11, 139, 30);
		frame.getContentPane().add(octal);
		
		binary = new JTextField();
		binary.setFont(new Font("Tahoma", Font.BOLD, 15));
		binary.setColumns(10);
		binary.setBounds(188, 51, 139, 30);
		frame.getContentPane().add(binary);
		
		decimal = new JTextField();
		decimal.setFont(new Font("Tahoma", Font.BOLD, 15));
		decimal.setColumns(10);
		decimal.setBounds(188, 93, 139, 30);
		frame.getContentPane().add(decimal);
		
		hexa = new JTextField();
		hexa.setFont(new Font("Tahoma", Font.BOLD, 15));
		hexa.setColumns(10);
		hexa.setBounds(188, 140, 139, 30);
		frame.getContentPane().add(hexa);
		
		JButton homebtn = new JButton("Home");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});
		homebtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		homebtn.setBounds(92, 190, 157, 41);
		frame.getContentPane().add(homebtn);

		
		
	}
}
