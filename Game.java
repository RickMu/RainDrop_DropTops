/**
 * Created by 高静 on 2017/3/15.
 */
public class Game {
    public static final String PLAYER1 = "H", PLAYER2="V";
    private Board board;
    Player[] players;



    Game(Board board){
        players = new Player[2];
        players[0] = new Player(PLAYER1);
        players[1] = new Player (PLAYER2);
        this.board= board;
    }


    










}
