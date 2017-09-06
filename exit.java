import greenfoot.*;  

public class exit extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseMoved(this)){
            setImage("images/exit-over.png");
        } else {
            setImage("images/exit.png");
        }
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.stop();
        }
    }    
}
