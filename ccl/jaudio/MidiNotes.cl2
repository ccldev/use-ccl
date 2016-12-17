#include ccl/jaudio/Midi.cl2

Audio.Midi.setProperty("C", 60);
Audio.Midi.setProperty("D", 62);
Audio.Midi.setProperty("E", 64);
Audio.Midi.setProperty("F", 65);
Audio.Midi.setProperty("G", 67);
Audio.Midi.setProperty("A", 69);
Audio.Midi.setProperty("B", 71);
Audio.Midi.setProperty("c", 72);
Audio.Midi.setProperty("d", 74);
Audio.Midi.setProperty("e", 76);
Audio.Midi.setProperty("f", 77);
Audio.Midi.setProperty("g", 79);
Audio.Midi.setProperty("a", 81);
Audio.Midi.setProperty("b", 83);

Audio.Midi.setProperty("sharp", <note|note + 1>);
Audio.Midi.setProperty("bsign", <note|note - 1>);