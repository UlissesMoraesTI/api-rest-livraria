package br.com.guimatec.livraria.repository;

import br.com.guimatec.livraria.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository <Livro, Long> {
    List<Livro> findByAutorIgnoreCaseContaining(String autor);
}
