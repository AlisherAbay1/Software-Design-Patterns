package video_codecs;

public interface VideoCodec {
    public byte[] encode(byte[] dataToEncode);
    public byte[] decode(byte[] dataToDecode);
    public int calculateBitrate(int bitrate);
}
