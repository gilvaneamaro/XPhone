package com.xphone.xphone;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.dao.ClienteDAO;
import model.dto.ClienteDTO;
import utils.Alerts;

import java.sql.SQLException;

public class CadastroController extends LoadScreen {
    @FXML
    public MenuItem cadastroClientes;
    @FXML
    public TextField cpf;
    @FXML
    public TextField nomeCliente;
    @FXML
    public TextField contatoCliente;
    @FXML
    public TextField emailCliente;
    @FXML
    public TextField marcaAparelho;
    @FXML
    public TextField modeloAparelho;
    @FXML
    public CheckBox liga;
    @FXML
    public CheckBox molhou;
    @FXML
    public CheckBox telaQuebrada;
    @FXML
    public DatePicker dataEntrega;
    @FXML
    public TextArea descricaoOS;
    @FXML
    public ComboBox funcionarioComboBox;
    @FXML
    public Button criarOS;
    @FXML
    public void onCriarOSbutton(ActionEvent event) throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteDTO cliente = new ClienteDTO(nomeCliente.getText(),emailCliente.getText(),cpf.getText(),contatoCliente.getText(), 1L);

        clienteDAO.addCliente(cliente);


        //Alerts.showAlert("Sucesso!","","Cliente cadastrado com sucesso!", Alert.AlertType.INFORMATION);

    }

}
