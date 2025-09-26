public class Main {
    public static void main(String[] args) {
        HumanBMI humanBMI = new HumanBMI(80,1.52);
        System.out.println(humanBMI.getResult());
    }
}
class HumanBMI {
    private double weight; //Weight Human
    private double height; // Height Human
    public HumanBMI(double weight, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero");
        }
        this.weight = weight;
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be > 0");
        this.height = height;
    }
    public double getBMI() {
        return weight/(height * height);
    }
    public String getResult() {
        double bmi = getBMI();
        if (bmi < 18.5) return "Deficit";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Warning!";
        else return "Fat";
    }
}