public class Grade {
    String name;
    int gradeOfSubject1, gradeOfSubject2, gradeOfSubject3;

    Grade(String _name, int s1, int s2, int s3) {
        name = _name;
        gradeOfSubject1 = s1;
        gradeOfSubject2 = s2;
        gradeOfSubject3 = s3;
    }

    Grade(int s1, int s2, int s3) {
        gradeOfSubject1 = s1;
        gradeOfSubject2 = s2;
        gradeOfSubject3 = s3;
    }

    public int getGrade() {
        return (gradeOfSubject1 + gradeOfSubject2 + gradeOfSubject3) / 3;
    }

}
