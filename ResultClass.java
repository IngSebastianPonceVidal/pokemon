package gml.pokemon.pokemon.list;

public class ResultClass {
    private String name;
    private String url;

    public ResultClass(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
