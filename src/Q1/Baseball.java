package Q1;

public class Baseball extends Ball{
    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("goo");
    }

    @Override
    public void bounce() {
        System.out.println("gaaa");
    }
}
