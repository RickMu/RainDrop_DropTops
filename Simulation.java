/**
 * Created by 高静 on 2017/3/15.
 */
public class Simulation {

    public static void main(String[] args){

        String[][] board=Utility.readInputFile("C:\\Users\\Rick\\IdeaProjects\\RainDrop-Droptops\\src\\inputs");

        for(String[] row: board) {
            for (String cell : row)
                System.out.print((cell));
            System.out.println();
        }

    }
}
