import java.util.*;

public class KNNClassifier {

    static class DataPoint {
        double x1, x2;
        String label;

        DataPoint(double x1, double x2, String label) {
            this.x1 = x1;
            this.x2 = x2;
            this.label = label;
        }
    }

    static double distance(DataPoint a, DataPoint b) {
        return Math.sqrt(
            Math.pow(a.x1 - b.x1, 2) +
            Math.pow(a.x2 - b.x2, 2)
        );
    }

    static String predict(
            List<DataPoint> trainingData,
            DataPoint testPoint,
            int k) {

        List<DataPoint> sorted = new ArrayList<>(trainingData);

        sorted.sort(
            Comparator.comparingDouble(
                p -> distance(p, testPoint)
            )
        );

        Map<String, Integer> votes = new HashMap<>();

        for (int i = 0; i < k; i++) {
            String label = sorted.get(i).label;
            votes.put(label, votes.getOrDefault(label, 0) + 1);
        }

        return votes.entry