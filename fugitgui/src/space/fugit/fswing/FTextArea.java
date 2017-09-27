package space.fugit.fswing;

import javax.swing.JTextArea;

public class FTextArea extends JTextArea {
	
	private int topMargin = 45;
	private int labelFieldGap = 5;
	private int fieldMargin = 20;
	@SuppressWarnings("unused")
	private int fieldWidth = 250;
	private int fieldHeight = 50;
	private int labelHeight = 30;
	private int columns = 0;
	private static final long serialVersionUID = 1L;

	public FTextArea(FFrame frame) {
		topMargin = frame.getTopMargin();
		labelFieldGap = frame.getLabelFieldGap();
		fieldMargin = frame.getFieldMargin();
		fieldWidth = frame.getFieldWidth();
		fieldHeight = frame.getFieldHeight();
		labelHeight = frame.getLabelHeight();
		columns = frame.getNumberOfColumns();
		setBorder(frame.getBorder());
		setFont(frame.getDisplayFonts());
	}
	//stays at a row alone, usually last row
	public FTextArea(FFrame frame, int row){
		this(frame);
		int aboveSpace = topMargin + ((fieldHeight+labelHeight+labelFieldGap+fieldMargin) * (row-1));
		
		setSize(frame.getFrameWidth() - (fieldMargin*2), (frame.getFrameHeight() - aboveSpace-fieldMargin));
		setLocation(fieldMargin, (aboveSpace + labelFieldGap));
	}
	
	//this can be put inside the table, it takes two rows
	public FTextArea(FFrame frame, int row, int column){
		this(frame);
		int aboveSpace = topMargin + ((fieldHeight+labelHeight+labelFieldGap+fieldMargin) * (row-1));
		
		setSize(frame.getFrameWidth() - (fieldMargin*2), (frame.getFrameHeight() - aboveSpace-fieldMargin));
		setLocation(fieldMargin, (aboveSpace + labelFieldGap));
	}
	
	//this spans several columns
	public FTextArea(FFrame frame, int row, int column, int spanRows){
		
		this(frame);
		
		int aboveSpace = (columns * 0) + topMargin + ((fieldHeight+labelHeight+labelFieldGap+fieldMargin) * (row-1));
		
		setSize(frame.getFrameWidth() - (fieldMargin*2), (frame.getFrameHeight() - aboveSpace-fieldMargin));
		setLocation(fieldMargin, (aboveSpace + labelFieldGap));
	}
}