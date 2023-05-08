package com.consulti.personas.personabackend.model;

import javax.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String nombre;

  @ManyToOne
  @JoinColumn(name = "pais_id")
  private Pais pais;

  //constructor
  public Estado() {
 
  }
  public Estado(String nombre, Pais pais) {
    super();
    this.nombre = nombre;
    this.pais = pais;
  }

  //getters and setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Pais getPais() {
    return pais;
  }

  public void setPais(Pais pais) {
    this.pais = pais;
  }
}
