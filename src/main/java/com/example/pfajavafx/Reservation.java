package com.example.pfajavafx;

import java.time.LocalDate;

public class Reservation {
    private String id;
    private String status;
    private String heureDebut;
    private String heureFin;
    private LocalDate dateReservation;
    private double avanceClient;
    private Offre offre; // Changer le nom de la variable
    private Client client;

    public Reservation(String id, String status, String heureDebut, String heureFin, LocalDate dateReservation, double avanceClient, Offre offre, Client client) {
        this.id = id;
        this.status = status;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.dateReservation = dateReservation;
        this.avanceClient = avanceClient;
        this.offre = offre;
        this.client = client;
    }
    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public double getAvanceClient() {
        return avanceClient;
    }

    public void setAvanceClient(double avanceClient) {
        this.avanceClient = avanceClient;
    }

    public Offre getOffre() {
        return offre;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
