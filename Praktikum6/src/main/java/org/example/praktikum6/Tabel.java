package org.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Tabel extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String> kolomNim = new TableColumn<>("NIM");
        kolomNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("Nama");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolomNim);
        tabel.getColumns().add(kolomNama);
        tabel.getItems().add(new Mahasiswa(1, "22108170", "Kale"));
        tabel.getItems().add(new Mahasiswa(2, "22108171", "Epen"));
        tabel.getItems().add(new Mahasiswa(3, "22108172", "Fahrul"));
        tabel.getItems().add(new Mahasiswa(4, "22108173", "Fadel"));
        tabel.getItems().add(new Mahasiswa(5, "22108174", "Alif"));
        tabel.getItems().add(new Mahasiswa(6, "22108175", "Ryan"));
        tabel.getItems().add(new Mahasiswa(7, "22108176", "Aldy"));
        tabel.getItems().add(new Mahasiswa(8, "22108177", "Ghani"));
        tabel.getItems().add(new Mahasiswa(9, "22108178", "Rozi"));
        tabel.getItems().add(new Mahasiswa(10, "22108179", "Syafiq"));
        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}