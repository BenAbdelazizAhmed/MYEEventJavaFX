package com.example.pfajavafx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Méthode pour établir une connexion à la base de données
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/chacha";
        String utilisateur = "root";
        String motDePasse = "";

        // Charger le pilote JDBC
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC MySQL introuvable");
            e.printStackTrace();
        }

        // Établir la connexion
        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("Connexion à la base de données établie");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données");
            e.printStackTrace();
            throw e;
        }

        return connexion;
    }

    // Méthode pour fermer une connexion à la base de données
    public static void closeConnection(Connection connexion) {
        if (connexion != null) {
            try {
                connexion.close();
                System.out.println("Connexion à la base de données fermée");
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture de la connexion à la base de données");
                e.printStackTrace();
            }
        }
    }
}
