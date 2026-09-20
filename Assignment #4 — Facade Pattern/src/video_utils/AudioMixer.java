package video_utils;

import base_objects.AudioFile;

public class AudioMixer {
    public void normalizeVolume(AudioFile audioFile) {
        System.out.println("Audio volume normalized for audio file: " + audioFile.getTrackName());
    }

    public void mix(AudioFile[] audioFiles) {
        for (AudioFile audioFile: audioFiles) {
            System.out.println("File: " + audioFile.getTrackName() + " mixed.");
        }
    }
}
