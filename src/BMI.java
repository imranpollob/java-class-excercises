public class BMI {
    String name;
    int age;
    double weight;
    double height;
    final double KG_PER_LB = 0.454;
    final double MR_PER_INCH = 0.0254;

    BMI(String _name, int _age, double _weight, double _height) {
        name = _name;
        age = _age;
        weight = _weight;
        height = _height;
    }

    BMI(String _name, double _weight, double _height) {
        name = _name;
        weight = _weight;
        height = _height;
    }

    private double getBMI() {
        double bmi = weight * KG_PER_LB / ((height * MR_PER_INCH) * (height * MR_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public void getStatus() {
        double bmi = getBMI();
        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
