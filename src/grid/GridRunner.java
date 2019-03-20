package grid;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner {

    public static void main(String args[]) throws IOException {
        
        String[] arr = {"1","3","5","a","b","c"};
        Grid grid = new Grid(2, 1, arr);
        
        System.out.println(grid.toString());
        System.out.println("\n");
        System.out.println(grid.findMax(arr) + " occurs the most");
        
        
    }
}
