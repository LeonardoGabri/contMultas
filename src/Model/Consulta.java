package Model;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import Controller.ControleCadastro;
import Model.Motorista;
import Model.Moto;
import Model.Caminhao;
import Model.Veiculos;
import Model.Multas;
import Controller.ControleCadastro;

public class Consulta implements ActionListener{

    int idMotorista = 1;
    int idVeiculo = 1;
    String motMulta;

    public String getMotMulta() {
        return motMulta;
    }

    public void setMotMulta(String motMulta) {
        this.motMulta = motMulta;
    }

    JFrame consultaCarro = new JFrame();
    //Veiculo
    JTextField cmc =  new JTextField();
    JTextField modelo = new JTextField();
    JTextField marca = new JTextField();
    JTextField idvei = new JTextField();
    JLabel lblcmc = new JLabel();
    JLabel lblmodelo = new JLabel();
    JLabel lblmarca = new JLabel();
    JLabel lblidvei = new JLabel();
    JLabel lblveiculos = new JLabel();
    JTextArea txamoto = new JTextArea();
    JTextArea txacarro = new JTextArea();
    JButton btncadastrarvei = new JButton();
    JTextArea txacaminhao = new JTextArea();
    JButton btnCarro = new JButton();
    JButton btnMoto = new JButton();
    JButton btnCaminhao = new JButton();
    //Motorista
    JTextField idmot = new JTextField();
    JTextField cpf = new JTextField();
    JTextField nome = new JTextField();
    JLabel lblidmot = new JLabel();
    JLabel lblnome = new JLabel();
    JLabel lblcpf = new JLabel();
    JLabel lblmot= new JLabel();
    JButton btncadastrarmot = new JButton();
    JTextArea txamot = new JTextArea();
    //Multas
    JComboBox idmotmulta =  new JComboBox();
    JComboBox idcarromulta = new JComboBox();
    JTextField descmulta = new JTextField();
    JTextField pontmulta = new JTextField();
    JLabel lblidmotmulta = new JLabel();
    JLabel lblidcarromulta = new JLabel();
    JLabel lbldescmulta = new JLabel();
    JLabel lblpontmulta = new JLabel();
    JLabel lblregistromulta = new JLabel();
    JButton btnregistrarmulta = new JButton();
    //Consulta de multa
    JTextArea txaconsultamulta = new JTextArea();
    JLabel lblconsultamulta = new JLabel();

