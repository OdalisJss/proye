
package com.umg;
import Pantallas.jtable;

public class ProyectoProgramacionIII {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jtable().setVisible(true);
            }
        });
    }
}
