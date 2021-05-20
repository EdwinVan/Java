import java.util.ArrayList;

class Cat implements Subject    //具体主题
{
    private ArrayList<Observer> list;

    public Cat() {
        list = new ArrayList<Observer>();
    }

    public void addObserver(Observer obs) {
        list.add(obs);
    }

    public void cry() {
        System.out.println("猫大叫一声！");
        for (Object obj : list) {
            ((Observer) obj).response();
        }
    }
}

