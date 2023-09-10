package fit;

public class Song {
    public String name;
    private Integer playbackCount;
    /**
     * Warning: can't return 0 to ensure backwards compatibility
     * there's another method elsewhere that divides the song count by the playback count, so it would divide by zero
     * returns null when the playback count is empty
     */
    public Integer getPlaybackCount(){
        return this.playbackCount;
    }
    public void increasePlaybackCount(){
        if( this.playbackCount == null ){
            this.playbackCount = 0;
        }
        this.playbackCount++;
    }
}
