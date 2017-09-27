package space.fugit.fswing;

import javax.swing.JRadioButton;

public class FRadioButton extends JRadioButton{
	
	private static final long serialVersionUID = 1L;

	public FRadioButton(String textId, String text) {
		setText(text);
	    setActionCommand(textId);
	    setSelected(false);
	}
	
	public FRadioButton(String text) {
		super(text);
		setActionCommand(text);
	    setSelected(false);
	}
	
	
}
