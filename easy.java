import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class easy extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseMoved(this)){
            this.setImage("images/easy-over.png");
        } else {
            this.setImage("images/easy.png");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new hint1());
        }
    }    
}
