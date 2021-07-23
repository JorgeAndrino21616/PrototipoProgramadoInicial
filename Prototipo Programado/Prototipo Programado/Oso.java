import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oso extends Actor
{
    /**
     * Act - do whatever the Oso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("Left"))
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            move(3);
        }

    }
}
