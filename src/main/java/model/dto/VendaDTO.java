package model.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendaDTO {
    private FuncionarioDTO funcionario;
    private List<ProdutoDTO> listaProdutos = new ArrayList<>();
    private ClienteDTO cliente;
    private LocalDate dataQuitacao;
    private OrdemDeServicoDTO ordemDeServico;

    public VendaDTO() {
    }

    public VendaDTO(FuncionarioDTO funcionario, List<ProdutoDTO> listaProdutos, ClienteDTO cliente, LocalDate dataQuitacao, OrdemDeServicoDTO ordemDeServico) {
        this.funcionario = funcionario;
        this.listaProdutos = listaProdutos;
        this.cliente = cliente;
        this.dataQuitacao = dataQuitacao;
        this.ordemDeServico = ordemDeServico;
    }

    public FuncionarioDTO getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioDTO funcionario) {
        this.funcionario = funcionario;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(LocalDate dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public OrdemDeServicoDTO getOrdemDeServico() {
        return ordemDeServico;
    }

    public void setOrdemDeServico(OrdemDeServicoDTO ordemDeServico) {
        this.ordemDeServico = ordemDeServico;
    }
    public void addProdutoVenda(ProdutoDTO produto){
        listaProdutos.add(produto);
    }

    public void removeProdutoVenda(ProdutoDTO produtoDTO){
        listaProdutos.remove(produtoDTO);
    }
    public List<ProdutoDTO> listarProdutos(){
        return listaProdutos;
    }

    public  List<ProdutoDTO> buscarProduto(ProdutoDTO produtoBuscado){
        List<ProdutoDTO> itensEncontrados = new ArrayList<>();
        for(ProdutoDTO produto: listaProdutos){
            if(produto.getNomeProduto().startsWith(produtoBuscado.getNomeProduto())){
                itensEncontrados.add(produto);
            }
        }
        return itensEncontrados;
    }
}
