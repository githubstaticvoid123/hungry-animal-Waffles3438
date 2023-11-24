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
        
        // create a lable
        Label scoreLabel = new Label("Score: ", 40);
        addObject(scoreLabel, 60, 20);
        
        // creates bread
        createBread();
    }
    
    public void createBread()
    {
        Bread bread = new Bread();
        int x = Greenfoot.getRandomNumber(600);
        addObject(bread, x, 1);
    }
}
