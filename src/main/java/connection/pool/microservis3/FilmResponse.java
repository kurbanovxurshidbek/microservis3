package connection.pool.microservis3;

import java.sql.Timestamp;

public record FilmResponse(
        Long filmId,
        String title,
        String description,
        Integer releaseYear,
        Integer rentalDuration,
        Double rentalRate,
        Integer length,
        Double replacementCost,
        String rating,
        String specialFeatures,
        String language,
        Timestamp lastUpdate
) {

    public static FilmResponse toResponse(Film film) {
        return new FilmResponse(
                film.getFilmId(),
                film.getTitle(),
                film.getDescription(),
                film.getReleaseYear(),
                film.getRentalDuration(),
                film.getRentalRate(),
                film.getLength(),
                film.getReplacementCost(),
                film.getRating(),
                film.getSpecialFeatures(),
                film.getLanguage() != null ? film.getLanguage().getName() : null,
                film.getLastUpdate()
        );
    }
}
