package net.nanquanyuhao;

/**
 * 闭包的关键在于内部函数可以访问外部函数的变量和作用域，即使外部函数已经执行完毕。
 * 总结起来，闭包是一个函数和其相关的引用环境的组合，它允许函数访问并操作其定义时所处的词法作用域之外的变量。通过闭包，我们可以实现更加灵活和强大的函数功能。
 *
 * 1. 闭包是一个函数，它可以被调用和执行。
 * 2. 闭包能够访问其被定义时所处的词法作用域中的变量。
 * 3. 环境引用：闭包维持对外部变量的引用，使得这些变量在函数执行完毕后仍然存在。
 */
public class ClosureTest2 {

    private int x = 1;

    public void printClosure() {
        int y = 2;
        new Runnable() {
            @Override
            public void run() {
                System.out.println(x + y);
            }
        }.run();
    }

    public static void main(String[] args) {
        ClosureTest2 ce = new ClosureTest2();
        ce.printClosure(); // 输出 3
    }
}
