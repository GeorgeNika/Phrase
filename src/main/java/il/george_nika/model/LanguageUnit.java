package il.george_nika.model;

import lombok.Data;

/**
 * Created by George on 16.06.2017.
 */
@Data
public class LanguageUnit {

    private String russian;
    private String hebrew;
    private String transcription;

    public LanguageUnit() {
        this.russian = "";
        this.hebrew = "";
        this.transcription = "";
    }

    public LanguageUnit(String russian, String hebrew, String transcription) {
        this.russian = russian;
        this.hebrew = hebrew;
        this.transcription = transcription;
    }

    public void addLanguageUnit(LanguageUnit languageUnit){
        this.russian = russian + " " + languageUnit.getRussian();
        this.hebrew = hebrew + " " + languageUnit.getHebrew();
        this.transcription = transcription + " " + languageUnit.getTranscription();
    }
}
