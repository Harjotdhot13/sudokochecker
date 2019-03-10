
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;


public class CheckSudoku {
	Integer[][] SudokuArray=new Integer [9][9];
    private HashSet< Integer > rowSet = null;
    private HashSet< Integer > colSet = null;
    private HashSet< Integer > boxSet = null;
    private ArrayList< HashSet < Integer > > arrList = new ArrayList< HashSet < Integer > >();
      
    public boolean isAllowed(int row, int col) {
  
        rowSet = arrList.get(row);
        colSet = arrList.get(9 + col);
  
        int box = 3 * (row / 3) + (col / 3);
        boxSet = arrList.get(18 + box);
  
        return (rowSet.add(SudokuArray[row][col]) && colSet.add(SudokuArray[row][col]) && boxSet.add(SudokuArray[row][col]));
    }

public Boolean isSudokuSolution(File file)
   {
	SudokuArray= ReadFile.readFileAsArray(file);
	for (int i = 0; i < 27; i++)
    {
        arrList.add(new HashSet< Integer >());
    }

    for (int i = 0; i < 9; i++)
    {
        for (int j = 0; j < 9; j++)
        {
            if(!isAllowed(i, j))
            {
                return false;
            }
        }
    }
    return true;
   }
 }