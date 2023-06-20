import java.beans.Transient;

public class StringCalculatorTest{
    //this is the test
    //
    @BeforeEach
    public void setUp() {
        calculator = new calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    //should throw an exception because it is negative
    public void testCount1() {
        calculator.setInt("-5");
    }

    @Test
    //should be ignored because it's greater than 1000
    public void testCount2(){
        calculator.setInt("5000");
    }
    
    @Test
    //should run just fine
    public void testCount3(){
        calculator.setInt("5");
    }
}
