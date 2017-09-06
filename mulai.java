import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class mulai extends Actor
{
    int level = 0;
    public void act() 
    {
        if (Greenfoot.mouseMoved(this)){
            setImage("images/mulai-over.png");
        } else {
            setImage("images/mulai.png");
        }
        if (Greenfoot.mouseClicked(this) && level == 1){
            Greenfoot.setWorld(new GamePlay());
        } else if (Greenfoot.mouseClicked(this) && level == 2){
            Greenfoot.setWorld(new GamePlay2());
        } else if (Greenfoot.mouseClicked(this) && level == 3){
            Greenfoot.setWorld(new GamePlay3());
        }
    }
    public void setLevel(int n){
        level = n;
    }
}
