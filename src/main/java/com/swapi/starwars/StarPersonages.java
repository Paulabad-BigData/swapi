package com.swapi.starwars;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Result;
import java.util.List;
import java.util.Objects;

public class StarPersonages {
    private String name;
    private String height;
    private String mass;
    @SerializedName("hair_color")
    private String hairColor;
    @SerializedName("skin_color")
    private String skinColor;
    @SerializedName("eye_color")
    private String eyeColor;
    @SerializedName("birth_year")
    private String birthYear;
    private String gender;
    private String homeworld;
    private List<Result> films;
    private List<Result> species;
    private List<Result> vehicles;
    private List<Result> starships;
    private String created;
    private String edited;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public List<Result> getFilms() {
        return films;
    }

    public void setFilms(List<Result> films) {
        this.films = films;
    }

    public List<Result> getSpecies() {
        return species;
    }

    public void setSpecies(List<Result> species) {
        this.species = species;
    }

    public List<Result> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Result> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Result> getStarships() {
        return starships;
    }

    public void setStarships(List<Result> starships) {
        this.starships = starships;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarPersonages that = (StarPersonages) o;
        return Objects.equals(name, that.name) && Objects.equals(height, that.height) && Objects.equals(mass, that.mass) && Objects.equals(hairColor, that.hairColor) && Objects.equals(skinColor, that.skinColor) && Objects.equals(eyeColor, that.eyeColor) && Objects.equals(birthYear, that.birthYear) && Objects.equals(gender, that.gender) && Objects.equals(homeworld, that.homeworld) && Objects.equals(films, that.films) && Objects.equals(species, that.species) && Objects.equals(vehicles, that.vehicles) && Objects.equals(starships, that.starships) && Objects.equals(created, that.created) && Objects.equals(edited, that.edited) && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, mass, hairColor, skinColor, eyeColor, birthYear, gender, homeworld, films, species, vehicles, starships, created, edited, url);
    }

    // Para ver los valores de los objetos

    @Override
    public String toString() {
        return "StarPersonages{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", mass='" + mass + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", gender='" + gender + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", films=" + films +
                ", species=" + species +
                ", vehicles=" + vehicles +
                ", starships=" + starships +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
