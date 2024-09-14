package TextAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] smiles = new String[] { ":(", "=(", ":|"};
    @Override
    protected String[] getKeywords() {
        return smiles;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
