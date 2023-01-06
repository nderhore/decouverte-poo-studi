package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private int id_bibliotheque;

    private List<Livre> livreList;

    public Bibliotheque(int id_bibliotheque, List<Livre> livreList) {
        this.id_bibliotheque = id_bibliotheque;
        this.livreList = livreList;
    }

    public Bibliotheque() {
        this.livreList = new ArrayList<Livre>();
    }

    public int getId_bibliotheque() {
        return id_bibliotheque;
    }

    public void setId_bibliotheque(int id_bibliotheque) {
        this.id_bibliotheque = id_bibliotheque;
    }

    public List<Livre> getLivreList() {
        return livreList;
    }

    public void setLivreList(List<Livre> livreList) {
        this.livreList = livreList;
    }
}
