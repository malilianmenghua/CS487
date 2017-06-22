import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_window extends JFrame {

	private JPanel contentPane;
	static guiEXAMPLE frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_window frame = new Main_window();
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
	public Main_window() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(177, 210, 75, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				guiEXAMPLE gui = new guiEXAMPLE();
				gui.setVisible(true);
			}
		});
		panel.setLayout(null);
		panel.add(btnBack);
		
		JButton btnNewButton = new JButton("show course");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Main_window a = new Main_window();
				dispose();
				course_page cp=new course_page();
				cp.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(25, 20, 124, 29);
		panel.add(btnNewButton);
		
		JButton btnTaskList = new JButton("task check list");
		btnTaskList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				task_list tl = new task_list();
				tl.setVisible(true);
				//frame.setVisible(false);
			}
		});
		btnTaskList.setBounds(161, 20, 124, 29);
		panel.add(btnTaskList);
		
		JButton btnNewButton_1 = new JButton("contact with professor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				contact_professor cp = new contact_professor();
				cp.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(12, 159, 205, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("contact with TA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				contact_TA ct =  new contact_TA();
				ct.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(229, 159, 205, 29);
		panel.add(btnNewButton_2);
		
		JButton btnDeadlines = new JButton("deadlines");
		btnDeadlines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				deadlines dl = new deadlines();
				dl.setVisible(true);
			}
		});
		btnDeadlines.setBounds(299, 20, 117, 29);
		panel.add(btnDeadlines);
	}
}
