package com.example.paisesapi;

public class RestriccionSolicitud {
    private String paisOrigen;
    private String paisDestino;


    public RestriccionSolicitud() {}


    public RestriccionSolicitud(String paisOrigen, String paisDestino) {
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }
}
