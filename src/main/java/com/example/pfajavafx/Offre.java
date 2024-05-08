package com.example.pfajavafx;
import java.time.LocalDate;

public class Offre {
    private String id;
    private String titre;
    private String description;
    private double prixInitial;
    private double prixRemise;
    private LocalDate dateFinRemise;
    private String entrepreneur_id;
    public Offre(String id, String titre, String description, double prixInitial, double prixRemise, LocalDate dateFinRemise) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.prixInitial = prixInitial;
        this.prixRemise = prixRemise;
        this.dateFinRemise = dateFinRemise;
    }

    public Offre(String id, String titre, String description, double prixInitial, double prixRemise, LocalDate dateFinRemise, String entrepreneur_id) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.prixInitial = prixInitial;
        this.prixRemise = prixRemise;
        this.dateFinRemise = dateFinRemise;
        this.entrepreneur_id = entrepreneur_id;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrixInitial() {
        return prixInitial;
    }

    public void setPrixInitial(double prixInitial) {
        this.prixInitial = prixInitial;
    }

    public double getPrixRemise() {
        return prixRemise;
    }

    public void setPrixRemise(double prixRemise) {
        this.prixRemise = prixRemise;
    }

    public LocalDate getDateFinRemise() {
        return dateFinRemise;
    }

    public void setDateFinRemise(LocalDate dateFinRemise) {
        this.dateFinRemise = dateFinRemise;
    }

    public String getEntrepreneur_id() {
        return entrepreneur_id;
    }

    public void setEntrepreneur_id(String entrepreneur_id) {
        this.entrepreneur_id = entrepreneur_id;
    }
}
