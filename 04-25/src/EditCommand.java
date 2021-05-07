public class EditCommand implements Command {
    private BoardScreen BoardScreen;

    @Override
    public void excute() {
        BoardScreen.edit();
    }

    public EditCommand(BoardScreen boardScreen){
        this.BoardScreen = boardScreen;
    }
}
