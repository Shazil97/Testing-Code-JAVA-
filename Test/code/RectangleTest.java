package code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;


    @org.junit.jupiter.api.BeforeEach
    void setUp(){
        rectangle = new Rectangle(20,30);
        square = new Rectangle(20,30);
    }
    @Test
    void getPerimeterSquare()
    {    //leangth = 20, width = 20. Perimeter = 2*20+2*30=100
        double expResult = 80;
        assertEquals(expResult, square.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void setLength() {
    }

    @org.junit.jupiter.api.Test
    void setWidth() {
    }

}