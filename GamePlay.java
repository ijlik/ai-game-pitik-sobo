import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GamePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamePlay extends World
{
    scoreActor skor = new scoreActor();
    nyawaActor nyawaactor = new nyawaActor();
    ayam ayam = new ayam();
    public GamePlay()
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
        cacing cacing = new cacing();
        addObject(cacing,298,210);
        cacing cacing2 = new cacing();
        addObject(cacing2,325,320);
        cacing cacing3 = new cacing();
        addObject(cacing3,468,248);
        cacing cacing4 = new cacing();
        addObject(cacing4,726,154);
        cacing cacing5 = new cacing();
        addObject(cacing5,635,382);
        cacing cacing6 = new cacing();
        addObject(cacing6,572,530);
        cacing cacing7 = new cacing();
        addObject(cacing7,839,246);
        cacing cacing8 = new cacing();
        addObject(cacing8,622,105);
        cacing cacing9 = new cacing();
        addObject(cacing9,271,450);
        cacing cacing10 = new cacing();
        addObject(cacing10,164,279);
        cacing cacing11 = new cacing();
        addObject(cacing11,832,442);
        cacing cacing12 = new cacing();
        addObject(cacing12,327,511);
        cacing cacing13 = new cacing();
        addObject(cacing13,459,358);
        cacing cacing14 = new cacing();
        addObject(cacing14,224,69);
        cacing cacing15 = new cacing();
        addObject(cacing15,464,77);

        elang elang = new elang();
        elang.level(1);
        addObject(elang,155,175);
        
        addObject(ayam,666,444);
        ayam.level(1);

        home home = new home();
        addObject(home,456,320);
        home.setImage("images/home1.png");
        home.getImage().setTransparency(0);

        home home2 = new home();
        addObject(home2,450,325);
        home2.setImage("images/home1.png");
        home2.setRotation(90);
        home2.getImage().setTransparency(0);        

        addObject(skor,726,29);
        
        addObject(nyawaactor,237,29);
    }

    public scoreActor getskor()
    {
         return skor;
    }
    
    public nyawaActor getnyawa()
    {
         return nyawaactor;
    }
    
    public ayam getayam()
    {
        return ayam;
    }
}
