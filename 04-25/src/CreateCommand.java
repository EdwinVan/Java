public class CreateCommand implements Command {
    private BoardScreen BoardScreen;

    @Override
    public void excute() {
        BoardScreen.creat();
    }

    public CreateCommand(BoardScreen boardscreen){
        this.BoardScreen = boardscreen;
    }
}
