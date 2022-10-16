
import java.util.ArrayList;


public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory=new ArrayList<>();
    }
    
    public void add(double status) {
        this.changeHistory.add(status);
    }
    
    public void clear() {
        this.changeHistory=new ArrayList<>();
    }
    
    public String toString() {
        return this.changeHistory.toString();
    }
    
    public double maxValue() {
        if (this.changeHistory.size()==0) {
            return 0;
        } else {
            double maxValue = this.changeHistory.get(0);
            for (Double value: this.changeHistory){
                if(value >= maxValue) {
                    maxValue = value;
                }
            }
            return maxValue;
        }
    }
    
    public double minValue() {
        if (this.changeHistory.size()==0) {
            return 0;
        } else {
            double minValue = this.changeHistory.get(0);
            for (Double value: this.changeHistory){
                if(value <= minValue) {
                    minValue = value;
                }
            }
            return minValue;
        }
    }
    
    public double average() {
        if (this.changeHistory.size()==0) {
            return 0;
        } else {
            double sum = 0;
            for (Double value: this.changeHistory){
                sum+=value;
            }
            return sum/this.changeHistory.size();
        }
    }
    
}
