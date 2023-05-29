package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class mainChat {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainChat window = new mainChat();
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
    public mainChat() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setBounds(100, 100, 847, 509);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panelMenuLeft = new JPanel();
        panelMenuLeft.setBorder(null);
        panelMenuLeft.setBackground(new Color(219, 219, 219));
        panelMenuLeft.setLayout(null);

        // Add multiple instances of ShowUser panel to panelMenuLeft
        int showUserHeight = 40;
        int spacing = 5;
        int numUsers = 15; // Number of ShowUser panels to add
        for (int i = 0; i < numUsers; i++) {
            ShowUser showUser = new ShowUser();
            showUser.setBounds(10, i * (showUserHeight + spacing), 141, showUserHeight);
            panelMenuLeft.add(showUser);
        }

        JScrollPane scrollPane = new JScrollPane(panelMenuLeft);
        scrollPane.setBounds(10, 48, 162, 414);
        frame.getContentPane().add(scrollPane);

        JPanel panelMenuFeftTop = new JPanel();
        panelMenuFeftTop.setBackground(new Color(182, 182, 182));
        panelMenuFeftTop.setBounds(10, 10, 162, 28);
        frame.getContentPane().add(panelMenuFeftTop);
        panelMenuFeftTop.setLayout(null);

        JLabel btnGroup = new JLabel("");
        btnGroup.setForeground(new Color(182, 182, 182));
        btnGroup.setBackground(new Color(182, 182, 182));
        btnGroup.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Icons8-Ios7-Healthcare-Groups.32.png"));
        btnGroup.setBounds(97, 0, 55, 28);
        panelMenuFeftTop.add(btnGroup);

        JLabel btnMSG = new JLabel("");
        btnMSG.setForeground(new Color(182, 182, 182));
        btnMSG.setBackground(new Color(182, 182, 182));
        btnMSG.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Pictogrammers-Material-Light-Message.32.png"));
        btnMSG.setBounds(10, 0, 55, 28);
        panelMenuFeftTop.add(btnMSG);

        JPanel panelUserName = new JPanel();
        panelUserName.setBackground(new Color(182, 182, 182));
        panelUserName.setBounds(196, 10, 627, 28);
        frame.getContentPane().add(panelUserName);
        panelUserName.setLayout(null);
        
        JLabel lblNameChatting = new JLabel("Name");
        lblNameChatting.setBounds(10, 0, 122, 28);
        panelUserName.add(lblNameChatting);

        JPanel panelChat = new JPanel();
        panelChat.setBackground(new Color(255, 255, 255));
        panelChat.setBounds(-521, -362, 454, 292);
        frame.getContentPane().add(panelChat);

        JScrollPane scrollPaneChat = new JScrollPane(panelChat);
        panelChat.setLayout(null);
        scrollPaneChat.setBounds(196, 48, 627, 350);
        frame.getContentPane().add(scrollPaneChat);

        JPanel panelMessageInput = new JPanel();
        panelMessageInput.setBorder(new LineBorder(new Color(105, 107, 116), 2, true));
        panelMessageInput.setForeground(new Color(105, 107, 116));
        panelMessageInput.setBackground(new Color(255, 255, 255));
        panelMessageInput.setBounds(196, 434, 555, 28);
        frame.getContentPane().add(panelMessageInput);
        panelMessageInput.setLayout(null);

        JTextField jfMessageInput = new JTextField("");
        jfMessageInput.setFont(new Font("Tahoma", Font.PLAIN, 11));
        jfMessageInput.setHorizontalAlignment(SwingConstants.LEFT);
        jfMessageInput.setBounds(10, 5, 535, 20);
        jfMessageInput.setBorder(null);
//        jfMessageInput.setLayout(null);
//        JLabel lblMessageInput = new JLabel("Type your message here");
//        lblMessageInput.setFont(new Font("Tahoma", Font.PLAIN, 11));
//        lblMessageInput.setHorizontalAlignment(SwingConstants.LEFT);
//        lblMessageInput.setBounds(10, 6, 150, 14);
//        lblMessageInput.add(lblMessageInput);
//        panelMessageInput.add(lblMessageInput);
        panelMessageInput.add(jfMessageInput);
        
        JButton btnSend = new JButton("");
        btnSend.setBackground(new Color(255, 255, 255));
        btnSend.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Icons8-Ios7-Messaging-Sent.32.png"));
        btnSend.setBounds(761, 434, 43, 28);
        frame.getContentPane().add(btnSend);
        btnSend.setBorderPainted(false);
    }

    public class ShowUser extends JPanel {

        /**
         * Create the panel.
         */
        public ShowUser() {
            setBackground(new Color(182, 182, 182));
            setLayout(null);

            JLabel lblAvatar = new JLabel("");
            lblAvatar.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Custom-Icon-Design-Silky-Line-User-User.24.png"));
            lblAvatar.setBounds(10, 0, 38, 41);
            add(lblAvatar);

            JLabel lblNameUser = new JLabel("Name");
            lblNameUser.setBounds(55, 5, 81, 31);
            add(lblNameUser);
        }
    }
}


