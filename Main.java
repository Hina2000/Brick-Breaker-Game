import javax.swing.JFrame;

public class Main{
 public static void main(String args[]) {
    Gameplay gameplay=new Gameplay();
    JFrame obj=new JFrame();
    obj.setBounds(10,10,700,600);
    obj.setTitle("BreakOut Ball");
    obj.setResizable(false);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    obj.add(gameplay);
        
    }

}