package Model;

public class Automovel extends Veiculos {

    public Automovel(String placa, String modelo, String marca, int id, String cmc) {
        super(id);
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setCmc(cmc);
    }

    public Automovel(String mod, String mar, int idVei) {
        this.setModelo(mod);
        this.setMarca(mar);
        this.setId(idVei);
    }

    @Override
    public String toString() {
        return "\n\n" + "ID: " + this.getId() + "\n" + "Modelo: " + this.getModelo() + "\n" + "Marca: " + this.getMarca();
    }
}
