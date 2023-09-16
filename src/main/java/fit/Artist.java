package fit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Artist {
    public String name;
    private final List<Album> albumList;
    public Artist(final String name){
        this.albumList = new ArrayList<>(); // we assume this method exists and works, omitted for brevity
        this.name = name;
        this.name.intern();
    }
    // write a method that returns all the songs of an artist that have more than 1000 playbacks, extra credit: sorted by playback count
    public List<Song> getSong(){
        return this.albumList.stream().flatMap(it-> it.getSongs().stream()).
                filter(it ->  it.getPlaybackCount() != null && it.getPlaybackCount() > 1000).
                sorted(Comparator.comparing(Song::getPlaybackCount)).collect(Collectors.toList());
    }
}
