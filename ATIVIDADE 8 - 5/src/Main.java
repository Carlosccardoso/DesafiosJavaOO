class MainTransporte {
    public static void main(String[] args) {
        IMeioTransporte[] meios = {new Carro(), new Bicicleta(), new Trem()};

        for (IMeioTransporte meio : meios) {
            meio.acelerar();
            meio.frear();
        }
    }
}

interface IMeioTransporte {
    void acelerar();
    void frear();
}

class Carro implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("Carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Carro está freando.");
    }
}

class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("Bicicleta está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta está freando.");
    }
}

class Trem implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("Trem está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("Trem está freando.");
    }
}

