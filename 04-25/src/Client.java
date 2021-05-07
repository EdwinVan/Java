public class Client {
    public static void main(String[] args){
        Command createCommand,openCommand,editCommand;
        BoardScreen boardScreen = new BoardScreen();

        createCommand = new CreateCommand(boardScreen);
        openCommand = new OpenCommand(boardScreen);
        editCommand = new EditCommand(boardScreen);

        Menu menu = new Menu();
        MenuItem menuItem1,menuItem2,menuItem3;
        menuItem1 = new MenuItem("创建",createCommand);
        menuItem2 = new MenuItem("打开",openCommand);
        menuItem3 = new MenuItem("编辑",editCommand);

        menu.addMenuItem(menuItem1);
        menu.addMenuItem(menuItem2);
        menu.addMenuItem(menuItem3);

        menu.getMenuItem("创建").click();
        menu.getMenuItem("打开").click();
        menu.getMenuItem("编辑").click();
    }
}
