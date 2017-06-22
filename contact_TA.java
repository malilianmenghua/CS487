import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contact_TA extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contact_TA frame = new contact_TA();
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
	public contact_TA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrLineEmail = new JTextArea();
		txtrLineEmail.setBounds(6, 6, 293, 115);
		txtrLineEmail.setText("line 1 email address of TA\nline 2 dialog TA texted");
		txtrLineEmail.setRows(2);
		txtrLineEmail.setColumns(10);
		panel.add(txtrLineEmail);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setToolTipText("");
		textArea_1.setText("line 1 email address of student\nline 2 dialog student texted");
		textArea_1.setRows(2);
		textArea_1.setColumns(10);
		textArea_1.setBounds(6, 145, 293, 117);
		panel.add(textArea_1);
		
		JButton button = new JButton("send file");
		button.setBounds(317, 91, 117, 29);
		panel.add(button);
		
		JButton button_1 = new JButton("end talk");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main_window mw=new Main_window();
				mw.setVisible(true);
			}
		});
		button_1.setBounds(317, 233, 117, 29);
		panel.add(button_1);
	}
}
