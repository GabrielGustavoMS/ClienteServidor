package SugestaoMusical.model;

import java.util.*;

public class SelecaoMusical {

    public ArrayList getLista(String estilo) {
        ArrayList<String> grupos = new ArrayList<String>();
        if (estilo.equals("Rock")) {
            grupos.add("Led Zeppelin");
            grupos.add("The Who");
            grupos.add("U2");
            grupos.add("Yes");
        } else if (estilo.equals("Samba")) {
            grupos.add("Zeca Pagodinho");
            grupos.add("Fundo de Quintal");
            grupos.add("Dona Ivone Lara");
            grupos.add("Martinho da Vila");
        } else if (estilo.equals("Opera")) {
            grupos.add("Placido Domingo");
            grupos.add("Luciano Pavarotti");
            grupos.add("Jose Carreras");
            grupos.add("Enrico Caruso");
        } else {
            grupos.add("Chico Buarque");
            grupos.add("Milton Nascimento");
            grupos.add("Ellis Regina");
            grupos.add("Gonzaguinha");
        }
        return grupos;
    }
}
