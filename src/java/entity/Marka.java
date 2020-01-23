package entity;
// Generated Jan 17, 2020 4:32:14 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marka generated by hbm2java
 */
public class Marka  implements java.io.Serializable {


     private Integer id;
     private String naziv;
     private Set<Automobil> automobils = new HashSet<Automobil>(0);

    public Marka() {
    }

    public Marka(String naziv, Set<Automobil> automobils) {
       this.naziv = naziv;
       this.automobils = automobils;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public Set<Automobil> getAutomobils() {
        return this.automobils;
    }
    
    public void setAutomobils(Set<Automobil> automobils) {
        this.automobils = automobils;
    }




}


