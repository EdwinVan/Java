import java.util.List;

public class ProductIterator implements AbstractIterator{

    private List <Object> products;
    private int cursors1;
    private int cursors2;

    public ProductIterator(ProductList list){
        this.products = list.getObjects();
        cursors1 = 0;
        cursors2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursors1<products.size()){
            cursors1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursors1 == products.size());
    }

    @Override
    public void previous() {
        if (cursors2>-1){
            cursors2--;
        }
    }

    @Override
    public boolean isFirst() {
        return (cursors2==-1);
    }

    @Override
    public Object getNextItem() {
        return products.get(cursors1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursors2);
    }
}
