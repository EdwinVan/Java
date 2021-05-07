public class MenuItem {
    public Command command;
    String itemName;

    public MenuItem(String itemName,Command command) {
        this.command = command;
        this.itemName = itemName;
    }
    public Command getCommand() {
        return command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void click(){
        System.out.println("MenuItem中的"+this.itemName+"被执行");
        this.command.excute();
    }
}
