import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends World
{
    easy easy = new easy();
    medium medium = new medium();
    hard hard = new hard();
    int level=0;
    public level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 650, 1); 
        prepare();
    }

    private void prepare()
    {
        
        addObject(easy,193,332);
        
        addObject(medium,456,331);
        
        addObject(hard,724,331);
    }
}