    public Consulta() {

        //TITULOS LABEL

        consultaCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        consultaCarro.setSize(1920,1000);
        consultaCarro.getContentPane().setBackground(new Color(223, 231, 242));
        consultaCarro.setLayout(null);
        consultaCarro.setResizable(false);

        lblveiculos.setBounds(0,10,475,65);
        lblveiculos.setBackground(new Color(223, 231, 242));
        lblveiculos.setForeground(new Color(192, 0, 0));
        lblveiculos.setFont(new Font("Arial", Font.BOLD, 35));
        lblveiculos.setBorder(BorderFactory.createBevelBorder(1));
        lblveiculos.setHorizontalAlignment(JLabel.CENTER);
        lblveiculos.setText("VEICULOS");


        lblmot.setBounds(480,10,475,65);
        lblmot.setBackground(new Color(223, 231, 242));
        lblmot.setForeground(new Color(112, 173, 71));
        lblmot.setFont(new Font("Arial", Font.BOLD, 35));
        lblmot.setBorder(BorderFactory.createBevelBorder(1));
        lblmot.setHorizontalAlignment(JLabel.CENTER);
        lblmot.setText("MOTORISTA");


        lblregistromulta.setBounds(960,10,475,65);
        lblregistromulta.setBackground(new Color(223, 231, 242));
        lblregistromulta.setForeground(new Color(237, 125, 42));
        lblregistromulta.setFont(new Font("Arial", Font.BOLD, 35));
        lblregistromulta.setBorder(BorderFactory.createBevelBorder(1));
        lblregistromulta.setHorizontalAlignment(JLabel.CENTER);
        lblregistromulta.setText("REGISTRO DE MULTAS");


        lblconsultamulta.setBounds(1440,10,475,65);
        lblconsultamulta.setBackground(new Color(223, 231, 242));
        lblconsultamulta.setForeground(new Color(237, 125, 42));
        lblconsultamulta.setFont(new Font("Arial", Font.BOLD, 35));
        lblconsultamulta.setBorder(BorderFactory.createBevelBorder(1));
        lblconsultamulta.setHorizontalAlignment(JLabel.CENTER);
        lblconsultamulta.setText("CONSULTA");

        //VEICULOS

        lblmodelo.setBounds(0, 90, 235, 50);
        lblmodelo.setBackground(new Color(223, 231, 242));
        lblmodelo.setForeground(new Color(192, 0, 0));
        lblmodelo.setFont(new Font("Arial", Font.BOLD, 20));
        lblmodelo.setBorder(BorderFactory.createBevelBorder(1));
        lblmodelo.setHorizontalAlignment(JLabel.CENTER);
        lblmodelo.setText("Modelo");

        lblmarca.setBounds(0, 150, 235, 50);
        lblmarca.setBackground(new Color(223, 231, 242));
        lblmarca.setForeground(new Color(192, 0, 0));
        lblmarca.setFont(new Font("Arial", Font.BOLD, 20));
        lblmarca.setBorder(BorderFactory.createBevelBorder(1));
        lblmarca.setHorizontalAlignment(JLabel.CENTER);
        lblmarca.setText("Marca");

        lblidvei.setBounds(0, 210, 235, 50);
        lblidvei.setBackground(new Color(223, 231, 242));
        lblidvei.setForeground(new Color(192, 0, 0));
        lblidvei.setFont(new Font("Arial", Font.BOLD, 20));
        lblidvei.setBorder(BorderFactory.createBevelBorder(1));
        lblidvei.setHorizontalAlignment(JLabel.CENTER);
        lblidvei.setText("ID");


        modelo.setBounds(245,90,230,50);
        modelo.setBackground(new Color(255, 255, 255));
        modelo.setForeground(new Color(0, 0, 0));
        modelo.setFont(new Font("Arial", Font.BOLD,20));
        modelo.setBorder(BorderFactory.createBevelBorder(1));
        modelo.setHorizontalAlignment(JTextField.CENTER);
        modelo.setEditable(true);
        modelo.setText(modelo.getText());


        marca.setBounds(245,150,230,50);
        marca.setBackground(new Color(255, 255, 255));
        marca.setForeground(new Color(0, 0, 0));
        marca.setFont(new Font("Arial", Font.BOLD,20));
        marca.setBorder(BorderFactory.createBevelBorder(1));
        marca.setHorizontalAlignment(JTextField.CENTER);
        marca.setEditable(true);
        marca.setText(marca.getText());

        idvei.setBounds(245,210,230,50);
        idvei.setBackground(new Color(255, 255, 255));
        idvei.setForeground(new Color(0, 0, 0));
        idvei.setFont(new Font("Arial", Font.BOLD,20));
        idvei.setBorder(BorderFactory.createBevelBorder(1));
        idvei.setHorizontalAlignment(JTextField.CENTER);
        idvei.setEditable(false);
        idvei.setText(String.valueOf(idVeiculo));

        txacarro.setBounds(0,445,155,515);
        txacarro.setBorder(BorderFactory.createBevelBorder(1));
        txacarro.setLineWrap(false);
        txacarro.setEditable(false);
        txacarro.setWrapStyleWord(true);


        txamoto.setBounds(160,445,155,515);
        txamoto.setBorder(BorderFactory.createBevelBorder(1));
        txamoto.setLineWrap(false);
        txamoto.setEditable(false);
        txamoto.setWrapStyleWord(true);

        txacaminhao.setBounds(320,445,155,515);
        txacaminhao.setBorder(BorderFactory.createBevelBorder(1));
        txacaminhao.setLineWrap(false);
        txacaminhao.setEditable(false);
        txacaminhao.setWrapStyleWord(true);



        
        btnCarro.setHorizontalAlignment(JLabel.CENTER);
        btnCarro.setText("Carros");

        btnMoto.setBounds(160,320,155,30);
        btnMoto.setBackground(new Color(192, 0, 0));
        btnMoto.setForeground(new Color(223,231,242));
        btnMoto.setFont(new Font("Arial", Font.BOLD, 15));
        btnMoto.setFocusable(false);
        btnMoto.setHorizontalAlignment(JLabel.CENTER);
        btnMoto.setText("Motos");

        btnCaminhao.setBounds(320,320,155,30);
        btnCaminhao.setBackground(new Color(192, 0, 0));
        btnCaminhao.setForeground(new Color(223,231,242));
        btnCaminhao.setFont(new Font("Arial", Font.BOLD, 15));
        btnCaminhao.setFocusable(false);
        btnCaminhao.setHorizontalAlignment(JLabel.CENTER);
        btnCaminhao.setText("Caminhão");

        //MOTORISTA

        lblidmot.setBounds(480, 90, 235, 50);
        lblidmot.setBackground(new Color(223,231,242));
        lblidmot.setForeground(new Color(112, 173, 71));
        lblidmot.setFont(new Font("Arial", Font.BOLD, 20));
        lblidmot.setBorder(BorderFactory.createBevelBorder(1));
        lblidmot.setHorizontalAlignment(JLabel.CENTER);
        lblidmot.setText("ID");

        lblnome.setBounds(480, 150, 235, 50);
        lblnome.setBackground(new Color(223,231,242));
        lblnome.setForeground(new Color(112, 173, 71));
        lblnome.setFont(new Font("Arial", Font.BOLD, 20));
        lblnome.setBorder(BorderFactory.createBevelBorder(1));
        lblnome.setHorizontalAlignment(JLabel.CENTER);
        lblnome.setText("Nome");

        lblcpf.setBounds(480, 210, 235, 50);
        lblcpf.setBackground(new Color(223,231,242));
        lblcpf.setForeground(new Color(112, 173, 71));
        lblcpf.setFont(new Font("Arial", Font.BOLD, 20));
        lblcpf.setBorder(BorderFactory.createBevelBorder(1));
        lblcpf.setHorizontalAlignment(JLabel.CENTER);
        lblcpf.setText("CPF");


        idmot.setBounds(725,90,230,50);
        idmot.setBackground(new Color(255, 255, 255));
        idmot.setForeground(new Color(0, 0, 0));
        idmot.setFont(new Font("Arial", Font.BOLD,20));
        idmot.setBorder(BorderFactory.createBevelBorder(1));
        idmot.setHorizontalAlignment(JTextField.CENTER);
        idmot.setEditable(false);
        idmot.setText(String.valueOf(idMotorista));

        nome.setBounds(725,150,230,50);
        nome.setBackground(new Color(255, 255, 255));
        nome.setForeground(new Color(0, 0, 0));
        nome.setFont(new Font("Arial", Font.BOLD,20));
        nome.setBorder(BorderFactory.createBevelBorder(1));
        nome.setHorizontalAlignment(JTextField.CENTER);
        nome.setEditable(true);
        nome.setText(nome.getText());

        cpf.setBounds(725,210,230,50);
        cpf.setBackground(new Color(255, 255, 255));
        cpf.setForeground(new Color(0, 0, 0));
        cpf.setFont(new Font("Arial", Font.BOLD,20));
        cpf.setBorder(BorderFactory.createBevelBorder(1));
        cpf.setHorizontalAlignment(JTextField.CENTER);
        cpf.setEditable(true);
        cpf.setText(cpf.getText());

        btncadastrarmot.setBounds(600,280,240,50);
        btncadastrarmot.setBackground(new Color(112, 173, 71));//COR DO BOTAO - BACKGROUND
        btncadastrarmot.setForeground(new Color(223,231,242));//COR DA LETRA DO BOTAO - FOREGROUND
        btncadastrarmot.setFont(new Font ("Arial", Font.BOLD,20));
        btncadastrarmot.setFocusable(false);
        btncadastrarmot.addActionListener(this);
        btncadastrarmot.setText("CADASTRAR");

        txamot.setBounds(480,370,480,590);
        txamot.setBorder(BorderFactory.createBevelBorder(1));
        txamot.setEditable(false);
        txamot.setLineWrap(false);
        txamot.setWrapStyleWord(true);

        //REGISTRO DE MULTAS

        lblidmotmulta.setBounds(960,90,235,50);
        lblidmotmulta.setBackground(new Color(223,231,242));
        lblidmotmulta.setForeground(new Color(237, 125, 42));
        lblidmotmulta.setFont(new Font("Arial", Font.BOLD, 20));
        lblidmotmulta.setBorder(BorderFactory.createBevelBorder(1));
        lblidmotmulta.setHorizontalAlignment(JLabel.CENTER);
        lblidmotmulta.setText("ID Motorista");

        lblidcarromulta.setBounds(960, 150, 235, 50);
        lblidcarromulta.setBackground(new Color(223,231,242));
        lblidcarromulta.setForeground(new Color(237, 125, 42));
        lblidcarromulta.setFont(new Font("Arial", Font.BOLD, 20));
        lblidcarromulta.setBorder(BorderFactory.createBevelBorder(1));
        lblidcarromulta.setHorizontalAlignment(JLabel.CENTER);
        lblidcarromulta.setText("ID Carro");

        lbldescmulta.setBounds(960, 210, 235, 50);
        lbldescmulta.setBackground(new Color(223,231,242));
        lbldescmulta.setForeground(new Color(237, 125, 42));
        lbldescmulta.setFont(new Font("Arial", Font.BOLD, 20));
        lbldescmulta.setBorder(BorderFactory.createBevelBorder(1));
        lbldescmulta.setHorizontalAlignment(JLabel.CENTER);
        lbldescmulta.setText("Descrição da Multa");

        lblpontmulta.setBounds(960, 270, 235, 50);
        lblpontmulta.setBackground(new Color(223,231,242));
        lblpontmulta.setForeground(new Color(237, 125, 42));
        lblpontmulta.setFont(new Font("Arial", Font.BOLD, 20));
        lblpontmulta.setBorder(BorderFactory.createBevelBorder(1));
        lblpontmulta.setHorizontalAlignment(JLabel.CENTER);
        lblpontmulta.setText("Pontuação da Multa");

        idmotmulta.setBounds(1200,90,235,50);
        idmotmulta.setBackground(new Color(255, 255, 255));
        idmotmulta.setForeground(new Color(0, 0, 0));
        idmotmulta.setFont(new Font("Arial", Font.BOLD,20));
        idmotmulta.setBorder(BorderFactory.createBevelBorder(1));
        idmotmulta.setEditable(true);


        idcarromulta.setBounds(1200,150,235,50);
        idcarromulta.setBackground(new Color(255, 255, 255));
        idcarromulta.setForeground(new Color(0, 0, 0));
        idcarromulta.setFont(new Font("Arial", Font.BOLD,20));
        idcarromulta.setBorder(BorderFactory.createBevelBorder(1));
        idcarromulta.setEditable(true);


        descmulta.setBounds(1200,210,235,50);
        descmulta.setBackground(new Color(255, 255, 255));
        descmulta.setForeground(new Color(0, 0, 0));
        descmulta.setFont(new Font("Arial", Font.BOLD,20));
        descmulta.setBorder(BorderFactory.createBevelBorder(1));
        descmulta.setHorizontalAlignment(JTextField.CENTER);
        descmulta.setEditable(true);
        descmulta.setText(descmulta.getText());

        pontmulta.setBounds(1200,270,235,50);
        pontmulta.setBackground(new Color(255, 255, 255));
        pontmulta.setForeground(new Color(0, 0, 0));
        pontmulta.setFont(new Font("Arial", Font.BOLD,20));
        pontmulta.setBorder(BorderFactory.createBevelBorder(1));
        pontmulta.setHorizontalAlignment(JTextField.CENTER);
        pontmulta.setEditable(true);
        pontmulta.setText(pontmulta.getText());

        btnregistrarmulta.setBounds(1080,340,240,50);
        btnregistrarmulta.setBackground(new Color(237, 125, 42));//COR DO BOTAO - BACKGROUND
        btnregistrarmulta.setForeground(new Color(223,231,242));//COR DA LETRA DO BOTAO - FOREGROUND
        btnregistrarmulta.setFont(new Font ("Arial", Font.BOLD,20));
        btnregistrarmulta.setFocusable(false);
        btnregistrarmulta.addActionListener(this);
        btnregistrarmulta.setText("REGISTRAR");

        txaconsultamulta.setBounds(1440,90,480,870);
        txaconsultamulta.setBorder(BorderFactory.createBevelBorder(1));
        txaconsultamulta.setLineWrap(false);
        txaconsultamulta.setEditable(false);
        txaconsultamulta.setWrapStyleWord(true);


        consultaCarro.add(txaconsultamulta);
        consultaCarro.add(btnregistrarmulta);
        consultaCarro.add(lblidcarromulta);
        consultaCarro.add(idcarromulta);
        consultaCarro.add(descmulta);
        consultaCarro.add(pontmulta);
        consultaCarro.add(idmotmulta);
        consultaCarro.add(lblpontmulta);
        consultaCarro.add(lbldescmulta);
        consultaCarro.add(lblidmotmulta);
        consultaCarro.add(btncadastrarmot);
        consultaCarro.add(txamot);
        consultaCarro.add(idmot);
        consultaCarro.add(cpf);
        consultaCarro.add(nome);
        consultaCarro.add(lblcpf);
        consultaCarro.add(lblnome);
        consultaCarro.add(lblidmot);
        consultaCarro.add(btnCarro);
        consultaCarro.add(btnMoto);
        consultaCarro.add(btnCaminhao);
        consultaCarro.add(txacaminhao);
        consultaCarro.add(txacarro);
        consultaCarro.add(txamoto);
        consultaCarro.add(btncadastrarvei);
        consultaCarro.add(idvei);
        consultaCarro.add(marca);
        consultaCarro.add(cmc);
        consultaCarro.add(modelo);
        consultaCarro.add(lblmarca);
        consultaCarro.add(lblidvei);
        consultaCarro.add(lblmodelo);
        consultaCarro.add(lblcmc);
        consultaCarro.add(lblregistromulta);
        consultaCarro.add(lblconsultamulta);
        consultaCarro.add(lblmot);
        consultaCarro.add(lblveiculos);
        consultaCarro.setVisible(true);

        cadastrarMot();
        cadastrarVei();
        registrarMulta();

    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public void cadastrarVei(){
        btnMoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  mod = modelo.getText();
                String mar = marca.getText();
                int idVei = Integer.parseInt(idvei.getText());

                Moto moto = new Moto(mod, mar, idVei);
                idcarromulta.addItem(idVei + " - " + mod);

                txamoto.append(moto.toString());

                ControleCadastro.cadastroMoto(moto);
                idVeiculo++;
                idvei.setText(String.valueOf(idVeiculo));
            }
        });

        btnCaminhao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CMC = cmc.getText();
                String  mod = modelo.getText();
                String mar = marca.getText();
                int idVei = Integer.parseInt(idvei.getText());

                Caminhao caminhao = new Caminhao(mod, mar, idVei);
                idcarromulta.addItem(idVei + " - " + mod);

                txacaminhao.append(caminhao.toString());

                ControleCadastro.cadastroCaminhao(caminhao);
                idVeiculo++;
                idvei.setText(String.valueOf(idVeiculo));

                cmc.setText(" ");
                modelo.setText(" ");
                marca.setText(" ");

            }
        });

        btnCarro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CMC = cmc.getText();
                String  mod = modelo.getText();
                String mar = marca.getText();
                int idVei = Integer.parseInt(idvei.getText());

                Automovel carro = new Automovel(mod, mar, idVei);
                idcarromulta.addItem(idVei + " - " + mod);
                txacarro.append(carro.toString());

                ControleCadastro.cadastroCarro(carro);
                idVeiculo++;
                idvei.setText(String.valueOf(idVeiculo));

                cmc.setText(" ");
                modelo.setText(" ");
                marca.setText(" ");

            }
        });

    }

    public void cadastrarMot(){
        btncadastrarmot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int idMot = Integer.parseInt(idmot.getText());
                String Cpf = cpf.getText();
                String Nome = nome.getText();

                Motorista mot = new Motorista(idMot, Cpf, Nome);


                idmotmulta.addItem(idMot + " - " + Nome);
                txamot.append(mot.toString());

            ControleCadastro.cadastroMotorista(mot);

                idMotorista++;
                idmot.setText(String.valueOf(idMotorista));

                cpf.setText(" ");
                nome.setText(" ");

            }

        });


    }

    public void registrarMulta(){
        btnregistrarmulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idMot = (String) idmotmulta.getSelectedItem();
                String idAut = (String) idcarromulta.getSelectedItem();
                String Descmulta = descmulta.getText();
                double Pontmulta = Double.parseDouble(pontmulta.getText());

                Multas multa = new Multas(idMot, idAut, Descmulta, Pontmulta);

                txaconsultamulta.append(multa.toString());

                descmulta.setText(" ");
                pontmulta.setText(" ");


            }
        });

    }



}
