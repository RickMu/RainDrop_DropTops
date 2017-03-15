import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by 高静 on 2017/3/15.
 */
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

        }catch (FileNotFoundException e){
            System.out.println( e.getMessage());
        }

        return input;
    }

}
