import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Label totalScore;
    Label playAgain;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        totalScore = new Label("Your score: " + score, 40);
        addObject(totalScore, 300, 300);
        playAgain = new Label("Press space to play again", 40);
        addObject(playAgain, 300, 350);
        MyWorld.setScore(0);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Titlescreen titlescreen = new Titlescreen();
            Greenfoot.setWorld(titlescreen);
        }
    }
}
