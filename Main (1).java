public interface Animal {
    void som();
    void comer();
}

public class Porco implements Animal {
    @Override
    public void som() {
        System.out.println("O porco faz oinc oinc");
    }

    @Override
    public void comer() {
        System.out.println("O porco está comendo");
    }
}

public class TesteAnimal {
    public static void main(String[] args) {
        Animal meuPorco = new Porco();

        meuPorco.som();
        meuPorco.comer();
    }
}
