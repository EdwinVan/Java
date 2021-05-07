public class OpenCommand implements Command {
    private BoardScreen BoardScreen;

    @Override
    public void excute() {
        BoardScreen.open();
    }

    public OpenCommand(BoardScreen boardScreen){
        this.BoardScreen = boardScreen;
    }
}
