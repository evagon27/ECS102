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
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Pizza pizza = new Pizza();
        addObject(pizza,300,300);
        Topping topping = new Topping("Cheese");
        addObject(topping,0,0);
        Topping topping2 = new Topping("Olives");
        addObject(topping2,599,399);
        Topping topping3 = new Topping("BellPeppers");
        addObject(topping3,300,150);
        Topping topping4 = new Topping("Mushrooms");
        addObject(topping4,249,55);
    }
}
