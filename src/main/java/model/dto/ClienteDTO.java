package model.dto;

public class ClienteDTO {
    private String nomeCliente;
    private String emailCliente;
    private String cpfCliente;
    private String telefoneCliente;

    public ClienteDTO() {
    }

    public ClienteDTO(String nomeCliente, String emailCliente, String cpfCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getMail() {
        return emailCliente;
    }

    public void setMail(String mail) {
        this.emailCliente = mail;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
}

