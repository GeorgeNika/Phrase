package ua.george_nika.model;

/**
 * Created by user on 25.05.16.
 */
public class ThreeString {

    protected String russian;
    protected String translate;
    protected String transcription;

    public ThreeString() {
    }

    public ThreeString(String russian, String translate, String transcription) {
        this.russian = russian;
        this.translate = translate;
        this.transcription = transcription;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }
}

