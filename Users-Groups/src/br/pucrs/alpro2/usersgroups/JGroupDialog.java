package br.pucrs.alpro2.usersgroups;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JGroupDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton okButton;
	private JButton cancelButton;
	private JComboBox comboBox;
	private JTextArea textArea;

	
	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JPasswordField getPasswordField_1() {
		return passwordField_1;
	}

	public void setPasswordField_1(JPasswordField passwordField_1) {
		this.passwordField_1 = passwordField_1;
	}

	public JButton getOkButton() {
		return okButton;
	}

	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JGroupDialog dialog = new JGroupDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JGroupDialog() {
		setBounds(100, 100, 686, 491);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAccountName = new JLabel("Full Name:");
		lblAccountName.setBounds(10, 11, 106, 14);
		contentPanel.add(lblAccountName);
		
		textField = new JTextField();
		textField.setBounds(10, 30, 529, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAccountName_1 = new JLabel("Account Name:");
		lblAccountName_1.setBounds(10, 61, 106, 14);
		contentPanel.add(lblAccountName_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 80, 529, 20);
		contentPanel.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setBounds(10, 111, 74, 14);
		contentPanel.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 131, 529, 20);
		contentPanel.add(passwordField);
		
		JLabel lblVerifyPassword = new JLabel("Verify Password:");
		lblVerifyPassword.setBounds(10, 162, 106, 14);
		contentPanel.add(lblVerifyPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(10, 182, 529, 20);
		contentPanel.add(passwordField_1);
		
		JLabel lblPasswordHint = new JLabel("Password Hint:");
		lblPasswordHint.setBounds(10, 262, 106, 14);
		contentPanel.add(lblPasswordHint);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBorder(new LineBorder(Color.GRAY));
		textArea.setBounds(10, 287, 529, 74);
		contentPanel.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Account type:");
		lblNewLabel_1.setBounds(10, 213, 93, 14);
		contentPanel.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Standard", "Admin", "Guest"}));
		comboBox.setBounds(10, 231, 529, 20);
		contentPanel.add(comboBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
