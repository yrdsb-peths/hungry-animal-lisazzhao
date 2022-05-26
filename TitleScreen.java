import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Lisa Zhao 
 * @version May 16, 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("The Starfish", 80);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(titleLabel, 250, 150);
        prepare();
        
        Label instructions1 = new Label ("Use <-- and --> to move", 45);
        addObject(instructions1, 240, 250);
        
        Label instructions2 = new Label ("Press <space> to start", 45);
        addObject(instructions2, 300, 300);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the inital objects and add them to the world.
     */
    private void prepare()
    {
        Starfish st1 = new Starfish();
        addObject(st1, 479, 75);
    }
}
