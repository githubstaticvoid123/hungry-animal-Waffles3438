import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadBread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadBread extends Actor
{
    /**
     * Act - do whatever the BadBread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 2); 
   
        MyWorld world = (MyWorld) getWorld(); 
        if(isAtEdge())
        {
            world.createBadBread();
            if(world.getHP() == 0)
            {
                world.removeObject(this);
            }
            world.removeObject(this);
        }
        
    }
}
