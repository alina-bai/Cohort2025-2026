package Week4.Chess;

public class Pawn extends Piece {

    public Pawn(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canMove(int newX, int newY) {
        // Пешка двигается только прямо на 1 клетку вверх
        return (x == newX) && (newY - y == 1);
    }

    @Override
    public boolean canBeat(int targetX, int targetY) {
        // Пешка бьет по диагонали вверх
        return (Math.abs(targetX - x) == 1) && (targetY - y == 1);
    }
}
