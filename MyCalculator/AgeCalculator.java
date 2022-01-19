import java.awt.EventQueue;

import javax.swing.JFrame;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JYearChooser;

public class AgeCalculator {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgeCalculator window = new AgeCalculator();
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
	public AgeCalculator() {
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
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(245, 75, 136, 26);
		frame.getContentPane().add(dateChooser_1);
		
		JLabel lblNewLabel = new JLabel("Age Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(149, 0, 251, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Birth Date      :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(83, 82, 152, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Current Date :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(83, 131, 171, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(245, 125, 136, 26);
		frame.getContentPane().add(dateChooser_2);
		
		JButton clear_btn = new JButton("Clear");
		clear_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dateChooser_1.setCalendar(null);
				dateChooser_2.setCalendar(null);
				
			}
		});
		clear_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		clear_btn.setBounds(128, 175, 107, 34);
		frame.getContentPane().add(clear_btn);
		
		JButton calculate_btn = new JButton("Calculate");

		calculate_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		calculate_btn.setBounds(304, 175, 107, 34);
		frame.getContentPane().add(calculate_btn);
		
		JLabel lblNewLabel_2 = new JLabel("Age is ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(128, 280, 56, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
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
		exit_btn.setBounds(304, 220, 107, 34);
		frame.getContentPane().add(exit_btn);
		
		JLabel lblNewLabel_2_1 = new JLabel("years");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(213, 280, 56, 26);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("months");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(293, 280, 56, 26);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("days");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(386, 280, 56, 26);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel yearlbl = new JLabel("00");
		yearlbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		yearlbl.setBounds(183, 280, 31, 26);
		frame.getContentPane().add(yearlbl);
		
		JLabel monthlbl = new JLabel("00");
		monthlbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		monthlbl.setBounds(267, 280, 31, 26);
		frame.getContentPane().add(monthlbl);
		
		JLabel daylbl = new JLabel("00");
		daylbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		daylbl.setBounds(359, 280, 31, 26);
		frame.getContentPane().add(daylbl);
		
		JButton home_btn = new JButton("Home");
		home_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main.main(null);
			}
		});
		home_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		home_btn.setBounds(128, 220, 107, 34);
		frame.getContentPane().add(home_btn);
		
		calculate_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String dateOfBirth= ((JTextField)dateChooser_1.getDateEditor().getUiComponent()).getText();
				
				String dob[]= dateOfBirth.split("-");
				int month = 0;
				
				if(dob[1].equalsIgnoreCase("Jan")) month=1;

				if(dob[1].equalsIgnoreCase("Feb")) month=2;

				if(dob[1].equalsIgnoreCase("Mar")) month=3;

				if(dob[1].equalsIgnoreCase("Apr")) month=4;

				if(dob[1].equalsIgnoreCase("May")) month=5;

				if(dob[1].equalsIgnoreCase("Jun")) month=6;

				if(dob[1].equalsIgnoreCase("Jul")) month=7;

				if(dob[1].equalsIgnoreCase("Aug")) month=8;

				if(dob[1].equalsIgnoreCase("Sep")) month=9;

				if(dob[1].equalsIgnoreCase("Oct")) month=10;

				if(dob[1].equalsIgnoreCase("Nov")) month=11;

				if(dob[1].equalsIgnoreCase("Dec"))month=12;

				int day= Integer.parseInt(dob[0]);
				int year= Integer.parseInt(dob[2]);
			
				String dateOfBirth1= ((JTextField)dateChooser_2.getDateEditor().getUiComponent()).getText();
				
				String dob1[]= dateOfBirth1.split("-");
				int month1=0;
				
				if(dob1[1].equalsIgnoreCase("Jan")) month1=1;

				if(dob1[1].equalsIgnoreCase("Feb")) month1=2;

				if(dob1[1].equalsIgnoreCase("Mar")) month1=3;

				if(dob1[1].equalsIgnoreCase("Apr")) month1=4;

				if(dob1[1].equalsIgnoreCase("May")) month1=5;

				if(dob1[1].equalsIgnoreCase("Jun")) month1=6;

				if(dob1[1].equalsIgnoreCase("Jul")) month1=7;

				if(dob1[1].equalsIgnoreCase("Aug")) month1=8;

				if(dob1[1].equalsIgnoreCase("Sep")) month1=9;

				if(dob1[1].equalsIgnoreCase("Oct")) month1=10;

				if(dob1[1].equalsIgnoreCase("Nov")) month1=11;

				if(dob1[1].equalsIgnoreCase("Dec")) month1=12;

				int day1= Integer.parseInt(dob1[0]);
				int year1= Integer.parseInt(dob1[2]);
				
				LocalDate selectedDate = LocalDate.of(year, month, day);
				
				LocalDate currentDate = LocalDate.of(year1, month1, day1);

				int resultyear=Period.between(selectedDate, currentDate).getYears();
				int resultmonth=Period.between(selectedDate, currentDate).getMonths();
				int resultdays=Period.between(selectedDate, currentDate).getDays();
				
				yearlbl.setText(Integer.toString(resultyear));
				monthlbl.setText(Integer.toString(resultmonth));
				daylbl.setText(Integer.toString(resultdays));
			}
		});
	}
}
