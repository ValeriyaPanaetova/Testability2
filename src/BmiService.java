public class BmiService {
    public int calculate(double height, double weight) {
        double index = weight / (height * 2);
        return (int) index; // возвращаем рассчитанный индекс массы тела
    }
}
