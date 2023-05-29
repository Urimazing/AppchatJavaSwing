package Client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class chatGroup extends JFrame {
	private Frame frame;

	private JPanel contentPane;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chatGroup frame = new chatGroup();
					frame.setSize(1000,600);
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
	public chatGroup() {
		frame = new JFrame();
	     frame.setBounds(100, 100, 847, 509);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     getContentPane().setLayout(null);
	     
	  
	//	initialize();
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JPanel pnGroupName = new JPanel();
		pnGroupName.setBackground(new Color(182, 182, 182));
		pnGroupName.setBounds(193, 10, 664, 52);
		getContentPane().add(pnGroupName);
		pnGroupName.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Group Name");
		lblNewLabel.setForeground(new Color(74, 74, 74));
		lblNewLabel.setBackground(new Color(182, 182, 182));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(21, 0, 95, 52);
		pnGroupName.add(lblNewLabel);
		
		JPanel pnMenu = new JPanel();
		pnMenu.setBackground(new Color(182, 182, 182));
		pnMenu.setBounds(10, 10, 159, 52);
		getContentPane().add(pnMenu);
		pnMenu.setLayout(null);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\chat_bubble_FILL0_wght400_GRAD0_opsz48 (1)"));
		lblMessage.setBounds(10, 5, 50, 47);
		pnMenu.add(lblMessage);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\person_FILL0_wght400_GRAD0_opsz48"));
		lblNewLabel_1.setBounds(88, 5, 50, 47);
		pnMenu.add(lblNewLabel_1);
		
		JPanel panelList = new JPanel();
		panelList.setBorder(null);
		panelList.setBackground(new Color(216, 216, 216));
	//	panelList.setBounds(3, 5, 159, 453);
		getContentPane().add(panelList);
		panelList.setLayout(null);
		panelList.setBorder(null);
		
		int showGroupHeight = 40;
		int spacing = 2;
		int numGroups = 30;
		for (int i = 0; i < numGroups; i++) {
		    ShowGroup showGroup = new ShowGroup();
		    showGroup.setBounds(10, i * (showGroupHeight + spacing), 141, showGroupHeight);
		    panelList.add(showGroup);
	        }
		
		JScrollPane scrollPane = new JScrollPane(panelList);
		scrollPane.setBounds(10, 72, 159, 453);
		//scrollPane.add(panelList);
		getContentPane().add(scrollPane);
		
		JPanel panelChat = new JPanel();
		panelChat.setBackground(new Color(255, 255, 255));
		panelChat.setBounds(193, 72, 664, 397);
		getContentPane().add(panelChat);
		panelChat.setLayout(null);
		
		JScrollPane scrollChat = new JScrollPane();
		scrollChat.setEnabled(false);
		scrollChat.setBounds(0, 0, 664, 397);
		panelChat.add(scrollChat);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(193, 479, 577, 46);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		input = new JTextField();
		input.setText("Write your message");
		input.setFont(new Font("Arial", Font.PLAIN, 16));
		input.setBounds(10, 10, 557, 26);
		panel.add(input);
		input.setColumns(10);
		input.setBorder(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\TGDD\\send_FILL0_wght400_GRAD0_opsz48 (1)"));
		btnNewButton.setBounds(782, 479, 63, 46);
		btnNewButton.setBorder(null);
		getContentPane().add(btnNewButton);
		
		getContentPane().setVisible(true);
		getContentPane().setSize(600, 600);
		getContentPane().setBounds(100,100,681,302);
		
	}

//	private void initialize() {
//		// TODO Auto-generated method stub
//		 
//	}
	public class ShowGroup extends JPanel {
		public ShowGroup() {
			setBackground(new Color(182, 182, 182));
            setLayout(null);
            
            JLabel lblAvatar = new JLabel("");
            lblAvatar.setIcon(new ImageIcon("C:\\Users\\My PC\\Downloads\\groups_FILL0_wght400_GRAD0_opsz48.png"));
            lblAvatar.setBounds(10, 0, 38, 41);
            add(lblAvatar);
            
            JLabel lblNameGroup = new JLabel("Group");
            lblNameGroup.setBounds(70, 5, 81, 31);
            add(lblNameGroup);
		}
	}
}

