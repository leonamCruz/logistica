package tech.leonam.logistica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.leonam.logistica.model.ProgressoEntidade;

@Repository
public interface ProgressoRepositorio extends JpaRepository<ProgressoEntidade, Long> {
}
