public class Memory {

    public boolean check(boolean c){
        if (c){
            System.out.println("内存开始自检，未发现错误");
            return true;
        }
        else {
            System.out.println("内存存在故障");
            return false;
        }
    }
}
