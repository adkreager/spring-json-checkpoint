package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MovieController {

    @GetMapping("/movies/movie")
    public Movie getMovie() {
        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setMinutes(175);
        movie.setGenre("Crime, Drama");
        movie.setRating(9.2);
        movie.setMetascore(100);
        movie.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        movie.setVotes(1561591);
        movie.setGross(134.97);
        movie.setYear("1972");
        Movie.Credits.Person person1 = new Movie.Credits.Person();
        person1.setRole("Director");
        person1.setFirstName("Francis Ford");
        person1.setLastName("Copolla");
        Movie.Credits.Person person2 = new Movie.Credits.Person();
        person2.setRole("Star");
        person2.setFirstName("Marlon");
        person2.setLastName("Brando");
        Movie.Credits.Person person3 = new Movie.Credits.Person();
        person3.setRole("Star");
        person3.setFirstName("Al");
        person3.setLastName("Pacino");
        Movie.Credits.Person person4 = new Movie.Credits.Person();
        person4.setRole("Star");
        person4.setFirstName("James");
        person4.setLastName("Caan");
        Movie.Credits.Person person5 = new Movie.Credits.Person();
        person5.setRole("Star");
        person5.setFirstName("Diane");
        person5.setLastName("Keaton");
        Movie.Credits.Person[] people = new Movie.Credits.Person[5];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;
        Movie.Credits[] credits = new Movie.Credits[5];
        Movie.Credits credit = new Movie.Credits();
        credit.setPerson(person1);
        credits[0] = credit;
        credit.setPerson(person2);
        credits[1] = credit;
        credit.setPerson(person3);
        credits[2] = credit;
        credit.setPerson(person4);
        credits[3] = credit;
        credit.setPerson(person5);
        credits[4] = credit;

        movie.setCredits(credits);
        return movie;
    }

    @PostMapping("/movies/gross/total")
    public Map<String, Double> sumTicketsTotal(@RequestBody() Movie[] movies) {
        double total = 0;
        for (Movie movie : movies) {
            total += movie.getGross();
        }
        Map<String, Double> result = new HashMap<>();
        result.put("result", total);
        return result;
    }

}
