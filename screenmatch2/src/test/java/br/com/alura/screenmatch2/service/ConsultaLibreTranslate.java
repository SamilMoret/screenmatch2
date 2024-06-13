ppackage br.com.alura.screenmatch2.service;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import javax.imageio.spi.IIORegistry;

public class ConsultaGoogleTranslate {
    public static String obterTraducao(String texto) {
        // Configurar o serviço de tradução
        IIORegistry TranslateOptions;
        Translate translate = TranslateOptions.getDefaultInstance().getService();

        // Traduzir o texto
        Translation translation = translate.translate(
                texto,
                Translate.TranslateOption.sourceLanguage("en"),
                Translate.TranslateOption.targetLanguage("pt")
        );

        return translation.getTranslatedText();
    }
}
