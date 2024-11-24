package com.anabelenhernandez.rna_transcription;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RnaTranscriptionTest {

    @Test
    public void testTranscribeGtoC() {
        assertEquals("C", RnaTranscription.transcribe("G"));
    }

    @Test
    public void testTranscribeCtoG() {
        assertEquals("G", RnaTranscription.transcribe("C"));
    }

    @Test
    public void testTranscribeTtoA() {
        assertEquals("A", RnaTranscription.transcribe("T"));
    }

    @Test
    public void testTranscribeAtoU() {
        assertEquals("U", RnaTranscription.transcribe("A"));
    }

    @Test
    public void testTranscribeFullSequence() {
        assertEquals("UGCACCAGAAUU", RnaTranscription.transcribe("ACGTGGTCTTAA"));
    }
}
