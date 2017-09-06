import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class air here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class air extends Actor
{
    /**
     * Act - do whatever the air wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List p = getObjectsInRange(100, ayam.class);
        if(p.size()>0)
        {
            World myWorld= getWorld();
            GamePlay3 sand = (GamePlay3)myWorld;
            staminaActor ini = sand.getstamina();
            ini.addstamina();
        }
    }    
}
