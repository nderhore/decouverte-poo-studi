package org.example;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.example.models.*;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Creation d'une instance de ville
        Ville maVille = new Ville(1,"MaVille","France","93000");
        Ville maVilleDeux = new Ville(2,"baptiste","France","93000");

        //creation d'une instance de bibliotheque
        Bibliotheque maBibliotheque = new Bibliotheque(1,new ArrayList<>());

        //Creation d'un editeur
        Editeur editeur = new Editeur(1,"Hachette");

        //Creation d'un auteur
        Auteur auteur = new Auteur(1,"v","baptiste");
        ArrayList<Auteur> auteurs = new ArrayList<>();
        auteurs.add(auteur);

        Livre livre = new Livre(1,"FC POO","live POO",editeur,auteurs);

        maBibliotheque.add_livre(livre);

        maVille.addBibliotheque(maBibliotheque);

        System.out.println(maVille);

        //Je crée une instance BookDaoImpl qui est une version du contrat BookDao
        BookDao bookDao = new BookDaoImpl();

        //J'ajoute un livre
        bookDao.createBook(livre);
        for(Livre livreUn : bookDao.getAllBook()){
            System.out.println(livreUn);
        }

        bookDao.deleteBook(livre.getId_livre());

    }
}
