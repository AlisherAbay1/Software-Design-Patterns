package video_utils;

import base_objects.VideoFile;

public class BitrateReader {
    public Integer read(VideoFile videoFile) {
        return videoFile.getBitrate();
    }
}