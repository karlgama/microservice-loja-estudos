package br.com.alura.microservice.fornecedor.loja.service;

import br.com.alura.microservice.fornecedor.loja.dto.CompraDTO;
import br.com.alura.microservice.fornecedor.loja.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class CompraService {

    public void realizaCompra(CompraDTO compraDTO) {
        //feign client seria melhor
        RestTemplate client = new RestTemplate();
        var exchange = client.exchange("http://localhost:8081/info/"+compraDTO.getEndereco().getEstado(),
        HttpMethod.GET, null, InfoFornecedorDTO.class);
    }
}
