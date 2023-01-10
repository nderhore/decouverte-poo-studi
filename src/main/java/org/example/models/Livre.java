package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Livre {

    private int id_livre;

    private String titre;

    private String resume;

    private Editeur editeur;

    private List<Auteur> auteurList;

    public Livre(int id_livre, String titre, String resume, Editeur editeur, List<Auteur> auteurList) {
        this.id_livre = id_livre;
        this.titre = titre;
        this.resume = resume;
        this.editeur = editeur;
        this.auteurList = auteurList;
    }

    public Livre() {
        this.auteurList = new ArrayList<Auteur>();
    }

    public int getId_livre() {
        return id_livre;
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Editeur getEditeur() {
        return editeur;
    }

    public void setEditeur(Editeur editeur) {
        this.editeur = editeur;
    }

    @Override
    public String toString(){

        String auteurs = "";
        for(Auteur auteur : auteurList){
            auteurs = auteurs + auteur.toString() + ",";
        }
        return "Je possede le titre " + this.titre + ", qui traite de " + this.resume +"," +
                " edité par " + this.editeur + ", écrit par " + auteurs;
    }
}