//import java.awt.EventQueue;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import java.awt.Color;
//import javax.swing.ImageIcon;
//import javax.swing.JScrollPane;
//
//public class mainChat {
//
//    private JFrame frame;
//
//    /**
//     * Launch the application.
//     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    mainChat window = new mainChat();
//                    window.frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//
//    /**
//     * Create the application.
//     */
//    public mainChat() {
//        initialize();
//    }
//
//    /**
//     * Initialize the contents of the frame.
//     */
//    private void initialize() {
//        frame = new JFrame();
//        frame.getContentPane().setBackground(new Color(255, 255, 255));
//        frame.setBounds(100, 100, 847, 509);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setLayout(null);
//
//        JPanel panelMenuLeft = new JPanel();
//        panelMenuLeft.setBackground(new Color(219, 219, 219));
//        panelMenuLeft.setLayout(null);
//
//        // Add multiple instances of ShowUser panel to panelMenuLeft
//        int showUserHeight = 40;
//        int spacing = 5;
//        int numUsers = 15; // Number of ShowUser panels to add
//        for (int i = 0; i < numUsers; i++) {
//            ShowUser showUser = new ShowUser();
//            showUser.setBounds(10, i * (showUserHeight + spacing), 141, showUserHeight);
//            panelMenuLeft.add(showUser);
//        }
//
//        JScrollPane scrollPane = new JScrollPane(panelMenuLeft);
//        scrollPane.setBounds(10, 48, 162, 414);
//        frame.getContentPane().add(scrollPane);
//
//        JPanel panelMenuFeftTop = new JPanel();
//        panelMenuFeftTop.setBackground(new Color(182, 182, 182));
//        panelMenuFeftTop.setBounds(10, 10, 162, 28);
//        frame.getContentPane().add(panelMenuFeftTop);
//        panelMenuFeftTop.setLayout(null);
//
//        JLabel btnGroup = new JLabel("");
//        btnGroup.setForeground(new Color(182, 182, 182));
//        btnGroup.setBackground(new Color(182, 182, 182));
//        btnGroup.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Icons8-Ios7-Healthcare-Groups.32.png"));
//        btnGroup.setBounds(97, 0, 55, 28);
//        panelMenuFeftTop.add(btnGroup);
//
//        JLabel btnMSG = new JLabel("");
//        btnMSG.setForeground(new Color(182, 182, 182));
//        btnMSG.setBackground(new Color(182, 182, 182));
//        btnMSG.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Pictogrammers-Material-Light-Message.32.png"));
//        btnMSG.setBounds(10, 0, 55, 28);
//        panelMenuFeftTop.add(btnMSG);
//
//        JPanel panelUserName = new JPanel();
//        panelUserName.setBackground(new Color(182, 182, 182));
//        panelUserName.setBounds(196, 10, 627, 28);
//        frame.getContentPane().add(panelUserName);
//    }
//
//    public class ShowUser extends JPanel {
//
//        /**
//         * Create the panel.
//         */
//        public ShowUser() {
//            setBackground(new Color(182, 182, 182));
//            setLayout(null);
//
//            JLabel lblAvatar = new JLabel("");
//            lblAvatar.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Custom-Icon-Design-Silky-Line-User-User.24.png"));
//            lblAvatar.setBounds(10, 0, 38, 41);
//            add(lblAvatar);
//
//            JLabel lblNameUser = new JLabel("Name");
//            lblNameUser.setBounds(55, 5, 81, 31);
//            add(lblNameUser);
//        }
//    }
//}


//import java.awt.EventQueue;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import java.awt.Color;
//import javax.swing.JButton;
//import javax.swing.ImageIcon;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JScrollPane;
//
//public class mainChat {
//
//	private JFrame frame;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					mainChat window = new mainChat();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public mainChat() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(new Color(255, 255, 255));
//		frame.setBounds(100, 100, 847, 509);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//
//		JPanel panelMenuLeft = new JPanel();
//		panelMenuLeft.setBackground(new Color(219, 219, 219));
//		panelMenuLeft.setLayout(null);
//
//		// Add multiple instances of ShowUser panel to panelMenuLeft
//		int showUserHeight = 40;
//		int spacing = 5;
//		int numUsers = 15; // Number of ShowUser panels to add
//		for (int i = 0; i < numUsers; i++) {
//			ShowUser showUser = new ShowUser();
//			showUser.setBounds(10, i * (showUserHeight + spacing), 141, showUserHeight);
//			panelMenuLeft.add(showUser);
//		}
//
//		JScrollPane scrollPane = new JScrollPane(panelMenuLeft);
//		scrollPane.setBounds(10, 48, 162, 414);
//		frame.getContentPane().add(scrollPane);
//
//		JPanel panelMenuFeftTop = new JPanel();
//		panelMenuFeftTop.setBackground(new Color(182, 182, 182));
//		panelMenuFeftTop.setBounds(10, 10, 162, 28);
//		frame.getContentPane().add(panelMenuFeftTop);
//		panelMenuFeftTop.setLayout(null);
//
//		JButton btnGroup = new JButton("");
//		btnGroup.setForeground(new Color(182, 182, 182));
//		btnGroup.setBackground(new Color(182, 182, 182));
//		btnGroup.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Icons8-Ios7-Healthcare-Groups.32.png"));
//		btnGroup.setBounds(97, 0, 55, 28);
//		panelMenuFeftTop.add(btnGroup);
//
//		JButton btnMSG = new JButton("");
//		btnMSG.setForeground(new Color(182, 182, 182));
//		btnMSG.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnMSG.setBackground(new Color(182, 182, 182));
//		btnMSG.setIcon(new ImageIcon("C:\\Users\\TGDD\\Downloads\\Pictogrammers-Material-Light-Message.32.png"));
//		btnMSG.setBounds(10, 0, 55, 28);
//		panelMenuFeftTop.add(btnMSG);
//
//		JPanel panelUserName = new JPanel();
//		panelUserName.setBackground(new Color(182, 182, 182));
//		panelUserName.setBounds(196, 10, 627, 28);
//		frame.getContentPane().add(panelUserName);
//	}
//
//	
//}

