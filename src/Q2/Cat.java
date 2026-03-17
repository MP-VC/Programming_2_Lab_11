package Q2;

public class Cat extends Animal implements Pet{
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }
    public Cat() {
        super(4);
        this.name = "";
    }

    @Override
    public void eat() {
        System.out.println("meow meow meow");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Tis an enjoyable moment. .  .");
    }
}
