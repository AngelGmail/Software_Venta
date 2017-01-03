package com.venta.sistema.core.model;
// Generated Jan 3, 2017 5:45:21 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Dni generated by hbm2java
 */
public class Dni  implements java.io.Serializable {


     private int id;
     private TipoDni tipoDni;
     private String numero;
     private Date actualizadoEn;
     private String actualizadoPor;
     private boolean estado;
     private Set personas = new HashSet(0);

    public Dni() {
    }

	
    public Dni(int id, TipoDni tipoDni, String numero, Date actualizadoEn, String actualizadoPor, boolean estado) {
        this.id = id;
        this.tipoDni = tipoDni;
        this.numero = numero;
        this.actualizadoEn = actualizadoEn;
        this.actualizadoPor = actualizadoPor;
        this.estado = estado;
    }
    public Dni(int id, TipoDni tipoDni, String numero, Date actualizadoEn, String actualizadoPor, boolean estado, Set personas) {
       this.id = id;
       this.tipoDni = tipoDni;
       this.numero = numero;
       this.actualizadoEn = actualizadoEn;
       this.actualizadoPor = actualizadoPor;
       this.estado = estado;
       this.personas = personas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public TipoDni getTipoDni() {
        return this.tipoDni;
    }
    
    public void setTipoDni(TipoDni tipoDni) {
        this.tipoDni = tipoDni;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Date getActualizadoEn() {
        return this.actualizadoEn;
    }
    
    public void setActualizadoEn(Date actualizadoEn) {
        this.actualizadoEn = actualizadoEn;
    }
    public String getActualizadoPor() {
        return this.actualizadoPor;
    }
    
    public void setActualizadoPor(String actualizadoPor) {
        this.actualizadoPor = actualizadoPor;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Set getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Set personas) {
        this.personas = personas;
    }




}


