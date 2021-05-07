import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> MenuItemsList = new ArrayList<MenuItem>();

    // 添加菜单项
    public void addMenuItem(MenuItem item){
        this.MenuItemsList.add(item);
    }

    public MenuItem getMenuItem(String itemName){
        for(int i=0;i<MenuItemsList.size();i++){
            if(MenuItemsList.get(i).getItemName().equals(itemName)){
                return MenuItemsList.get(i);
            }
        }
        return null;
    }
}
