import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Starfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Starfish extends Actor
{
    int xPos;
    int yPos;
    public void addedToWorld(World w)
    {
        xPos = getX();
        yPos = getY();
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
        if (Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()-(-2));
        }
        if (isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
        }
    }    
}
