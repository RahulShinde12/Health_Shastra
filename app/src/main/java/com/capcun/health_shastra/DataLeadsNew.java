package com.capcun.health_shastra;

public class DataLeadsNew {

    String  name,rating,location,distance,reviews;

    public DataLeadsNew(String name, String rating, String location, String distance, String reviews) {
        this.name = name;
        this.rating = rating;
        this.location = location;
        this.distance = distance;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
}
