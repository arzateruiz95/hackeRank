package fit;

import java.util.ArrayList;
import java.util.List;

public class Album {
    public String name;
    private List<Song> songs;
    public Album() throws RuntimeException {
        this.songs = new ArrayList<>(); // we assume this method exists and works,  omitted for brevity
    }
    public List<Song> getSongs(){
        return this.songs;
    }
}
