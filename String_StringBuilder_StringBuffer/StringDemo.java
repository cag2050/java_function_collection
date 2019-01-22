import java.util.LinkedList;
import java.util.List;

public class StringDemo {
    public static void main(String[] args) {
        // String 两种方法连接字符：加符号、concat
        String str1 = "aaa";
        str1 = str1 + "bbb";
        System.out.println("str1 = " + str1);

        String str2 = "aaa";
        str2 = str2.concat("bbb");
        System.out.println("str2 = " + str2);

        // jdk 1.8新增的方法：String.join(分隔符, 多个字符串或一个集合)
        List<String> strings = new LinkedList<>();
        strings.add("Java");
        strings.add("is");
        strings.add("cool");
        String message = String.join("-", strings);
        System.out.println("message = " + message);
    }
}
