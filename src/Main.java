public class Main {
    public static void main (String[] args){
        BmiService service = new BmiService();
        double height = 1.74;
        int weight = 70;
        double index = service.calculate(height, weight);
        System.out.println((int)index);

    }
}
