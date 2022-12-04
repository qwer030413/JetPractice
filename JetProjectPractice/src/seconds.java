import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener; 
//player
public class seconds extends JPanel implements ActionListener, KeyListener{
    double x1 = 0;
    double y1 = 0;
    int a = 0;
    double velX = 5;
    double velY = 5;
    double Deg1 = 0;
    double DegVel = 3;
    Image image1, bullet;
    Timer timer;
    JLabel label; 
    seconds()
    {
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(Color.BLACK);  
        image1 = new ImageIcon("plane.jpg").getImage();
        // bullet = new ImageIcon("plane2.jpg").getImage();
        timer = new Timer(1, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        // setLayout(new GridLayout(0,1));

    }
    
  

    public void paint(Graphics g) 
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        goingTheSameWay();
        g2D.rotate(Math.toRadians(Deg1),(image1.getWidth(label) / 2) + x1 ,(image1.getHeight(label) / 2) +y1);
        g2D.drawImage(image1,(int)x1,(int)y1,null); 


    }



    @Override
    public void actionPerformed(ActionEvent e)  
    {   
        
        
        repaint();
       

        
    }

    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        

        if(key == KeyEvent.VK_RIGHT)
        {
            Deg1 = Deg1 + DegVel;
           

        }
        if(key == KeyEvent.VK_LEFT)
        {
            Deg1 = Deg1 - DegVel;
        }
        


   
        

        
    }

    public Boolean getImage()
    {
        if(image1 == null)
        {
            return false;
        }
        else{
            return true;
        }

    }
    public void goingTheSameWay()
    {
        x1 += velX * Math.cos(Math.toRadians(Deg1));
        y1 += velY * Math.sin(Math.toRadians(Deg1));

        
    }

    public void keyReleased(KeyEvent e)
    {
        

    }



    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    // public double GetX()
    // {
    //     return x1;
    // }
    // public double GetY()
    // {
    //     return y1;
    // }
    // public double getDeg()
    // {
    //     return Deg1;
    // } 



  

    
    







    
}
