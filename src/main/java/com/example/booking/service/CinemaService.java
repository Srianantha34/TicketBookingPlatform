package com.example.booking.service;

import com.example.booking.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private ShowRepository showRepository;

    public List<Show> getTheatersRunningShows(Long movieId, String date) {
        LocalDateTime date1 = LocalDateTime.parse(date);
        List<Show> shows = showRepository.findByMovieMovieIdAndStartTimeGreaterThanEqual(movieId,date1);

        List<Cinema> theaters = new ArrayList<>();

        System.out.println ("List of shows:" + shows.toString());

        return shows;
    }

    public List<Seat> getSeatDetails(Long showId)
    {
        Optional<Show> shows = showRepository.findById(showId);
        System.out.println ("Total number of seats: " +  shows.get().getCinemaHall().getTotalSeats());

        return shows.get().getCinemaHall().getSeats();
    }

}
