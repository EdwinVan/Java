//具体策略类
public class BicycleStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("自行车旅行");
    }
}

