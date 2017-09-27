package space.fugit.fswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class FFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private int FRAME_WIDTH = 830;
	private int FRAME_HEIGHT = 580;
	
	private Container contentPane;
	private Font displayFonts;
	private Font labelFonts;
	private LineBorder border;
	
	private int topMargin = 45;
	private int labelFieldGap = 5;
	private int fieldMargin = 20;
	private int fieldWidth = 250;
	private int fieldHeight = 50;
	private int labelHeight = 30;
	private int columns = 0;
	
	
	public FFrame(int frameHeight, int frameWidth, int cols){
		FRAME_HEIGHT = frameHeight;
		FRAME_WIDTH = frameWidth;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		fieldMargin = (int)(0.025 * FRAME_WIDTH);
		columns = cols;
		labelFieldGap = (int) (0.025 * fieldMargin);
		fieldWidth = (int)(FRAME_WIDTH - (fieldMargin * (columns + 1)))/columns;
		fieldHeight = (int) (0.10 * FRAME_HEIGHT);
		labelHeight = (int) (0.06 * FRAME_HEIGHT);
		topMargin = (int) (2 * fieldMargin);
		
		displayFonts = new Font("Verdana", Font.PLAIN, 25);
		labelFonts = new Font("Aria", Font.BOLD, 18);
		border = new LineBorder(Color.GRAY, 1, true);
		
		setTitle("Address Form");
		contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);
	}
	
	/**
	 * gets the number of columns defined for the frame
	 * @return columns int
	 */
	
	public int getNumberOfColumns() {
		return columns;
	}
	
	public LineBorder getBorder() {
		return border;
	}
	
	public void setBorder(LineBorder border) {
		this.border = border;
	}
	
	public void setLabelFonts(Font font) {
		this.labelFonts = font;
	}
	
	public Font getLabelFonts(){
		return labelFonts;
	}
	
	public void setDisplayFonts(Font font) {
		this.displayFonts = font;
	}
	
	public Font getDisplayFonts(){
		return displayFonts;
	}
	/**
	 * gets the width of the frame
	 * @return FRAME_WIDTH
	 */
	public int getFrameWidth() {
		return FRAME_WIDTH;
	}
	
	/**
	 * gets the height of the frame
	 * @return FRAME_HEIGHT
	 */
	public int getFrameHeight() {
		return FRAME_HEIGHT;
	}
	
	/**
	 * gets the top margin of the display field
	 * @return
	 */
	public int getTopMargin() {
		return topMargin;
	}
	
	
	/**
	 * gets the space between an input field and its label
	 * @return int labelFieldGap
	 */
	public int getLabelFieldGap() {
		return labelFieldGap;
	}
	
	/**
	 * field margin includes the left and right margins, the space between input
	 * fields both vertical and horizontal
	 * @return int fieldMargin the space between fields
	 */
	public int getFieldMargin() {
		return fieldMargin;
	}
	
	/**
	 * gets the width of a field such as a label, textfield, button, etc
	 * @return int fieldWidth
	 */
	public int getFieldWidth() {
		return fieldWidth;
	}
	
	/**
	 * returns the height of a field such a label, textfield
	 * @return int topMargin the top margin
	 */
	public int getFieldHeight() {
		return fieldHeight;
	}
	
	/**
	 * gets the height of a label field
	 * @return int labelHeight the height of the label 
	 */
	public int getLabelHeight() {
		return labelHeight;
	}
}
