import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        // 添加
        linkedHashMap.put("", "全部");
        linkedHashMap.put("a", "aa");
        linkedHashMap.put("b", "bb");
        System.out.println(linkedHashMap);
        // 获取
        System.out.println(linkedHashMap.get("a"));
        // 删除
        linkedHashMap.remove("b");
        System.out.println(linkedHashMap);
        // 修改（重新给key赋值，会覆盖之前值）
        linkedHashMap.put("a", "aaa");
        System.out.println(linkedHashMap);
    }
}
