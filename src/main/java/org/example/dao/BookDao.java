package org.example.dao;

import org.example.models.Livre;

import java.util.List;

public interface BookDao {

    //Creation d'un livre
    void createBook(Livre livre);

    //Mise à jour d'un livre
    void updateBook(Livre livre, int id_livre);

    //recuperation d'un livre par son ID
    Livre getBookById(int id_livre);

    //recuperation de tous les livres
    List<Livre> getAllBook();

    //Suppression d'un livre
    void deleteBook(int id_livre);
}
