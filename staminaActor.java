import greenfoot.*;  

public class staminaActor extends Actor
{
    int stamina = 100000;
    private long lastTime = 0;
       
    public void act() {
        long time = System.currentTimeMillis();
        if(lastTime != 0) {
            long diff = lastTime - time;
            if (stamina < 1000 || stamina > 150000){
                Greenfoot.setWorld(new GameOver());
            }
            else {
                stamina += diff;
            }
        }
        lastTime = time;
        updateImage(); 
    }
   
    public void updateImage() {
        int nilai = stamina / 1000;
        String text = Integer.toString(nilai);
        // Update the image
        GreenfootImage img = new GreenfootImage(text, 28, null, null);
        setImage(img);
    }   
    public void addstamina()
    {
        stamina += 50;
    }  
}
