class Super {
  public void print() {
      System.out.println("Chamada de superclasse");
  }
}

class Sub extends Super {
  @Override
  public void print() {
      System.out.println("Chamada da subclasse");
  }
}

public class TestePolimorfismo {
  public static void main(String[] args) {
      Super sup = new Super();
      Super poli = new Sub(); // Note que o tipo é Super, mas a instância é Sub

      sup.print();  // Chamada de superclasse
      poli.print(); // Chamada da subclasse (polimorfismo)
  }
}
