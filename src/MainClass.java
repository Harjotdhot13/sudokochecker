import java.io.File;

public class MainClass {
  public static void main(String args[])
  {
    CheckSudoku cs=new CheckSudoku();
    File file=new File("data/input_sudoku.txt");
    System.out.println(cs.isSudokuSolution(file));

  }
}
