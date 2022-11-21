import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> users = new HashMap<>();
        ArrayList<String> resultList = new ArrayList<>();
        users.put(1, "Pavel");
        users.put(2, "Oleg");
        users.put(3, "Stepan");
        users.put(4, "Dmitriy");
        users.put(5, "Egor");
        users.put(6, "Ivan");
        users.put(7, "Aleksey");
        users.put(8, "Evgeniy");
        users.put(9, "Sergey");
        users.put(10, "Daniil");
        users.put(11, "Nazar");
        users.put(12, "Andrey");
        users.put(13, "Konstantin");
        users.put(14, "Matvei");
        users.put(15, "Leonid");

        users.keySet().stream().filter(x -> (x == 1) || (x == 2) || (x == 5) || (x == 8) || (x == 9) || (x == 13))
                .forEach(x -> {
                    if (users.get(x).length() % 2 != 0) {
                        StringBuilder builder = new StringBuilder(users.get(x));
                        resultList.add(builder.reverse().toString());
                    }
                });

        System.out.println(users.values());
        System.out.println(resultList);

    }
}
