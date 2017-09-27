package space.fugit.fswing;

import javax.swing.JLabel;

public class FLabel extends JLabel {
	
	private int topMargin = 45;
	private int labelFieldGap = 5;
	private int fieldMargin = 20;
	private int fieldWidth = 250;
	private int fieldHeight = 50;
	private int labelHeight = 30;
	
	private static final long serialVersionUID = 1L;

	public FLabel(FFrame frame, String text, int row, int column) {
		topMargin = frame.getTopMargin();
		labelFieldGap = frame.getLabelFieldGap();
		fieldMargin = frame.getFieldMargin();
		fieldWidth = frame.getFieldWidth();
		fieldHeight = frame.getFieldHeight();
		labelHeight = frame.getLabelHeight();
		
		int x = 0;
		int y = 0;
		if( column >= 1) {
			x = fieldMargin + ((fieldWidth + fieldMargin) * (column - 1));
		}
		if( row >= 1 ) {
			y = topMargin + ((labelHeight + labelFieldGap + fieldHeight + fieldMargin) * (row - 1));
		}
		
		setLocation(x, y);
		setText(text);
		setFont(frame.getLabelFonts());
		setSize(fieldWidth, labelHeight);
	}
}