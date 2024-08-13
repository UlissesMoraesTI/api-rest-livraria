package br.com.guimatec.livraria.service;

import br.com.guimatec.livraria.entity.Livro;
import br.com.guimatec.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> listaLivro() {
        return  livroRepository.findAll();
    }

    public Optional<Livro> buscarPorId(Long id) {
        return  livroRepository.findById(id);
    }

    public void removerPorId(Long id) {
        livroRepository.deleteById(id);
    }

}
