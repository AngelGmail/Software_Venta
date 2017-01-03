package com.venta.sistema.core.model;
// Generated Jan 3, 2017 5:45:21 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private int id;
     private Persona personaByDespachadoPor;
     private Persona personaByClienteId;
     private Date despachadoEn;
     private BigDecimal monto;
     private Date actualizadoEn;
     private String actualizadoPor;
     private boolean estado;
     private Set facturaDetalles = new HashSet(0);

    public Factura() {
    }

	
    public Factura(int id, Persona personaByDespachadoPor, Persona personaByClienteId, Date despachadoEn, Date actualizadoEn, String actualizadoPor, boolean estado) {
        this.id = id;
        this.personaByDespachadoPor = personaByDespachadoPor;
        this.personaByClienteId = personaByClienteId;
        this.despachadoEn = despachadoEn;
        this.actualizadoEn = actualizadoEn;
        this.actualizadoPor = actualizadoPor;
        this.estado = estado;
    }
    public Factura(int id, Persona personaByDespachadoPor, Persona personaByClienteId, Date despachadoEn, BigDecimal monto, Date actualizadoEn, String actualizadoPor, boolean estado, Set facturaDetalles) {
       this.id = id;
       this.personaByDespachadoPor = personaByDespachadoPor;
       this.personaByClienteId = personaByClienteId;
       this.despachadoEn = despachadoEn;
       this.monto = monto;
       this.actualizadoEn = actualizadoEn;
       this.actualizadoPor = actualizadoPor;
       this.estado = estado;
       this.facturaDetalles = facturaDetalles;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Persona getPersonaByDespachadoPor() {
        return this.personaByDespachadoPor;
    }
    
    public void setPersonaByDespachadoPor(Persona personaByDespachadoPor) {
        this.personaByDespachadoPor = personaByDespachadoPor;
    }
    public Persona getPersonaByClienteId() {
        return this.personaByClienteId;
    }
    
    public void setPersonaByClienteId(Persona personaByClienteId) {
        this.personaByClienteId = personaByClienteId;
    }
    public Date getDespachadoEn() {
        return this.despachadoEn;
    }
    
    public void setDespachadoEn(Date despachadoEn) {
        this.despachadoEn = despachadoEn;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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
    public Set getFacturaDetalles() {
        return this.facturaDetalles;
    }
    
    public void setFacturaDetalles(Set facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }




}


