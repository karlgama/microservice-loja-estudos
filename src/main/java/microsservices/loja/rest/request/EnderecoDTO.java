package microsservices.loja.rest.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDTO {
    private String rua;
    private int numero;
    private String estado;
}
