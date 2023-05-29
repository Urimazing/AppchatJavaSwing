package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

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
