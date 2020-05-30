package modele;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Activite{
    protected String nom, lieu, publique;
    protected LocalDate date;
    protected static int nbActivite = 0;

    //constructeur (methiode qui porte le meme nom que la classe,
    //qui peut avoir des paramètres (surcharge), ne retourne rien meme pas void
    // qu'on peut utiliser pour initialiser les attributs de l'objet
    // qui s'execute juste apres la creation de l'objet
    public Activite(String nom, String lieu, String publique, LocalDate date){
        this.nom = nom;
        this.lieu = lieu;
        this.publique = publique;
        this.date = date;
        nbActivite++;
    }
    public Activite(LocalDate date, String nom, String lieu, String publique){
        this.nom = nom;
        this.lieu = lieu;
        this.publique = publique;
        this.date = date;
        nbActivite++;
    }
    public Activite(){
        nbActivite++;
    }
    public Activite(String nom){
        this.nom = nom;
        nbActivite++;
    }
    public Activite(String lieu, String publique){
        this.lieu = lieu;
        this.publique = publique;
        nbActivite++;
    }
    //getters/setters


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getPublique() {
        return publique;
    }

    public void setPublique(String publique) {
        this.publique = publique;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public static int getNbActivite() {
        return nbActivite;
    }



    @Override
    public String toString() {
        return "Activite "+nbActivite+" ["+nom+", "+lieu+", "+publique+", "+date+"]";
    }
    public void saisie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le nom de l'activité");
        nom = sc.nextLine();
        System.out.println("Saisir le lieu de l'activité");
        lieu = sc.nextLine();
        System.out.println("Saisir le publique destinataire de l'activité");
        publique = sc.nextLine();
        System.out.println("Saisir la date de l'activité");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = LocalDate.parse(sc.nextLine(), df);
    }

}
