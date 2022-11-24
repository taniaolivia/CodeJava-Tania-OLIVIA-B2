/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4;
/**
 *
 * @author taniaolivia
 */
public class LignePanier {
    
    private int quantite;
    private float prixHT;
    private Produit produit;
    private Panier panier;
    
    public LignePanier()
    {
        this.quantite = 0;
        this.prixHT = 0;
        produit = new Produit();
    }
    public LignePanier(Produit produit, Panier panier)
    {
        this.quantite++;
        this.produit = produit;
        this.panier = panier;
    }
    
    public boolean verifierPresence(String libelleProduitAjouter)
    {
        if(this.produit.getLibelle().equals(libelleProduitAjouter))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void ajouterQuantite()
    {
        this.quantite++;
        this.prixHT = (float)(quantite * produit.getPrixHT());
    }
}
