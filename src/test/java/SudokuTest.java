
import org.junit.Test;
import static org.junit.Assert.*;

public class SudokuTest {



    @Test
    public void testSudoku() {
          int[][] solution = {
                {9,3,4,1,7,2,6,8,5},
                {7,6,5,8,9,3,2,4,1},
                {8,1,2,6,4,5,3,9,7},
                {4,2,9,5,8,1,7,6,3},
                {6,5,8,7,3,9,1,2,4},
                {1,7,3,4,2,6,8,5,9},
                {2,9,7,3,5,8,4,1,6},
                {5,4,6,2,1,7,9,3,8},
                {3,8,1,9,6,4,5,7,2},
        };

        Sudoku sudoku = new Sudoku();
        sudoku.fillBoard();

        int [][] boardCopy = sudoku.getBoard();


        for (int i = 0; i < 9; i++)
                for (int j = 0; j < 9; j++)
                {
                        assertEquals(solution[i][j],boardCopy[i][j] );

                }

        }

    @Test
public void TestDigits()
    {

        Sudoku sudoku = new Sudoku();
        sudoku.fillBoard();
        String Array1 = sudoku.getOutputArray();
        sudoku.fillBoard();
        String Array2 = sudoku.getOutputArray();
        assertNotSame(Array1, Array2);




    }











}


