/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import TP4.Client;
import TP4.LignePanier;
import TP4.Panier;
import TP4.Produit;
/**
 *
 * @author taniaolivia
 */
public class main {
    
    public static void main(String[] args)
    {
        Client client1 = new Client("Tania", "28 rue du cordouan");
        client1.afficherClient();
        
        Produit produit1 = new Produit ("Pomme de terre", 5);
        Panier panier1 = new Panier(1);
        panier1.ajouterProduit("Pomme de terre", produit1, panier1);
        panier1.afficher();
        
        Produit produit2 = new Produit ("Pomme", 4);
        Panier panier2 = new Panier(2);
        panier2.ajouterProduit("Pomme", produit2, panier2);
        panier2.afficher();
    }
}
