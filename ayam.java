import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ayam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ayam extends Actor
{
    public boolean stop;
    public int noLevel;
    public ayam(){
        stop = false;
    }
    public void checkTombol() 
    {
        // Add your action code here.
            if (Greenfoot.isKeyDown("left"))
            {
                turn(-3);
                stop = false;
            }
        
            if (Greenfoot.isKeyDown("down"))
            {
                move(-3);
            }
        
            if (Greenfoot.isKeyDown("right"))
            {
                turn(3);
                stop = false;
            }
        
            if (Greenfoot.isKeyDown("up"))
            {
                move(3);
            }
        
    }
    boolean touchingAnt3 = false;  
    public void makanCacing()
    {
        //eksekusi food jika ketemu
        if(isTouching(cacing.class))
            {
            World myWorld= getWorld();
            GamePlay sand = (GamePlay)myWorld;
            sand.addObject(new cacing(), 
            Greenfoot.getRandomNumber(920), 
            Greenfoot.getRandomNumber(650));
            scoreActor skor = sand.getskor();
            nyawaActor nyawa = sand.getnyawa();
            skor.addscore();
            nyawa.addnyawa();
            removeTouching(cacing.class);
            //Greenfoot.playSound("makan.wav");
            }
        else
           {
               touchingAnt3=false;
            }
    }
    public void makanCacing2()
    {
        //eksekusi food jika ketemu
        if(isTouching(cacing.class))
            {
            World myWorld= getWorld();
            GamePlay2 sind = (GamePlay2)myWorld;
            sind.addObject(new cacing(), 
            Greenfoot.getRandomNumber(920), 
            Greenfoot.getRandomNumber(650));
            scoreActor scor = sind.getskor();
            nyawaActor nyaw = sind.getnyawa();
            scor.addscore();
            nyaw.addnyawa();
            removeTouching(cacing.class);
            //Greenfoot.playSound("makan.wav");
            }
        else
           {
               touchingAnt3=false;
            }
    }
    public void makanCacing3()
    {
        //eksekusi food jika ketemu
        if(isTouching(cacing.class))
            {
            World myWorld= getWorld();
            GamePlay3 sund = (GamePlay3)myWorld;
            sund.addObject(new cacing(), 
            Greenfoot.getRandomNumber(920), 
            Greenfoot.getRandomNumber(650));
            scoreActor score = sund.getskor();
            nyawaActor nywa = sund.getnyawa();
            score.addscore();
            nywa.addnyawa();
            removeTouching(cacing.class);
            //Greenfoot.playSound("makan.wav");
            }
        else
           {
               touchingAnt3=false;
            }
    }
    public void makanScorpio()
    {
        //eksekusi food jika ketemu
        if(isTouching(scorpio.class))
            {
            World myWorld= getWorld();
            GamePlay3 sand = (GamePlay3)myWorld;
            sand.addObject(new scorpio(), 
            Greenfoot.getRandomNumber(920), 
            Greenfoot.getRandomNumber(650));
            nyawaActor ini = sand.getnyawa();
            ini.hurt();
            removeTouching(scorpio.class);
            //Greenfoot.playSound("makan.wav");
            }
        else
           {
               touchingAnt3=false;
            }
    }
    
    public void act() 
    {
        checkTombol();
        
        if(noLevel == 1){
            makanCacing();
        }
        if(noLevel == 2){
            makanCacing2();
        }
        if(noLevel == 3){
            makanCacing3();
            makanScorpio();
        }
        hide();
        
    }
    
    public void hide()
    {
        if(isTouching(home.class))
        {
            getImage().setTransparency(0);
        } else {
            getImage().setTransparency(255);
        }
    }
    
    public int level(int n)
    {
        return noLevel = n;
    }
    
}
