package com.example.pfajavafx;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TransactionController {
    @FXML
    private TableView<Transaction> MainTable;

    @FXML
    private TextField Text_Searchbar;

    public void initialize() {
        initializeTableView();

        ObservableList<Transaction> transactionsDB = getAllTransactions();
        MainTable.setItems(transactionsDB);
    }

    public void initializeTableView() {
        TableColumn<Transaction, Integer> idColumn = new TableColumn<>("ID");
        TableColumn<Transaction, String> nomColumn = new TableColumn<>("Nom");
        TableColumn<Transaction, String> prenomColumn = new TableColumn<>("Prenom");
        TableColumn<Transaction, LocalDate> dateColumn = new TableColumn<>("Date");
        TableColumn<Transaction, Double> prixColumn = new TableColumn<>("Prix");
        TableColumn<Transaction, String> referenceColumn = new TableColumn<>("Reference");
        TableColumn<Transaction, String> statutColumn = new TableColumn<>("Statut");

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        prixColumn.setCellValueFactory(new PropertyValueFactory<>("prix"));
        referenceColumn.setCellValueFactory(new PropertyValueFactory<>("reference"));
        statutColumn.setCellValueFactory(new PropertyValueFactory<>("statut"));

        MainTable.getColumns().addAll(idColumn, nomColumn, prenomColumn, dateColumn, prixColumn, referenceColumn, statutColumn);
    }

    public ObservableList<Transaction> getAllTransactions() {
        ObservableList<Transaction> transactions = FXCollections.observableArrayList();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM transactions");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                LocalDate date = resultSet.getDate("date").toLocalDate();
                double prix = resultSet.getDouble("prix");
                String reference = resultSet.getString("reference");
                String statut = resultSet.getString("statut");

                Transaction transaction = new Transaction(id, nom, prenom, date, prix, reference, statut);
                transactions.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return transactions;
    }

    public static Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/chacha";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url, username, password);
    }
}
