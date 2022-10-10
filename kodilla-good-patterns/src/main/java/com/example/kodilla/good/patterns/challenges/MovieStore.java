package com.example.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MovieStore {

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitleWithTranslations = new HashMap<>();
        booksTitleWithTranslations.put("IM", ironManTranslations);
        booksTitleWithTranslations.put("AV", avengersTranslations);
        booksTitleWithTranslations.put("FL", flashTranslations);

        return booksTitleWithTranslations;
    }


}
