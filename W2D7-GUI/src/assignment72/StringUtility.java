package assignment72;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class StringUtility implements ActionListener {

	private static final int FRAME_WIDTH = 750;
	private static final int FRAME_HEIGHT = 300;
	
	private JFrame mainFrame;
	private Container contentPane;
	
	private Button letterCounter, letterReverser, deDuper;
	private TextField input, output;
	private Label inputLabel, outputLabel;
	private Font labelFonts = new Font("Aria", Font.BOLD, 18);
	private Font displayFonts = new Font("Verdana", Font.PLAIN, 25);
	
	private int labelWidth = 100;
	private int labelHeight = 30;
	private int width = 250;
	private int height = 50;
	private int textFieldWidth = 350;
	
	StringUtility(){
		mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = mainFrame.getContentPane();
		
		mainFrame.setTitle("String Utility");
		mainFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		mainFrame.setResizable(false);
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);
		addComponents();
		mainFrame.setVisible(true);
	}
	
	private class Button extends JButton {
		
		private static final long serialVersionUID = 1L;

		public Button(String buttonLabel) {
			setText(buttonLabel);
			setFont(labelFonts);
			setBorder(BorderFactory.createEtchedBorder(BevelBorder.RAISED));
			setBackground(Color.white);
			setSize(width, height);
			setFocusPainted(false);
		}
	}
	
	private class Label extends JLabel {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		Label(String labelText) {
			setText(labelText);
			setFont(labelFonts);
			setSize(labelWidth, labelHeight);
		}
	}
	
	private class TextField extends JTextField {
		private static final long serialVersionUID = 1L;

		TextField(){
			setFont(displayFonts);
			setSize(textFieldWidth, height);
		}
	}
	
	private void addComponents() {
		
		inputLabel = new Label("Input");
		inputLabel.setLocation(350, 60);
		contentPane.add(inputLabel);
		
		input = new TextField();
		input.setLocation(350, 85);
		contentPane.add(input);
		
		output = new TextField();
		output.setLocation(350, 165);
		contentPane.add(output);
		
		outputLabel = new Label("Output");
		outputLabel.setLocation(350, 140);
		contentPane.add(outputLabel);
		
		letterCounter = new Button("Count Letters");
		letterCounter.setLocation(25, 50);
		letterCounter.addActionListener(this);
		contentPane.add(letterCounter);
		
		letterReverser = new Button("Reverse Letters");
		letterReverser.setBounds(25, 125, width, height);
		letterReverser.addActionListener(this);
		contentPane.add(letterReverser);
		
		deDuper = new Button("Remove Duplicates");
		deDuper.setBounds(25, 200, width, height);
		deDuper.addActionListener(this);
		contentPane.add(deDuper);
	}
	
	public void actionPerformed(ActionEvent event) {
		Object eventSource = event.getSource();
		if (eventSource instanceof JButton) {
			JButton button = (JButton)eventSource;
			if( button.getText() == "Count Letters") {
				int length = input.getText().length();
				output.setText(String.format("%d", length));
			}
			if( button.getText() == "Reverse Letters" ) {
				String text = input.getText();
				String rText = "";
				for(int i = text.length() - 1; i >= 0; i--) {
					rText += text.charAt(i);
				}
				output.setText(rText);
			}
			
			if (button.getText() == "Remove Duplicates") {
				String text = input.getText();
				String newString = "";
				for( int i = 0; i < text.length() ; i++) {
					if( newString.indexOf(text.charAt(i)) == -1) {
						newString += text.charAt(i);
					}
				}
				output.setText(newString);
			}
		}
	}
}
