package model.dto;

public class ClienteDTO {
    private String nomeCliente;
    private String emailCliente;
    private String cpfCliente;
    private String telefoneCliente;
    private Long id;

    public ClienteDTO() {
    }

    public ClienteDTO(String nomeCliente, String emailCliente, String cpfCliente, String telefoneCliente, Long id) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
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

