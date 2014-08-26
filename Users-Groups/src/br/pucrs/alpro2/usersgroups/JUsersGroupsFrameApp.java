package br.pucrs.alpro2.usersgroups;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JUsersGroupsFrameApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JUsersGroupsFrameApp frame = new JUsersGroupsFrameApp();
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
	public JUsersGroupsFrameApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBorder(new LineBorder(Color.GRAY));
		list.setBounds(23, 29, 236, 334);
		contentPane.add(list);
		
		JLabel lblCurrentUsers = new JLabel("Current Users");
		lblCurrentUsers.setBounds(23, 11, 89, 14);
		contentPane.add(lblCurrentUsers);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(23, 369, 40, 28);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.setBounds(72, 369, 40, 28);
		contentPane.add(button);
	
		
	}

}
