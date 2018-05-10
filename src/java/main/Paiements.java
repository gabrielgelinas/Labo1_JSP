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
public class Paiements {
    private Double Hypotheque;
    private Double Auto;
    private Double Pretspersonnel;
    private Double Credit;
    private Double Pretetudiant;
    private Double Enfants;
    private Double Divers1;
    private Double Divers2;
    private Double Divers3;
    
    private Double Total;

    public Paiements(Double Hypotheque, Double Auto, Double Pretspersonnel, Double Credit, Double Pretetudiant, Double Enfants, Double Divers1, Double Divers2, Double Divers3) {
        this.setHypotheque(Hypotheque);
        this.setAuto(Auto);
        this.setPretspersonnel(Pretspersonnel);
        this.setCredit(Credit);
        this.setPretetudiant(Pretetudiant);
        this.setEnfants(Enfants);
        this.setDivers1(Divers1);
        this.setDivers2(Divers2);
        this.setDivers3(Divers3);
        
        this.setTotal(Hypotheque, Auto, Pretspersonnel, Credit, Pretetudiant, Enfants, Divers1, Divers2, Divers3);
    }
    
    private void setTotal(Double hypotheque, Double auto, Double pretpersonnel, Double credit, Double pretetudiant, Double enfants, Double divers1, Double divers2, Double divers3){
        this.Total = hypotheque + auto + pretpersonnel + credit + pretetudiant + enfants + divers1 + divers2 + divers3;
    }

    // <editor-fold>
    /* Getters */
    public Double getHypotheque() {
        return Hypotheque;
    }

    public Double getAuto() {
        return Auto;
    }

    public Double getPretspersonnel() {
        return Pretspersonnel;
    }

    public Double getCredit() {
        return Credit;
    }

    public Double getPretetudiant() {
        return Pretetudiant;
    }

    public Double getEnfants() {
        return Enfants;
    }

    public Double getDivers1() {
        return Divers1;
    }

    public Double getDivers2() {
        return Divers2;
    }

    public Double getDivers3() {
        return Divers3;
    }

    public Double getTotal() {
        return Total;
    }
    
    // </editor-fold>
    
    
    // <editor-fold>
    /* Setters */

    private void setHypotheque(Double Hypotheque) {
        this.Hypotheque = Hypotheque;
    }

    private void setAuto(Double Auto) {
        this.Auto = Auto;
    }

    private void setPretspersonnel(Double Pretspersonnel) {
        this.Pretspersonnel = Pretspersonnel;
    }

    private void setCredit(Double Credit) {
        this.Credit = Credit;
    }

    private void setPretetudiant(Double Pretetudiant) {
        this.Pretetudiant = Pretetudiant;
    }

    private void setEnfants(Double Enfants) {
        this.Enfants = Enfants;
    }

    private void setDivers1(Double Divers1) {
        this.Divers1 = Divers1;
    }

    private void setDivers2(Double Divers2) {
        this.Divers2 = Divers2;
    }

    private void setDivers3(Double Divers3) {
        this.Divers3 = Divers3;
    }
       
    // </editor-fold>
}
