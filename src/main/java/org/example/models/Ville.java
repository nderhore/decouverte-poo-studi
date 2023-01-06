package org.example.models;

import java.util.List;

public class Ville {

    private int id_ville;

    private String nom;

    private String pays;

    private String code_postal;

    private List<Bibliotheque> bibliothequeList;

    public Ville(int id_ville, String nom, String pays, String code_postal, List<Bibliotheque> bibliothequeList) {
        this.id_ville = id_ville;
        this.nom = nom;
        this.pays = pays;
        this.code_postal = code_postal;
        this.bibliothequeList = bibliothequeList;
    }

    public List<Bibliotheque> getBibliothequeList() {
        return bibliothequeList;
    }

    public void setBibliothequeList(List<Bibliotheque> bibliothequeList) {
        this.bibliothequeList = bibliothequeList;
    }

    public int getId_ville() {
        return id_ville;
    }

    public void setId_ville(int id_ville) {
        this.id_ville = id_ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }
}
