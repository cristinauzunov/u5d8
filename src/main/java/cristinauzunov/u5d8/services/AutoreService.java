package cristinauzunov.u5d8.services;

import cristinauzunov.u5d8.entities.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoreService {

    private List<Autore> autori = new ArrayList<>();

    public List<Autore> getTutti() {
        return autori;
    }

    public Autore getById(String id) {
        for (Autore autore : autori) {
            if (autore.getId().equals(id)) {
                return autore;
            }
        }
        return null;
    }

    public Autore crea(Autore nuovoAutore) {
        autori.add(nuovoAutore);
        return nuovoAutore;
    }

    public Autore modifica(String id, Autore autoreAggiornato) {
        Autore autore = getById(id);
        if (autore != null) {
            autore.setNome(autoreAggiornato.getNome());
            autore.setCognome(autoreAggiornato.getCognome());
            autore.setEmail(autoreAggiornato.getEmail());
            autore.setDataDiNascita(autoreAggiornato.getDataDiNascita());
        }
        return autore;
    }

    public void elimina(String id) {
        Autore autore = getById(id);
        if (autore != null) {
            autori.remove(autore);
        }
    }
}