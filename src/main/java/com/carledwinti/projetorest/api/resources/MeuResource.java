package com.carledwinti.projetorest.api.resources;

import com.carledwinti.projetorest.api.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class MeuResource {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente obterDadosCliente(@PathVariable Long id){
        System.out.println(String.format("Id recebido via url: %d", id));
        return new Cliente("Denvers", "123.456.789-01");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        //service.save(cliente);
        return cliente;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        System.out.println(String.format("Id recebido via url: %d", id));
        //service.buscarPorId(id);
        //service.delete(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente obterDadosCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        System.out.println(String.format("Id recebido via url: %d", id));
        //service.buscarPorId(id);
        //service.update(id);
        return cliente;
    }


}
