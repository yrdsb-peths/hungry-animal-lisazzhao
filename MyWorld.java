import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Starfish starfish = new Starfish();
        addObject(starfish, 300, 200);
        Pizza p1 = new Pizza();
        addObject(p1, 150, 200);
        Pizza p2 = new Pizza();
        addObject(p2, 50, 100);
        Pizza p3 = new Pizza();
        addObject(p3, 320, 300);
        Pizza p4 = new Pizza();
        addObject(p4, 500, 150);
        Pizza p5 = new Pizza();
        addObject(p5, 120, 300);
    }
}
