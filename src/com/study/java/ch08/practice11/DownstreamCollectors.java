package com.study.java.ch08.practice11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class DownstreamCollectors {
    
    public static class City {
        private String name;
        private String state;
        private int population;

        public City(String name, String state, int population) {
           this.name = name;
           this.state = state;
           this.population = population;
        }

        public String getName() { return name; }
        public String getState() { return state; }
        public int getPopulation() { return population; }
        
        public String toString() { return name; }
    }

    public static Stream<City> readCities(String filename) throws IOException {
        return Files.lines(Paths.get(filename)).map(l -> l.split(", ")).map(a -> new City(a[0], a[1], Integer.parseInt(a[2]))); 
    }
    
    public static Stream<String> codePoints(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = s.offsetByCodePoints(i, 1);
            result.add(s.substring(i, j));
            i = j;
        }
        return result.stream();
    }

    public static void main(String[] args) throws IOException {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<Locale>> countryToLocaleSet = locales.collect(
           groupingBy(Locale::getCountry, toSet()));// 리스트 대신 집합이 필요할때 toSet.기능 이용
        System.out.println("countryToLocaleSet: " + countryToLocaleSet);   

        locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Long> countryToLocaleCounts = locales.collect(
           groupingBy(Locale::getCountry, counting()));// counting, 모은 요소의 개수를 센다
        System.out.println("countryToLocaleCounts: " + countryToLocaleCounts);   

        Stream<City> cities = readCities("cities.txt");
        Map<String, Integer> stateToCityPopulation = cities.collect(
           groupingBy(City::getState, summingInt(City::getPopulation)));
        System.out.println("stateToCityPopulation: " + stateToCityPopulation);

        cities = readCities("cities.txt");
        Map<String, Optional<City>> stateToLargestCity = cities.collect(
            groupingBy(City::getState,
            maxBy(Comparator.comparing(City::getPopulation))));
        System.out.println("stateToLargestCity: " + stateToLargestCity);        
        
        cities = readCities("cities.txt");
        Map<String, Optional<String>> stateToLongestCityName = cities.collect(
           groupingBy(City::getState, 
              mapping(City::getName,
                 maxBy(Comparator.comparing(String::length)))));

        System.out.println("stateToLongestCityName: " + stateToLongestCityName);

        locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Set<String>> countryToLanguages = locales.collect(
           groupingBy(Locale::getDisplayCountry, 
              mapping(Locale::getDisplayLanguage,// mapping 컬렉터는 함수를 다운스트림 결과에 적용하며, 이 결과를 처리할 또 다른 컬렉터를 받음
                 toSet())));
        System.out.println("countryToLanguages: " + countryToLanguages);   

        cities = readCities("cities.txt");
        Map<String, Set<String>> codePointsByState;


        
        cities = readCities("cities.txt");
        Map<String, IntSummaryStatistics> stateToCityPopulationSummary = cities.collect(
           groupingBy(City::getState,
              summarizingInt(City::getPopulation)));
        System.out.println(stateToCityPopulationSummary.get("NY"));

        cities = readCities("cities.txt");
        Map<String, String> stateToCityNames = cities.collect(
           groupingBy(City::getState,
              reducing("", City::getName,
                 (s, t) -> s.length() == 0 ? t : s + ", " + t)));

        cities = readCities("cities.txt");
        stateToCityNames = cities.collect(
           groupingBy(City::getState,
              mapping(City::getName,
                 joining(", "))));
        System.out.println("stateToCityNames: " + stateToCityNames); 
    }
}
