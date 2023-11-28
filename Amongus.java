import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Amongus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amongus extends Actor
{
    /**
     * Act - do whatever the Amongus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound eatFood = new GreenfootSound("eat.mp3");
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
            world.increaseScore();
            eatFood.play();
        }
    }
}
