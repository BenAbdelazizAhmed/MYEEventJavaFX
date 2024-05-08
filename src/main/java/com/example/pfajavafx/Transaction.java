package com.example.pfajavafx;
import java.time.LocalDate;
import javafx.beans.property.*;


public class Transaction {
    private final IntegerProperty id;
    private final StringProperty nom;
    private final StringProperty prenom;
    private final ObjectProperty<LocalDate> date;
    private final DoubleProperty prix;
    private final StringProperty reference;
    private final StringProperty statut;

    public Transaction(int id, String nom, String prenom, LocalDate date, double prix, String reference, String statut) {
        this.id = new SimpleIntegerProperty(id);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.date = new SimpleObjectProperty<>(date);
        this.prix = new SimpleDoubleProperty(prix);
        this.reference = new SimpleStringProperty(reference);
        this.statut = new SimpleStringProperty(statut);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public LocalDate getDate() {
        return date.get();
    }

    public void setDate(LocalDate date) {
        this.date.set(date);
    }

    public double getPrix() {
        return prix.get();
    }

    public void setPrix(double prix) {
        this.prix.set(prix);
    }

    public String getReference() {
        return reference.get();
    }

    public void setReference(String reference) {
        this.reference.set(reference);
    }

    public String getStatut() {
        return statut.get();
    }

    public void setStatut(String statut) {
        this.statut.set(statut);
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public ObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public DoubleProperty prixProperty() {
        return prix;
    }

    public StringProperty referenceProperty() {
        return reference;
    }

    public StringProperty statutProperty() {
        return statut;
    }
}
