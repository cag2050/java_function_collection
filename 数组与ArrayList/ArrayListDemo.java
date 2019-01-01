import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void iteratorMethod(ArrayList value) {
        Iterator iterator = value.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        // 添加
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);
        // 遍历
//        iteratorMethod(arrayList);
        // 删除
        arrayList.remove(1);
//        iteratorMethod(arrayList);
        System.out.println(arrayList);
        // 修改
        arrayList.set(0, "aaa");
        System.out.println(arrayList);
    }
}
