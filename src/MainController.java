import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainController {

    public void runProgram() {
        ITalanalyse talanalyse = new Talanalyse();

        int[] numbers = {1, 3, 5, 32, 1, 7};
        int[] numbersTwo = {1, 6, 4, 38, 22, 6};
        Map<String, int[]> areaStats = new HashMap<>();
        areaStats.put("Vejle", numbers);
        areaStats.put("Aarhus", numbersTwo);
        Map<String, Integer> returnStats = talanalyse.getStatMap(areaStats);
/*
        System.out.println(Arrays.toString(numbers));
        int antalTalOverAvg = talanalyse.getNumbersAboveAvg(numbers);
        System.out.println("Antal: " + antalTalOverAvg);
*/

    }

}
