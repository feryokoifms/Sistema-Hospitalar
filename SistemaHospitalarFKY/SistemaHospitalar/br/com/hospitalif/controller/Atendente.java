<?xml version="1.0" encoding="UTF-8"?>

<?import java.lang.*?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.text.*?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>

<Pane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="450.0" prefWidth="600.0" style="-fx-background-color: #00688B;" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="br.com.hosptitalif.controller.Atendente">
   <children>
      <Text fill="WHITE" layoutX="239.0" layoutY="108.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Atendente ">
         <font>
            <Font size="25.0" />
         </font>
      </Text>
      <Button fx:id="btnCadastrarpaciente" layoutX="225.0" layoutY="205.0" mnemonicParsing="false" onAction="#cadastrarPaciente" prefHeight="40.0" prefWidth="150.0" text="Cadastrar Paciente" />
      <Button fx:id="btnVoltar" layoutX="225.0" layoutY="274.0" mnemonicParsing="false" onAction="#voltar" prefHeight="40.0" prefWidth="150.0" text="Voltar" />
   </children>
</Pane>