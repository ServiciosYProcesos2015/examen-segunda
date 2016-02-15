package es.florida_uni.dam.examensegundaevaluacin;


import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class Tortuga extends Thread {
    final static String TAG = "SYP-examensegunda";

    Handler handler;

    public Tortuga(Handler handler){
        this.handler = handler;
    }

    @Override
    public void run() {
        mostrarProgreso(0);
        for(int i=0;i<Carrera.LONGITUD_CARRERA; i++) {
            Utils.consumeCPU();
            mostrarProgreso(i);
        }
    }


    private void mostrarProgreso(final int progreso) {
        Log.i(TAG, "Tortuga ha corrido " + (progreso + 1) + " metros. Velocidad:"+Thread.currentThread().getPriority());

        // TODO: Mostrar el progreso en la barra principal
        // Debéis hacerlo enviando un mensaje a la actividad principal
        // No utilices runnables aquí
        // El mensaje que tienes que enviar es:
        //      Mensaje: MainActivity.MSG_ACTUALIZAR_TORTUGA
        //      arg1: situación del progreso (progreso+1)
        //      arg2: cero
        // Aproximadamente 2 líneas de código
        // TU CODIGO AQUI

        // TU CODIGO HASTA AQUI
    }

}
