package Q2;

public class Fish extends Animal implements Pet{
    String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("glub glub glub");
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
        System.out.println("Fihh time");
    }

    @Override
    public void walk() {  System.out.println("I have no legs and I must walk");  }
}
