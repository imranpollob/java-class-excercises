/**
 * Parent / Super class
 */
public class Animal {
    public int legs;
    private int weight;

    Animal() {}

    Animal(int _legs, int _weight) {
        legs = _legs;
        weight = _weight;
    }

    // Getters
    public int getLegs() { return legs; }
    public int getWeight() { return weight; }

    // Setters
    public void setLegs(int _legs) { legs = _legs; }
    public void setWeight(int _weight) { weight = _weight; }

    // General methods
    public String toString() {
        return "It has " + legs + " legs and it's weight is " + weight;
    }

    public static void hi() {
        System.out.println("Hello");
    }

    // private ->  -> publicprotected
    protected void say() {

    }

    public void test1(double a) {
        System.out.println(a * 2);
    }

    public void test2(double a) {
        System.out.println(a * 3);
    }
}
