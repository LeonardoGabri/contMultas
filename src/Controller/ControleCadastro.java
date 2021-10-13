package Controller;
import Model.*;

import java.util.ArrayList;


public class ControleCadastro {
    private static ArrayList <Veiculos> carroList = new ArrayList<Veiculos>();
        public static void cadastroCarro (Veiculos carro){
        carroList.add(carro);
    }

    private static ArrayList <Veiculos> motoList = new ArrayList<Veiculos>();
    public static void cadastroMoto (Veiculos moto){
        motoList.add(moto);
    }

    private static ArrayList <Veiculos> caminhaoList = new ArrayList<Veiculos>();
    public static void cadastroCaminhao (Veiculos caminhao){
        caminhaoList.add(caminhao);
    }

    private static ArrayList <Motorista> motoristaList = new ArrayList<Motorista>();
    public static void cadastroMotorista (Motorista motorista){
        motoristaList.add(motorista);
    }


}
