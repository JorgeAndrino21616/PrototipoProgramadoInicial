import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter= new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //crear puntaje para el juego
        addObject(counter, 100, 40);
        
        //crear objetos
        addObject (new Oso(), 300, 200);
        Cereza[] cerezas = new Cereza[7];
        for(int i=0; i<cerezas.length; i++)
        // crear un número determinado de cerezas, pero en posiciones aleatorias
        {
            cerezas[i]= new Cereza();
            int cerezaX = Greenfoot.getRandomNumber(getWidth());
            int cerezaY = Greenfoot.getRandomNumber(getHeight());
            addObject(cerezas[i], cerezaX, cerezaY);
        }
        Naranja[] naranjas = new Naranja[7];
        for(int i=0; i<naranjas.length; i++)
        //crear un número determinado de naranjas, pero en posiciones aleatorias
        {
            naranjas[i]= new Naranja();
            int naranjaX = Greenfoot.getRandomNumber(getWidth());
            int naranjaY = Greenfoot.getRandomNumber(getHeight());
            addObject(naranjas[i], naranjaX, naranjaY);
        }
        obstaculo[] obstaculos = new obstaculo[6];
        for(int i=0; i<obstaculos.length; i++)
        //crear un número de obstacúlos en posiociones aleatorias
        {
            obstaculos[i]= new obstaculo();
            int obstaculoX = Greenfoot.getRandomNumber(getWidth());
            int obstaculoY = Greenfoot.getRandomNumber(getHeight());
            addObject(obstaculos[i], obstaculoX, obstaculoY);
        }
    }
    
    //crear el puntaje
    public Counter getCounter()
    {
       return counter;
    }
}
