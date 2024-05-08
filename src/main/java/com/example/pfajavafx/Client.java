package com.example.pfajavafx;
import java.time.LocalDate;

public class Client {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String numTel;
    // Autres champs si nécessaire

    public Client(String id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public Client(String id, String nom, String prenom, String email, String numTel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numTel = numTel;
    }

    // Ajout de la méthode getEmail()
    public String getEmail() {
        return email;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
}
