package day9_0907.test.teacher;

/**
 * Created by º«²© on 2016/9/7.
 */
public class School {
    public static void main(String[] args) {
        School school = new School();
        school.show(new JavaTeacher("ÀÏ´ó"));
    }

    public void show(Teacher x) {
        x.jieShao();
    }
}
