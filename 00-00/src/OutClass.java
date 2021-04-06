// 非静态内部类
// FYJ
// 2021-4-6

public class OutClass { // 外部类
    private String outClassName;
    private void display(){
        System.out.println("OutClass Display");
        System.out.println(outClassName);
    }

    private class InnerClass{ // 定义内部类
        private String innerClassName;
        private void display(){
            System.out.println("InnerClass Display");
            System.out.println(innerClassName);
        }
    }

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.display();
        OutClass.InnerClass innerClass = outClass.new InnerClass();
        innerClass.display();
    }
}
