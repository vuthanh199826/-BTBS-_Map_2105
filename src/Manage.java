import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Manage {
    private Map<String, Student> map;

    public Manage() {
        map = new HashMap<>();
    }

    public void add(String key, Student student) {
        map.put(key, student);
    }

    public void display() {
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(map.get(key));
        }
    }

    public void search(String key) {
        if (map.containsKey(key)) {
            Set<String> set = map.keySet();
            for (String elementOfKey : set) {
                if (elementOfKey.equals(key)) {
                    System.out.println(map.get(key));
                }
            }
        } else {
            System.out.println("Invalid");
        }

    }

    public void delete(String key) {
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("Success");
        } else {
            System.out.println("Invalid");
        }
    }

    public boolean checkKey(String key) {
        if (map.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }

    public void edit(String key, Student student) {
            Set<String> set = map.keySet();
            for (String elementOfKey : set) {
                if (elementOfKey.equals(key)) {
                    map.replace(key,student);
                }
            }
    }
}
