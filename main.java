package view;

import FilaObject.Fila;
import controller.EscalonadorController;
import model.Processo;

public class Principal {
    
    public static void main(String[] args) {
        Fila processos = new Fila();
        EscalonadorController controller = new EscalonadorController();
        processos.insert(new Processo("notepad.exe", 14));
        processos.insert(new Processo("write.exe", 35));
        processos.insert(new Processo("chrome.exe", 27));
        processos.insert(new Processo("acrobat.exe", 52));
        processos.insert(new Processo("firefox.exe", 18));
        processos.insert(new Processo("word.exe", 25));
        while (!processos.isEmpty()) {
            controller.escalonador(processos);
        }
    }

}
