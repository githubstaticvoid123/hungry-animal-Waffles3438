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
        Starfish star = new Starfish();
        addObject(star, 300, 350);
        
        // create a label
        scoreLabel = new Label("Score: " + score, 40);
        addObject(scoreLabel, 65, 20);
        
        // creates bread
        createBread();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue("Score: " + score);
    }
    
    public void createBread()
    {
        Bread bread = new Bread();
        int x = Greenfoot.getRandomNumber(600);
        addObject(bread, x, 1);
    }
}
