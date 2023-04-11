package controller;

import FilaObject.Fila;
import model.Processo;

public class EscalonadorController {
    
    public void escalonador(Fila f) {
        Processo p = (Processo) f.remove();
        p.decrementaQtdRetornos();
        if (p.getQtdRetornos() > 1) {
            f.insert(p);
        }
    }

}
