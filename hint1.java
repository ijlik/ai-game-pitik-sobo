import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hint1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hint1 extends World
{

    /**
     * Constructor for objects of class hint1.
     * 
     */
    public hint1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 650, 1); 
        prepare();
    }

    private void prepare()
    {
        mulai mulai = new mulai();
        addObject(mulai,760,535);
        mulai.setLevel(1);
    }
}
