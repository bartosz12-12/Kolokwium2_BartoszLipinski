import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Kandydat> lista = new ArrayList<Kandydat>();
        Kandydat kandydat1 = new Kandydat("MAciej", 22, "magister", 1);
        Kandydat kandydat2 = new Kandydat("Karol", 22, "magister", 2);
        Kandydat kandydat3 = new Kandydat("Bohdan", 65, "magister", 30);
        Kandydat kandydat4 = new Kandydat("Dorota", 22, "licencjat", 3);
        Kandydat kandydat5 = new Kandydat("BAsia", 38, "licencjat", 7);

        lista.add(kandydat1);
        lista.add(kandydat2);
        lista.add(kandydat3);
        lista.add(kandydat4);
        lista.add(kandydat5);

        for(int i = 0; i <=lista.size()-1
                ; i++){
            System.out.println(lista.get(i).getNazwa());
        }
        System.out.println(Qualified(kandydat1));
        System.out.println("PO SORTOWNIU:");
        lista.sort(Kandydat::compareTo);
        for(int i = 0; i <=lista.size()-1
                ; i++){
            System.out.println(lista.get(i).getNazwa());
        }
        System.out.println(Qualified(kandydat1));

    }
    public static boolean Qualified(Kandydat k){
        Rekrutacja.set();
        if (k.getLataDoswiadczenia() >= Rekrutacja.getDoswiadczenie())
            return true;

        return false;
    }
    public static HashMap<Integer, String> RecruitmentMap(ArrayList<Kandydat> list)
    {
        HashMap<Integer, String> r = new HashMap<Integer, String>();
        for(Kandydat o : list)
        {
            if(Qualified(o))
            {
                r.put(o.getLataDoswiadczenia(), o.getNazwa());
            }
        }
        return r;
}
}