import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    //definir el puntaje inicial
    int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // crear el puntaje
        setImage(new GreenfootImage("Puntaje:" + score, 24, Color.BLACK, Color.WHITE));
    }
    
    //el puntaje aumenta con cada acción
    public void addScore()
    {
        score++;
    }
}
