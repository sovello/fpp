### Building GUIs in Java with Swing.

Lab :

1. Do   prog7-1_address_form from the Wiki

2. Do   prog7-2_string_util from the Wiki

3. In the Ch7TextFrame1 class, (from the Wiki) event handling
was done with this class. Modify the class so the button
events are handled by a `ButtonHandler` class, and the text events are handled by a
`TextHandler` class. You can use the `ButtonHandler`
class defined in the lesson, but you need to define your own `TextHandler` class.

4. Write a MyMenuFrame class with these menu choices.

    
    |File   |Edit  |Color |
    |-------|------|------|
    |Quit   |Erase |Red	  |
    |  	    |	   |Green |
    |	    |	   |Blue  |
    |	    |	   |Pink  |
    |	    |	   |Black |

    When the user selects Quit, stop the program.  When the user selects one of the colors, change
    the background of the frame (i.e., change the background color of the frame’s content pane)
    to the selected color.  When the user selects Erase, reset the background color to white.

5. Extra Credit :

   Create a GUI application for a registrar system at a university.  You will need
   students, professors, courses, grades, etc.  Design the GUI screens yourself
   and make it as complete and full as time allows.