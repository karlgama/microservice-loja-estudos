package microsservices.loja.service;

import microsservices.loja.rest.request.CompraDTO;
import microsservices.loja.rest.response.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {
    public void realizeCompra(CompraDTO compra) {
        var url = "http://fornecedor/info/" + compra.getEndereco().getEstado();
        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange(url,
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());
    }
}
