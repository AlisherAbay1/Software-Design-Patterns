package video_codecs;

public interface VideoCodec {
    public void encode(byte[] dataToEncode);
    public void decode(byte[] dataToDecode);
}
