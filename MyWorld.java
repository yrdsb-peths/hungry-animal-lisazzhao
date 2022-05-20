import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World, where the elephant lives.
 * 
 * @author Lisa Zhao
 * @version May 16, 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //create a starfish
        Starfish st1 = new Starfish();
        addObject(st1, 300, 300);
        
        //create a label to keep score
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        //create an apple
        createPizza();
    }
    
    /**
     * end the game and show "game over"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 150);
        Label startOverLabel = new Label("Press <space> to restart", 50);
        addObject(startOverLabel, 300, 210);
        Label returnScreen = new Label ("Press <enter> to return to the Title Screen", 35);
        addObject(returnScreen, 300, 250);
    }
    
    /**
     * To start over and try again
     */
    public void startOver()
    {
        setScore(0);
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Set new score
     */
    public void setScore(int newScore)
    {
        score = newScore;
    }
    
    /**
     * Create a new pizza at a random location
     */
    public void createPizza()
    {
        Pizza p1 = new Pizza();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(p1, x, y);
    }
}
