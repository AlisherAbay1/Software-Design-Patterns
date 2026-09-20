package video_codecs.concrete_codecs;

import video_codecs.VideoCodec;
import java.util.Arrays;

public class H265Codec implements VideoCodec {
    public void encode(byte[] dataToEncode) {
        System.out.println("H.265 codec encoded following bytes: " + Arrays.toString(dataToEncode));
    }
    public void decode(byte[] dataToDecode) {
        System.out.println("H.265 codec decoded following bytes: " + Arrays.toString(dataToDecode));
    }
}
