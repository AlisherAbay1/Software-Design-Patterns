# Assignment #4 — Facade

Video conversion demo: a client asks to convert a video into another format
with a single call, while a small subsystem of unaware, independently usable
classes does the actual work of decoding, re-encoding, and handling the
audio behind the scenes.

## Facade

`VideoConverter` is the Facade, exposing one simple method — `convert()` —
that hides the coordination of the subsystem. The subsystem itself is split
into three classes with distinct responsibilities: `CodecFactory` resolves
the right `VideoCodec` implementation for a given format (`H264Codec`,
`H265Codec`, `Vp9Codec` are the Concrete Codecs), `BitrateReader` reads the
bitrate of the source file, and `AudioMixer` normalizes and mixes the
video's audio tracks. `VideoFile` and `AudioFile` are plain data objects
passed between the subsystem classes.

None of the subsystem classes know that `VideoConverter` exists, they can
just as easily be instantiated and called directly by a client that needs
more control, as `Main` demonstrates alongside the normal Facade usage.