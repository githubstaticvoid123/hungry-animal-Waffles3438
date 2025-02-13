import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound eatFood = new GreenfootSound("eat.mp3");
    GreenfootSound walk = new GreenfootSound("stone.mp3");
    GreenfootImage idleRight[] = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    int movementSpd = 5;
    
    // Direction the elephant is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    // Constructor
    public Elephant()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(64,64);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(64,64);
        }

        
        animationTimer.mark();
        
        // Initial elephant image
        setImage(idleRight[0]);
    }
    
    // Animating elephant
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("d") && getX() <= 568)
        {
            move(movementSpd);
            facing = "right";
            walk.setVolume(50);
            walk.play();
        }
        else if(Greenfoot.isKeyDown("a") && getX() >= 32)
        {
            move(-movementSpd);
            facing = "left";
            walk.setVolume(50);
            walk.play();
        }
        else
        {
            walk.pause();
        }
        
        
        // remove bread if starfish touches it
        eat();
        badEat(); 
        
        // animate elephant
        animateElephant();
    }
    
    /**
     * Eats apple and spawns new apple
     */ 
    public void eat()
    {
        if(isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBread();
            world.increaseScore();
            eatFood.setVolume(50);
            eatFood.play();
        }
    }
    
    public void badEat()
    {
        if(isTouching(BadBread.class)){
            removeTouching(BadBread.class); 
            MyWorld world = (MyWorld) getWorld(); 
            world.gameOver(); 
            world.removeObject(this);
    }
    }
}
