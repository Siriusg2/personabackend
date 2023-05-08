package com.consulti.personas.personabackend.model;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String nombre;

  @ManyToOne
  @JoinColumn(name = "estado_id")
  private Estado estado;

  public Pais() {
   
  }

  //constructor
  public Pais(String nombre, Estado estado) {
    super();
    this.nombre = nombre;
    this.estado = estado;
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

  public Estado getEstado() {
    return estado;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }
}
