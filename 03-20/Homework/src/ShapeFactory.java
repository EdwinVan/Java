// 工厂
public class ShapeFactory{
    public Shape getShape(String shape) throws Exception {
        if (shape.equals("Circle")){
            return new Circle();
        } else if (shape.equals("Rectangle")){
            return new Rectangle();
        } else if (shape.equals("Triangle")){
            return new Triangle();
        } else {
            throw new Exception("不支持此图形的相关操作");
        }
    }
}
