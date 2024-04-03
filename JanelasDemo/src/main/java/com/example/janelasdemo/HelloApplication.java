package com.example.janelasdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private TextField agenciaField;
    private TextField contaField;
    private TextField titularField;
    private TextField saldoField;
    private TextField valorField;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Conta Bancária");

        agenciaField = new TextField();
        agenciaField.setPromptText("Agência");

        contaField = new TextField();
        contaField.setPromptText("Conta");

        titularField = new TextField();
        titularField.setPromptText("Titular");

        saldoField = new TextField();
        saldoField.setPromptText("Saldo");

        valorField = new TextField();
        valorField.setPromptText("Valor");

        Button criarContaButton = new Button("Criar Conta");
        Button sacarButton = new Button("Sacar");
        Button depositarButton = new Button("Depositar");

        criarContaButton.setOnAction(event -> criarConta());

        sacarButton.setOnAction(event -> sacar());
        depositarButton.setOnAction(event -> depositar());

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(agenciaField, contaField, titularField, saldoField, criarContaButton, valorField, new HBox(10, sacarButton, depositarButton));

        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }

    private void criarConta() {
        // Implemente a lógica para criar uma conta bancária aqui
        System.out.println("Conta criada com sucesso!");
    }

    private void sacar() {
        System.out.println("Valor sacado com sucesso!");
    }

    private void depositar() {
        System.out.println("Valor depositado com sucesso!");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
