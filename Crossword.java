public class Crossword {
    
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {
        puzzle = new Square [blackSquares.length][blackSquares[0].length];
        int counter = 1;
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle.length; j++) {
                if (blackSquares[i][j]) {
                    puzzle[i][j] = new Square (true, 0);
                } else {
                    if (toBeLabeled(i, j, blackSquares)) {
                        puzzle[i][j] = new Square (false, counter);
                        counter++;
                    } else {
                        puzzle[i][j] = new Square (false, 0);
                    }
                }
            }
        }
    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        return (!(blackSquares[r][c]) && ((r == 0) || (c == 0)) || (blackSquares[r - 1][c]) || (blackSquares[r][c - 1]));
    }

    
}
