import junit.framework.TestCase;

public class WagesGeneratorTest extends TestCase {

    // Test Number: 1
    // Test Objective: To calculate the wages of a salesperson
    // Test input(s): weekly = "200" , commissionsPercent = "0.09" , comAmount = "500"
    // Test expected output(s): 245

    public void testcalculateWages001() {

        WagesGenerator testObj = new WagesGenerator();

        assertEquals(245, testObj.calculateWages(200 , 0.09, 500));

    } // end testcalculateWages001


    // Test Number: 2
    // Test Objective: To calculate invalid values
    // Test input(s): weekly = "150" , commissionsPercent = "0.06" , comAmount = "200"
    // Test expected output(s): Error

    public void testcalculateWages002() {

        WagesGenerator testObj = new WagesGenerator();

        assertEquals("error", testObj.calculateWages(150 , 0.06, 200));

    } // end testcalculateWages002

    // Test Number: 3
    // Test Objective: To calculate invalid values
    // Test input(s): weekly = "250" , commissionsPercent = "0.1" , comAmount = "700"
    // Test expected output(s): Error

    public void testcalculateWages003() {

        WagesGenerator testObj = new WagesGenerator();

        assertEquals("error", testObj.calculateWages(250 , 0.1, 700));

    } // end testcalculateWages003

    // Test Number: 3
    // Test Objective: To calculate invalid values
    // Test input(s): weekly = "200" , commissionsPercent = "0.09" , comAmount = "-200"
    // Test expected output(s): Error

    public void testcalculateWages004() {

        WagesGenerator testObj = new WagesGenerator();

        assertEquals("error", testObj.calculateWages(200 , 0.09, -200));

    } // end testcalculateWages004

}