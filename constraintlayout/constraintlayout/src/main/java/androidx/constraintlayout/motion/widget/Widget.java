package androidx.constraintlayout.motion.widget;

import android.graphics.Matrix;

public interface Widget {
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

    void measure(int widthMeasureSpec, int heightMeasureSpec);

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

    Matrix getMatrix();

    void parentViewTransition(int mViewTransitionOnNegativeCross, Widget call);
}
