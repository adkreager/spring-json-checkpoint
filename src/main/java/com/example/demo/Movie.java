package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.RestController;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {
    private String title;
    private int minutes;
    private String genre;
    private double rating;
    private int metascore;
    private String description;
    private int votes;
    private double gross;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("Credits")
    private Credits[] credits;

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }
    @JsonProperty("Minutes")
    public int getMinutes() {
        return minutes;
    }
    @JsonProperty("minutes")
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }
    @JsonProperty("genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @JsonProperty("Rating")
    public double getRating() {
        return rating;
    }
    @JsonProperty("rating")
    public void setRating(double rating) {
        this.rating = rating;
    }
    @JsonProperty("Metascore")
    public int getMetascore() {
        return metascore;
    }
    @JsonProperty("metaScore")
    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty("Votes")
    public int getVotes() {
        return votes;
    }
    @JsonProperty("votes")
    public void setVotes(int votes) {
        this.votes = votes;
    }
    @JsonProperty("Gross")
    public double getGross() {
        return gross;
    }
    @JsonProperty("gross")
    public void setGross(double gross) {
        this.gross = gross;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Credits[] getCredits() {
        return credits;
    }

    public void setCredits(Credits[] credits) {

        this.credits = credits;
    }

    static class Credits {
        @JsonProperty("Person")
        public Person person;

        public Person getPerson() {
            return person;
        }
        public void setPerson(Person people) {
            this.person = people;
        }

        @JsonInclude(JsonInclude.Include.NON_NULL)
        static class Person {
            public String role;
            @JsonProperty("FirstName")
            public String firstName;
            @JsonProperty("LastName")
            public String lastName;

            @JsonProperty("Role")
            public String getRole() {
                return role;
            }
            //@JsonProperty("role")
            public void setRole(String role) {
                this.role = role;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }
        }
    }
}
