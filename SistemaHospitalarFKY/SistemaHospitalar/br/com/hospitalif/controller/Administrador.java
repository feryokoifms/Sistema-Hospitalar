<?xml version="1.0" encoding="UTF-8"?>

<?import java.lang.*?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.text.*?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>

<Pane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="450.0" prefWidth="600.0" style="-fx-background-color: #00688B;" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="br.com.hosptitalif.controller.Administrador">
   <children>
      <Text fill="WHITE" layoutX="206.0" layoutY="92.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Administrador">
         <font>
            <Font size="30.0" />
         </font>
      </Text>
      <Button fx:id="btnSalvar" layoutX="182.0" layoutY="232.0" mnemonicParsing="false" onAction="#cadastrarFuncionario" prefHeight="30.0" prefWidth="165.0" text="Cadastrar Funcionário">
         <font>
            <Font size="13.0" />
         </font>
      </Button>
      <Button fx:id="btnVoltar" layoutX="352.0" layoutY="232.0" mnemonicParsing="false" onAction="#voltar" prefHeight="30.0" prefWidth="67.0" text="Voltar" />
   </children>
</Pane>