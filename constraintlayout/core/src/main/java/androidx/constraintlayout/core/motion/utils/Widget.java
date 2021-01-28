package androidx.constraintlayout.core.motion.utils;


public interface Widget {
    public static final int VISIBLE = 0;
    public static final int INVISIBLE = 4;
    public static final int GONE = 8;
    public static final int UNSET = -1;


    void setRotation(float rotation);

    void setRotationY(float rotationY);

    void setRotationX(float rotationX);

    void setScaleX(float scaleX);

    void setScaleY(float scaleY);

    void setPivotX(float pivotX);

    void setPivotY(float pivotY);

    void setElevation(float elevation);

    float getTranslationX();

    float getTranslationY();

    float getTranslationZ();

    boolean isLayoutRequested();

    void setTranslationX(float translationX);

    void setTranslationY(float translationY);

    void setTranslationZ(float translationZ);

    void layout(int l, int t, int r, int b);

    void measureExactly(int width, int height);

    int getWidth();

    int getHeight();

    int getTop();

    void setTop(int top);

    void setBottom(int bottom);

    int getLeft();

    void setLeft(int left);

    int getRight();

    void setRight(int right);

    float getX();

    void setX(float x);

    float getY();

    void setY(float y);

    float getZ();

    int getVisibility();

    float getRotation();

    float getRotationY();

    float getRotationX();

    float getScaleX();

    float getScaleY();

    float getPivotX();

    float getPivotY();

    float getAlpha();

    void setAlpha(float alpha);

    float getElevation();

    Widget getParent();

    Widget findViewById(int mTransformPivotTarget);
    Widget findSiblingId(int id);

    int getBottom();

    void setVisibility(int visibility);

    int getId();

    String getConstraintTag();

    Object getContext();
    String getTypeName();

    int getMeasuredWidth();

    int getMeasuredHeight();

    Class getWidgetClass();

    Object getPlatformObject();

    static interface Matrix {
        void mapRect(ClRect rect);
    }
    Matrix getMatrix();

    void parentViewTransition(int mViewTransitionOnNegativeCross, Widget call);

    void setTag(int tag, Object value);
    Object getTag(int tag);
}
