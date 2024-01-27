package com.example.propuestacultura.models;

import jakarta.persistence.*;

@Entity
@Table(name = "documentos_adjuntos")
public class DocumentosAdjuntos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_documentoAdjunto;

    @Column(name = "nombre_documento")
    private String nombre_documento;

    @Column(name="url")
    private String URL;

    public Integer getId_documentoAdjunto() {
        return id_documentoAdjunto;
    }

    public void setId_documentoAdjunto(Integer id_documentoAdjunto) {
        this.id_documentoAdjunto = id_documentoAdjunto;
    }

    public String getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(String nombre_documento) {
        this.nombre_documento = nombre_documento;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
