package Client;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 302);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setBounds(552, 22, 73, 25);
		contentPane.add(lblNewLabel);
		
		txtUserName = new JTextField();
		txtUserName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUserName.getText().equals("User name")) 
				{
					txtUserName.setText("");
					txtUserName.setForeground(new Color(153,153,153));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUserName.getText().equals("")) 
				{
					txtUserName.setText("User name");
					txtUserName.setForeground(new Color(153,153,153));
				}
			}
		});
		txtUserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUserName.setForeground(SystemColor.activeCaptionBorder);
		txtUserName.setText("User name");
		txtUserName.setBounds(475, 57, 182, 31);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
			
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(475, 98, 182, 31);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(SystemColor.textHighlightText);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(475, 140, 90, 25);
		btnNewButton.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		contentPane.add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new register();
			}
		});
		btnRegister.setBackground(SystemColor.textHighlightText);
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBounds(567, 140, 90, 25);
		btnRegister.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		contentPane.add(btnRegister);
		
		
		
		
		JLabel label = new JLabel("");
		label.setBounds(23, 21, 415, 234);
		label.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(login.class.getResource("hinhanh.png.png"))));
		contentPane.add(label);
		
		
	}
}
