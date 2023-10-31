package net.nanquanyuhao;

public class ClosureTest {

    private int x = 1;

    public  void printClosure() {
        int y = 2;

        // Lambda 表达式中，可以访问x和y两个变量，即使它们都是在 Lambda 表达式定义之外的。
        // Lambda 表达式形成了一个闭包，它可以捕获并维持对外部变量的引用
        Runnable r = () -> System.out.println(x + y);
        r.run();
    }

    public static void main(String[] args) {
        ClosureTest ce = new ClosureTest();
        ce.printClosure(); // 输出 3
    }
}
