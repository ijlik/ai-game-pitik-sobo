import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scorpio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scorpio extends Actor
{
    /**
     * Act - do whatever the scorpio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if( isAtEdge())
        {
            turn(15);
        }
        
        if(Greenfoot.getRandomNumber(110)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        move(1);
    }    
}
