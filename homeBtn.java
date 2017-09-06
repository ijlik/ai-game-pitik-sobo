import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class homeBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class homeBtn extends Actor
{
    /**
     * Act - do whatever the homeBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseMoved(this)){
            setImage("images/homeBtn-over.png");
        } else {
            setImage("images/homeBtn.png");
        }
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Splash());
        }
    }    
}
