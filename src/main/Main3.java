package main;

import modele.Activite;
import modele.Concert;
import modele.Exposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main3 {
    public static void main(String[] args)
    {
        List<Activite> activites = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            if(r.nextInt(2) == 0){
                // concert
                System.out.println("Concert");
                activites.add(new Concert());
            }
            else{
                //exposition
                System.out.println("Exposition");
                activites.add(new Exposition());
            }
            activites.get(i).saisie();
        }
        for (Activite a: activites) {
            System.out.println(a);
        }
    }
}
