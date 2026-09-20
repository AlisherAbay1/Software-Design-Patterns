package base_objects;
import video_codecs.VideoCodec;

public class VideoFile {
    private String fileName;
    private byte[] video;
    private VideoCodec codec;
    private AudioFile[] audioFiles;
    private Integer bitrate;

    public VideoFile(String fileName, byte[] video, Integer bitrate, VideoCodec codec) {
        this.fileName = fileName;
        this.video = video;
        this.bitrate = bitrate;
        this.codec = codec;
    }

    public String getFileName() {
        return fileName;
    }

    public byte[] getVideo() {
        return video;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public VideoCodec getCodec() {
        return codec;
    }

    public AudioFile[] getAudioFiles() {
        return audioFiles;
    }
}
