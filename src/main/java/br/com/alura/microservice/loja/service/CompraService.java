package br.com.alura.microservice.loja.service;

import br.com.alura.microservice.loja.dto.CompraDTO;
import br.com.alura.microservice.loja.dto.InfoFornecedorDTO;
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
