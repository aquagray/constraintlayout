package androidx.constraintlayout.core.motion.utils;

import java.util.Random;

/**
 * A simple class to store keyFrame data which is in the range of 0-100 inclusive.
 * Typical number of keyframes is < 5 so brute force is used
 * @param <T>
 */
public class KeyFrameArray<T> {
    int mCount;
    int[] mKey = new int[101];
    @SuppressWarnings("unchecked")
    T[] mValue =  (T[]) (new Comparable<?>[101]);

    public void append(int index, T value) {
        int pos = mCount;
        for (; pos > 0; pos--) {
            if (mKey[pos - 1] < index) {
                break;
            }
            if (mKey[pos - 1] == index) {
                mValue[pos - 1] = value;
                return;
            }
        }
        for (int i = mCount - 1; i >= pos; i--) {
            mKey[i + 1] = mKey[i];
            mValue[i + 1] = mValue[i];
        }
        mKey[pos] = index;
        mValue[pos] = value;
        mCount++;
    }

    public int size() {
        return mCount;
    }

    public T valueAt(int i) {
        return mValue[i];
    }

    public int keyAt(int i) {
        return mKey[i];
    }
    void dump(){
        for (int i = 0; i < mCount; i++) {
            System.out.println("["+i+"] "+mKey[i] +" = "+mValue[i]);
        }
    }

    public static void main(String []arg) {
        KeyFrameArray<String> array = new KeyFrameArray<>();
        Random r = new Random(423);
        for (int i = 0; i < 23; i++) {
            int index = r.nextInt(101);
            String str = " --"+i+"-- ";
            System.out.println(index +" , "+ str);
           array.append(index,str);
        }
        array.dump();
    }
}
