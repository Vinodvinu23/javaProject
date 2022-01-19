import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField input1_txt;
	private JTextField input2_txt;
	private JLabel output_lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
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
	public SimpleCalculator() {
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
		
		JLabel input1_lbl = new JLabel("Input 1:");
		input1_lbl.setBounds(33, 51, 87, 53);
		input1_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(input1_lbl);
		
		JLabel input2_lbl = new JLabel("Input 2:");
		input2_lbl.setBounds(33, 143, 87, 53);
		input2_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(input2_lbl);
		
		input1_txt = new JTextField();
		input1_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		input1_txt.setBounds(130, 64, 124, 28);
		frame.getContentPane().add(input1_txt);
		input1_txt.setColumns(10);
		
		input2_txt = new JTextField();
		input2_txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		input2_txt.setColumns(10);
		input2_txt.setBounds(130, 156, 124, 28);
		frame.getContentPane().add(input2_txt);
		
		JButton add_btn = new JButton("+");
		
		add_btn.setFont(new Font("Tahoma", Font.BOLD, 22));
		add_btn.setBounds(289, 59, 57, 35);
		frame.getContentPane().add(add_btn);
		
		JLabel output = new JLabel("Output:");
		output.setFont(new Font("Tahoma", Font.BOLD, 20));
		output.setBounds(33, 239, 87, 53);
		frame.getContentPane().add(output);
		
		output_lbl = new JLabel("0.0");
		output_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		output_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		output_lbl.setBounds(130, 239, 87, 53);
		frame.getContentPane().add(output_lbl);
		
		JButton multiplication_btn = new JButton("X");
		
		multiplication_btn.setFont(new Font("Tahoma", Font.BOLD, 22));
		multiplication_btn.setBounds(289, 151, 57, 35);
		frame.getContentPane().add(multiplication_btn);
		
		JButton division_btn = new JButton("/");
		
		division_btn.setFont(new Font("Tahoma", Font.BOLD, 22));
		division_btn.setBounds(392, 151, 57, 35);
		frame.getContentPane().add(division_btn);
		
		JButton subtraction_btn = new JButton("-");
		
		subtraction_btn.setFont(new Font("Tahoma", Font.BOLD, 22));
		subtraction_btn.setBounds(392, 59, 57, 35);
		frame.getContentPane().add(subtraction_btn);
		
		JButton clear_btn = new JButton("C");
		
		clear_btn.setFont(new Font("Tahoma", Font.BOLD, 22));
		clear_btn.setBounds(289, 239, 57, 35);
		frame.getContentPane().add(clear_btn);
		
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
		exit_btn.setFont(new Font("Tahoma", Font.BOLD, 22));
		exit_btn.setBounds(272, 303, 113, 35);
		frame.getContentPane().add(exit_btn);
		
		JButton home_btn = new JButton("HOME");
		home_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});
		home_btn.setFont(new Font("Tahoma", Font.BOLD, 22));
		home_btn.setBounds(128, 303, 115, 35);
		frame.getContentPane().add(home_btn);
		
		add_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				double given1 =Double.parseDouble(input1_txt.getText());
				double given2 = Double.parseDouble(input2_txt.getText());
				
				double result=given1+given2;
				
				output_lbl.setText(Double.toString(result));
				
			}
		});
		
		
		subtraction_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				double given1 =Double.parseDouble(input1_txt.getText());
				double given2 = Double.parseDouble(input2_txt.getText());
				
				double result=given1-given2;
				
				output_lbl.setText(Double.toString(result));
				
			}
		});
		
		multiplication_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				double given1 =Double.parseDouble(input1_txt.getText());
				double given2 = Double.parseDouble(input2_txt.getText());
				
				double result=given1*given2;
				
				output_lbl.setText(Double.toString(result));
			}
		});

		division_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				double given1 =Double.parseDouble(input1_txt.getText());
				double given2 = Double.parseDouble(input2_txt.getText());
				double result;
				if(given2==0) {
					JOptionPane.showMessageDialog(null,"Divide by 0 error","error",JOptionPane.ERROR_MESSAGE);
					result=0;
					input1_txt.setText(null);
					input2_txt.setText(null);
					output_lbl.setText("0.0");
				}
				else {
					result=given1/given2;
				}
				output_lbl.setText(Double.toString(result));
			}
		});
		
		clear_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				input1_txt.setText(null);
				input2_txt.setText(null);
				output_lbl.setText("0.0");
			}
		});
		
	}
}
