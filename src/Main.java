
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

        This thisObj = new This();
        System.out.println(thisObj.getAge());
        System.out.println(thisObj.getPoint());
    }


}