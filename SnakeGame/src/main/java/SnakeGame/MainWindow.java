package SnakeGame;
import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(340, 365);
        setLocation(500,200);

        add(new GameField());
        setVisible(true);
    }
    
    public static void main(String[] args){
        MainWindow mw = new MainWindow();
    }
}




































