package iniciante;

import java.io.IOException;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Bee2344 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int nota = input.nextInt();

        NavigableMap<Integer, String> mapa = new TreeMap<>();
        mapa.put(35, "D");
        mapa.put(60, "C");
        mapa.put(85, "B");
        mapa.put(100, "A");

        String resultado = mapa.ceilingEntry(nota) != null ? mapa.ceilingEntry(nota).getValue() : "E";
        System.out.println(resultado);

    }

}