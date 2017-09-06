import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends World
{

    int n = 1;
    team team = new team();
    public Credit()
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
        homeBtn homebtn = new homeBtn();
        addObject(homebtn,475,576);
        next next = new next();
        addObject(next,821,573);
        back back = new back();
        addObject(back,103,568);
        addObject(team,483,304);
        team.setImage("images/team"+n+".png");
    }
    public void gantiKanan(){
        
        n++;
        if(n==6){
            n=1;
        }
        team.setImage("images/team"+n+".png");
    }
    public void gantiKiri(){

        n--;
        if(n==0){
            n=5;
        }
        team.setImage("images/team"+n+".png");
    }
}
