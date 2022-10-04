package microsservices.loja.rest.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDaCompraDTO {
    private long id;
    private int quantidade;
}
