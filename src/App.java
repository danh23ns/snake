import javax.swing.*;

public class App {
    public static void  main(String[] args){
        int boardWidth = 600;
        int boardHeigth = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeigth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Snake snake = new Snake(boardWidth, boardHeigth);
        frame.add(snake);
        frame.pack();
        snake.requestFocus();
    }

}
