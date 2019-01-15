/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.carte;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author zouhairhajji
 */
@Getter
@Setter

@ToString
public class ExchangeHistory {

    private String nom;
    private Timestamp dateAchat;
    private long montant;

    public ExchangeHistory(String nom, Long montant) {
        this.dateAchat = new Timestamp(System.currentTimeMillis());
        this.nom = nom;
        this.montant = montant;
    }

}
