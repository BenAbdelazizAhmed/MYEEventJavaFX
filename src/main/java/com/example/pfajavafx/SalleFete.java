package com.example.pfajavafx;

public class SalleFete extends Offre {
    private String surface;
    private int capacitePersonne;
    private String gouvernerat;
    private String ville;
    private String adresseExacte;
    private String description;
    private double latitude;
    private double longitude;
    private String optionInclus;
    private double prix;

    // Constructeur
    public SalleFete(String titre, String description, double prix) {
        super(titre, description, prix);
    }

    // Getters et setters
    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public int getCapacitePersonne() {
        return capacitePersonne;
    }

    public void setCapacitePersonne(int capacitePersonne) {
        this.capacitePersonne = capacitePersonne;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getOptionInclus() {
        return optionInclus;
    }

    public void setOptionInclus(String optionInclus) {
        this.optionInclus = optionInclus;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
