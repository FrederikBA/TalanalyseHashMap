import java.util.Map;

public interface ITalanalyse {

    public Map<String, Integer> getStatMap(Map<String, int[]> areaStats);

    public int getNumbersAboveAvg(int[] numbers);
}
