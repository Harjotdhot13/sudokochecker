import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
	
	public static Integer[][] readFileAsArray(File inputFile)
    {
		int rows = 9;
		int columns = 9;
		Integer [][] sudokuArray = new Integer[rows][columns];
		ArrayList<String> strArray=new ArrayList();
		Scanner sc = null;
		try {
			sc = new Scanner(new BufferedReader(new FileReader(inputFile)));
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

          while(sc.hasNextLine()) {
        	  String row = sc.nextLine();
        	  if (!row.isEmpty()) {
        		 strArray.add(row);
        	  }
          }
        	 for (int i=0; i<sudokuArray.length; i++) 
        	 {
        	   String[] line = strArray.get(i).split("");
        	   for (int j=0; j<sudokuArray.length; j++) {
        	   	try {
        	   		sudokuArray[i][j] = Integer.parseInt(line[j]);
        	   	}
        	   	catch(NumberFormatException e) {
        	   		e.printStackTrace();
        	   	}
        	   }
             }
          //System.out.println(Arrays.deepToString(sudokuArray));
          return sudokuArray;
    }
}
