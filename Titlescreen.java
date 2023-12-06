import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author Benny
 * @version Dec 4, 2023
 */
public class Titlescreen extends World
{
    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Starts game when user presses the space bar
        if(Greenfoot.isKeyDown("1"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            MyWorld.HP(3);
        }
        if(Greenfoot.isKeyDown("2"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            MyWorld.HP(2);
        }
        if(Greenfoot.isKeyDown("3"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            MyWorld.HP(1); 
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,getWidth()/2,320);
        Label label = new Label("Press A and D to move", 50);
        addObject(label,getWidth()/2,279);
        elephant.setLocation(getWidth()/2,183);
        Label label2 = new Label("Elephant", 75);
        addObject(label2,getWidth()/2,67);
        Label label3 = new Label("Press 1 for easy, 2 for medium and 3 for hard", 30);
        addObject(label3,getWidth()/2,338);
    }
}
