package ua.george_nika.model;

/**
 * Created by user on 25.05.16.
 */
public class ThreeString {

    protected StringBuilder russian;
    protected StringBuilder translate;
    protected StringBuilder transcription;

    public ThreeString() {
        russian = new StringBuilder();
        translate = new StringBuilder();
        transcription = new StringBuilder();
    }

    public ThreeString(ThreeString threeString) {
        this.russian = new StringBuilder(threeString.getRussian());
        this.translate = new StringBuilder(threeString.getTranslate());
        this.transcription = new StringBuilder(threeString.getTranscription());
    }

    public ThreeString(String russian, String translate, String transcription) {
        this.russian = new StringBuilder(russian);
        this.translate = new StringBuilder(translate);
        this.transcription = new StringBuilder(transcription);
    }

    public void append(ThreeString threeString) {
        russian.append(" ").append(threeString.getRussian());
        translate.append(" ").append(threeString.getTranslate());
        transcription.append(" ").append(threeString.getTranscription());
    }

    public void append(String russian, String translate, String transcription) {
        this.russian.append(" ").append(russian);
        this.translate.append(" ").append(translate);
        this.transcription.append(" ").append(transcription);
    }

    public String getRussian() {
        return russian.toString();
    }

    public String getTranslate() {
        return translate.toString();
    }

    public String getTranscription() {
        return transcription.toString();
    }
}

