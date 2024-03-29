//import com.deitel.data.A;
//import com.deitel.data.C;
import com.deitel.data.*;
import report.ShowReport;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        AreaCalculator.calculator();
//        MathQuiz.quiz();
//        TestingElse.test();
//        BitwiseOperation.test();
//        SwitchTest.test();
//        MathTest.test();
//        CharacterTest.test();
//        StringTest.test();
//        MathQuizLoop.test();
//        FloatingPointLoop.test();
//        DoWhileLoop.test();
//        ForLoop.test();
//        BreakAndContinue.test();
//        Quiz.test();
//        MethodExperiment.test();
//        ArrayPractice.test();
//        MultidimensionalArray.test();

//        BMI imran = new BMI("imran", 30, 62, 100);
//        imran.getStatus();
//        System.out.println(imran.name);
//
//        BMI joss = new BMI("joss", 65, 100);
//        joss.getStatus();
//        System.out.println(joss.height);

        /** create a class called Grade
         properties:
         - name: string
         - gradeOfSubject1: int,
         - gradeOfSubject2: int
         - gradeOfSubject3: int,
         methods:
         - constructor(name, gradeOfSubject1, gradeOfSubject2, gradeOfSubject3)
         - constructor(gradeOfSubject1, gradeOfSubject2, gradeOfSubject3)
         - getGrade(): int // average of three subject grades

         two objects:
         person1 -> use 1st constructor
         person2 -> use 2nd constructor

         print out the grade of two persons
        */

//        Grade person1 = new Grade("joss", 4, 5, 6);
//        System.out.println(person1.getGrade());
//
//        Grade person2 = new Grade(4, 7, 9);
//        System.out.println(person2.getGrade());

//        DefaultValue.test();
//        DefaultValue df = new DefaultValue();
//        df.test();
//        System.out.println(DefaultValue.age);

//        This thisObject = new This();
//        thisObject.setAge(5);
//        System.out.println(thisObject.getAge());
//        thisObject.setAgeUsingThis(7);
//        System.out.println(thisObject.getAge());
//
//        This.setPoint(20);
//        System.out.println(thisObject.getPoint());
//        This.setPoint2(50);
//        System.out.println(thisObject.getPoint());

//        This thisObj = new This();
//        System.out.println(thisObj.getAge());
//        System.out.println(thisObj.getPoint());

//        ShowReport showReport = new ShowReport();
//        showReport.test();
//        A a = new A();
//        C c = new C();

//        ThinkingInObjects.test();

//        Tiger tiger = new Tiger();
//        System.out.println(tiger.toString());
//        tiger.feed();
//        System.out.println(tiger);
//        Animal.hi();
//        tiger.hi();

//        tiger.test1(10);
//        tiger.test2(10);
//        tiger.test2(10.0);
//        Animal animal = new Tiger();
//        if (animal instanceof Tiger) {
//            System.out.println("animal object is an instance of Tiger");
//        }
//        Tiger tiger1 = (Tiger) new Animal();
//        if (tiger1 instanceof Animal) {
//            System.out.println("tiger1 object is an instance of Animal");
//        }

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(7);
//        numbers.add(5);
//        numbers.remove(5);

//        MyException.test();

//        try {
//            MyFile.test();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        GeometricObject[] geo = new GeometricObject[5];
//        // We can't instantiate an abstract class
//
//        Circle circle = new Circle(5);
//        System.out.println(circle.getArea());
//
//        Rectangle rectangle = new Rectangle(2, 2);
//        System.out.println(rectangle.getArea());

//        Apple apple = new Apple();
//        apple.howToEat();
//        System.out.println(Apple.count);

        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)};

        Arrays.sort(rectangles);

        for (ComparableRectangle rectangle: rectangles) {
            System.out.println(rectangle);
        }
    }


}