/** Ibrahim Ahmed #757050 | Rick Mu #758667*/
public class Simulation {

    public static void main(String[] args){

        String[][] bd=Utility.readInputFile("/Users/Ibrahim/Eclipse/AI/src/inputs.txt");

        Board board = new Board(bd);
        //System.out.println(board.getDimensions());
        //System.out.println(board.getCell(0,0));

        Game g = new Game(board);

        System.out.println(g.checkMovesForH());
        System.out.println(g.checkMovesForV());

        //board.printBoard();
    }
}
