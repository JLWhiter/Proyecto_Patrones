package edu.utp.pe.Diseno_Patrones.service.patron.builder;

import lombok.Getter;

@Getter
public class Reporte {
    private final String titulo;
    private final String contenido;
    private final String autor;

    private Reporte(Builder builder) {
        this.titulo = builder.titulo;
        this.contenido = builder.contenido;
        this.autor = builder.autor;
    }

    public static class Builder {
        private String titulo;
        private String contenido;
        private String autor;

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder contenido(String contenido) {
            this.contenido = contenido;
            return this;
        }

        public Builder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public Reporte build() {
            return new Reporte(this);
        }
    }
}
