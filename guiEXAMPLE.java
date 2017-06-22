import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class guiEXAMPLE extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static guiEXAMPLE frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new guiEXAMPLE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public guiEXAMPLE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogIn = new JButton("student log in");
		btnLogIn.addActionListener(new ActionListener() {
			
			
				public void actionPerformed(ActionEvent e) {
				//System.out.println("asd");
				Main_window a = new Main_window();
				a.setVisible(true);
				frame.setVisible(false);
				}
			
		});
		btnLogIn.setBounds(160, 110, 117, 29);
		contentPane.add(btnLogIn);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				System.exit(0);
			}
		});
		btnCancel.setBounds(309, 151, 117, 29);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("please enter your username and password");
		lblNewLabel.setBounds(98, 243, 279, 29);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(115, 34, 241, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 72, 241, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(26, 39, 67, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(26, 77, 67, 16);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("student system prototype");
		lblNewLabel_1.setBounds(118, 6, 228, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("professor log in");
		btnNewButton.setBounds(160, 151, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TA log in");
		btnNewButton_1.setBounds(160, 192, 117, 29);
		contentPane.add(btnNewButton_1);
		
		
		
		
	}
}
