import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class frmColorForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmColorForm frame = new frmColorForm();
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
	public frmColorForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblColor = new JLabel(" ");
		lblColor.setBounds(151, 183, 86, 28);
		contentPane.add(lblColor);
		
		JButton btnNewButton = new JButton("\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C \u0446\u0432\u0435\u0442 \u0444\u043E\u0440\u043C\u044B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contentPane.getBackground()==Color.WHITE) {
					contentPane.setBackground(Color.RED);
					lblColor.setText("Красный");}
					else if
					(contentPane.getBackground()==Color.RED) {
						contentPane.setBackground(Color.GREEN);
						lblColor.setText("Зеленый");}
						else if
						(contentPane.getBackground()==Color.GREEN) {
							contentPane.setBackground(Color.RED);
							lblColor.setText("Красный");
				}
				
			}
		});
		btnNewButton.setBounds(125, 106, 190, 40);
		contentPane.add(btnNewButton);
		
	}
}
