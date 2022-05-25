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
    GreenfootImage[] idleLeft = new GreenfootImage[7];
    GreenfootImage[] idleRight = new GreenfootImage[7];
    
    //Direction the starfish is facing
    String facing = "left";
    /**
     * Constructor
     */
    public Starfish()
    {
        for (int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/starfish_idle/idle"+ i + ".png");
            idleLeft[i].scale(100,100);
        }
        
        for (int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/starfish_idle/idle"+ i + ".png");
            idleRight[i].mirrorHorizontally();
            idleRight[i].scale(100,100);
        }
        //Initial starfish image
        setImage(idleLeft[0]);
    }
    
    int imageIndex = 0;
    /**
     * Animate the starfish
     */
    public void animateStarfish()
    {
        if (facing.equals("left"))
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        else
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex +1) % idleRight.length;
        }
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
            facing = "left";
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "right";
        }
        
        //remove pizza if eaten
        eat();
        
        //animate the starfish
        animateStarfish();
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