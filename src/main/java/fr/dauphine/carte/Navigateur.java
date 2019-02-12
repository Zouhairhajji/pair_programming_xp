/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

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
    private Coffre coffre;
    private Carte carte;

    public Navigateur(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.coffre = new Coffre();
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

    public void addToCoffre(String element) {
        this.coffre.getElements().add(element);
    }

    public void giveTo(String name, Navigateur otherBrowser) {
        List<String> toGive = this.coffre
                .getElements()
                .stream()
                .filter(s -> s.equalsIgnoreCase(name))
                .collect(Collectors.toList());
        this.coffre.getElements().removeIf(s -> s.equalsIgnoreCase(name));
        toGive.forEach(s -> otherBrowser.addToCoffre(s)  );
    }

}
