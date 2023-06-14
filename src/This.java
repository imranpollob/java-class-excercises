public class This {
    private int age = 1;
    private static int point = 10;

    This() {
        this(18);
    }

    This(int _age) {
        this(_age, 100);
    }

    This(int _age, int _point) {
        age = _age;
        point = _point;
    }

    public void setAge(int _age) {
        age = _age;
    }

    public void setAgeUsingThis(int _age) {
        this.age = _age;
    }

    public int getAge() {
        return age;
    }

    public static void setPoint(int _point) {
        point =  _point;
    }

    public static void setPoint2(int _point) {
        // this keyword will give an error here
        This.point =  _point;
    }

    public int getPoint() {
        return point;
    }
}
