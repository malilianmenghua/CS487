import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contact_professor extends JFrame {

	private JPanel contentPane;
	private JTextArea txtThisFieldListed;
	private JTextArea textField_1;
	private JButton btnNewButton;
	private JButton btnSendFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contact_professor frame = new contact_professor();
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
	public contact_professor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtThisFieldListed = new JTextArea();
		txtThisFieldListed.setRows(2);
		txtThisFieldListed.setText("line 1 email address of professor\nline 2 dialog professor texted");
		//txtThisFieldListed.setText("line 2 dialog professor texted");
		txtThisFieldListed.setBounds(6, 6, 293, 115);
		panel.add(txtThisFieldListed);
		txtThisFieldListed.setColumns(10);
		
		textField_1 = new JTextArea();
		textField_1.setText("line 1 email address of student\nline 2 dialog student texted");
		textField_1.setRows(2);
		textField_1.setToolTipText("");
		textField_1.setBounds(6, 145, 293, 117);
		
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("end talk");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main_window mw=new Main_window();
				mw.setVisible(true);
			}
		});
		btnNewButton.setBounds(311, 220, 117, 29);
		panel.add(btnNewButton);
		
		btnSendFile = new JButton("send file");
		btnSendFile.setBounds(311, 86, 117, 29);
		panel.add(btnSendFile);
	}
}
