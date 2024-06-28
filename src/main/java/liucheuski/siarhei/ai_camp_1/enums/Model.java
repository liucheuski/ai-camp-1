package liucheuski.siarhei.ai_camp_1.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Model {
    WHISPER("whisper-1"),
    TTS("tts-1");

    private final String name;
}
