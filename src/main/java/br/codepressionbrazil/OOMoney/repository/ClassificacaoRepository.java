package br.codepressionbrazil.OOMoney.repository;

import br.codepressionbrazil.OOMoney.model.entities.Classificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificacaoRepository extends JpaRepository<Classificacao, Long> {

}
