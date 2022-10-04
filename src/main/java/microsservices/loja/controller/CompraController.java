package microsservices.loja.controller;

import lombok.RequiredArgsConstructor;
import microsservices.loja.rest.request.CompraDTO;
import microsservices.loja.service.CompraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
@RequiredArgsConstructor
public class CompraController {
    private final CompraService compraService;

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compra) {
        compraService.realizeCompra(compra);
    }
}
