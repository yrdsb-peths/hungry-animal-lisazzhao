import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the starfish.
 * 
 * @author Lisa Zhao 
 * @version May 16, 2022
 */
public class Pizza extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    
    public void act() 
    {
        // pizza falls downwards
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //remove the pizza and end the game/show "game over"
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
       speed = spd;
    }
}
