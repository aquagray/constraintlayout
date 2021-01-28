package androidx.constraintlayout.core.motion.utils;

public class ClRect {
    public float bottom;
    public float left;
    public float right;
    public float top;

    public float centerX() {
        return 0.5f*(left+right);
    }

    public float centerY() {
        return .5f*(bottom+top);
    }

    public boolean intersect(ClRect mTargetRect) {
        return false;
    }
}
