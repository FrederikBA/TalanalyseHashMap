import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Talanalyse implements ITalanalyse {

    public int getNumbersAboveAvg(int[] numbers) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int avgOver = sum / numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avgOver) {
                counter = counter + 1;
            }
        }

        return counter;
    }

    public Map<String, Integer> getStatMap(Map<String, int[]> areaStats) {
        Map<String, Integer> stats = new HashMap<>();

        Set<String> sets = areaStats.keySet();

        for (String s : sets) {
            int[] statArray = areaStats.get(s);
            int aboveAvgStats = getNumbersAboveAvg(statArray);
            stats.put(s, aboveAvgStats);
            System.out.println(s + ": " + aboveAvgStats);
        }
        return stats;
    }

}
