import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hint2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hint2 extends World
{

    /**
     * Constructor for objects of class hint2.
     * 
     */
    public hint2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 650, 1); 
        prepare();
    }

    private void prepare()
    {
        mulai mulai = new mulai();
        addObject(mulai,760,535);
        mulai.setLevel(2);
    }
}
