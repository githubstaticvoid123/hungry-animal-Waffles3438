import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Starfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starfish extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("d"))
        {
            move(1);
        }
        else if(Greenfoot.isKeyDown("a"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            turn(-90);
            move(1);
            turn(90);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            turn(-90);
            move(-1);
            turn(90);
        }
    }
}
