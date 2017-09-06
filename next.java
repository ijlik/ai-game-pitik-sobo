import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class next extends Actor
{
    /**
     * Act - do whatever the next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World myWorld= getWorld();
        Credit sand = (Credit)myWorld;
        if(Greenfoot.mouseMoved(this)){
            this.setImage("images/next-over.png");
        } else {
            this.setImage("images/next.png");
        }
        if(Greenfoot.mouseClicked(this)){
            sand.gantiKanan();
        }
    }    
}
