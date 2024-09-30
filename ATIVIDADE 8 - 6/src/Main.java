public class Main {
    abstract class Animal {
        public abstract void emitirSom();
    }

    class Cachorro extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("Cachorro: Au Au!");
        }
    }

    class Gato extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("Gato: Miau!");
        }
    }

    class Vaca extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("Vaca: Muu!");
        }
    }

    public class MainAnimal {
        public void main(String[] args) {
            Animal[] animais = {new Cachorro(), new Gato(), new Vaca()};

            for (Animal animal : animais) {
                animal.emitirSom();
            }
        }
    }

}