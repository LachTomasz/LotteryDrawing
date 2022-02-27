package LotteryDrawing;
import java.util.*;

/**
 *Program ten demonstruje zastosowanie tablic.
 *This program demonstrates the use of arrays.
 */

/**
 * @author Tomek
 *
 */
public class LotteryDrawing
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.print ("Ile liczb musisz wylosować? ");
        int k = in.nextInt();

        System.out.print ("Jaka jest największa liczba? ");
        int n = in.nextInt();

        //Zapisanie tablicy liczbami 1, 2, 3, ... n.
        //Writing an array with numbers 1, 2, 3, ... n.
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        //Losowanie k liczb i zapisanie ich w drugiej tablicy.
        //Draw k numbers and store them in the second array.
        int[] result = new int[k];

        for(int i = 0; i < result.length; i++)
        {
            //Losowanie indeksu z zakresu od 0 do n-1.
            //Randomize an index in the range 0 to n-1.
            int r = (int) (Math.random() *n);
            //Pobieranie elementu z losowej lokalizacji.
            //Retrieving an item from a random location.
            result[i] = numbers[r];

            //Przeniesienie ostatniego elementu do losowej lokalizacji.
            //Moving the last item to a random location.
            numbers[r] = numbers[n-1];
            n--;
        }

        //Wydruk zapisanej tablicy.
        //Printout of a saved table.
        Arrays.sort(result);
        System.out.println("Postaw na następujące liczby. Dzięki nim zdobędziesz bogactwo!");
        for (int r : result)
            System .out.println(r);
    }

}