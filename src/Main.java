
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        Object kg;
        double height = 1.87;
        Object m;
        int Bmi = service.calculate(98, 1.87);
        System.out.println(Bmi);

    }
}