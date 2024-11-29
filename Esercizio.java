//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        int n, i, iMinH, iMinV;
        Scanner in = new Scanner(System.in);
        double sommaH, sommaV, minH, minV;
        System.out.println("inserisci N giri");
        n = in.nextInt();
        double[] h = new double[n];
        double[] v = new double[n];
        sommaH = 0;
        sommaV = 0;
        for (i = 0; i <= n - 1; i++) {
            System.out.println("inserisci il tempo che ha compiuto H per completare il " + (i + 1) + "° giro");
            h[i] = in.nextDouble();
            System.out.println("ora inserisci quello di V ");
            v[i] = in.nextDouble();
            sommaH = sommaH + h[i];
            sommaV = sommaV + v[i];
        }
        minH = 0;
        iMinH = 0;
        minV = 0;
        iMinV = 0;
        for (i = 0; i <= n - 1; i++) {
            if (i == 0) {
                minH = h[i];
                iMinH = i;
            }
            if (h[i] < minH) {
                minH = h[i];
                iMinH = i;
            }
        }
        for (i = 0; i <= n - 1; i++) {
            if (i == 0) {
                minV = v[i];
                iMinV = i;
            }
            if (v[i] < minV) {
                minV = v[i];
                iMinV = i;
            }
        }
        System.out.println("il giro che H ha compiuto con un tempo minore è " + iMinH + " con un tempo pari a " + minH);
        System.out.println("il giro che V ha compiuto con un tempo minore è " + iMinV + " con un tempo pari a " + minV);
        if (sommaH < sommaV) {
            System.out.println("HA VINTO H ");
        } else {
            System.out.println("HA VINTO V");
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md