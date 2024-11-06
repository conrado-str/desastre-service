package br.com.fiap.desastres.service;

import br.com.fiap.desastres.model.Desastre;
import br.com.fiap.desastres.repository.DesastreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DesastreService {


    @Autowired
    private DesastreRepository desastreRepository;

    public Desastre adicionar(Desastre desastre){
        return desastreRepository.save(desastre);
    }

    public Desastre buscarPorNome(String nome){
        Optional<Desastre> desastreOptional = Optional.ofNullable(desastreRepository.findByNome(nome));

        if(desastreOptional.isPresent()){
            return desastreOptional.get();
        }else {
            throw new RuntimeException("Desastre nao encontrado");
        }
    }

    public List<Desastre> listarDesastres(){
        return desastreRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Desastre> desastreOptional = desastreRepository.findById(id);

        if (desastreOptional.isPresent()){
            desastreRepository.delete(desastreOptional.get());
        } else{
            throw new RuntimeException("Desastre nao encontrado");
        }
    }

    public Desastre atualizar(Desastre desatre){
        Optional<Desastre> alertaOptional = desastreRepository.findById(desatre.getId());

        if (alertaOptional.isPresent()){
            return desastreRepository.save(desatre);
        } else{
            throw new RuntimeException("Nao existe esse alerta");
        }
    }

}
