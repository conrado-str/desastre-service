package br.com.fiap.desastres.repository;

import br.com.fiap.desastres.model.Desastre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DesastreRepository extends JpaRepository<Desastre, Long> {

    public Desastre findByNome(String nome);

    public List<Desastre> listarDesastres();
}
