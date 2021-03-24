/*
 * 工厂模式创建图形类
 * date: 2021-3-20
 * FYJ
 */

public class FactoryPattern {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        shape1.erase();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        shape2.erase();

        Shape shape3 = shapeFactory.getShape("Triangle");
        shape3.draw();
        shape3.erase();

        Shape shape4 = shapeFactory.getShape("Love");
        shape4.draw();
        shape4.erase();
    }
}
