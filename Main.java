package com.company;

public class Main {

    public static void main(String[] args) {

        Fiaca fiaca = new Fiaca();
        Moderado moderado1 = new Moderado(5);
        Moderado moderado2 = new Moderado(2);
        Moderado moderado3 = new Moderado(9);
        Obsecuente obsecuente = new Obsecuente(moderado1);

        Micro micro = new Micro(
                10,
                10,
                150
        );

        micro.subir(fiaca);
        micro.subir(moderado1);
        micro.subir(moderado2);

        micro.bajar();

        System.out.println(micro.quienSubioPrimero());

        micro.bajar();
        micro.bajar();

        System.out.println(micro.quienSubioPrimero());

        System.out.println(moderado1);
        System.out.println(moderado2);
        System.out.println(moderado3);

        System.out.println(moderado1.equals(moderado2));
        System.out.println(moderado1.equals(moderado1));

    }
}
