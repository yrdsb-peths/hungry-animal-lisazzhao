import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Starfish, the main character of the game, controlled by player.
 * 
 * @author Lisa Zhao 
 * @version May 16, 2022
 */
public class Starfish extends Actor
{
    GreenfootSound starfishSound = new GreenfootSound("water_sound.mp3");
    /**
     * Constructor
     */
    public Starfish()
    {
        
    }
    
    /**
     * Act - do whatever the Starfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        
        //remove pizza if eaten
        eat();
    }
    
    /*
     * Spawn new pizza if one is eaten
     */
    public void eat()
    {
        if (isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.createPizza();
            world.increaseScore();
            starfishSound.play();
        }
    }
}