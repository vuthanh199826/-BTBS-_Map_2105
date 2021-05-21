import java.util.*;
import java.util.Collections;
import java.util.Comparator;

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
                map.replace(key, student);
            }
        }
    }

    public void sort(int option) {
        Set<Map.Entry<String, Student>> entries = map.entrySet();                                 // Tạo set entry
        List<Map.Entry<String, Student>> entryList = new ArrayList<>(entries);                    //convert thành list
        Collections.sort(entryList, new Comparator<Map.Entry<String, Student>>() {                // sắp xếp list
            @Override
            public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
                if (option == 1) {
                    return o1.getValue().getName().compareTo(o2.getValue().getName());
                } else if(option == 2){
                    return o1.getValue().getAge() - o2.getValue().getAge();
                }else {
                    return o1.getValue().getMSV().compareTo(o2.getValue().getMSV());
                }
            }
        });
        LinkedHashMap<String, Student> sortedMap = new LinkedHashMap<>(entryList.size());          // tạo linkedhasmap và put vào list
        for (Map.Entry<String, Student> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        Set<String> set = sortedMap.keySet();
        for (String key : set) {
            System.out.println(sortedMap.get(key));
        }

    }
}
