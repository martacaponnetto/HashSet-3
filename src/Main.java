import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = hashSetRiempito();
        String oggettoDaEliminare = "3";
        eliminaOggetto(hashSet, oggettoDaEliminare);
        svuotaHashSet(hashSet);
        verificaEStampaRisultato(hashSet);
    }

    // Funzione che restituisce un HashSet riempito di stringhe
    public static HashSet<String> hashSetRiempito() {
        HashSet<String> insieme = new HashSet<>();
        insieme.add("1");
        insieme.add("2");
        insieme.add("3");
        insieme.add("4");
        return insieme;
    }

    // Funzione che elimina un oggetto dall'HashSet se presente
    public static void eliminaOggetto(HashSet<String> hashSet, String oggettoDaEliminare) {
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals(oggettoDaEliminare)) {
                iterator.remove();
            }
        }
    }

    // Funzione che svuota l'HashSet
    public static void svuotaHashSet(HashSet<String> hashSet) {
        hashSet.clear(); // Svuota l'HashSet
    }

    // Funzione che verifica e stampa se l'HashSet è vuoto
    public static void verificaEStampaRisultato(HashSet<String> hashSet) {
        if (hashSet.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }
    }
}

