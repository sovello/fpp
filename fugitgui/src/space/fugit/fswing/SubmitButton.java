package space.fugit.fswing;

import javax.swing.JButton;

public class SubmitButton extends JButton {
	
	private int topMargin = 45;
	private int labelFieldGap = 5;
	private int fieldMargin = 20;
	private int fieldWidth = 250;
	private int fieldHeight = 50;
	private int labelHeight = 30;
	
	private static final long serialVersionUID = 1L;

	public SubmitButton(FFrame frame, String text, int row){
		topMargin = frame.getTopMargin();
		labelFieldGap = frame.getLabelFieldGap();
		fieldMargin = frame.getFieldMargin();
		fieldWidth = frame.getFieldWidth();
		fieldHeight = frame.getFieldHeight();
		labelHeight = frame.getLabelHeight();
		
		int x = frame.getFrameWidth() - (fieldWidth + fieldMargin);
		int y = topMargin + ((labelHeight + labelFieldGap) * row) + ((fieldHeight + fieldMargin) * (row-1));
		setLocation(x, y);
		setText(text);
		setFont(frame.getLabelFonts());
		setSize(fieldWidth, fieldHeight);
		setFocusPainted(false);
	}
}