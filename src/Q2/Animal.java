package Q2;

public abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    public void walk() {
        System.out.println("I have this many legs : " + legs);
    }

    public abstract void eat();
}
