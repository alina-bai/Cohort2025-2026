package Week4.Chess;

public class Knight extends Piece {

    public Knight(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(int newX, int newY) {
        int dx = Math.abs(newX - x);
        int dy = Math.abs(newY - y);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }

    @Override
    public boolean canBeat(int targetX, int targetY) {
        // Для коня "бить" — это как обычный ход
        return canMove(targetX, targetY);
    }
}
