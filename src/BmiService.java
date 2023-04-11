public class BmiService {
    public int calculate(double index, double ves) {
        double bmi = (ves / (index * index));
        System.out.println("Ваш индекс равен:");
        return (int) bmi;
    }
}