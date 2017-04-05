/** Ibrahim Ahmed #757050 | Rick Mu #758667 */
public class Game {
    public static String PLAYER_H= "H", PLAYER_V ="V";
    private Board board;
    Player[] players;

    
    Game(Board board){
        players = new Player[2];
        players[0] = new Player(PLAYER_H);
        players[1] = new Player (PLAYER_V);
        this.board= board;
    }

    /** Returns the type of player according to the symbol given. */
    public Player getPlayer(String symbol) {
        if (players[0].getSymbol().equals(symbol)){
            return players[0];
        }else{
            return players[1];
        }
    }
    
    
    /** Checks moves for H. */
    public int checkMovesForH(){
        return checkPossibleMoves(players[0]);
    }
    
    
    /** Checks moves for V. */
    public int checkMovesForV(){
        return checkPossibleMoves(players[1]);
    }

    
    /** Checks possible moves for a player and returns an integer. */
    public int checkPossibleMoves(Player player){
        int totalMoves =0;
        Board tmpBoard= this.board;
        
        // Rotates the V player board before checking total moves.
        if(player.getSymbol()== PLAYER_V){
            tmpBoard = Board.rotateBoard(this.board);
        }
        
        // Now check total moves.
        for( int i=0 ; i<tmpBoard.getDimensions(); i++){
            for(int j=0 ; j<tmpBoard.getDimensions();j++){
                if(tmpBoard.getCell(i,j).equals(player.getSymbol())){
                    totalMoves+= checkMoves(tmpBoard, i ,j);
                }
            }
        }
        return totalMoves;
    }
    
    
    /** Checks the total number of moves for a cell in a board. 
     *  All boards are rotated if necessary so only one three directions will be checked. */
    public int checkMoves(Board board, int i, int j){
        int UP=-1, DOWN=1,RIGHT=1;
        int numMoves=0;
        
        if( board.pieceMoveable(i+UP, j)) numMoves+=1;
        if( board.pieceMoveable(i+DOWN,j)) numMoves+=1;
        if( board.pieceMoveable(i, j+RIGHT)) numMoves+=1;
        
        return numMoves;
    }
}
