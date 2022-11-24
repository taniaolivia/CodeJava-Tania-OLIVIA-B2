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
public class Produit {
    
    private String libelle;
    private float prixHT;
    
    public Produit(){
        
        libelle = "produit";
        prixHT = 0;
    }   
    
    public Produit(String libelle, float prixHT)
    {
        this.libelle = libelle;
        this.prixHT = prixHT;
    }
    
    public String getLibelle()
    {
        return libelle;
    }
    
    public float getPrixHT()
    {
        return prixHT;
    }
}
