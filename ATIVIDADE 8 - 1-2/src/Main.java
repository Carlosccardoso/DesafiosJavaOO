public class Main {
    public class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            setPreco(preco);
            setQuantidade(quantidade);
        }

        // Métodos de acesso (Getters)
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        // Métodos de modificação (Setters) com validação
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            if (preco >= 0) {
                this.preco = preco;
            } else {
                throw new IllegalArgumentException("O preço não pode ser negativo.");
            }
        }

        public void setQuantidade(int quantidade) {
            if (quantidade >= 0) {
                this.quantidade = quantidade;
            } else {
                throw new IllegalArgumentException("A quantidade não pode ser negativa.");
            }
        }

        // Método para aplicar desconto
        public void aplicarDesconto(double porcentagem) {
            if (porcentagem < 0 || porcentagem > 50) {
                throw new IllegalArgumentException("O desconto não pode ser maior que 50%.");
            }
            this.preco -= this.preco * (porcentagem / 100);
        }
    }

}