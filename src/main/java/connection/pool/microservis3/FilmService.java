package connection.pool.microservis3;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final FilmRepository filmRepository;

    public List<FilmResponse> getAllFilms() {
        Pageable topTen = PageRequest.of(0, 10);
        return filmRepository.findAll(topTen).stream().map(FilmResponse::toResponse).toList();
    }
}
