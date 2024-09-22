import java.util.ArrayList;

public class ChangeHistory {

    private final ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public double average() {
        return history.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public double minValue() {
        return history.stream()
                .mapToDouble(d -> d)
                .min()
                .orElse(0.0);
    }

    public double maxValue() {
        return history.stream()
                .mapToDouble(d -> d)
                .max()
                .orElse(0.0);
    }

    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
