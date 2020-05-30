package modele;

import java.time.LocalDate;
import java.util.Scanner;

public class Concert extends Activite {
    private String artiste, stade;
    private int prix;

    public Concert(String nom, String lieu, String publique, LocalDate date,
                   String artiste, String stade, int prix) {
        super(nom, lieu, publique, date);
        this.artiste = artiste;
        this.stade = stade;
        this.prix = prix;
    }

    public Concert() {
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getStade() {
        return stade;
    }

    public void setStade(String stade) {
        this.stade = stade;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Concert ["+super.toString()+", "+artiste+", "+stade+", "+prix+"]";
    }
    public void saisie(){
        Scanner sc = new Scanner(System.in);
        super.saisie();
        System.out.println("Saisir le nom de l'artiste");
        artiste = sc.nextLine();
        System.out.println("Saisir le nom du stade");
        stade = sc.nextLine();
        System.out.println("Saisir le prix du concert");
        prix = sc.nextInt();
    }
}
