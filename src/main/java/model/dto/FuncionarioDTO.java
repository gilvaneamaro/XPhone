package model.dto;

public class FuncionarioDTO {
    private String name;
    private String cpf;
    private Double vendas;
    private String password;

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(String name, String cpf, Double vendas, String password) {
        this.name = name;
        this.cpf = cpf;
        this.vendas = vendas;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
