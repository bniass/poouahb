package main;

import modele.Activite;
import modele.Concert;
import modele.Exposition;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args)
    {
        Exposition ex1 = new Exposition("Art graphique", "centre culturel français",
                "tous",
                LocalDate.now(), "art du dessin",
                "montrer l'interet de l'art graphique");
        Exposition ex2 = new Exposition();
        ex2.setDescription("desc1");
        ex2.setTheme("theme1");
        ex2.setNom("exp1");
        ex2.setDate(LocalDate.now());
        ex2.setPublique("jeune");
        ex2.setLieu("lieu1");

        //System.out.println(ex1);
        //System.out.println(ex2);

        Concert c1 = new Concert("concert1","lieu1", "pubklique 1",
                LocalDate.now(),"artiste1","stade 1", 10000);

        Activite c2 = new Concert("concert2","lieu2", "pubklique 2",
                LocalDate.now(),"artiste2","stade 2", 13000);


        //System.out.println(c1.toString());
        //System.out.println(c2.toString());
        display(ex1);
        display(ex2);
        display(c1);
        display(c2);
    }

    public static void display(Activite a){
        System.out.println(a);
    }
}
