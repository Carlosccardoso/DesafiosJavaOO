public class Main {
    abstract class FormaPagamento {
        public abstract void processarPagamento(double valor);
        public abstract boolean validarPagamento();
    }

    class CartaoCredito extends FormaPagamento {
        @Override
        public void processarPagamento(double valor) {
            System.out.println("Processando pagamento de R$" + valor + " com cartão de crédito.");
        }

        @Override
        public boolean validarPagamento() {
            System.out.println("Validação do cartão de crédito bem-sucedida.");
            return true;
        }
    }

    class Boleto extends FormaPagamento {
        @Override
        public void processarPagamento(double valor) {
            System.out.println("Processando pagamento de R$" + valor + " com boleto.");
        }

        @Override
        public boolean validarPagamento() {
            System.out.println("Validação do boleto bem-sucedida.");
            return true;
        }
    }

    class Pix extends FormaPagamento {
        @Override
        public void processarPagamento(double valor) {
            System.out.println("Processando pagamento de R$" + valor + " com Pix.");
        }

        @Override
        public boolean validarPagamento() {
            System.out.println("Validação do Pix bem-sucedida.");
            return true;
        }
    }

    public class MainPagamento {
        public void main(String[] args) {
            FormaPagamento pagamento = new CartaoCredito();
            pagamento.validarPagamento();
            pagamento.processarPagamento(150.0);
        }
    }

}