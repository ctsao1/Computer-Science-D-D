public class SortedArrayList<E extends Comparable<E>> extends MyArrayList<E> {

    private int binarySearch(E[] arr, E key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid].compareTo(key) == 0) {
                return mid;
            }

            if (arr[mid].compareTo(key) > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E obj) {
        return binarySearch(internalArray, obj) != -1;
    }

    // May not contain more than one of the same object
    @Override
    public boolean add(E obj) {
        if (contains(obj)) {
            return false;
        }
        if (size() == 0) {
            add(obj);
        } else {
            int low = 0;
            int high = internalArray.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (high == low) {
                    add(high, obj);;
                    break;
                }

                if (internalArray[mid].compareTo(obj) > 0) {
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
        return internalArray[0];
    }

    public E max() {
        return internalArray[internalArray.length - 1];
    }

}
