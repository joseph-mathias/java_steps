import java.util.ArrayList;
import java.util.List;

public class Genetrics {
    public static void main(String[] args) {
        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<Integer>(10);
        System.out.println(iObj.getObject());

        SingleGenericHolder<String> sObj = new SingleGenericHolder<String>("Simple Code!");
        System.out.println(sObj.getObject());
    }
}

class SingleGenericHolder<T>{
    T obj;

    SingleGenericHolder(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }
}































class NonGeneric{
    public void types() {
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
    }
}
class Genetric{
    public void types2() {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        String s = list.get(0);
    }
}

