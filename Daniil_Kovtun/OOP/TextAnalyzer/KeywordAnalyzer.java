package OOP.TextAnalyzer;

abstract public class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    public Label processText(String text) {
        for (int i = 0; i < getKeywords().length; i++) {
            if (text.indexOf(getKeywords()[i]) != -1) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
