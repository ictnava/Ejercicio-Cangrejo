import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{   
    public final int TIEMPO_NIVEL = 15;
    private Counter contGusanos;
    private Counter contVidas;
    private Counter contTiempo;
    private SimpleTimer reloj;
    private Crab cangrejo;
    private Lobster langosta;
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        contGusanos=new Counter("Gusanos:  ");
        addObject(contGusanos,50,20);
        contVidas=new Counter("Vidas: ");
        addObject(contVidas,400,20);
        contVidas.setValue(3);
        contTiempo = new Counter("Tiempo: ");
        addObject(contTiempo,225,34);
        prepare();
        contTiempo.setValue(TIEMPO_NIVEL);
        reloj=new SimpleTimer();
        
    }
    public void started()
    {
        reloj.mark();
        System.out.println("Boton Run presionado");
    }
    
    public void stopped()
    {
      System.out.println("Boton pause presionado");
    }
    
    public void act()
    {
        contGusanos.act(); 
        contVidas.act();
        
        if(reloj.millisElapsed()>1000){
        contTiempo.add(-1);
        reloj.mark();
        }
    }

    public void incrementaGusano()
    {
        contGusanos.add(1);
    }
    
     public void decrementaVidas()
    {
        contVidas.add(-1);
    }
    
    
    public void cangrejoAtrapado()
    {
     
        //mundo.showText("Game Over",250,250);
         decrementaVidas();
         langosta.setLocation(20,30);
         cangrejo.setLocation(218,270);
         if(contVidas.getValue()==0)
         {
          Label etiquetaFin=new Label("Game Over",50);
          addObject(etiquetaFin,250,250);
          Greenfoot.stop();
         }
        
        //Label etiquetaFin=new Label("Game Over",50);
        //mundo.addObject(etiquetaFin,250,250);
        //Greenfoot.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,326,298);
        Worm worm2 = new Worm();
        addObject(worm2,474,420);
        Worm worm3 = new Worm();
        addObject(worm3,275,484);
        Worm worm4 = new Worm();
        addObject(worm4,275,484);
        Worm worm5 = new Worm();
        addObject(worm5,230,171);
        Worm worm6 = new Worm();
        addObject(worm6,101,314);
        Worm worm7 = new Worm();
        addObject(worm7,318,195);
        Worm worm8 = new Worm();
        addObject(worm8,428,136);
        cangrejo = new Crab();
        addObject(cangrejo,218,270);
        Worm worm9 = new Worm();
        addObject(worm9,86,388);
        Worm worm10 = new Worm();
        addObject(worm10,412,78);
        Worm worm11 = new Worm();
        addObject(worm11,412,78);
        Worm worm12 = new Worm();
        addObject(worm12,96,153);
        Worm worm13 = new Worm();
        addObject(worm13,503,289);
        Worm worm14 = new Worm();
        addObject(worm14,503,289);
        langosta = new Lobster();
        addObject(langosta,469,212);
           }
}
