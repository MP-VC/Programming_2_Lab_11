package Q1;

abstract class Ball implements Tossable{
    String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    public void bounce() {
        System.out.println("gee");
    }
}
