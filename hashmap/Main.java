package hashmap;

public class Main {
    public static void main(String[] args) {
        Hash_Map<String, Integer> map = new Hash_Map<>();
        map.put("один", 1);
        map.put("два", 2);
        map.put("три", 3);

        System.out.println("Значение ключа 'два': " + map.get("два"));
        System.out.println("Содержит ли map ключ 'три': " + map.containsKey("три"));
        System.out.println("Размер map: " + map.size());

        // Создаем итератор
        Hash_Map.Iterator<String> iterator = map.new Hash_Map_Iterator();

        // Проверяем итератор
        while (iterator.hasNext()) {
            System.out.println("Итератор: " + iterator.next());
        }

        // Удаляем элемент
        iterator.remove();
        System.out.println("Размер map после удаления: " + map.size());

        System.out.println("Содержит ли map значение 2: " + map.containsValue(2));

        // Создаем вторую карту для сравнения
        Hash_Map<String, Integer> map2 = new Hash_Map<>();
        map2.put("четыре", 4);
        map2.put("пять", 5);
        map2.put("шесть", 6); // Добавляем дополнительный элемент

        // Сравниваем карты
        System.out.println("Сравнение map и map2: " + map.compareTo(map2));
        System.out.println("Сравнение map2 и map: " + map.compare(map2, map));
    }
}
