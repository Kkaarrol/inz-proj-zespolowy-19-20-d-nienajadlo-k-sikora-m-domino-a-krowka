package hibernate;
// Generated 2019-12-10 21:47:49 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Ksiegowosc generated by hbm2java
 */
public class Ksiegowosc  implements java.io.Serializable {


     private Integer ksiegowoscId;
     private Hurtownia hurtownia;
     private Date data;
     private float przychody;
     private float koszty;
     private float aktywa;
     private float pasywa;

    public Ksiegowosc() {
    }

    public Ksiegowosc(Hurtownia hurtownia, Date data, float przychody, float koszty, float aktywa, float pasywa) {
       this.hurtownia = hurtownia;
       this.data = data;
       this.przychody = przychody;
       this.koszty = koszty;
       this.aktywa = aktywa;
       this.pasywa = pasywa;
    }
   
    public Integer getKsiegowoscId() {
        return this.ksiegowoscId;
    }
    
    public void setKsiegowoscId(Integer ksiegowoscId) {
        this.ksiegowoscId = ksiegowoscId;
    }
    public Hurtownia getHurtownia() {
        return this.hurtownia;
    }
    
    public void setHurtownia(Hurtownia hurtownia) {
        this.hurtownia = hurtownia;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public float getPrzychody() {
        return this.przychody;
    }
    
    public void setPrzychody(float przychody) {
        this.przychody = przychody;
    }
    public float getKoszty() {
        return this.koszty;
    }
    
    public void setKoszty(float koszty) {
        this.koszty = koszty;
    }
    public float getAktywa() {
        return this.aktywa;
    }
    
    public void setAktywa(float aktywa) {
        this.aktywa = aktywa;
    }
    public float getPasywa() {
        return this.pasywa;
    }
    
    public void setPasywa(float pasywa) {
        this.pasywa = pasywa;
    }




}


