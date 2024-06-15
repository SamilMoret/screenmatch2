package br.com.alura.screenmatch2.service;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class ConsultaGoogleTranslate {
    private static final String API_KEY = System.getenv("TRADUTOR_GOOGLE_APIKEY");

    public static String obterTraducao(String texto) {
        Translate translate = TranslateOptions.newBuilder().setApiKey(API_KEY).build().getService();
        Translation translation = translate.translate(
                texto,
                Translate.TranslateOption.sourceLanguage("en"),
                Translate.TranslateOption.targetLanguage("pt")
        );
        return translation.getTranslatedText();
    }
}
