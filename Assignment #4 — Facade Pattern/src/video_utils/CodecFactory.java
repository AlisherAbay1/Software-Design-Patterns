package video_utils;

import video_codecs.VideoCodec;
import video_codecs.concrete_codecs.*;

public class CodecFactory {
    public VideoCodec getCodec(String codecName) {
        if (codecName.equals("H.265")) {
            return new H265Codec();
        } else if (codecName.equals("H.264")) {
            return new H264Codec();
        } else if (codecName.equals("VP9")) {
            return new Vp9Codec();
        } else {
            throw new IllegalArgumentException("Unsupported codec: " + codecName);
        }
    }
}
