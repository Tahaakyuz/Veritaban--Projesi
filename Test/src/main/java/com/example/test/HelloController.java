package com.example.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Button b_cagri;

    @FXML
    private Button b_itiraz;

    @FXML
    private Button b_prim;

    @FXML
    private AnchorPane pCagri;

    @FXML
    private AnchorPane pPrim;

    @FXML
    private AnchorPane pItiraz;

    @FXML
    private TableView<?> table1;

    @FXML
    private TableColumn<?, ?> test1;

    @FXML
    private TableColumn<?, ?> test2;

    @FXML
    public void cagri(ActionEvent event)
    {
        pItiraz.setVisible(false);
        pPrim.setVisible(false);
        pCagri.setVisible(true);

    }
    public void prim(ActionEvent event)
    {
        pCagri.setVisible(false);
        pItiraz.setVisible(false);
        pPrim.setVisible(true);
    }
    public void itiraz(ActionEvent event)
    {
        pPrim.setVisible(false);
        pCagri.setVisible(false);
        pItiraz.setVisible(true);

    }
}
