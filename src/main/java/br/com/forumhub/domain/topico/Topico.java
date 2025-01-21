package br.com.forumhub.domain.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensagem;

    @Column(name = "data_de_criacao")
    private LocalDateTime dataDeCriacao;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String autor;

    private String curso;

    public Topico(){
    }
    public Topico(@Valid DadosCadastroTopico dados) {
        this.autor = "Aluno";
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.curso = dados.nomeCurso();
        this.dataDeCriacao = LocalDateTime.now();
        this.status = Status.NAO_RESPONDIDO;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataDeCriacao() {
        return dataDeCriacao;
    }

    public Status getStatus() {
        return status;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public void atualizarDados(@Valid DadosAtualizacaoTopico dados) {
        this.mensagem = dados.mensagem();
        this.curso = dados.nomeCurso();
        this.titulo = dados.titulo();
    }
}
