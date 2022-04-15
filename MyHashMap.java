import java.util.LinkedList;
import java.util.List;

public class MyHashMap {

    //Definition of the type of pair we will be saving
    class Pair<Key, Value>{

        public Key key;
        public Value value;

        public Pair(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    //Definition of the Bucket in which we will be saving the above Pairs.
    class Bucket{
        public List<Pair<Integer, Integer>> bucket;

        public Bucket() {
            this.bucket = new LinkedList<Pair<Integer, Integer>>();
        }

        public Integer get(Integer key) {

            for (Pair<Integer, Integer> integerIntegerPair : bucket) {
                if(integerIntegerPair.key.equals(key))
                {
                    return integerIntegerPair.value;
                }
            }

            return -1;
        }

        public void add(Integer key, Integer value) {

            for (Pair<Integer, Integer> integerIntegerPair : bucket) {
                if(integerIntegerPair.key.equals(key))
                {
                    integerIntegerPair.value = value;
                    return;
                }
            }

            bucket.add(new Pair<>(key, value));

        }

        public void remove(Integer key) {

            for (Pair<Integer, Integer> integerIntegerPair : bucket) {
                if(integerIntegerPair.key.equals(key))
                {
                    bucket.remove(integerIntegerPair);
                }
            }
        }


    }


    public static void main(String[] args) {

    }

}
