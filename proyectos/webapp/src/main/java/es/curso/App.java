package es.curso;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hola Jenkins!" );
    }
    
    public static int doblar( int numero )
    {
        return numero*2;
    }
    
    public static int mayor( int numero1, int numero2 )
    {
        /*if (numero1 > numero2) {
            return numero1
        }
        return numero2;
        */
        return numero1 > numero2 ? numero1 : numero2 ;
    }
    
    // Definiendo el API
    public static int menor( int numero1, int numero2 )
    {
        // TODO: Implemntar la función
        return numero1 < numero2 ? numero1 : numero2 ;
    }
}