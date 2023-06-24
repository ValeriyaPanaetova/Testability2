public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        double weight = 70;
        double bmiIndex = service.calculate(height, weight);
        System.out.println(bmiIndex);
    }
}