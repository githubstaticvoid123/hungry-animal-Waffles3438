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
        Random rand = new Random(); 
        int x = rand.nextInt(600); 
        Starfish star = new Starfish();
        Bread bread = new Bread();
        addObject(star, 300, 350);
        addObject(bread, x, 1);
    }
}
