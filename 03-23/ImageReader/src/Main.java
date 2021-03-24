// 工厂方法模式

public class Main {
    public static void main(String[] args) {
        GifReaderFactory g = new GifReaderFactory();
        JpgReaderFactory j = new JpgReaderFactory();

        ImageReader img1 = g.factoryMethod("GifImage");
        img1.imageReader();

        ImageReader img2 = j.factoryMethod("JpgImage");
        img2.imageReader();
    }
}
