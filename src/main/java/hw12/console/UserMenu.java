package hw12.console;

public class UserMenu implements Menu{
    @Override
    public String show() {
            return "________________________________________\n" +
                    "|              Welcome!!!               |\n" +
                    " ---------------------------------------\n" +
                    "| 1 -> Fill With Current Data           |\n"+
                    "| 2 -> Display Families By Index        |\n"+
                    "| 3 -> Get Family Bigger Than           |\n" +
                    "| 4 -> Get Family Less Than             |\n" +
                    "| 5 -> Count Family With Member Number  |\n" +
                    "| 6 -> Create New Family                |\n" +
                    "| 7 -> Delete Family                    |\n" +
                    "| 8 -> Edit Family                      |\n" +
                    "| 9 -> Delete Older Than Children       |\n"+
                    "|_______________________________________|\n";
    }
}
