import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class seconds extends JPanel implements ActionListener{
    int x = 0;
    int y = 0;
    int velX = 2;
    int velY = 2;
    Image image;
    Timer timer;
    JLabel label;
    seconds()
    {
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.BLACK);
        image = new ImageIcon("plane.jpg").getImage();
        timer = new Timer(1, this);
        timer.start();

    }
    


    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image,x,y,null);

    }



    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(x >= 500)
        {
            velX = velX * -1;
        }
        x += velX;
        
        repaint();
    }



  

    
    







    
}
