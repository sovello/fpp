package assignment71;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class AddressForm implements ActionListener{
	
	private static final int WIDTH = 830;
	private static final int HEIGHT = 580;
	
	private JFrame addressForm;
	private TextField name, street, city, state, zip;
	private TextArea textArea;
	private Label nameLabel, streetLabel, cityLabel, stateLabel, zipLabel;
	private Button submitButton;
	
	private Container contentPane;
	
	private int width = 250;
	private int height = 50;
	private int labelWidth = 100;
	private int labelHeight = 30;
	private Font displayFonts = new Font("Verdana", Font.PLAIN, 25);
	private Font labelFonts = new Font("Aria", Font.BOLD, 18);
	private LineBorder border = new LineBorder(Color.GRAY, 1, true);
	
	AddressForm(){
		addressForm = new JFrame("Address Form");
		addressForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addressForm.setSize(WIDTH, HEIGHT);
		addressForm.setResizable(false);
		contentPane = addressForm.getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);
		addcontentPane();
		addressForm.setVisible(true);
	}	
	
	private class TextField extends JTextField{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		TextField(int row, int column){
			int x = 0;
			int y = 0;
			if( column >= 1) {
				x = leftMargin + ((width + colToCol) * (column - 1));
			}
			if( row >= 1 ) {
				y = topMargin + ((labelHeight + labelFieldGap) * row) + ((height + fieldToLabel) * (row-1));
			}
			
			setLocation(x, y);
			setFont(displayFonts);
			setSize(width, height);
		}
	}

	private int leftMargin = 20;
	private int topMargin = 45;
	//private int leftSpace = 20;
	private int fieldToLabel = 20;
	private int labelFieldGap = 5;
	private int colToCol = 20;
	private class Label extends JLabel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		Label(String text, int row, int column) {
			int x = 0;
			int y = 0;
			if( column >= 1) {
				x = leftMargin + ((width + colToCol) * (column - 1));
			}
			if( row >= 1 ) {
				y = topMargin + ((labelHeight + labelFieldGap + height + fieldToLabel) * (row - 1));
			}
			
			setLocation(x, y);
			setText(text);
			setFont(labelFonts);
			setSize(labelWidth, labelHeight);
		}
	}
	
	private class Button extends JButton {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		Button(String text){
			setText(text);
			setFont(labelFonts);
			setSize(width, height);
			setFocusPainted(false);
		}
	}
	
	private class TextArea extends JTextArea {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		TextArea(){
			setSize(790, 160);
		}
	}
	
	
	private void addcontentPane() {
		nameLabel = new Label("Name", 1, 1 );
		contentPane.add(nameLabel);
		
		name = new TextField(1, 1);
		contentPane.add(name);
		
		streetLabel = new Label("Street", 1, 2);
		contentPane.add(streetLabel);
		
		street = new TextField(1, 2);
		contentPane.add(street);
		
		
		cityLabel = new Label("City", 1, 3);
		contentPane.add(cityLabel);

		city = new TextField(1, 3);
		contentPane.add(city);
		
				
		stateLabel = new Label("State", 2, 1);
		contentPane.add(stateLabel);
		
		state = new TextField(2, 1);
		contentPane.add(state);
		
		
		zip = new TextField(2, 2);
		contentPane.add(zip);
		
		zipLabel = new Label("Zip", 2, 2);
		contentPane.add(zipLabel);
		
		
		submitButton = new Button("Submit");
		submitButton.setLocation(280, 315);
		submitButton.addActionListener(this);
		contentPane.add(submitButton);
		
		//add textArea for displaying output
		textArea = new TextArea();
		textArea.setLocation(20, 400);
		textArea.setBorder(border);
		textArea.setFont(displayFonts);
		contentPane.add(textArea);
		
	}	
	
	public void actionPerformed(ActionEvent event) {
		Object actionEvent = event.getSource();
		if(actionEvent instanceof JButton) {
			JButton capturedEvent = (JButton)actionEvent;
			if ((String)capturedEvent.getText() == "Submit"){
				textArea.setText( String.format("" +
						"%s%n" +
						"%s%n" +
						"%s, %s %s", name.getText(), street.getText(),
						city.getText(), state.getText(), zip.getText()));
			}
			
		}
	}
}
