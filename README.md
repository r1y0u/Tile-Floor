# Tile-Floor
The tile floor consists of some number of rows of (filled) colored squares. 

Each row contains some number of squares. Each square has a side of 10 pixels and is separated from its neighbors by 3 pixels. Each square is a random color: either red, green, blue, black, and cyan. 

Use the constants defined for you in the starter code. You must use nested loops. Draw the rows and then the columns to match Codecheck output.  For the colors, use the Color constants in the Color class. (Color.RED etc)  The TileFloor will have two constructors  public TileFloor( int x, int y) where x and y are the coordinates of the upper left-hand corner of the floor. 

Create a Random object using the constructor that takes a seed. Use 8 as the default number of rows and 6 as the default the number of columns. (Use the constants defined for you in the starter).

public TileFloor( int x, int y, int rows, int columns) where x and y are the coordinates of the upper left-hand corner of the floor. rows is the number of rows and columns is the number of squares in each row. Create a Random object using the constructor that takes a seed.

The TileFloor will have these methods  public void draw(Graphics2D g2) draws the floor with the rows filled squares at the x, y coordinates. Use a nested loop private Color randomColor() randomly returns a Color object either red, green, blue, black, or cyan. Use the Random object you created in the constructor to determine which to return. You need to use if / else if / else statement structure. public void setX(int x) sets a new x coordinate. 

public void setY(int y) sets a new y coordinate. (Implemented for you) There is trick you can use to determine which color to return. Notice each color has been assigned an integer 0 to 4 in the constants. You can generate a random number between 0 (inclusive) and 5 (exclusive). If the random number is RED (0), return Color.RED. If the random number is GREEN (1), return Color.GREEN. Use the defined constants, not the numbers 0, 1 etc.
