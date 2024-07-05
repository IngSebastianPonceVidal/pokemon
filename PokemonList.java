package gml.pokemon.pokemon.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonList {

    private int count;
    private String next;
    private String previous;
    private List<ResultClass> results;

    public PokemonList(String previous, String next, int count, List<ResultClass> results) {
        this.previous = previous;
        this.next = next;
        this.count = count;
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<ResultClass> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "PokemonList{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }

}
