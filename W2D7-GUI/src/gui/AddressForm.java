package gui;

import java.awt.*;
import java.awt.event.*;

import space.fugit.gui.*;

public class AddressForm extends FFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private FTextField name, street, city, state, zip;
	private FTextArea textArea;
	private FLabel nameLabel, streetLabel, cityLabel, stateLabel, zipLabel;
	private SubmitButton submitButton;
	
	private Container contentPane;
	
	AddressForm(int fHeight, int fWidth, int cols){
		super(fHeight, fWidth, cols);
		setTitle("Address Form");
		contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);
		addcontentPane();
	}	
		
	
	private void addcontentPane() {
		nameLabel = new FLabel(this, "Name", 1, 1 );
		contentPane.add(nameLabel);
		
		name = new FTextField(this, 1, 1);
		contentPane.add(name);
		
		streetLabel = new FLabel(this, "Street", 1, 2);
		contentPane.add(streetLabel);
		
		street = new FTextField(this, 1, 2);
		contentPane.add(street);
		
		
		cityLabel = new FLabel(this, "City", 1, 3);
		contentPane.add(cityLabel);

		city = new FTextField(this, 1, 3);
		contentPane.add(city);
		
				
		stateLabel = new FLabel(this, "State", 2, 1);
		contentPane.add(stateLabel);
		
		state = new FTextField(this, 2, 1);
		contentPane.add(state);
		
		
		zip = new FTextField(this, 2, 2);
		contentPane.add(zip);
		
		zipLabel = new FLabel(this, "Zip", 2, 2);
		contentPane.add(zipLabel);
		
		
		submitButton = new SubmitButton(this, "Submit", 3);
		submitButton.addActionListener(this);
		contentPane.add(submitButton);
		
		textArea = new FTextArea(this, 2);
		contentPane.add(textArea);
		
	}	
	
	public void actionPerformed(ActionEvent event) {
		Object actionEvent = event.getSource();
		if(actionEvent instanceof SubmitButton) {
			SubmitButton capturedEvent = (SubmitButton)actionEvent;
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
