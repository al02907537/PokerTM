public class Card {
    String valor;
    String palo;
    String color;
    String p1,p2,p3,p4;
    String c1, c2;
    String v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13;

    public void colores() {
        c1 = ("rojo");
        c2 = ("negro");
    }

    public void palos() {
        p1 = ("treboles");
        p2 = ("corazones");
        p3 = ("picas");
        p4 = ("diamantes");
    }

       public void valores() {
        v1 = ("A");
        v2 = ("2");
        v3 = ("3");
        v4 = ("4");
        v5 = ("5");
        v6 = ("6");
        v7 = ("7");
        v8 = ("8");
        v9 = ("9");
        v10 = ("10");
        v11 = ("J");
        v12 = ("Q");
        v13 = ("K");
    }

    public Card(String valor, String palo, String color) {
        this.valor = valor;
        this.palo = palo;
        this.color = color;
    }

}
