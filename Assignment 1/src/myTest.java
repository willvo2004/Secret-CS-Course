public class myTest {
    public static void main(String[] args) {
        int[][] g1 = new int[][] {
             //  0  1  2  3  4  5  6  7
             //  *        *        *                   [0,0] [0,3] [0,6]  [3,0] [3,3] [3,6]  [6,0] [6,3] [6,6]
                {1, 2, 3, 4, 5, 6, 7, 8, 9}, // 0 *
                {4, 5, 6, 7, 8, 9, 1, 2, 3}, // 1
                {7, 8, 9, 1, 2, 3, 4, 5, 6}, // 2
                {2, 3, 4, 5, 6, 7, 8, 9, 1}, // 3 *
                {5, 6, 7, 8, 9, 1, 2, 3, 4}, // 4
                {8, 9, 1, 2, 3, 4, 5, 6, 7}, // 5
                {3, 4, 5, 6, 7, 8, 9, 1, 2}, // 6 *
                {6, 7, 8, 9, 1, 2, 3, 4, 5}, // 7
                {9, 1, 2, 3, 4, 5, 6, 7, 8}  // 8
        };
        int[][] g2 = new int[][] {
                {2, 3, 1, 4},
                {4, 1, 3, 2},
                {3, 4, 2, 1},
                {1, 2, 4, 3}
        };

        int[][] g3 = new int[][] {
                {5, 6, 3, 2, 1, 4},
                {4, 1, 2, 3, 6, 5},
                {6, 3, 4, 5, 2, 1},
                {2, 5, 1, 6, 4, 3},
                {1, 2, 5, 4, 3, 6},
                {3, 4, 6, 1, 5, 2}
        };

        int[][] g4 = new int[][] {
                {5, 4, 2, 7, 1, 3, 8, 6, 9},
                {3, 6, 1, 9, 8, 2, 7, 5, 4},
                {7, 9, 8, 4, 6, 5, 1, 3, 2},
                {6, 5, 4, 3, 2, 1, 9, 8, 7},
                {1, 3, 7, 6, 9, 8, 4, 2, 5},
                {8, 2, 9, 5, 4, 7, 6, 1, 3},
                {4, 7, 5, 1, 3, 6, 2, 9, 8},
                {2, 1, 3, 8, 7, 9, 5, 4, 6},
                {9, 8, 6, 2, 5, 4, 3, 7, 1}
        };

        int[][] g5 = new int[][] {
                {5, 4, 2, 7, 1, 3, 8, 6, 9},
                {3, 6, 1, 9, 8, 2, 7, 5, 4},
                {7, 9, 3, 4, 6, 5, 1, 3, 2},
                {6, 5, 4, 3, 2, 1, 9, 8, 7},
                {1, 3, 7, 6, 9, 8, 4, 2, 5},
                {8, 2, 9, 5, 4, 7, 6, 1, 3},
                {4, 7, 5, 1, 3, 6, 2, 0, 8},
                {2, 1, 3, 8, 7, 9, 5, 4, 6},
                {9, 8, 6, 2, 5, 4, 3, 7, 1}
        };

        int[][] g6 = new int[][] {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {2, 3, 4, 7, 6, 7, 8, 9, 1},
                {5, 6, 7, 8, 2, 1, 2, 3, 4},
                {8, 9, 1, 2, 3, 6, 5, 6, 7},
                {3, 4, 5, 6, 7, 8, 3, 1, 2},
                {6, 7, 8, 9, 1, 2, 3, 4, 5},
                {9, 1, 2, 3, 4, 5, 6, 7, 8}
        };
        Sudoku s1 = new Sudoku(g1);
        Sudoku s3 = new Sudoku(g3);
        Sudoku s4 = new Sudoku(g4);
        Sudoku s5 = new Sudoku(g5);
        Sudoku s6 = new Sudoku(g6);

        UniqueDiagonalSudoku u1 = new UniqueDiagonalSudoku(g1); // should be false
        UniqueDiagonalSudoku u2 = new UniqueDiagonalSudoku(g2); // should be false
        UniqueDiagonalSudoku u6 = new UniqueDiagonalSudoku(g6); // should be false
        UniqueDiagonalSudoku u4 = new UniqueDiagonalSudoku(g4);

       // System.out.println(s1.isValidRow(0) && s1.isValidRow(8));
       // System.out.println(s3.isValidRow(4) && s3.isValidRow(5));

        System.out.println(u6.isValidSolution());
        System.out.println(s6.isValidSolution());


    }
}
