import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
/**
 * Describes a mosaic table top
 * @ryujiroyoshioka
 */
public class TileFloor
{
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
    public static final int BLACK = 3;
    public static final int CYAN = 4;
    
    public static final int GAP = 3;
    public static final int SIDE = 10;
    public static final int DEFAULT_ROWS = 8;
    public static final int DEFAULT_COLUMNS = 6;
    
    private Random random;
    private int x;
    private int y;
    
    //must be initialized in the constructors
    private  final int ROWS;
    private  final int COLUMNS;
    
    
    
    /**
     * Models a tile floor with upper left hand corner at x, y and square tiles with side of 10 with the 
     * default number of rows and columns
     * @param x the x coordinate of the upper left hand corner of the table top
     * @param y the x coordinate of the upper left hand corner of the table top
     */
    public TileFloor(int x, int y)
    {
        random = new Random(12345);
        
        this.x = x;
        this.y = y;
        ROWS = DEFAULT_ROWS;
        COLUMNS = DEFAULT_COLUMNS;
        
    }
    
    /**
     * Models a tile floor with upper left hand corner at x, y and square tiles with side of 10.
     * @param x the x coordinate of the upper left hand corner of the table top
     * @param y the x coordinate of the upper left hand corner of the table top
     * @param rows the number of rows in this TileFloor
     * @param columns the number of squares in each row of this TileFloor
     */
    public TileFloor( int x, int y, int rows, int columns)
    {
        random = new Random(12345);
        
        this.x = x;
        this.y = y;
        ROWS = rows;
        COLUMNS = columns;
        
    }
    
    
    public Color randomColor() {
    	
    		int colorInt = random.nextInt(5);
        Color theColor;
        
        if(colorInt == RED) {
        	
        	theColor = Color.red;
        	
        }
        
        else if (colorInt == GREEN) {
        
        	theColor = Color.green;
        	
        }
        
        else if (colorInt == BLUE) {
            
        theColor = Color.blue;
        	
        }
        
        else if (colorInt == BLACK) {
        	
        	theColor = Color.black;
        	
        }
        
        else {
        	
        	theColor = Color.cyan;
        	
        }
        
        return theColor;
    	
    }
    
    
    public void draw(Graphics2D g2) {
    	
    		int tileY = y;
    	
    		for(int rows = 0; rows < ROWS;rows++) {
    			
    			int tileX = x;
    			
    			for(int columns = 0; columns < COLUMNS;columns++) {
    	    		
    	    		Rectangle rectangle = new Rectangle(tileX,tileY,SIDE,SIDE);
    	    		tileX = tileX + SIDE + GAP;
    	    		g2.setColor(randomColor());
    	    		g2.fill(rectangle);
    	    		
    		}
    	
        		tileY = tileY + SIDE + GAP;

    	}
     	
  }
    /**
     * Sets a new x for  the table top
     * @param x the new x coordinate of this object.
     */
    public void setX(int x)
    {
        this.x = x;
    }
    
    /**
     * Sets a new y for  the table top
     * @param theY the new y coordinate of this object.
     */
    public void setY(int theY)
    {
        y = theY;
    }
}      