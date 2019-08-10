import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Cal {

	private JFrame frmCalculator;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtAns;
	private JButton btnReset;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(new Color(153, 180, 209));
		frmCalculator.getContentPane().setForeground(Color.BLACK);
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(Cal.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 772, 494);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txtNum1 = new JTextField();
		txtNum1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtNum1.setToolTipText("Number 1");
		txtNum1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNum1.setBounds(99, 101, 258, 45);
		frmCalculator.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtNum2.setToolTipText("Number 2");
		txtNum2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNum2.setBounds(381, 101, 258, 45);
		frmCalculator.getContentPane().add(txtNum2);
		txtNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(txtNum1.getText());
					num2 = Integer.parseInt(txtNum2.getText());
					
					ans = num1 + num2;
					
					txtAns.setText(Integer.toString(ans));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
					txtAns.setText("");
					txtNum1.setText("");
					txtNum2.setText("");
					
				}
			}
		});
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(217, 200, 139, 56);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1 = Integer.parseInt(txtNum1.getText());
					num2 = Integer.parseInt(txtNum2.getText());
					
					ans = num1 - num2;
					
					txtAns.setText(Integer.toString(ans));
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
					txtAns.setText("");
					txtNum1.setText("");
					txtNum2.setText("");
				}
			}
		});
		btnNewButton_1.setForeground(SystemColor.text);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(381, 200, 123, 56);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		txtAns = new JTextField();
		txtAns.setBackground(SystemColor.window);
		txtAns.setEditable(false);
		txtAns.setHorizontalAlignment(SwingConstants.CENTER);
		txtAns.setFont(new Font("Subpear", Font.BOLD, 18));
		txtAns.setBounds(253, 302, 251, 45);
		frmCalculator.getContentPane().add(txtAns);
		txtAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Subpear", Font.PLAIN, 16));
		lblNewLabel.setBounds(61, 303, 225, 45);
		frmCalculator.getContentPane().add(lblNewLabel);
		
		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAns.setText("");
				txtNum1.setText("");
				txtNum2.setText("");
			}
		});
		btnReset.setForeground(SystemColor.text);
		btnReset.setBackground(new Color(204, 102, 0));
		btnReset.setFont(UIManager.getFont("Button.font"));
		btnReset.setBounds(526, 209, 113, 43);
		frmCalculator.getContentPane().add(btnReset);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(SystemColor.text);
		btnExit.setBackground(new Color(204, 0, 0));
		btnExit.setFont(UIManager.getFont("Button.font"));
		btnExit.setBounds(318, 371, 113, 45);
		frmCalculator.getContentPane().add(btnExit);
	}
}
