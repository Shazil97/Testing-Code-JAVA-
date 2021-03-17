package code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;


    @org.junit.jupiter.api.BeforeEach
    void setUp(){
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

    //TEST CODE 5
    @Test
    void setLengthInvalidLow() {
        try {
            rectangle.setLength(0);
            fail("length of 0 should throw an Exception");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    //TEST CODE 6
    @Test
    void setLengthInvalidHigh() {
        try {
            rectangle.setLength(100);
            fail("length of 100 should throw an Exception");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
        @org.junit.jupiter.api.Test
        void setWidth ()
        {

        }
    }

