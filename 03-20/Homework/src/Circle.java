// 圆形
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    public void erase() {
        System.out.println("Erase a circle");
    }
}
