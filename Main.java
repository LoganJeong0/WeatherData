import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        double[] temps = {99.1, 142, 85, 86.1, 84.6, 94.3, 123, 98, 101};
        ArrayList<Double> t = new ArrayList<Double>();
        for(double n : temps) t.add(n);
        WeatherData w = new WeatherData(t);
        //w.cleanData(85.0, 120.0);
        System.out.println(w.longestHeatWave(95.2));
    }
}