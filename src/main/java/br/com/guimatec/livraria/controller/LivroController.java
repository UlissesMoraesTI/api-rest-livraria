package br.com.guimatec.livraria.controller;

import br.com.guimatec.livraria.entity.Livro;
import br.com.guimatec.livraria.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Livro salvar(@RequestBody Livro livro){
        return livroService.salvar(livro);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Livro> listaLivro() {
        return livroService.listaLivro();
    }

    /*/@GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Livro buscarLivroPorId(@PathVariable("id") Long id){
        return livroService.buscarPorId(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado"));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerLivro(@PathVariable("id") Long id) {
        livroService.buscarPorId(id)
                .map(livro -> {
                    livroService.removerPorId(livro.getId());
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado"));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarLivro(@PathVariable("id") Long id, @RequestBody Livro livro) {
        livroService.buscarPorId(id)
                .map(livroBase -> {
                    modelMapper.map(livro, livroBase);
                    livroService.salvar(livroBase);
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado."));
    } */


}
