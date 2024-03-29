package Map;

import java.util.ArrayList;

public class MyMap<X, Y> {
    private final ArrayList<X> keys;
    private final ArrayList<Y> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(X key, Y value) {
        int i = keys.indexOf(key);
        if (i == -1) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(i, value);
        }
    }

    public Y get(X key) {
        int i = keys.indexOf(key);
        if (i != -1) {
            return values.get(i);
        }
        return null;
    }

    public Y remove(X key) {
        int i = keys.indexOf(key);
        if (i != -1) {
            Y temp = values.get(i);
            keys.remove(i);
            values.remove(i);
            return temp;
        }
        return null;
    }
}
