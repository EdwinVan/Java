class Master implements Observer     //具体观察者
{
    private String name;

    public Master(String name, Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    public void response() {

        System.out.println(this.name + "从梦中惊醒！");
    }
}

