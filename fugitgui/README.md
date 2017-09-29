### Java Swing

This is a wrapper class which simplifies the process of creating Java Swing
components.

At the least, you need to give it the width and height, then it calculates
the sizes of all the components that are going to be added relative to the
frame size.

You also have to state how many rows and columns the main frame has, and
when creating the components you give it a name, a display and
the location in terms of which row and which column.

For example the constructor for the frame and button is

```java
FFrame(int frameHeight, int frameWidth, int cols){
FButton(FFrame frame, String text, int row, int column)
```

FFrame inherits from JFrame, so after this is created, you can create
any of the other components giving the frame as the first variable.

