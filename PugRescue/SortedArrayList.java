import java.util.Arrays;

public class SortedArrayList<E extends Comparable<E>> extends MyArrayList<E> {

    @Override
    public boolean contains(E obj) {
        if (super.internalArray.length == 0) {
            return false;
        }
        if (Arrays.binarySearch(super.internalArray, obj) >= 0) {
            return true;
        }
        return false;
    }

    // May not contain more than one of the same object
    @Override
    public boolean add(E obj) {
        if (contains(obj)) {
            return false;
        }
        if (size() == 0) {
            super.add(obj);
        } else {
            int low = 0;
            int high = super.internalArray.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (high == low) {
                    super.add(high, obj);
                    break;
                }

                if (super.internalArray[mid].compareTo(obj) > 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return true;
    }

    @Override
    public boolean remove(E obj) {
        return super.remove(obj);
    }

    public E min() {
        return super.internalArray[0];
    }

    public E max() {
        return super.internalArray[super.internalArray.length - 1];
    }


}
