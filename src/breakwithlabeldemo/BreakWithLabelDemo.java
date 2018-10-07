/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakwithlabeldemo;

/**
 *
 * @author Oktawian
 */
public class BreakWithLabelDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] arrayOfInts = {
            {32, 87, 3, 589},
            {12, 1078, 2000, 8},
            {622, 126, 42, 837}
        };
        
        int searchFor = 42;
        
        int i;
        int j = 0;
        boolean foundIt = false;
        
        search:
            for (i = 0; i<arrayOfInts.length; i++){
                for(j = 0; j<arrayOfInts[i].length; j++){
                    if(arrayOfInts[i][j] == searchFor){
                        foundIt = true;
                        break search;
                    }
                }
            }
        
        if(foundIt){
            System.out.println("Found " + searchFor + " at " + i + ", " + j);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
    
}
