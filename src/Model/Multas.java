package Model;

import Model.Motorista;
import Model.Veiculos;

import javax.swing.*;

public class Multas extends Consulta{
    String idMot;
    String idVei;
    String descMulta;
    double pontMulta;

    String [][] multas ={

    };

    public Multas(int idMot, int idVei, String descMulta, Double pontMulta) {
        super();
        this.setDescMulta(descMulta);
        this.setPontMulta(pontMulta);
    }

    public Multas(String idMot, String idVei, String descmulta, double pontmulta) {
        this.setIdMot(idMot);
        this.setIdVei(idVei);
        this.setDescMulta(descmulta);
        this.setPontMulta(pontmulta);
    }

    @Override
    public String toString() {
        return "\n\n" + "ID Automovel: " + this.getIdVei() + "\n" + "ID Motorista: " + this.getIdMot() + "\n" + "Descrição da multa: " + this.getDescMulta() + "\n" +"Pontuação: " + this.getPontMulta();
    }


    public String getIdMot() {
        return idMot;
    }

    public void setIdMot(String idMot) {
        this.idMot = idMot;
    }

    public String getIdVei() {
        return idVei;
    }

    public void setIdVei(String idVei) {
        this.idVei = idVei;
    }

    public String getDescMulta() {
        return descMulta;
    }

    public void setDescMulta(String descMulta) {
        this.descMulta = descMulta;
    }

    public double getPontMulta() {
        return pontMulta;
    }

    public void setPontMulta(double pontMulta) {
        this.pontMulta = pontMulta;
    }

    public void registrarMulta(){

    }





}
