package ru.netology.java;

public class ManagerFilm {

    private ManagerFilm[] films;
    private int limit;

    public ManagerFilm() {
        this.limit = 5;
        this.films = new ManagerFilm[0];
    }

    public ManagerFilm(int limit) {
        this.limit = limit;
        this.films = new ManagerFilm[0];
    }

    public void addNewFilm(ManagerFilm point) {
        ManagerFilm[] tmp = new ManagerFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = point;
        films = tmp;
    }

    public ManagerFilm[] findAll() {
        return films;

    }

    public ManagerFilm[] findLast() {
        int resultLength;
        if (limit > films.length) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }

        ManagerFilm[] result = new ManagerFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
