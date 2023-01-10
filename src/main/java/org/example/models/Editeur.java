package org.example.models;

public class Editeur {

    private int id_editeur;

    private String nom;

    public Editeur(int id_editeur, String nom) {
        this.id_editeur = id_editeur;
        this.nom = nom;
    }

    public Editeur() {
    }

    public int getId_editeur() {
        return id_editeur;
    }

    public void setId_editeur(int id_editeur) {
        this.id_editeur = id_editeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString(){
        return this.nom;
    }
}
