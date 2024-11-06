package br.com.fiap.desastres.model;

import jakarta.persistence.*;

import java.util.Objects;

public class Desastre {




        @Id
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "DESASTRES_SEQ"
        )
        @SequenceGenerator(
                name = "DESASTRES_SEQ",
                sequenceName = "DESASTRES_SEQ",
                allocationSize = 1
        )
        private Long id;
        private String nome;
        private String descricao;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Desastre desastre = (Desastre) o;
            return Objects.equals(id, desastre.id) && Objects.equals(nome, desastre.nome) && Objects.equals(descricao, desastre.descricao);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, nome, descricao);
        }
    }


