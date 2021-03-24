public class GifReaderFactory implements ImageReaderFactory {
    @Override
    public ImageReader factoryMethod(String imageReader) {
        if (imageReader.equals("GifImage")){
            return new GifReader();
        }
        return null;
    }
}