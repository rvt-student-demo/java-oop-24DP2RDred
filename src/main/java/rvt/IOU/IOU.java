package rvt.IOU;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owe = new HashMap<>();

    public IOU() {}

    public void setSum(String toWhom, double amount) {
        owe.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        Double debt = owe.get(toWhom);
        return debt == null ? 0.0 : debt;
    }
}