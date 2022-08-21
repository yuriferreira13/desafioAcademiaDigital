package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

	@NotNull(message = "Preencha o campo corretamente.")
	@Positive(message = "O Id do aluno precisa ser positivo.")
	private Long alunoId;

	@NotNull(message = "Preencha o campo corretamente.")
	@Positive(message = "O '${validatedValue}' do aluno precisa ser positivo.")
	private double peso;

	@NotNull(message = "Preencha o campo corretamente.")
	@Positive(message = "A '${validatedValue}' do aluno precisa ser positiva.")
	private double altura;
}
