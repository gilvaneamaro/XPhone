package model.dao;

import javafx.scene.control.Alert;
import model.DatabaseConnection;
import model.dto.ClienteDTO;
import utils.Alerts;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ClienteDAO {
    private Connection connection;
    public void addCliente(ClienteDTO clienteDTO) throws SQLException {
        PreparedStatement stmt= null;
        try{
            connection = DatabaseConnection.connection();
            String sql = "INSERT INTO cliente(nomeCliente, emailCliente, cpfCliente, telefoneCliente) VALUES(?, ?, ?, ?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1,clienteDTO.getNomeCliente());
            stmt.setString(2,clienteDTO.getEmailCliente());
            stmt.setString(3, clienteDTO.getCpfCliente());
            stmt.setString(4, clienteDTO.getTelefoneCliente());
            stmt.executeUpdate();
        }
        catch (SQLException e){
            Alerts.showAlert("Erro no banco de dados","","Erro ao tentar incluir cliente no banco de dado:  "+e.getMessage(), Alert.AlertType.ERROR);
        }
        catch ( ClassNotFoundException e){
            Alerts.showAlert("Erro banco de dados", "Classe não encontrada", "msg: "+e.getMessage(), Alert.AlertType.ERROR);
        }
        finally {
            if(connection!= null) connection.close();
        }
    }
}
