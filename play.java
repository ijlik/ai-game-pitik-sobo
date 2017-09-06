import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends Actor
{
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseMoved(this)){
            this.setImage("images/play-hover.png");
        } else {
            this.setImage("images/play.png");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new level());
        }
    }    
}
