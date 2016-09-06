package day9_0906.test.printer;

/**
 * Created by º«²© on 2016/9/6.
 */
public class TestPrinter {
    public static void main(String[] args) {
        Printer printer =new Printer();
        printer.test(new CaiPrinter());
        printer.test(new HeiBaiPrinter());
    }
}
