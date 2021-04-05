public class Client {
    public static void main(String[] args) {
        LoadBalancer l1,l2,l3,l4;
        l1 = LoadBalancer.getInstance();
        l2 = LoadBalancer.getInstance();
        l3 = LoadBalancer.getInstance();
        l4 = LoadBalancer.getInstance();

        l1.addServer("server1");
        l2.addServer("server2");
        l3.addServer("server3");
        l4.addServer("server4");

        for (int i=0; i<10; i++){
            String s = l1.getServer();
            System.out.println("分发请求至服务器A: " + s);
        }
    }
}
