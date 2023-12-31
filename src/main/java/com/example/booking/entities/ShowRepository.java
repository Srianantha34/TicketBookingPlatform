package com.example.booking.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {

    List<Show>  findByMovieMovieIdAndStartTimeGreaterThanEqual(Long movieId, LocalDateTime date);
}
