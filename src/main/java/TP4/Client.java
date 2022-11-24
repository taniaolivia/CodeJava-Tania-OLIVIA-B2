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
public class Client {
    
    private String nom;
    private String adresse;
    
    public Client(String nom, String adresse)
    {
        this.nom = nom;
        this.adresse = adresse;
    }
    
    public String getNom()
    {
        return nom;
    }

    public String getAdresse()
    {
        return adresse;
    }
    public void afficherClient()
    {
        System.out.println("Nom : " + getNom());
        System.out.println("Adresse : " + getAdresse());
    }
}
