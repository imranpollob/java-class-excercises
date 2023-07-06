/**
 * Child / Sub class
 */
public class Tiger extends Animal {
    Tiger() {
        super(4, 200);
    }

    public void feed() {
        super.setWeight(super.getWeight() + 2);
    }

    // Overriding parent toString method
    @Override
    public String toString() {
        return "Tiger has " + super.getLegs() + " legs and it's weight is " + super.getWeight();
    }

    public static void hi() {
        Animal.hi();
        System.out.println("Hello !!!");
    }

    // more accessible
    public void say(){

    }

    // override
    public void test1(double a) {
        System.out.println(a);
    }

    // overload
    public void test2(int a) {
        System.out.println(a);
    }

}
