package hibernate;
// Generated 2019-12-03 21:04:59 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Zamowienie generated by hbm2java
 */
public class Zamowienie  implements java.io.Serializable {


     private Integer zamowienieId;
     private String statusZaplaty;
     private String statusTransportu;
     private Date data;
     private float koszt;
     private Set towaryzamowienies = new HashSet(0);

    public Zamowienie() {
    }

	
    public Zamowienie(String statusZaplaty, String statusTransportu, Date data, float koszt) {
        this.statusZaplaty = statusZaplaty;
        this.statusTransportu = statusTransportu;
        this.data = data;
        this.koszt = koszt;
    }
    public Zamowienie(String statusZaplaty, String statusTransportu, Date data, float koszt, Set towaryzamowienies) {
       this.statusZaplaty = statusZaplaty;
       this.statusTransportu = statusTransportu;
       this.data = data;
       this.koszt = koszt;
       this.towaryzamowienies = towaryzamowienies;
    }
   
    public Integer getZamowienieId() {
        return this.zamowienieId;
    }
    
    public void setZamowienieId(Integer zamowienieId) {
        this.zamowienieId = zamowienieId;
    }
    public String getStatusZaplaty() {
        return this.statusZaplaty;
    }
    
    public void setStatusZaplaty(String statusZaplaty) {
        this.statusZaplaty = statusZaplaty;
    }
    public String getStatusTransportu() {
        return this.statusTransportu;
    }
    
    public void setStatusTransportu(String statusTransportu) {
        this.statusTransportu = statusTransportu;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public float getKoszt() {
        return this.koszt;
    }
    
    public void setKoszt(float koszt) {
        this.koszt = koszt;
    }
    public Set getTowaryzamowienies() {
        return this.towaryzamowienies;
    }
    
    public void setTowaryzamowienies(Set towaryzamowienies) {
        this.towaryzamowienies = towaryzamowienies;
    }




}


