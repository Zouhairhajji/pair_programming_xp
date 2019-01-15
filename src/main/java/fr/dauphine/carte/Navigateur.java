/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author zouhairhajji
 */
@Getter
@Setter
public class Navigateur {

    private String nom;
    private String prenom;
    private int age;
    private List<ExchangeHistory> coffre;
    private Carte carte;

    public Navigateur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.coffre = new ArrayList<>();
        this.carte = new Carte(this);
    }

    public void echangerCarte(Navigateur navigateur) throws Exception {
        if (navigateur.getCarte() == null || this.carte == null) {
            throw new Exception("C'est une arnaque, il faudrait que les deux partenaires pocedent une cartes");
        }

        Carte carteTmp = navigateur.getCarte();
        navigateur.setCarte(this.carte);
        this.carte = carteTmp;
    }

    public void addCoffre(String ble, long montant) {
        this.coffre.add(new ExchangeHistory(ble, montant));
    }

    public void giveTo(String name, Navigateur otherBrowser) {
        List<ExchangeHistory> elements = this.coffre
                .stream()
                .filter(s -> s.getNom().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        this.coffre.removeIf(s -> s.getNom().equalsIgnoreCase(name));
        elements.forEach(s -> otherBrowser.addCoffre(s.getNom(), s.getMontant()));
    }

}
