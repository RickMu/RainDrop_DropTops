/**
 * Created by 高静 on 2017/3/15.
 */
public class Simulation {

    public static void main(String[] args){

        String[][] bd=Utility.readInputFile("C:\\Users\\Rick\\IdeaProjects\\RainDrop-Droptops\\src\\inputs.txt");

        Board board = new Board(bd);
        System.out.println(board.getDimensions());
        System.out.println(board.getCell(0,0));

        Game g = new Game(board);
        System.out.println(g.checkMovesForH());
        System.out.println(g.checkMovesForV());

        board.printBoard();
    }
}
