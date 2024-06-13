package BOOKS_CART;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;

public class BOOKS {
int amount=0;
int items=0;

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BOOKS window = new BOOKS();
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
	public BOOKS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1178, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONLINE BOOK STORE");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(266, 47, 518, 87);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_1.setBounds(746, 275, 122, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AMOUNT");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_2.setBounds(752, 405, 141, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RS 300/-");
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_3.setBounds(42, 542, 159, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS 600/-");
		lblNewLabel_4.setForeground(new Color(0, 255, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_4.setBounds(312, 527, 141, 65);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS 300/-");
		lblNewLabel_5.setForeground(new Color(0, 255, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_5.setBounds(547, 520, 159, 72);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Tahoma", Font.BOLD, 24));
		tb1.setBounds(956, 275, 110, 40);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setFont(new Font("Tahoma", Font.BOLD, 24));
		tb2.setBounds(956, 405, 122, 40);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+300;
				tb1.setText(""+items);
				tb2.setText(""+amount);
				
				
		
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\mrec\\Downloads\\images.jpg"));
		btnNewButton.setBounds(10, 198, 197, 301);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+600;
				tb1.setText(""+items);
				tb2.setText(""+amount);
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\mrec\\Downloads\\download (2).jpg"));
		btnNewButton_1.setBounds(279, 205, 175, 294);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+300;
				tb1.setText(""+items);
				tb2.setText(""+amount);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\mrec\\Downloads\\download (3).jpg"));
		btnNewButton_2.setBounds(537, 214, 186, 294);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\mrec\\Downloads\\books.jpg"));
		lblNewLabel_6.setBounds(10, 11, 1123, 581);
		frame.getContentPane().add(lblNewLabel_6);
		
		
	}
}
