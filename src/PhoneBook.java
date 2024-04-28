import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
// Введите свое решение ниже Добавляет запись в телефонную книгу.
        if (phoneBook.containsKey(name))
            phoneBook.get(name).add(phoneNum);
        else {
            ArrayList<Integer> phoneList = new ArrayList<>();
            phoneList.add(phoneNum);
            phoneBook.put(name, phoneList);
        }


    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже Поиск номеров телефона по имени в телефонной книге.
        ArrayList<Integer> res = new ArrayList<>();
        if (phoneBook.containsKey(name))
            res = phoneBook.get(name);
        return res;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже Возвращает всю телефонную книгу
        return phoneBook;
    }
}