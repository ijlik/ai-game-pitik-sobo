import greenfoot.*; 

public class GamePlay3 extends World
{
    scoreActor skor = new scoreActor();
    nyawaActor nyawaactor3 = new nyawaActor();
    staminaActor staminaactor1 = new staminaActor();
    ayam ayam = new ayam();
    public GamePlay3()
    {    
        
        super(920, 650, 1); 
        prepare();
    }


    public void prepare()
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
        scorpio scorpio = new scorpio();
        addObject(scorpio,710,541);
        scorpio scorpio2 = new scorpio();
        addObject(scorpio2,109,115);
        scorpio scorpio3 = new scorpio();
        addObject(scorpio3,111,539);
        addObject(skor,770,29);
        home home = new home();
        addObject(home,179,114);
        home.setImage("images/home3.png");
        home home2 = new home();
        addObject(home2,742,415);
        home2.setImage("images/home3.png");
        home home3 = new home();
        addObject(home3,285,483);
        home3.setImage("images/home3.png");

        elang elang = new elang();
        elang.level(3);
        addObject(elang,54,483);
        addObject(ayam,790,268);
        ayam.level(3);
        air air = new air();
        addObject(air,461,327);
        air.getImage().setTransparency(0);
        addObject(nyawaactor3,196,29);
        addObject(staminaactor1,490,29);
    }

    public scoreActor getskor()
    {
         return skor;
    }
    
    public nyawaActor getnyawa()
    {
         return nyawaactor3;
    }
    
    public staminaActor getstamina()
    {
        return staminaactor1;
    }
    
    public ayam getayam(){
        return ayam;
    }
}
