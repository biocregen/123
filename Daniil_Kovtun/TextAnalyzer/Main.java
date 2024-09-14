package TextAnalyzer;

import org.w3c.dom.Text;

public class Main {
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++) {
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        String[] keywordsSpam = {"jopa", "dora"};
        int maxLength = 105;
        String text = "abcdef 555555555555555555555555555555555555555555555555555555 opa mmm";
        SpamAnalyzer spamCheck = new SpamAnalyzer(keywordsSpam);
        TooLongTextAnalyzer tooLongCheck = new TooLongTextAnalyzer(maxLength);
        NegativeTextAnalyzer negativeCheck = new NegativeTextAnalyzer();
        TextAnalyzer[] arrayAnalyzers = new TextAnalyzer[] {negativeCheck, spamCheck,  tooLongCheck};
        System.out.println(checkLabels(arrayAnalyzers,  text));
    }
}
