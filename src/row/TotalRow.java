package row;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
        List<Integer> sums = new ArrayList<>();
        for(int[] arr : m){
            int sum = 0;
            for(int i : arr){
                sum += i;
            }
            sums.add(sum);
        }
        return sums;
    }
}
