package br.pucrs.alpro2.usersgroups;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JButton;


public class JUsersGroupsFrameApp extends JFrame {

	private JPanel contentPane;
	private JGroupDialog dialog;
	private DefaultListModel lista = new DefaultListModel<String>();
	private JList list;
	private ArrayList<Users> usersList = new ArrayList<Users>();

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
	@SuppressWarnings("unchecked")
	public JUsersGroupsFrameApp() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list = new JList(lista);
		list.setBorder(new LineBorder(Color.GRAY));
		list.setBounds(23, 29, 236, 334);
		contentPane.add(list);
		
		JLabel lblCurrentUsers = new JLabel("Users");
		lblCurrentUsers.setBounds(23, 11, 89, 14);
		contentPane.add(lblCurrentUsers);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(23, 369, 51, 28);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	try {
        			dialog = new JGroupDialog();
        			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        			dialog.setVisible(true);
        			dialog.getOkButton().addActionListener(new ActionListener(){
    		            @SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e) {
    		            	//JOptionPane.showMessageDialog(null, "Campos: " + dialog.getTextField().getText()+dialog.getTextField_1().getText()+dialog.getComboBox().getSelectedIndex()+dialog.getPasswordField().getText()+dialog.getTextArea().getText());
    		            	try{
	    		            	Users user = new Users(dialog.getTextField().getText(),dialog.getTextField_1().getText(),dialog.getComboBox().getSelectedIndex(),dialog.getPasswordField().getText(),dialog.getTextArea().getText());
	    		            	usersList.add(user);
	    		            	lista.add(lista.getSize(), user.getAccountName());
	    		            	dialog.setVisible(false);
								dialog.dispose();
    		            	} catch(Exception e1){
    		            		dialog.setVisible(false);
    							dialog.dispose();
    		        			e1.printStackTrace();    		            		
    		            	}
    		            }
    		        });
        			dialog.getCancelButton().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dialog.setVisible(false);
							dialog.dispose();
						}
					});
        		} catch (Exception e1) {
        			e1.printStackTrace();
        		}
            }
        });
		
		JButton button = new JButton("-");
		button.setBounds(83, 369, 51, 28);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY));
		panel.setBounds(293, 29, 400, 334);
		contentPane.add(panel);
	
		
	}
}
