package net.nanquanyuhao;

/**
 * 当我们将一个闭包作为回调函数传递给另一个函数时，我们可以使用闭包来捕获外部函数的变量和状态，从而在回调函数执行时访问和操作这些变量。
 * 这种方式可以使得回调函数更加灵活和可定制，因为它可以访问外部函数的状态和变量，而不仅仅是传递的参数。
 * 总结起来，闭包回调是一种通过将函数作为参数传递给另一个函数，并在特定时刻调用该函数的机制，用于实现异步操作、事件处理等场景。
 * 在 Java 中，可以使用接口、匿名内部类或者 Lambda 表达式等方式来实现闭包回调。
 *
 * 此示例中，匿名内部类 new Callback() 可以捕获并访问外部方法中的局部变量，从而实现了一种类似闭包的行为。
 */
public class CallbackExample {

    public static void main(String[] args) {

        processData("Hello", new Callback() {
            @Override
            public void onComplete(String result) {
                // result 即被访问到的外部环境的局部变量 processedData，所以形成了闭包
                System.out.println("Callback result: " + result);
            }
        });
    }

    public static void processData(String data, Callback callback) {
        // 模拟处理数据的过程
        String processedData = data.toUpperCase();

        // 处理完数据后调用 callback 函数的 onComplete
        // 匿名内部类可以捕获并访问外部方法 processData() 中的局部变量 processedData，从而在回调函数中使用这些变量。
        // 当 processData() 方法处理完数据后，会调用传入的 callback 函数，执行 callback 函数内部的逻辑。这样就实现了将控制权交给回调函数的过程，即回调，也就是闭包了也回调了。
        callback.onComplete(processedData);
    }
}
