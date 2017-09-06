import greenfoot.*;  
import java.util.List;
/**
 * Write a description of class elang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elang extends Actor
{
    private double speed;
    private boolean isAlive;
    private int range;
    private int noLevel;

    public elang()
    {
        speed=2;
        isAlive=true;
    }
    
    private void gerak()
    {
        List p = getObjectsInRange(range, ayam.class);
        int Distx, Disty;
        double angle;
        if(p.size()>0)
        {
            ayam P = (ayam) p.get(0);
            Distx = getX()-P.getX();
            Disty = getY()-P.getY();
            angle = Math.toDegrees(Math.atan2(Disty,Distx))+180;
            setRotation((int)angle);
            
            angle = Math.toRadians( getRotation() );
            int x = (int) Math.round(getX() + Math.cos(angle) * speed);
            int y = (int) Math.round(getY() + Math.sin(angle) * speed);
            setLocation(x, y);
        }
    }
    public void act()
    {
        if(noLevel == 1){
            aktif1();
        } else if(noLevel == 2){
            aktif2();
        } else if(noLevel == 3){
            aktif3();
        }
    }
    
    private boolean ketemu1(Class clss)
    {
        World myWorld = getWorld();
        GamePlay ini = (GamePlay)myWorld;
        ayam x = ini.getayam();
        if(x.getImage().getTransparency() == 255) {
                range = 1000;
                Actor actor = getOneObjectAtOffset(0, 0, clss);
                return actor != null;        
        } else {
                range = 5;
                move(2);
                turn(2);
                return false;
        }
        
    }
    public void aktif1(){
        if(isAlive)
        {
                if(!ketemu1(ayam.class)) {
                    gerak();
                } 
                else {
                    if(isTouching(ayam.class))
                    {
                        isAlive = false;
                        removeTouching(ayam.class);
                        Greenfoot.delay(10);
                        Greenfoot.setWorld(new GameOver());
                    }
                }
            
        }
    }
    
    private boolean ketemu2(Class clss)
    {
        World myWorld = getWorld();
        GamePlay2 in = (GamePlay2)myWorld;
        ayam y = in.getayam();
        if(y.getImage().getTransparency() == 255) {
                range = 1000;
                Actor actor = getOneObjectAtOffset(0, 0, clss);
                return actor != null;        
        } else {
                range = 5;
                move(2);
                turn(2);
                return false;
        }
        
    }
    public void aktif2(){
        if(isAlive)
        {
                if(!ketemu2(ayam.class)) {
                    gerak();
                } 
                else {
                    if(isTouching(ayam.class))
                    {
                        isAlive = false;
                        removeTouching(ayam.class);
                        Greenfoot.delay(10);
                        Greenfoot.setWorld(new GameOver());
                    }
                }
            
        }
    }
    
    private boolean ketemu3(Class clss)
    {
        World myWorld = getWorld();
        GamePlay3 ini = (GamePlay3)myWorld;
        ayam x = ini.getayam();
        if(x.getImage().getTransparency() == 255) {
                range = 1000;
                Actor actor = getOneObjectAtOffset(0, 0, clss);
                return actor != null;        
        } else {
                range = 5;
                move(2);
                turn(2);
                return false;
        }
        
    }
    public void aktif3(){
        if(isAlive)
        {
                if(!ketemu3(ayam.class)) {
                    gerak();
                } 
                else {
                    if(isTouching(ayam.class))
                    {
                        isAlive = false;
                        removeTouching(ayam.class);
                        Greenfoot.delay(10);
                        Greenfoot.setWorld(new GameOver());
                    }
                }
            
        }
    }
    public int level(int n)
    {
        return noLevel = n;
    }
}
