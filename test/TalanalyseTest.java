import static org.junit.Assert.*;

public class TalanalyseTest {

    @org.junit.Test
    public void getNumbersAboveAvg() {
        Talanalyse talanalyse = new Talanalyse();
        int[] numbers = {1,3,5,32,1,7};
        int expected = 1;
        int actual = talanalyse.getNumbersAboveAvg(numbers);
        assertEquals(expected, actual);
    }
}