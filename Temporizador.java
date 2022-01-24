package temporizador;

public class Temporizador {

    public static boolean start(boolean run, boolean mostrarTemp, int minutes, long delay) throws InterruptedException {
        if (run && mostrarTemp) {

            mostrar = true;
            temporizador(minutes, delay);

        } else if (run) {

            temporizador(minutes, delay);

        }

        return fin;
    } //metodo start temporizador


    protected static String[] temp = {"00:00"};  //variables globales
    protected static boolean fin = true;         //variables globales
    protected static boolean mostrar = false;    //variables globales


    static void temporizador(int minutes, long delay) throws InterruptedException {


        int seconds = 0;


        if (minutes != 0) {
            minutes = minutes - 1;
            seconds = 60;
        }

        while (seconds != 0) {

            if (minutes != 0) {

                seconds--;

                if (seconds < 10) {
                    temp[0] = "0" + minutes + ":" + "0" + seconds;
                } else if (minutes < 10) {
                    temp[0] = "0" + minutes + ":" + seconds;
                } else {
                    temp[0] = minutes + ":" + seconds;
                }


                if (seconds == 0) {
                    minutes--;
                    seconds = 60;
                }
            } else {
                if (seconds <= 10) {
                    seconds--;
                    temp[0] = "0" + minutes + ":" + "0" + seconds;
                } else {
                    seconds--;
                    temp[0] = "0" + minutes + ":" + seconds;
                }
            }

            Temporizador.mostrar(mostrar,delay);


        }

    } //metodo funcion temporizador

    static void mostrar(boolean mostrar, long delay) throws InterruptedException {

        if(mostrar) {

            if (temp[0].equals("00:00")){

                fin = false;
                System.out.println(temp[0]);
                Thread.sleep(delay);

            } else {

                System.out.println(temp[0]);
                Thread.sleep(delay);

            }

        } else {

            fin = false;
            Thread.sleep(delay);

        }
    } //metodo mostrar temporizador por consola, true = mostrar - false = no mostrar


}