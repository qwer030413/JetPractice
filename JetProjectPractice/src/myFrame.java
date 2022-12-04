// import java.awt.BorderLayout;
// import java.awt.GridLayout;
// import javax.swing.BorderFactory;
import javax.swing.JFrame;
    
                        
            
                                         
      
public class myFrame extends JFrame{
    seconds panel;
    int a = 1;     
    myFrame()                             
    { 
        panel = new seconds();
        // panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        // panel.setLayout(new GridLayout(0,1));
        // label.setText("deg: " + panel.getDeg());
        
        // panel.add(label, BorderLayout.CENTER); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);      
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
         
             
                    

         
    }
    
}
