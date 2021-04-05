import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    // 静态私有成员变量
    private static LoadBalancer instance = new LoadBalancer();

    private List serverList = null;
    // 私有构造函数
    private LoadBalancer() {
        serverList = new ArrayList();
    }
    // 公有的静态方法
    public static LoadBalancer getInstance() {
        return instance;
    }
    // 增加服务器
    public void addServer (String server){
        serverList.add(server);
    }
    // 使用服务器
    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
