package com.example.pfajavafx;
import java.util.List;

public class Entrepreneur extends User {
    private String nomProjet;
    private String categorie;
    private String gouvernerat;
    private String ville;
    private String adresseExacte;
    private String numTelPro;
    private double latitude;
    private double longitude;
    private int userId; // Changer le type de variable pour correspondre à votre implémentation

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
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

    public String getNumTelPro() {
        return numTelPro;
    }

    public void setNumTelPro(String numTelPro) {
        this.numTelPro = numTelPro;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Méthode pour récupérer les salles de fête associées à cet entrepreneur
    public List<SalleFete> getSallesFete() {
        // Implémentez la logique pour récupérer les salles de fête associées à cet entrepreneur
        // Assurez-vous d'avoir une méthode dans votre système pour récupérer les salles de fête par l'ID de l'entrepreneur
        // Retournez la liste des salles de fête associées à cet entrepreneur
        return null;
    }
}
