import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class task_list extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					task_list frame = new task_list();
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
	public task_list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("course task 1");
		chckbxNewCheckBox_1.setBounds(156, 75, 128, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("course task 2");
		chckbxNewCheckBox_2.setBounds(156, 30, 128, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("course task 3");
		chckbxNewCheckBox.setBounds(156, 119, 128, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main_window mw=new Main_window();
				mw.setVisible(true);
			}
		});
		btnNewButton.setBounds(167, 186, 117, 29);
		panel.add(btnNewButton);
	}
}
