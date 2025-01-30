import java.util.ArrayList;
import java.util.List;

class Utente {
  String nome;
  String cognome;
  int eta;
  String citta;

  public Utente(String nome, String cognome, int eta, String citta) {
    this.nome = nome;
    this.cognome = cognome;
    this.eta = eta;
    this.citta = citta;
  }

  public String toString() {
    return "Utente{" +
        "nome='" + nome + '\'' +
        ", cognome='" + cognome + '\'' +
        ", eta=" + eta +
        ", citta='" + citta + '\'' +
        '}';
  }
}

public class TestLista {
  public static void main(String[] args) {
    List<Utente> lista = new ArrayList<Utente>();
    Utente u = new Utente("Giacomo", "Scampini", 24, "Milano");
    lista.add(u);
    lista.add(u);
    lista.add(u);
    System.out.println(lista);
  }
}
