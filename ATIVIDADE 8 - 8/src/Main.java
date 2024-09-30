import java.util.ArrayList;
import java.util.List;

class SistemaFuncionarios {
    public static void main(String[] args) {
        // Lista de funcionários de várias classes
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Carlos", 5000));
        funcionarios.add(new Desenvolvedor("Ana", 3000));
        funcionarios.add(new Estagiario("Pedro", 1500));

        double folhaTotal = calcularFolhaPagamento(funcionarios);
        System.out.println("Total da folha de pagamento: R$" + folhaTotal);
    }

    // Método para calcular a folha de pagamento
    public static double calcularFolhaPagamento(List<Funcionario> funcionarios) {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario() + f.calcularBonus();
        }
        return total;
    }
}

// Classe base Funcionario
class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularBonus() {
        return 0; // Sem bônus por padrão
    }

    public void trabalhar() {
        System.out.println("Funcionário está trabalhando.");
    }
}

// Classe Gerente
class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.20; // 20% de bônus para gerente
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está gerenciando a equipe.");
    }
}

// Classe Desenvolvedor
class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.10; // 10% de bônus para desenvolvedor
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está desenvolvendo código.");
    }
}

// Classe Estagiario
class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario); // Chamando o construtor da classe base
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.05; // 5% de bônus para estagiário
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está auxiliando nas tarefas diárias.");
    }
}
