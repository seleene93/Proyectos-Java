
package filmes.model;

public interface ICatalogueFilms {
    void insertFilm(Film filmName);
    void listFilm();
    void searchFilm(String filmName);
}
