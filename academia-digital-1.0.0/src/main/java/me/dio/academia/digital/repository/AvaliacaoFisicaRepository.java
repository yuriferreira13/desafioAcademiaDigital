package me.dio.academia.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.AvaliacaoFisica;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {

	//@Query(value = "DELETE FROM tb_avaliacoes af " + "WHERE af.aluno_id = :id", nativeQuery = true)
	//void deleteAvaliacoesDeUmAluno(Long id);
}
