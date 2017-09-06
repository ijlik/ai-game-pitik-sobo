import greenfoot.*; 

public class nyawaActor extends Actor
{
    
    int nyawa = 100000;
    private long lastTime = 0;
       
    public void act() {
        long time = System.currentTimeMillis();
        if(lastTime != 0) {
            long diff = lastTime - time;
            if (nyawa < 1000){
                Greenfoot.setWorld(new GameOver());
            }
            else {
                nyawa += diff;
            }
        }
        lastTime = time;
        updateImage(); 
    }
   
    public void updateImage() {
        int nilai = nyawa / 1000;
        String text = Integer.toString(nilai);
        // Update the image
        GreenfootImage img = new GreenfootImage(text, 28, null, null);
        setImage(img);
    }   
    public void addnyawa()
    {
        nyawa += 500;
    }
    public void hurt(){
        nyawa -= 25000;
    }
}
