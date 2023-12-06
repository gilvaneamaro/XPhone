package model.dto;

import java.time.LocalDate;

public class OrdemDeServicoDTO {
    private Integer numeroOS;
    private ClienteDTO clienteDTO;
    private AparelhoDTO aparelhoDTO;
    private LocalDate previsaoEntrega;
    private String descricao;

    public OrdemDeServicoDTO() {
    }

    public OrdemDeServicoDTO(Integer numeroOS, ClienteDTO clienteDTO, AparelhoDTO aparelhoDTO, LocalDate previsaoEntrega, String descricao) {
        this.numeroOS = numeroOS;
        this.clienteDTO = clienteDTO;
        this.aparelhoDTO = aparelhoDTO;
        this.previsaoEntrega = previsaoEntrega;
        this.descricao = descricao;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public AparelhoDTO getAparelhoDTO() {
        return aparelhoDTO;
    }

    public void setAparelhoDTO(AparelhoDTO aparelhoDTO) {
        this.aparelhoDTO = aparelhoDTO;
    }

    public LocalDate getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumeroOS() {
        return numeroOS;
    }
}
