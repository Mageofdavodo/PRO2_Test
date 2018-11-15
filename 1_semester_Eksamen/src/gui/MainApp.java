package gui;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import models.PraktikVirksomhed;
import service.Service;

public class MainApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Administration af praktikvirksomheder");
        GridPane pane = new GridPane();
        Service.initStorage();
        initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    private TextField txfNavn, txfFeedback, txfKontrakt;
    private ListView<PraktikVirksomhed> lvwVirksomheder;
    private Label lblError;

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        Label lblVirksomhedInfo = new Label("Praktikvirksomhed:");
        pane.add(lblVirksomhedInfo, 1, 0);

        Label lblNavn = new Label("Navn:");
        pane.add(lblNavn, 0, 1);

        txfNavn = new TextField();
        pane.add(txfNavn, 1, 1);

        Label lblFeedback = new Label("Feedback:");
        pane.add(lblFeedback, 0, 2);

        txfFeedback = new TextField();
        pane.add(txfFeedback, 1, 2);

        Label lblKontrakt = new Label("Kontrakt:");
        pane.add(lblKontrakt, 0, 3);

        txfKontrakt = new TextField();
        pane.add(txfKontrakt, 1, 3);

        Label lblVirksomheder = new Label("Praktikvirksomheder");
        pane.add(lblVirksomheder, 2, 0);

        this.lvwVirksomheder = new ListView<>();
        this.lvwVirksomheder.setPrefSize(300, 250);
        pane.add(lvwVirksomheder, 2, 1, 1, 8);
        this.lvwVirksomheder.getItems().setAll(Service.getVirksomheder());

        ChangeListener<PraktikVirksomhed> listenerVirksomhed = (ov, oldVirksomhed,
                newVirksomed) -> updateWhenSelected();
        this.lvwVirksomheder.getSelectionModel().selectedItemProperty().addListener(listenerVirksomhed);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 0, 6);
        btnAdd.setOnAction(event -> addAction());

        Button btnUpdate = new Button("Update");
        pane.add(btnUpdate, 0, 7);
        btnUpdate.setOnAction(event -> updateAction());

        this.lblError = new Label();
        pane.add(lblError, 2, 9);

    }

    private void updateWhenSelected() {
        PraktikVirksomhed virksomhed = this.lvwVirksomheder.getSelectionModel().getSelectedItem();
        if (virksomhed != null) {
            this.txfNavn.setText(virksomhed.getNavn());
            this.txfFeedback.setText(virksomhed.getFeedback());
            this.txfKontrakt.setText(virksomhed.getKontaktPerson());
        } else {
            clearInfo();
        }
    }

    private void addAction() {
        String navn = this.txfNavn.getText().trim();
        String feedback = this.txfFeedback.getText().trim();
        String kontakt = this.txfKontrakt.getText().trim();

        if ((!navn.equals("")) && (!feedback.equals("")) && (!kontakt.equals(""))) {
            Service.createPraktikVirksomhed(navn, feedback, kontakt);
            labelCreate();
            this.lvwVirksomheder.getItems().setAll(Service.getVirksomheder());
        } else {
            labelError();
            return;
        }
    }

    private void labelError() {
        this.lblError.setText("Manglende input");
    }

    private void labelCreate() {
        this.lblError.setText("");
    }

    private void updateAction() {
        PraktikVirksomhed virksomhed = this.lvwVirksomheder.getSelectionModel().getSelectedItem();
        if (virksomhed != null) {
            String navn = this.txfNavn.getText().trim();
            String feedback = this.txfFeedback.getText().trim();
            String kontakt = this.txfKontrakt.getText().trim();
            if ((!navn.equals("")) && (!feedback.equals("")) && (!kontakt.equals(""))) {
                Service.updatePraktikVirksomhed(navn, feedback, kontakt, virksomhed);
                labelCreate();
                this.lvwVirksomheder.getItems().setAll(Service.getVirksomheder());
            } else {
                labelError();
                return;
            }
        } else {
            this.lblError.setText("Ingen virksomhed valgt");
            return;
        }
    }

    private void clearInfo() {
        this.txfNavn.clear();
        this.txfFeedback.clear();
        this.txfKontrakt.clear();
    }
}
