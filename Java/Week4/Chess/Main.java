package Week4.Chess;

public class Main {
    public static void main(String[] args) {
        Piece knight = new Knight(0, 0);
        Piece pawn = new Pawn(1, 1);

        // Конь делает ход
        System.out.println("Knight move to (2,1): " + knight.move(2, 1)); // true
        System.out.println("Knight move to (3,3): " + knight.move(3, 3)); // false

        // Пешка делает ход
        System.out.println("Pawn move to (1,2): " + pawn.move(1, 2)); // true
        System.out.println("Pawn move to (1,4): " + pawn.move(1, 4)); // false

        // Пешка пытается побить по диагонали
        System.out.println("Pawn can beat (2,3): " + pawn.canBeat(2, 3)); // true
        System.out.println("Pawn beat to (2,3): " + pawn.beat(2, 3)); // true
    }
}
