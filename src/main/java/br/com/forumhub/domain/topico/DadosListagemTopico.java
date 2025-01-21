package br.com.forumhub.domain.topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(String titulo, String mensagem, LocalDateTime dataDeCriacao, Status status, String autor, String curso) {

    public DadosListagemTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensagem(), topico.getDataDeCriacao(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }

}
