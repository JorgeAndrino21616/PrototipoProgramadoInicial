import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstaculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstaculo extends objects
{
    /**
     * Act - do whatever the obstaculo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
          Actor Oso;
        Oso = getOneObjectAtOffset (0, 0, Oso.class);
        if (Oso != null)
        {
            World world;
            world = getWorld();
            GameOver gameover = new GameOver();
            world.addObject(gameover, world.getWidth()/2, world.getHeight()/2);
            world.removeObject(Oso);
        }
    }
}
