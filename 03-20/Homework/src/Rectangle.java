// 长方形
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }

    @Override
    public void erase() {
        System.out.println("Erase a rectangle");
    }
}
