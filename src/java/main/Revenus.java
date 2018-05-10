/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author gggab
 */
public class Revenus {
    private Double Salaire;
    private Double Pension;
    private Double Autres;
    private Double Total;
    
    public Revenus(){}

    public Revenus(Double Salaire, Double Pension, Double Autres) {
        this.setSalaire(Salaire);
        this.setPension(Pension);
        this.setAutres(Autres);
        
        setTotal(Salaire,Pension,Autres);
    }

    public Double getSalaire() {
        return Salaire;
    }

    private void setSalaire(Double Salaire) {
        this.Salaire = Salaire;
    }

    public Double getPension() {
        return Pension;
    }

    private void setPension(Double Pension) {
        this.Pension = Pension;
    }

    public Double getAutres() {
        return Autres;
    }

    private void setAutres(Double Autres) {
        this.Autres = Autres;
    }

    public Double getTotal() {
        return Total;
    }

    private void setTotal(Double Salaire, Double Pension, Double Autres) {
        this.Total = Salaire+Pension+Autres;
    }
}
