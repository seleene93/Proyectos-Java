
package filmes.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImplementationCatalogueFilm implements ICatalogueFilms {
    
    private final ArrayList<String> listFilms;

    public ImplementationCatalogueFilm() {
        this.listFilms = new ArrayList<>();
    }
    
    

    @Override
    public void insertFilm(Film filmName) {
        this.listFilms.add(filmName.toString());
    }

    @Override
    public void listFilm() {
        JOptionPane.showMessageDialog(
                null,
                this.listFilms,
                "Lista de películas",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void searchFilm(String filmName) {
        String result = null;
        for(var film : this.listFilms) {
            if(film.equals(filmName)) {
                result = film;
                break;
            } else {
                result = film;
            }
        }
        
        if (filmName.equals(result)) {
            JOptionPane.showMessageDialog(
                null,
                "Resultado ->" + result,
                "Buscar película",
                JOptionPane.QUESTION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "No se ha encontrado la película ->" + filmName,
                "Buscar película",
                JOptionPane.QUESTION_MESSAGE);
        }
    }
    
}
