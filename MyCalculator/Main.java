import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(192, 11, 173, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JButton SimpleCal_btn = new JButton("Simple Calculator");
		SimpleCal_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				SimpleCalculator.main(null);
			}
		});
		SimpleCal_btn.setFont(new Font("Tahoma", Font.BOLD, 17));
		SimpleCal_btn.setBounds(39, 103, 198, 46);
		frame.getContentPane().add(SimpleCal_btn);
		
		JButton ageCalculator_btn = new JButton("Age Calculator");
		ageCalculator_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AgeCalculator.main(null);
			}
		});
		ageCalculator_btn.setFont(new Font("Tahoma", Font.BOLD, 17));
		ageCalculator_btn.setBounds(303, 103, 198, 46);
		frame.getContentPane().add(ageCalculator_btn);
		
		JButton findingRoots_btn = new JButton("Finding Roots");
		findingRoots_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindingRoots.main(null);
			}
		});
		findingRoots_btn.setFont(new Font("Tahoma", Font.BOLD, 17));
		findingRoots_btn.setBounds(303, 215, 198, 46);
		frame.getContentPane().add(findingRoots_btn);
		
		JButton convertions_btn = new JButton("Convertions");
		convertions_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Convertions.main(null);
			}
		});
		convertions_btn.setFont(new Font("Tahoma", Font.BOLD, 17));
		convertions_btn.setBounds(39, 215, 198, 46);
		frame.getContentPane().add(convertions_btn);
		
		JButton exit_btn = new JButton("EXIT");
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fram = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","EXIT",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		exit_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		exit_btn.setBounds(421, 308, 80, 27);
		frame.getContentPane().add(exit_btn);
	}
}
