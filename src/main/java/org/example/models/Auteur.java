package org.example.models;

public class Auteur {

    private int id_auteur;

    private String nom;

    private String prenom;

    public Auteur(int id_auteur, String nom, String prenom) {
        this.id_auteur = id_auteur;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId_auteur() {
        return id_auteur;
    }

    public void setId_auteur(int id_auteur) {
        this.id_auteur = id_auteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String toString(){
        return this.nom + " " + this.prenom;
    }
}
