public class Principal {
    public static void main(String[] args) throws InterruptedException {
        // a ordem das execuções é imprevisível
        Recurso recurso = new Recurso(10);

        MinhaThread t1 = new MinhaThread("T1", recurso, 2);
        MinhaThread t2 = new MinhaThread("T2", recurso, 7);
        MinhaThread t3 = new MinhaThread("T3", recurso, 1);
        MinhaThread t4 = new MinhaThread("T4", recurso, 30);

        System.out.println("Estado de T1 antes do join(): " + t1.getState());
        System.out.println("Estado de T2 antes do join(): " + t2.getState());
        System.out.println("Estado de T3 antes do join(): " + t3.getState());
        System.out.println("Estado de T4 antes do join(): " + t4.getState());

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Estado de T1 depois do join(): " + t1.getState());
        System.out.println("Estado de T2 depois do join(): " + t2.getState());
        System.out.println("Estado de T3 depois do join(): " + t3.getState());
        System.out.println("Estado de T4 depois do join(): " + t4.getState());

        // sout é executado antes das threads
        // por ser mais rápido, não é preciso ser criado como as threads
        System.out.println("Valor final: " + recurso.getValor()); 
    }
}
