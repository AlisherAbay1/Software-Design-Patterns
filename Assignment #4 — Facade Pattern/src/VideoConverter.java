import base_objects.AudioFile;
import base_objects.VideoFile;
import video_codecs.VideoCodec;
import video_utils.AudioMixer;
import video_utils.BitrateReader;
import video_utils.CodecFactory;

public class VideoConverter {
    public VideoFile convert(VideoFile videoFile, String format) {
        VideoCodec sourceVideoCodec = videoFile.getCodec();
        byte[] decodedVideo = sourceVideoCodec.decode(videoFile.getVideo());

        BitrateReader bitrateReader = new BitrateReader();
        int bitrate = bitrateReader.read(videoFile);

        CodecFactory codecFactory = new CodecFactory();
        VideoCodec newVideoCodec = codecFactory.getCodec(format);
        byte[] encodedVideo = newVideoCodec.encode(decodedVideo);
        int newBitrate = newVideoCodec.calculateBitrate(bitrate);

        AudioMixer audioMixer = new AudioMixer();
        for (AudioFile audioFile: videoFile.getAudioFiles()) {
            audioMixer.normalizeVolume(audioFile);
        }
        audioMixer.mix(videoFile.getAudioFiles());

        VideoFile newVideo = new VideoFile(
            videoFile.getFileName(), 
            encodedVideo, 
            newBitrate, 
            newVideoCodec, 
            videoFile.getAudioFiles()
        );

        return newVideo;
    }
}
