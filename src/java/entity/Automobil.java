package entity;
// Generated Jan 17, 2020 4:32:14 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Automobil generated by hbm2java
 */
public class Automobil  implements java.io.Serializable {


     private Integer id;
     private Marka marka;
     private String model;
     private BigDecimal cijena;
     private Integer kilometraza;
     private Date godiste;
     private Set<AutomobilKupac> automobilKupacs = new HashSet<AutomobilKupac>(0);

    public Automobil() {
    }

    public Automobil(Marka marka, String model, BigDecimal cijena, Integer kilometraza, Date godiste, Set<AutomobilKupac> automobilKupacs) {
       this.marka = marka;
       this.model = model;
       this.cijena = cijena;
       this.kilometraza = kilometraza;
       this.godiste = godiste;
       this.automobilKupacs = automobilKupacs;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Marka getMarka() {
        return this.marka;
    }
    
    public void setMarka(Marka marka) {
        this.marka = marka;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public BigDecimal getCijena() {
        return this.cijena;
    }
    
    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    public Integer getKilometraza() {
        return this.kilometraza;
    }
    
    public void setKilometraza(Integer kilometraza) {
        this.kilometraza = kilometraza;
    }
    public Date getGodiste() {
        return this.godiste;
    }
    
    public void setGodiste(Date godiste) {
        this.godiste = godiste;
    }
    public Set<AutomobilKupac> getAutomobilKupacs() {
        return this.automobilKupacs;
    }
    
    public void setAutomobilKupacs(Set<AutomobilKupac> automobilKupacs) {
        this.automobilKupacs = automobilKupacs;
    }




}


