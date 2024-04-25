public class BmiService {

    public int calculate(int weight, double height) {
        int indexBmi;
        indexBmi = (int) (weight / (height * height));

        return indexBmi;
    }
}
