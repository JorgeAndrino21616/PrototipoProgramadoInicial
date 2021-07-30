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
            setRotation(180);
            move(3);
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            setRotation(0);
            move(3);
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            setRotation(270);
            move(3);
        }
        if (Greenfoot.isKeyDown("Down"))
        {
            setRotation(90);
            move(3);
        }
        
        Actor Cereza;
        Cereza = getOneObjectAtOffset (0, 0, Cereza.class);
        if (Cereza != null)
        {
            World world;
            world = getWorld();
            MyWorld mundo = (MyWorld)world;
            Counter counter = mundo.getCounter();
            counter.addScore();
            world.removeObject(Cereza);
        }
        
        Actor Naranja;
        Naranja = getOneObjectAtOffset (0, 0, Naranja.class);
        if (Naranja != null)
        {
            World world;
            world = getWorld();
            MyWorld mundo = (MyWorld)world;
            Counter counter = mundo.getCounter();
            counter.addScore();
            world.removeObject(Naranja);
        }
        }

    }

