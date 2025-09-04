package src.model;

public class Aluno {
        private String nome;
        private int idade;

        public Aluno() {}

        public Aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        //Inserir valor no atributo -> set
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String showAluno(){
            return "Nome: " +this.getNome() + "\nIdade: " +this.getIdade();
        }
    }

