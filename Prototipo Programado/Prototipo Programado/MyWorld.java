import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject (new Oso(), 300, 200);
        Cereza[] cerezas = new Cereza[7];
        for(int i=0; i<cerezas.length; i++)
        {
            cerezas[i]= new Cereza();
            int cerezaX = Greenfoot.getRandomNumber(getWidth());
            int cerezaY = Greenfoot.getRandomNumber(getHeight());
            addObject(cerezas[i], cerezaX, cerezaY);
        }
        Naranja[] naranjas = new Naranja[7];
        for(int i=0; i<naranjas.length; i++)
        {
            naranjas[i]= new Naranja();
            int naranjaX = Greenfoot.getRandomNumber(getWidth());
            int naranjaY = Greenfoot.getRandomNumber(getHeight());
            addObject(naranjas[i], naranjaX, naranjaY);
        }
        obstaculo[] obstaculos = new obstaculo[6];
        for(int i=0; i<obstaculos.length; i++)
        {
            obstaculos[i]= new obstaculo();
            int obstaculoX = Greenfoot.getRandomNumber(getWidth());
            int obstaculoY = Greenfoot.getRandomNumber(getHeight());
            addObject(obstaculos[i], obstaculoX, obstaculoY);
        }
    }
}
