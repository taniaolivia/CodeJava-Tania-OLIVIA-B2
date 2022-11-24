/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author taniaolivia
 */
public class Panier {
    
    private int numero;
    private LocalDateTime date;
    private float prixTotal;
    private ArrayList <LignePanier> listeLignePanier = new ArrayList <LignePanier>();
    
    public Panier(int numero)
    {
        this.numero = numero;
        this.date = LocalDateTime.now();
        prixTotal = 0;
    }
    
    public void ajouterLigne(Produit produit, Panier panier)
    {
        LignePanier ligne = new LignePanier(produit, panier);
        listeLignePanier.add(ligne);
    }
    
    public void ajouterProduit(String libelle, Produit produit, Panier panier)
    {
        if(listeLignePanier.size() > 1)
        {
            LignePanier ligne = new LignePanier();
            for(int leI = 0; leI <= listeLignePanier.size(); leI++)
            {
                ligne = listeLignePanier.get(leI);
                boolean laVerification = ligne.verifierPresence(libelle);
                System.out.println(laVerification);
                if(laVerification == true)
                {
                    ligne.ajouterQuantite();
                    leI = listeLignePanier.size();
                }
                
                if(laVerification == false && leI == listeLignePanier.size())
                {
                    ajouterLigne(produit, panier);
                }
            }
        }
        else
        {
            ajouterLigne(produit, panier);
        }
    }

    public void afficher()
    {
        System.out.println("Votre panier " + numero + " contient " + listeLignePanier + " ligne");
    }
}
