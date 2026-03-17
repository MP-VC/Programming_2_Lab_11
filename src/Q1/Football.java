package Q1;

class Football extends Ball{
    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("foooo");
    }

    @Override
    public void bounce() {
        System.out.println("fighter");
    }
}
