import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bread extends Actor
{
    int speed  = 2;
    
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        // bread goes down
        if(!isAtEdge())
        {
            turn(90);
            move(speed);
            turn(-90);
        }
        
        // removes bread when it touches the ground
        MyWorld world = (MyWorld) getWorld();
        if(isAtEdge())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
        System.out.println(speed);
    }
}
