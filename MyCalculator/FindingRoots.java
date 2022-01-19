import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FindingRoots {

	private JFrame frame;
	private JTextField atxt;
	private JTextField btxt;
	private JTextField ctxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindingRoots window = new FindingRoots();
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
	public FindingRoots() {
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
		
		JLabel lblNewLabel = new JLabel("Quadratic Of Form  ax^2+bx+c");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(124, 11, 266, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Values of  a :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(44, 56, 174, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		atxt = new JTextField();
		atxt.setFont(new Font("Tahoma", Font.BOLD, 14));
		atxt.setBounds(217, 56, 50, 29);
		frame.getContentPane().add(atxt);
		atxt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel(" b :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(287, 56, 35, 34);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		btxt = new JTextField();
		btxt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btxt.setColumns(10);
		btxt.setBounds(311, 56, 50, 29);
		frame.getContentPane().add(btxt);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(" c :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(377, 56, 35, 34);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		ctxt = new JTextField();
		ctxt.setFont(new Font("Tahoma", Font.BOLD, 14));
		ctxt.setColumns(10);
		ctxt.setBounds(400, 56, 50, 29);
		frame.getContentPane().add(ctxt);
		
		JLabel lblNewLabel_1_1_2 = new JLabel(" x1 :");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBounds(217, 101, 35, 34);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel(" x2 :");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_3.setBounds(217, 137, 35, 34);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel r1lbl = new JLabel("0.0");
		r1lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		r1lbl.setBounds(280, 101, 170, 34);
		frame.getContentPane().add(r1lbl);
		
		JLabel r2lbl = new JLabel("0.0");
		r2lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		r2lbl.setBounds(280, 137, 170, 34);
		frame.getContentPane().add(r2lbl);
		
		JButton clear_btn = new JButton("Clear");
		clear_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atxt.setText(null);
				btxt.setText(null);
				ctxt.setText(null);
				
				r1lbl.setText("0.0");
				r2lbl.setText("0.0");
				
			}
		});
		clear_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		clear_btn.setBounds(128, 204, 119, 40);
		frame.getContentPane().add(clear_btn);
		
		JButton calculate_btn = new JButton("Calculate");
		calculate_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Double.parseDouble(atxt.getText());
				double b=Double.parseDouble(btxt.getText());
				double c=Double.parseDouble(ctxt.getText());
				double root1,root2;
				 double determinant = b * b - 4 * a * c;
				 
				 if (determinant > 0) {
				      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
				      root2 = (-b - Math.sqrt(determinant)) / (2 * a);
				     
				      r1lbl.setText(Double.toString(root1));
				      r2lbl.setText(Double.toString(root2));
			        }
				 else if (determinant == 0) {
					 root1 = root2 = -b / (2 * a);
					 
					 r1lbl.setText(Double.toString(root1));
				     r2lbl.setText(Double.toString(root2));
				 }
				 else {

				      // roots are complex number and distinct
				      double real = (-b / (2 * a));
				      double imaginary = Math.sqrt(-determinant) / (2 * a);
				      String real1=String.format("%.4f",real);
				      String imaginary1=String.format("%.4f",imaginary);
				      r1lbl.setText(real1+" + i"+imaginary1);
				      r2lbl.setText(real1+" - i"+imaginary1);
				 }
			}
		});
		calculate_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		calculate_btn.setBounds(302, 205, 119, 39);
		frame.getContentPane().add(calculate_btn);
		
		JButton home_btn = new JButton("Home");
		home_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});
		home_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		home_btn.setBounds(128, 269, 119, 40);
		frame.getContentPane().add(home_btn);
		
		JButton exit_btn = new JButton("Exit");
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
		exit_btn.setBounds(302, 271, 119, 37);
		frame.getContentPane().add(exit_btn);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Roots Are");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_2_1.setBounds(128, 101, 85, 34);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
	}
}
