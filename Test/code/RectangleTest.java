package code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
        //GLOBAL VARIABLES
    private Rectangle rectangle;
    private Rectangle square;


    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        //NEW OBJECTS
        rectangle = new Rectangle(20,30);
        square = new Rectangle(20,20);
    }

    //TEST CODE 1
    @Test
    void getPerimeterSquare()
    {    //length = 20, width = 20. Perimeter = 2*20+2*20=80
        double expResult = 80;
        assertEquals(expResult, square.getPerimeter());
    }

    //TEST CODE 2
    @Test
    void getPerimeterRectangle()
    {    //length = 20, width = 20. Perimeter = 2*20+2*30=100
        double expResult = 100;
        assertEquals(expResult, rectangle.getPerimeter());
    }

    //TEST CODE 3
    @Test
    void getArea()
    {
        //length = 20, width = 30,. Area = 20*30=600
        double expResult = 600;
        assertEquals(expResult, rectangle.getArea());
    }

    //TEST CODE 4
    @org.junit.jupiter.api.Test

    void setLength() {
        rectangle.setLength(75);
        assertEquals(75, rectangle.getLength());
    }

    //TEST CODE 5 for low Length
    @Test
    void setLengthInvalidLow() {
        try {
            rectangle.setLength(0);
            fail("length of 0 should throw an Exception");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    //TEST CODE 6 for high Length
    @Test
    void setLengthInvalidHigh() {
        try {
            rectangle.setLength(100);
            fail("length of 100 should throw an Exception");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

        //TEST CODE 7 shorter way of writing valid test for width
        @org.junit.jupiter.api.Test
        void setWidth ()
        {
          rectangle.setWidth(40);
          assertEquals(40,rectangle.getWidth());
        }

        //TEST CODE 8 test code for low width
    @Test
    void setWidthInvalidLow()
    {
        assertThrows(IllegalArgumentException.class, ()->
                rectangle.setWidth(0));
    }
    }

