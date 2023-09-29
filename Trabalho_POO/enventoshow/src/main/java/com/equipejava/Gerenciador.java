package com.equipejava;

import java.util.List;
import java.util.ArrayList;

public class Gerenciador {
    private List<Evento> eventos = new ArrayList<Evento>();

    public Gerenciador() {

    }

    public void addEvento(String nome, String data, String local, String responsavel) {
        eventos.add(new Evento(nome, data, local, responsavel));
    }

    public String showEventos() {
        String res = "";
        int contador = 1;
        for (Evento evento : eventos) {
            res += "Evento " + contador + ": Nome: " + evento.getNome() + ", Data: " + evento.getData() + ", Local: " + evento.getLocal() + ", Responsável: " + evento.getResponsavel() + " | ";
            contador++;
        }

        return res;
    }

    public List<Evento> getEventos() {
        return eventos;
    }
}