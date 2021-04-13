public class MainFrame {
    private CPU cpu;
    private HardDisk harddisk;
    private Memory memory;
    private OS os;

    public MainFrame(){
        cpu = new CPU();
        harddisk = new HardDisk();
        memory = new Memory();
        os = new OS();
    }
    public void on(){
        boolean a = memory.check(true);
        boolean b = cpu.cpu(a);
        boolean c = harddisk.read(b);
        boolean d = os.load(c);
        if (d){
            System.out.println("电脑启动成功");
        }
        else {
            System.out.println("电脑启动失败");
        }
    }
}
