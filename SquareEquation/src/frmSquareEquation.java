import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
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
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u041A\u0432\u0430\u0434\u0440\u0430\u0442\u043D\u043E\u0435 \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(111, 11, 237, 33);
		contentPane.add(lblNewLabel);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt1.setBounds(10, 83, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt2.setColumns(10);
		txt2.setBounds(145, 83, 86, 20);
		contentPane.add(txt2);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Tahoma", Font.BOLD, 14));
		txt3.setColumns(10);
		txt3.setBounds(271, 83, 86, 20);
		contentPane.add(txt3);
		
		JLabel lblNewLabel_1 = new JLabel("\u04252   +");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(99, 86, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u0425   +");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(234, 86, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("= 0");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(367, 86, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblSolution = new JLabel(" ");
		lblSolution.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSolution.setBounds(10, 212, 403, 38);
		contentPane.add(lblSolution);
		
		JButton btnSolve = new JButton("\u0420\u0435\u0448\u0438\u0442\u044C \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		btnSolve.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a,b,c;
				try{
					a = Double.parseDouble(txt1.getText());
					}
					catch(NumberFormatException nfe){
					a = 0.0;
					txt2.setText("0.0");
					}
				try{
					b = Double.parseDouble(txt2.getText());
					}
					catch(NumberFormatException nfe){
					b = 0.0;
					txt2.setText("0.0");
					}
					try{
					c = Double.parseDouble(txt3.getText());
					}
					catch(NumberFormatException nfe){
					c = 0.0;
					txt3.setText("0.0");
					}
					double D = b * b - 4 * a * c;
					double x1, x2;
					String Sol = "";
					if(D < 0.0)
						Sol = "Действительных корней нет";
					else if(D > 0 && a != 0.){
					x1 = (-b + Math.sqrt(D)) / (2. * a);
					x2 = (-b - Math.sqrt(D)) / (2. * a);
					Sol = "Корни: x1 = " + x1 + ", x2 = " + x2;
					}
					else if(D == 0 && a != 0.0){
					x1 = -b / (2. * a);
					Sol = "Корень x = " + x1;
					}
					else if(a == 0 && b != 0.){
					x1 = -c / b;
					Sol = "Корень x = " + x1;
					}
					lblSolution.setText(Sol);
			}
		});
		btnSolve.setBounds(121, 144, 187, 23);
		contentPane.add(btnSolve);
		
		
		JLabel label_2 = new JLabel("\u0420\u0435\u0448\u0435\u043D\u0438\u0435");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(185, 176, 95, 14);
		contentPane.add(label_2);
	}
}
