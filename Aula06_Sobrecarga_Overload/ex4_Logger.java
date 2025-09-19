public class ex4_Logger {
    public void log (String msg) {
        System.out.println("Log: " + msg);
    }

    public void log (String msg, int nivel) {
        System.out.println("Log: " + msg + " | Nível: " + nivel);
    }

    public void log (String msg, String nivel) {
        System.out.println("Log: " + msg + " | Nível: " + nivel);
    }

    public String log (String msg, String... args) {
        String monte = msg;

        for (int i = 0; i<args.length; i++) {
            monte += " | "+ args[i];
        }
        System.out.println("Log: " + monte);
        return monte;
    }

    public static void main(String[] args) {
        ex4_Logger Logger = new ex4_Logger();
        Logger.log("Primeiro log");
        Logger.log("Segundo log", "2");
        Logger.log("Terceiro log", 4);
        Logger.log("Quarto log", "INFO", "user%)($($#))");

    }
}
