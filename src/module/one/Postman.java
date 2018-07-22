package module.one;

import java.util.ArrayList;

public class Postman {

    private static Postman postamn;
    private static String newspaper = "Газета № ";
    private static ArrayList<String> editionNewspaper;

    private Postman(){
        editionNewspaper = new ArrayList<>();

    }

    public static Postman initPostmam(){
        if (postamn == null){
            postamn = new Postman();
        }

        return postamn;
    }

    protected ArrayList<String> createСirculation(){
        for (int i = 0; i < 100; i++) {
            editionNewspaper.add(newspaper + i);
        }
        return editionNewspaper;
    }

    public String getNewspaper(int number){
        return editionNewspaper.get(number);
    }

}
