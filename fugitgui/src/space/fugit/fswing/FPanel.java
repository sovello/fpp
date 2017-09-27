package space.fugit.fswing;

import javax.swing.JPanel;

public class FPanel extends JPanel {
	private int topMargin = 45;
	private int labelFieldGap = 5;
	private int fieldMargin = 20;
	private int fieldWidth = 250;
	private int fieldHeight = 50;
	private int labelHeight = 30;
	private int columns = 0;
	private static final long serialVersionUID = 1L;

	public FPanel (FFrame frame, int row, int column, int columns){
		
		topMargin = frame.getTopMargin();
		labelFieldGap = frame.getLabelFieldGap();
		fieldMargin = frame.getFieldMargin();
		fieldWidth = frame.getFieldWidth();
		fieldHeight = frame.getFieldHeight();
		labelHeight = frame.getLabelHeight();
		columns = frame.getNumberOfColumns();
		
		int aboveSpace = topMargin + ((fieldHeight+labelHeight+labelFieldGap+fieldMargin) * (row-1));
		
		int x = fieldMargin + ((fieldWidth + fieldMargin) * (column - 1));
		int y = topMargin + ((labelHeight + labelFieldGap) * row) + ((fieldHeight + fieldMargin) * (row-1));
		setSize(frame.getFrameWidth() - (fieldMargin*(column+1))- (fieldWidth * (column - 1)), (frame.getFrameHeight() - aboveSpace-fieldMargin));
		//setSize(frame.getFrameWidth() - (fieldMargin*(column+1))- (fieldWidth * (column - 1)), (fieldHeight+fieldMargin+labelFieldGap)*4);
		setBorder(frame.getBorder());
		setFont(frame.getDisplayFonts());
		setLocation(x, y);
		//setLocation(fieldMargin, (aboveSpace + labelFieldGap));
	}
}
