package hibernate;
// Generated 2020-01-15 16:13:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Hurtownia generated by hbm2java
 */
public class Hurtownia  implements java.io.Serializable {


     private Integer hurtowniaId;
     private Adresy adresy;
     private long telefon;
     private Set ksiegowoscs = new HashSet(0);
     private Set magazyns = new HashSet(0);

    public Hurtownia() {
    }

	
    public Hurtownia(Adresy adresy, long telefon) {
        this.adresy = adresy;
        this.telefon = telefon;
    }
    public Hurtownia(Adresy adresy, long telefon, Set ksiegowoscs, Set magazyns) {
       this.adresy = adresy;
       this.telefon = telefon;
       this.ksiegowoscs = ksiegowoscs;
       this.magazyns = magazyns;
    }
   
    public Integer getHurtowniaId() {
        return this.hurtowniaId;
    }
    
    public void setHurtowniaId(Integer hurtowniaId) {
        this.hurtowniaId = hurtowniaId;
    }
    public Adresy getAdresy() {
        return this.adresy;
    }
    
    public void setAdresy(Adresy adresy) {
        this.adresy = adresy;
    }
    public long getTelefon() {
        return this.telefon;
    }
    
    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }
    public Set getKsiegowoscs() {
        return this.ksiegowoscs;
    }
    
    public void setKsiegowoscs(Set ksiegowoscs) {
        this.ksiegowoscs = ksiegowoscs;
    }
    public Set getMagazyns() {
        return this.magazyns;
    }
    
    public void setMagazyns(Set magazyns) {
        this.magazyns = magazyns;
    }




}


