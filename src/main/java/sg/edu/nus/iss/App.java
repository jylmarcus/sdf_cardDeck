package sg.edu.nus.iss;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        cardDeck test = new cardDeck();
        test.setDeck();
        test.shuffle();
        System.out.println("There are " + test.getDeck().size() + " cards in the deck");
        System.out.println(Arrays.toString(test.getDeck().toArray()));
        System.out.println(test.draw().toString());
    }
}
