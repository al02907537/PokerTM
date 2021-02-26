import java.util.*;

public class Deck {

    Queue<Card> deck_cards ;

    public Deck() {
        deck_cards = new LinkedList<Card>();

        Card carta;
        String color = "", palo = "";

        for (int p = 0; p < 4; p++) {
            switch (p) {
                case 0:
                    palo = "tréboles";
                    color = "negro";
                    break;
                case 1:
                    palo = "corazones";
                    color = "rojo";
                    break;
                case 2:
                    palo = "picas";
                    color = "negro";
                    break;
                case 3:
                    palo = "diamantes";
                    color = "rojo";
                    break;
            }

            for (int valor = 1; valor <= 13; valor++) {
                switch (valor) {
                    case 1:
                        carta = new Card("A", palo, color);
                        break;
                    case 11:
                        carta = new Card("J", palo, color);
                        break;
                    case 12:
                        carta = new Card("Q", palo, color);
                        break;
                    case 13:
                        carta = new Card("K", palo, color);
                        break;
                    default:
                        carta = new Card(String.valueOf(valor), palo, color);
                        break;
                }
                deck_cards.add(carta);
            }
        }
    }
    public void shuffle()
    {
        List<Card> lista_cartas = new ArrayList<>(deck_cards);
        Collections.shuffle(lista_cartas);
        deck_cards = new LinkedList<>(lista_cartas);
        lista_cartas.clear();
        System.out.println("Se mezcló el deck");
    }

    public void head()
    {
        Card primera_carta = deck_cards.element();
        deck_cards.remove(primera_carta);
        System.out.println(
                "{"+primera_carta.palo+"} ,"+
                        "{"+primera_carta.color+"} ,"+
                        "{"+primera_carta.valor+"} \n"+
                "Quedan "+(deck_cards.size())+" cartas");

    }

    public void pick()
    {
        List<Card> lista_cartas = new ArrayList<>(deck_cards);
        Random randomGen = new Random();
        int random_int = randomGen.nextInt(lista_cartas.size());
        Card carta_aleatoria = lista_cartas.get(random_int);
        deck_cards = new LinkedList<>(lista_cartas);
        lista_cartas.clear();
        lista_cartas = null;
        deck_cards.remove(carta_aleatoria);

        System.out.println(
                "{"+carta_aleatoria.palo+"} ,"+
                        "{"+carta_aleatoria.color+"} ,"+
                        "{"+carta_aleatoria.valor+"} \n"+
                        "Quedan "+(deck_cards.size())+" cartas");
    }

    public void hand()
    {
        Card[] arreglo_cartas = new Card[5];
        arreglo_cartas[0]= deck_cards.poll();
        arreglo_cartas[1]= deck_cards.poll();
        arreglo_cartas[2]= deck_cards.poll();
        arreglo_cartas[3]= deck_cards.poll();
        arreglo_cartas[4]= deck_cards.poll();

        System.out.println(
                "{"+arreglo_cartas[0].palo+"} ,"+
                        "{"+arreglo_cartas[0].color+"} ,"+
                        "{"+arreglo_cartas[0].valor+"} \n"+
                        "{"+arreglo_cartas[1].palo+"} ,"+
                        "{"+arreglo_cartas[1].color+"} ,"+
                        "{"+arreglo_cartas[1].valor+"} \n"+
                        "{"+arreglo_cartas[2].palo+"} ,"+
                        "{"+arreglo_cartas[2].color+"} ,"+
                        "{"+arreglo_cartas[2].valor+"} \n"+
                        "{"+arreglo_cartas[3].palo+"} ,"+
                        "{"+arreglo_cartas[3].color+"} ,"+
                        "{"+arreglo_cartas[3].valor+"} \n"+
                        "{"+arreglo_cartas[4].palo+"} ,"+
                        "{"+arreglo_cartas[4].color+"} ,"+
                        "{"+arreglo_cartas[4].valor+"} \n"+
                        "Quedan "+(deck_cards.size())+" cartas");
    }
}



