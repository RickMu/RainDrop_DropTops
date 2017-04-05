
public class Game {
    public static String PLAYER_H= "H", PLAYER_V ="V";
    private Board board;
    Player[] players;

    public Player getPlayer(String symbol) {
        if (players[0].getSymbol().equals(symbol)){
            return players[0];
        }else{
            return players[1];
        }
    }

    Game(Board board){
        players = new Player[2];
        players[0] = new Player(PLAYER_H);
        players[1] = new Player (PLAYER_V);
        this.board= board;
    }

    public int checkMovesForH(){

        return checkPossibleMoves(players[0]);
    }

    public int checkMovesForV(){

        return checkPossibleMoves(players[1]);
    }



    public int checkPossibleMoves(Player player){
        int totalMoves =0;
        Board tmpBoard= this.board;

        if(player.getSymbol()== PLAYER_V){
            tmpBoard = Board.rotateBoard(this.board);
        }

        for( int i=0 ; i<tmpBoard.getDimensions(); i++){
            for(int j=0 ; j<tmpBoard.getDimensions();j++){
                if(tmpBoard.getCell(i,j).equals( player.getSymbol())){
                    totalMoves+= checkMoves(tmpBoard, i ,j);
                }
            }
        }

        return totalMoves;
    }
    public int checkMoves(Board board, int i, int j){
        int UP=-1, DOWN=1,RIGHT=1;
        int numMoves=0;

        if( board.pieceMoveable(i+UP, j))
            numMoves+=1;
        if( board.pieceMoveable(i+DOWN,j))
            numMoves+=1;
        if( board.pieceMoveable(i, j+RIGHT))
            numMoves+=1;

        return numMoves;
    }
}
