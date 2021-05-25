//具体策略类
public class AirStrategy implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("飞机旅行");
    }
}

