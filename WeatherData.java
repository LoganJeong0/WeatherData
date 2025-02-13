import java.util.ArrayList;
public class WeatherData
{
/** Guaranteed not to be null and to contain only non-null entries */
private ArrayList<Double> temperatures;
public WeatherData(ArrayList<Double> arr){
    temperatures = arr;
}
public void cleanData(double lower, double upper)
{ 
    for (int i = 0; i < temperatures.size(); i++){
        if (temperatures.get(i) > upper || temperatures.get(i) < lower){
            temperatures.remove(i);
        }
    }
}
public ArrayList<Double> getArrayList(){
    return temperatures;
}
public int longestHeatWave(double threshold)
{ 
    int max = 0;
    int current = 0;
    for (double heat : temperatures){
        //System.out.println("heat: " + heat + "   Threshold: " + threshold + "  Result: " + (heat > threshold));
        if (heat > threshold){
            current++;
        }
        else current = 0;
        if (current > max){
            max = current;
        }
    }   
    return max;
}
// There may be instance variables, constructors, and methods that are not shown.
}
