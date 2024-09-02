package level23.talk3.task5;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>
    {
       public SimpleObject<String> getInstance(){
            return null;
        }
    }
}
