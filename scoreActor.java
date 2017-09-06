import greenfoot.*;  

public class scoreActor extends Actor
{
    int score=0;
    public void act() 
    {
        String text = Integer.toString(score);
        setImage(new GreenfootImage(text, 28, null, null));
    }    
    
    public void addscore()
    {
        score++;
    }    
}
