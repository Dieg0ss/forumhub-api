package br.com.forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(@NotNull Long id, @NotBlank String mensagem, @NotBlank String nomeCurso, @NotBlank String titulo){
}
