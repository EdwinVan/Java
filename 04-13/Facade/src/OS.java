public class OS {
    public boolean load(boolean c){
        if (c){
            System.out.println("开始载入操作系统，载入操作系统成功");
            return true;
        }
        else {
            System.out.println("开始载入操作系统，载入操作系统失败");
            return false;
        }
    }
}
