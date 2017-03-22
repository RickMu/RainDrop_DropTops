import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Utility {

    public static String[][] readInputFile (String path ){
        String [][] input= null;
        try {
            Scanner sc = new Scanner(new File(path));

            int dim= Integer.parseInt(sc.nextLine());
            input = new String [dim][dim];


            for (int i = 0; i< dim;i++){
                input[i]  = sc.nextLine().split("\\s+");
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println( e.getMessage());
        }

        return input;
    }

}
