/*
Reforce a prática implementando uma classe Logger com
métodos sobrecarregados:
1 log(String msg).
2 log(String msg, int nivel).
3 log(String msg, String nivel).
4 log(String msg, String... args).
• Teste cada versão e explique qual sobrecarga foi chamada.
 */

public class ex4_Logger {
    public void log (String msg) {
        System.out.println("Log: " + msg);
    }

    public void log (String msg, int nivel) {
        System.out.println("Log: " + msg + " | Level: " + nivel);
    }

    public void log (String msg, String nivel) {
        System.out.println("Log: " + msg + " | Level: " + nivel);
    }

    public String log (String msg, String... args) {
        String monte = msg;

        for (int i = 0; i<args.length; i++) {
            monte = monte + " | " + args[i];
        }
        System.out.println("Log: " + monte);
        return monte;
    }

    public static void main(String[] args) {
        ex4_Logger Logger = new ex4_Logger();
        Logger.log("ERROR!");
        Logger.log("ERROR!", "TWO");
        Logger.log("ERROR!", 4);
        Logger.log("ERROR!", "FATAL", "SYSTEM32 FOLDER HAS BEEN DELETED");

    }
}
