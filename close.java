import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class close here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class close extends Actor
{
    /**
     * Act - do whatever the close wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseMoved(this)){
            this.setImage("images/close-over.png");
        } else {
            this.setImage("images/close.png");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Splash());
        }
    }    
}
