package day9_0910.test;

/**
 * Created by º«²© on 2016/9/10.
 */
class Test {
    public static void main(String[]  args) {
        String str = new String("World");
        char []  ch = { 'H', 'e', 'l', 'l', 'o' };
        change(str, ch);
        System.out.println(str + "and");
        System.out.println(ch);
    }
    public static void change(String str, char[] ch) {
       str = "Changed";
        ch[0] = 'C';
    }
}