import greenfoot.*;  

public class GamePlay2 extends World
{
    scoreActor skor = new scoreActor();
    nyawaActor nyawaactor2 = new nyawaActor();
    staminaActor staminaactor = new staminaActor();
    ayam ayam = new ayam();
    public GamePlay2()
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
        home home3 = new home();
        addObject(home3,280,169);
        home3.setImage("images/home2.png");
        home home4 = new home();
        addObject(home4,689,410);
        home4.setImage("images/home2.png");
        home home5 = new home();
        addObject(home5,199,591);
        home5.setImage("images/home2.png");
        elang elang = new elang();
        elang.level(2);
        addObject(elang,73,570);
        
        addObject(ayam,451,125);
        ayam.level(2);
        
        api api = new api();
        addObject(api,848,289);
        api.getImage().setTransparency(0);
        api api2 = new api();
        addObject(api2,472,585);
        api2.getImage().setTransparency(0);
        api api3 = new api();
        addObject(api3,91,267);
        api3.getImage().setTransparency(0);
        addObject(skor,770,29);
        addObject(nyawaactor2,196,29);
        addObject(staminaactor,478,29);
        
    }
    
    public scoreActor getskor()
    {
         return skor;
    }
    
    public nyawaActor getnyawa()
    {
         return nyawaactor2;
    }
    
    public staminaActor getstamina()
    {
        return staminaactor;
    }
    
    public ayam getayam(){
        return ayam;
    }
}
