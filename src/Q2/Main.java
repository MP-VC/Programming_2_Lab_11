package Q2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("professional feline");
        Spider s = new Spider();
        Fish f = new Fish("dastardly aquatic demon");

        c.walk();
        s.walk();
        f.walk();

        c.play();
        f.play();

        c.eat();
        s.eat();
        f.eat();

        System.out.println(c.getName());
        System.out.println(f.getName());
    }
}