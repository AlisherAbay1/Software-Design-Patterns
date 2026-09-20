import base_objects.AudioFile;
import base_objects.VideoFile;
import video_codecs.concrete_codecs.H264Codec;

public class Main {

    public static void main(String[] args) {
        byte[] rawVideoBytes = {10, 20, 30, 40, 50, 60, 70, 80};

        AudioFile[] audioTracks = {
            new AudioFile("Original audio", new byte[]{1, 2, 3, 4}, 128),
            new AudioFile("Commentary", new byte[]{5, 6, 7, 8}, 96)
        };

        VideoFile sourceVideo = new VideoFile(
            "movie.mp4",
            rawVideoBytes,
            5000,
            new H264Codec(),
            audioTracks
        );

        System.out.println("--- The Facade ---");
        System.out.println("Source file: " + sourceVideo.getFileName()
            + ", bitrait: " + sourceVideo.getBitrate() + " bps");
        System.out.println();

        VideoConverter videoConverter = new VideoConverter();
        VideoFile convertedVideo = videoConverter.convert(sourceVideo, "H.265");

        System.out.println();
        System.out.println("--- Conversion result ---");
        System.out.println("File: " + convertedVideo.getFileName());
        System.out.println("New bitrate: " + convertedVideo.getBitrate() + " bps");
        System.out.println("New codec: " + convertedVideo.getCodec().getClass().getSimpleName());
    }
}
