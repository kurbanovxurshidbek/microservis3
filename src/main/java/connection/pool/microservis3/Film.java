package connection.pool.microservis3;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "film")
@Getter
@Setter
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filmId;

    private String title;
    private String description;
    private Integer releaseYear;
    private Integer rentalDuration;
    private Double rentalRate;
    private Integer length;
    private Double replacementCost;
    private String rating;

    @Column(columnDefinition = "text")
    private String specialFeatures;

    private Timestamp lastUpdate;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

}
