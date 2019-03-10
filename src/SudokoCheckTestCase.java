import java.io.File;
import static junit.framework.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class SudokoCheckTestCase {
    
	File inputFile=new File("data/IncorrectInput.txt");
	File CorrectFile=new File("data/CorrectInput.txt");
    CheckSudoku cs=new CheckSudoku();
	@Test
	void testIncorrectSudokuSolution() {
		assertEquals((boolean)false,(boolean)cs.isSudokuSolution(inputFile));
	}
	@Test
	void testCorrectSudokuSolution() {
		assertEquals(true,(boolean)cs.isSudokuSolution(CorrectFile));
	}

}

