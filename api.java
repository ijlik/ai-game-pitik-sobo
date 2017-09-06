import greenfoot.*;
import java.util.List;


public class api extends Actor
{
    /**
     * Act - do whatever the api wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List p = getObjectsInRange(50, ayam.class);
        if(p.size()>0)
        {
            World myWorld= getWorld();
            GamePlay2 sind = (GamePlay2)myWorld;
            staminaActor stm = sind.getstamina();
            stm.addstamina();
        }
    }    
}
