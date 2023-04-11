public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = (1.87); //Рост в метрах
        double ves = (98);//Массв тела
        int bmi = service.calculate(index, ves);
        System.out.println(bmi);
    }
}