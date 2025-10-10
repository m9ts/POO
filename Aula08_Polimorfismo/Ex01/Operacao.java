package Ex01;

abstract class Operacao implements Operavel {
    public double valor;
    
    public void resumo(){
        System.out.println("----- RESUMO DA OPERACAO -----");
        System.out.println("Tipo: " + this.getClass().getSimpleName()); 
        // getClass() -> retorna a classe do objeto atual
        // getSimpleName() -> retorna só o nome da classe (sem o pacote)
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("------------------------");
    }
}