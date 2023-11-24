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
            move(3);
        }
        else if(Greenfoot.isKeyDown("a"))
        {
            move(-3);
        }
        
        // remove bread if starfish touches it
        eat();
    }
    
    // Eats apple and spawns new apple
    public void eat()
    {
        if(isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBread();
        }
    }
}
