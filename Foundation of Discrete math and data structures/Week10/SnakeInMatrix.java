package Week10;
import java.util.List;

public class SnakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0, y = 0;
        for (String cmd : commands) {
            switch (cmd.charAt(0)) {
                case 'U': x--; break;
                case 'D': x++; break;
                case 'L': y--; break;
                case 'R': y++; break;
            }
        }
        return x * n + y;
    }
}


