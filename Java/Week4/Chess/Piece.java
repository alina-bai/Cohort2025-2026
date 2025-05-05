package Week4.Chess;

public abstract class Piece {
    protected int x;
    protected int y;

    public Piece (int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract boolean canMove(int newX, int newY);

    public boolean move(int newX, int newY) {
        if (canMove(newX, newY)) {
            this.x = newX;
            this.y = newY;
            return true;
        } else {
            System.out.println("Invalid move!");
            return false;
        }
    }

    public abstract boolean canBeat(int targetX, int targetY);

    public boolean beat(int targetX, int targetY) {
        if (canBeat(targetX, targetY)) {
            this.x = targetX;
            this.y = targetY;
            return true;
        } else {
            System.out.println("Can't beat there!");
            return false;
        }
    }

}
