package base_objects;

public class AudioFile {
    private String trackName;
    private byte[] audio;
    private Integer bitrate;

    public AudioFile(String trackName, byte[] audio, Integer bitrate) {
        this.trackName = trackName;
        this.audio = audio;
        this.bitrate = bitrate;
    }

    public String getTrackName() {
        return trackName;
    }

    public byte[] getAudio() {
        return audio;
    }

    public Integer getBitrate() {
        return bitrate;
    }
}
