package filmes.ui;

import filmes.model.*;
import javax.swing.JOptionPane;

public class UIFilms {

    public static void interfaceUser() {
        ICatalogueFilms films = new ImplementationCatalogueFilm();
        Film film;

        CLOSE:
        while (true) {

            String option = JOptionPane.showInputDialog(
                    null,
                    "1 - Insertar película\n"
                    + "2 - Listar película\n"
                    + "3 - Buscar película\n"
                    + "4 - Salir",
                    "Ingrese una opción",
                    3
            );

            int optionInt = 0;
            try {
                optionInt = Integer.parseInt(option);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Las opciones tienen que ser números enteros\n" + e,
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null, 
                        e,
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            

            switch (optionInt) {
                case 1:
                    String filmName = JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nombre de la película",
                            "Entrada",
                            3
                    );

                    film = new Film(filmName);
                    films.insertFilm(film);
                    break;

                case 2:
                    films.listFilm();
                    break;

                case 3:
                    filmName = JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nombre de la película",
                            "Ingrese",
                            3
                    );
                    films.searchFilm(filmName);
                    break;
                case 4:
                    break CLOSE;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción incorrecta\n"
                            + "Vuelve a ingresar una película\n"
                            + "Opción correcta\n"
                            + "Las opciones son de 1 a 4",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
            }
        }
    }
}
