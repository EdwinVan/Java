public class JpgReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader factoryMethod(String imageReader) {
        if (imageReader.equals("JpgImage")){
            return new JpgReader();
        }
        return null;
    }
}
