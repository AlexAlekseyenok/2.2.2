public class BmiService {
    public double calculate (double height, int weight){
        double index = (weight / Math.pow(height, 2));
        return index;
    }

}
