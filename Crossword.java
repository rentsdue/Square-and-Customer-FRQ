public class Crossword {
    
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares) {

    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        if (blackSquares[r][c]) {
            return true;
        }
        return false;
    }
}
