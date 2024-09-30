public class Main {
    public class Funcionario {
        protected String nome;
        protected double salario;

        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public double calcularBonus() {
            return 0; // Base sem bônus
        }

        public void trabalhar() {
            System.out.println("Funcionário está trabalhando.");
        }

        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        }
    }

    class Gerente extends Funcionario {
        public Gerente(String nome, double salario) {
            super(nome, salario);
        }

        @Override
        public double calcularBonus() {
            return this.salario * 0.20; // 20% de bônus
        }

        @Override
        public void trabalhar() {
            System.out.println(nome + " está gerenciando a equipe.");
        }
    }

    class Desenvolvedor extends Funcionario {
        public Desenvolvedor(String nome, double salario) {
            super(nome, salario);
        }

        @Override
        public double calcularBonus() {
            return this.salario * 0.10; // 10% de bônus
        }

        @Override
        public void trabalhar() {
            System.out.println(nome + " está desenvolvendo código.");
        }
    }

}