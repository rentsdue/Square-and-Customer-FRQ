public class Square {

    private boolean isBlack;
    private int num;

    public Square(boolean isBlack, int num) {
        this.isBlack = isBlack;
        this.num = num;
    }

    public boolean isBlack() {
        return this.isBlack;
    }

    public void setBlack(boolean isBlack) {
        this.isBlack = isBlack;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}