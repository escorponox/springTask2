package jpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BeanEntity implements Serializable {

    @SequenceGenerator(name = "SEQ",sequenceName = "BEANENTITY_SEQ",allocationSize=1)

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ")
    private Long id;
    private String titulo;
    private Long numero;

    protected BeanEntity() {
    }

    public BeanEntity(String titulo, Long numero) {
        this.titulo = titulo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "BeanEntity{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", numero=" + numero +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
