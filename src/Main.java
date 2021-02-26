import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        String v;
        Scanner a;
        do {
            a = new Scanner(System.in);
            System.out.println("Escribe una de las siguientes opciones:");
            System.out.println("s: shuffle      h:head      p:pick      a:hand      x:exit ");

            v = a.nextLine();

            switch (v)
            {
                case "s":
                    deck.shuffle();
                    break;
                case "h":
                    deck.head();
                    break;
                case "p":
                    deck.pick();
                    break;
                case "a":
                    deck.hand();
                    break;
                case "x":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Comando no reconocido");
                    break;
            }
        } while(v != "x");
    }
}
