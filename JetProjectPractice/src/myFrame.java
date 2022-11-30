import javax.swing.JFrame;




public class myFrame extends JFrame{
    seconds panel;
    
    myFrame()
    {
        panel = new seconds();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
       

        
    }
    
}
