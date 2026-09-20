package video_utils;

import base_objects.AudioFile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AudioMixer {
    public void normalizeVolume(AudioFile audioFile) {
        System.out.println("Audio volume normalized for audio file: " + audioFile.getTrackName());
    }
    public AudioFile concatenate(String trackName, AudioFile[] audioFiles) {
        ByteArrayOutputStream concatenetedAudioBytes = new ByteArrayOutputStream();
        int maxBitrate = 0;
        for (AudioFile audioFile: audioFiles) {
            if (audioFile.getBitrate() > maxBitrate) {
                maxBitrate = audioFile.getBitrate();
            }
            try {
                concatenetedAudioBytes.write(audioFile.getAudio());
            } catch (IOException e) {
                throw new RuntimeException("Failed to concatenate audio tracks", e);
            }
        }
        return new AudioFile(trackName, concatenetedAudioBytes.toByteArray(), maxBitrate);
    }

    public void mix(AudioFile[] audioFiles) {
        for (AudioFile audioFile: audioFiles) {
            System.out.println("File: " + audioFile.getTrackName() + "mixed.");
        }
    }
}
