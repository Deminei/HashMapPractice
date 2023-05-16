import java.util.HashMap;
import java.util.Map;

public class IOU {
    private Map<String, Double> IOU;

    public IOU() {
        IOU = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        IOU.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return IOU.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
