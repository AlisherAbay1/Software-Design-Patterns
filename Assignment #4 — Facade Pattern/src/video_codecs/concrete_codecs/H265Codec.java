package video_codecs.concrete_codecs;

import video_codecs.VideoCodec;
import java.util.Arrays;

public class H265Codec implements VideoCodec {
    private static final double COMPRESSION_RATIO = 0.4; 

    public byte[] encode(byte[] dataToEncode) {
        System.out.println("H.265 codec encoded following bytes: " + Arrays.toString(dataToEncode));
        byte[] encoded = new byte[dataToEncode.length];
        for (int i = 0; i < dataToEncode.length; i++) {
            encoded[i] = dataToEncode[dataToEncode.length - 1 - i];
        }
        return encoded;
    }
    
    public byte[] decode(byte[] dataToDecode) {
        System.out.println("H.265 codec decoded following bytes: " + Arrays.toString(dataToDecode));
        byte[] decoded = new byte[dataToDecode.length];
        for (int i = 0; i < dataToDecode.length; i++) {
            decoded[i] = dataToDecode[dataToDecode.length - 1 - i];
        }
        return decoded;
    }

    public int calculateBitrate(int bitrate) {
        return (int) (bitrate * COMPRESSION_RATIO);
    }
}
