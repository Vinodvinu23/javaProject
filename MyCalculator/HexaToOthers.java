import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class HexaToOthers {

	private JFrame frame;
	private JFrame frame_1;
	private JTextField hexa;
	private JTextField binary;
	private JTextField decimal;
	private JTextField octal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HexaToOthers window = new HexaToOthers();
					window.frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HexaToOthers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame_1 = new JFrame();
		frame_1.setBounds(100, 100, 540, 385);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Hexa Decimal Number :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 14, 214, 36);
		frame_1.getContentPane().add(lblNewLabel);
		
		
		JLabel lblDecimal = new JLabel("Binary :");
		lblDecimal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDecimal.setBounds(180, 49, 78, 36);
		frame_1.getContentPane().add(lblDecimal);
		
		JLabel lblOctal = new JLabel("Decimal :");
		lblOctal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal.setBounds(169, 96, 66, 36);
		frame_1.getContentPane().add(lblOctal);
		
		JLabel lblHexaDecimal = new JLabel("Ocatal  :");
		lblHexaDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblHexaDecimal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHexaDecimal.setBounds(166, 143, 78, 36);
		frame_1.getContentPane().add(lblHexaDecimal);
		
		
		JLabel lblOctal_1 = new JLabel("(2)");
		lblOctal_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1.setBounds(403, 49, 31, 36);
		frame_1.getContentPane().add(lblOctal_1);
		
		JLabel lblOctal_1_1 = new JLabel("(8)");
		lblOctal_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_1.setBounds(403, 143, 31, 36);
		frame_1.getContentPane().add(lblOctal_1_1);
		
		JLabel lblOctal_1_2 = new JLabel("(10)");
		lblOctal_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_2.setBounds(403, 91, 31, 36);
		frame_1.getContentPane().add(lblOctal_1_2);
		
		JLabel lblOctal_1_3 = new JLabel("(16)");
		lblOctal_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOctal_1_3.setBounds(403, 14, 31, 36);
		frame_1.getContentPane().add(lblOctal_1_3);
		
		JButton binarybtn = new JButton("Binary To Others");
		binarybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BinaryToOthers.main(null);
			}
		});
		binarybtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		binarybtn.setBounds(10, 242, 239, 41);
		frame_1.getContentPane().add(binarybtn);
		
		JButton decimalbtn = new JButton("Decimal To Others");
		decimalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalToOthers.main(null);
			}
		});
		decimalbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		decimalbtn.setBounds(291, 242, 217, 41);
		frame_1.getContentPane().add(decimalbtn);
		
		JButton ocatalbtn = new JButton("Octal To Others");
		ocatalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OctalToOthers.main(null);
			}
		});
		ocatalbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		ocatalbtn.setBounds(10, 294, 239, 41);
		frame_1.getContentPane().add(ocatalbtn);
		
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
		frame_1.getContentPane().add(exitbtn);
		
		
		JButton convertbtn = new JButton("Convert");
		convertbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=Integer.parseInt(hexa.getText(), 16);
				binary.setText(Integer.toBinaryString(b));
				decimal.setText(Integer.toString(b));
				octal.setText(Integer.toOctalString(b));
				
			}
		});
		convertbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		convertbtn.setBounds(291, 190, 157, 41);
		frame_1.getContentPane().add(convertbtn);
		
		hexa = new JTextField();
		hexa.setFont(new Font("Tahoma", Font.BOLD, 15));
		hexa.setColumns(10);
		hexa.setBounds(254, 14, 139, 30);
		frame_1.getContentPane().add(hexa);
		
		binary = new JTextField();
		binary.setFont(new Font("Tahoma", Font.BOLD, 15));
		binary.setColumns(10);
		binary.setBounds(254, 54, 139, 30);
		frame_1.getContentPane().add(binary);
		
		decimal = new JTextField();
		decimal.setFont(new Font("Tahoma", Font.BOLD, 15));
		decimal.setColumns(10);
		decimal.setBounds(254, 96, 139, 30);
		frame_1.getContentPane().add(decimal);
		
		octal = new JTextField();
		octal.setFont(new Font("Tahoma", Font.BOLD, 15));
		octal.setColumns(10);
		octal.setBounds(254, 148, 139, 30);
		frame_1.getContentPane().add(octal);
		
		JButton homebtn = new JButton("Home");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});
		homebtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		homebtn.setBounds(87, 190, 157, 41);
		frame_1.getContentPane().add(homebtn);


	}
}
