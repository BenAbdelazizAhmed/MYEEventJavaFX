package com.example.pfajavafx;

import java.util.List;

public class User {
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String numTel;
    private String genre;
    private String image;
    // Les autres attributs nécessaires peuvent être ajoutés ici

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // Méthode pour récupérer les réservations associées à cet utilisateur
    public List<Reservation> getReservations() {
        // Implémentez la logique pour récupérer les réservations associées à cet utilisateur
        // Assurez-vous d'avoir une méthode dans votre système pour récupérer les réservations par l'ID de l'utilisateur
        // Retournez la liste des réservations associées à cet utilisateur
        return null;
    }
}
