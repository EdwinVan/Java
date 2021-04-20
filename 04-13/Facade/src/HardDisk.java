public class HardDisk {
    public boolean read(boolean b){
        if (b){
            System.out.println("硬盘读取内容成功");
            return true;
        }
        else {
            System.out.println("硬盘读取内容失败");
            return false;
        }
    }
}
