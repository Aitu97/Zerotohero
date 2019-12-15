package CarInvetory;

public class PlaylistSongs {

    String  singer;
    double duration;
    String writer;
    String title;

    public PlaylistSongs(String singer, String writer, String title, double duration){
        this.singer=singer;
        this.writer=writer;
        this.title=title;
        this.duration=duration;
    }

    public String getSinger(String singer){
        return singer;
    }
    public void setSinger(){
        this.singer=singer;
    }
    public String getWriter(String writer){
        return writer;
    }
    public void setWriter(){
        this.writer=writer;
    }
    public String getTitle(String title){
        return title;
    }
    public void setTitle(){
        this.title=title;
    }
    public double getDuration(double duration){
        return duration;
    }
    public void setDuration(){
        this.duration=duration;
    }




}
