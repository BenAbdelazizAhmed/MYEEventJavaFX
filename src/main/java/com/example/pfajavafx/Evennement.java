package com.example.pfajavafx;

import java.time.LocalDate;


public class Evennement {
    private int id;
    private String titre;
    private LocalDate dateEvent;
    private String heureDebutEvent;
    private String heureFinEvent;
    private int nbInvites;
    private String gouvernerat;
    private String ville;
    private String adresseExacte;
    private int clientId;

    // Constructeur
    public Evennement(int id, String titre, LocalDate dateEvent, String heureDebutEvent, String heureFinEvent, int nbInvites, String gouvernerat, String ville, String adresseExacte, int clientId) {
        this.id = id;
        this.titre = titre;
        this.dateEvent = dateEvent;
        this.heureDebutEvent = heureDebutEvent;
        this.heureFinEvent = heureFinEvent;
        this.nbInvites = nbInvites;
        this.gouvernerat = gouvernerat;
        this.ville = ville;
        this.adresseExacte = adresseExacte;
        this.clientId = clientId;
    }

    // Getters et setters (ou méthodes pour accéder et modifier les attributs)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(LocalDate dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getHeureDebutEvent() {
        return heureDebutEvent;
    }

    public void setHeureDebutEvent(String heureDebutEvent) {
        this.heureDebutEvent = heureDebutEvent;
    }

    public String getHeureFinEvent() {
        return heureFinEvent;
    }

    public void setHeureFinEvent(String heureFinEvent) {
        this.heureFinEvent = heureFinEvent;
    }

    public int getNbInvites() {
        return nbInvites;
    }

    public void setNbInvites(int nbInvites) {
        this.nbInvites = nbInvites;
    }

    public String getGouvernerat() {
        return gouvernerat;
    }

    public void setGouvernerat(String gouvernerat) {
        this.gouvernerat = gouvernerat;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresseExacte() {
        return adresseExacte;
    }

    public void setAdresseExacte(String adresseExacte) {
        this.adresseExacte = adresseExacte;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}
