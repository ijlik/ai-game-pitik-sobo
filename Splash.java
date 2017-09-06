import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Splash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splash extends World
{

    /**
     * Constructor for objects of class Splash.
     * 
     */
    public Splash()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 650, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        play play = new play();
        addObject(play,456,382);
        info info = new info();
        addObject(info,223,470);
        info.setLocation(221,464);
        play.setLocation(463,383);
        info.setLocation(799,571);
        info.setLocation(813,559);
        info.setLocation(816,555);
    }
}
