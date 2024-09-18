import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList january = new ArrayList();
        ArrayList february = new ArrayList();
        ArrayList march = new ArrayList();
        ArrayList june = new ArrayList();
        ArrayList may = new ArrayList();
        ArrayList november = new ArrayList();
        january.add(1);
        january.add(7);
        february.add(23);
        march.add(8);
        may.add(1);
        may.add(9);
        june.add(12);
        november.add(4);
        HashMap<String, ArrayList<Integer>> stateHolydays = new HashMap<>();
        stateHolydays.put("january", january);
        stateHolydays.put("february", february);
        stateHolydays.put("march", march);
        stateHolydays.put("may", may);
        stateHolydays.put("june", june);
        stateHolydays.put("november", november);


        System.out.println(stateHolydays);
    }
}