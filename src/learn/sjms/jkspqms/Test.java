package learn.sjms.jkspqms;

public class Test {
/*
 * 接口适配器模式（缺省适配模式）
接口适配器模式（缺省适配模式）的思想是，为一个接口提供缺省实现，这样子类可以从这个缺省实现进行扩展，而不必从原有接口进行扩展。

这里提供一个例子。java.awt.KeyListener是一个键盘监听器接口，我们把这个接口的实现类对象注册进容器后，这个容器就会对键盘行为进行监听，像这样：

public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("hey geek!");
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

可以看到其实我们只使用到其中一个方法，但必须要把接口中所有方法都实现一遍，如果接口里方法非常多，那岂不是非常麻烦。于是我们引入一个默认适配器，让适配器把接口里的方法都实现一遍，使用时继承这个适配器，把需要的方法实现一遍就好了。JAVA里也为java.awt.KeyListener提供了这样一个适配器：java.awt.KeyAdapter。我们使用这个适配器来改改上面的代码：

public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("fxcku!");
            }
        });
    }

 */
}
