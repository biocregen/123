package Module1;

public class PrintTextPerRole {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder strBuilder = new StringBuilder();
        StringBuilder strBuilderHelp = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            strBuilder.append(roles[i] + ":" + '\n');
            for (int j = 0; j < textLines.length; j++) {
                //boolean result = roles[i].regionMatches(0, textLines[j], 0, roles[i].length());
                //int index = textLines[j].lastIndexOf(roles[i]);
                //if (index == roles[i].length()-1 ) {
                if (roles[i].equals(textLines[j].split(":")[0])) {
                    strBuilder.append(j + 1 + ")" + textLines[j].substring(textLines[j].indexOf(":") + 1) + "\n");
                    //strBuilderHelp.delete(0,strBuilderHelp.length());
                    //strBuilderHelp.append(textLines[j]);
                    //strBuilderHelp.delete(0, roles[i].length()+1);
                    //strBuilder.append(strBuilderHelp + "\n");
                }
            }
            if (i != roles.length - 1) {
                strBuilder.append("\n");
            }
        }
        return strBuilder.toString();
    }
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!", "Артемий Филиппович: Вот не было заботы, так подай!"};
        System.out.print(printTextPerRole(roles, textLines));
        //StringBuilder strBuilder = new StringBuilder();
        //System.out.println(strBuilder.append(roles[2] + ":" + '\n'));
        //System.out.println(strBuilder.append(1 + ") "));
        //System.out.println(strBuilder.delete(0, roles[2].length() + 1));

    }
}
