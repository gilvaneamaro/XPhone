package model.dto;

public class AparelhoDTO {
    private Long id;
    private String modelo;
    private String marca;
    private Boolean liga;
    private Boolean molhou;
    private Boolean telaQuebrada;
    public AparelhoDTO(){}



    public AparelhoDTO(String modelo, String marca, Boolean liga, Boolean molhou, Boolean telaQuebrada) {
        this.modelo = modelo;
        this.marca = marca;
        this.liga = liga;
        this.molhou = molhou;
        this.telaQuebrada = telaQuebrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getLiga() {
        return liga;
    }

    public void setLiga(Boolean liga) {
        this.liga = liga;
    }

    public Boolean getMolhou() {
        return molhou;
    }
    public Long getId() {
        return id;
    }
    public void setMolhou(Boolean molhou) {
        this.molhou = molhou;
    }

    public Boolean getTelaQuebrada() {
        return telaQuebrada;
    }

    public void setTelaQuebrada(Boolean telaQuebrada) {
        this.telaQuebrada = telaQuebrada;
    }
}
