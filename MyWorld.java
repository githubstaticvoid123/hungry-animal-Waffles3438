import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    public int x = 600;
    public int y = 400;
    int level = 1;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1);
 
        // creates starfish
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 325);
        
        // create a label
        scoreLabel = new Label("Score: " + score, 40);
        addObject(scoreLabel, x/2, 20);
        
        // creates bread
        createBread();
    }
    
    
    /**
     * Ends game and shows game over title
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, x/2, y/2);
    }
    
    
    /**
     * Increases score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue("Score: " + score);
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /**
     * Creates a bread
     */
    public void createBread()
    {
        Bread bread = new Bread();
        bread.setSpeed(level);
        java.util.Random rand = new java.util.Random();
        int x = rand.nextInt(32, 568);
        addObject(bread, x, 1);
    }
}
