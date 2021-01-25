package androidx.constraintlayout.motion.widget;

import android.os.Build;

public class WidgetImp implements Widget {
    android.view.View View;
    
    @Override
    public void setRotation(float rotation) {
        View.setRotation(rotation);
    }

    @Override
    public void setRotationY(float rotationY) {
        View.setRotationY(rotationY);
    }

    @Override
    public void setRotationX(float rotationX) {
        View.setRotationX(rotationX);
    }

    @Override
    public void setScaleX(float scaleX) {
        View.setScaleX(scaleX);
    }

    @Override
    public void setScaleY(float scaleY) {
        View.setScaleY(scaleY);
    }

    @Override
    public void setPivotX(float pivotX) {
        View.setPivotX(pivotX);
    }

    @Override
    public void setPivotY(float pivotY) {
        View.setPivotY(pivotY);
    }

    @Override
    public void setElevation(float elevation) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            View.setElevation(elevation);
        }
    }

    @Override
    public float getTranslationX() {
        return View.getTranslationX();
    }

    @Override
    public float getTranslationY() {
        return View.getTranslationY();
    }

    @Override
    public float getTranslationZ() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return View.getTranslationZ();
        }
        return 0;
    }

    @Override
    public boolean isLayoutRequested() {
        return View.isLayoutRequested();
    }

    @Override
    public void setTranslationX(float translationX) {
        View.setTranslationX(translationX);
    }

    @Override
    public void setTranslationY(float translationY) {
        View.setTranslationY(translationY);
    }

    @Override
    public void setTranslationZ(float translationZ) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            View.setTranslationZ(translationZ);
        }
    }

    @Override
    public void layout(int l, int t, int r, int b) {
        View.layout(l, t, r, b);
    }

    @Override
    public void measure(int widthMeasureSpec, int heightMeasureSpec) {
        View.measure(widthMeasureSpec, heightMeasureSpec);
    }

     @Override
     public int getWidth() {
        return View.getWidth();
    }

     @Override
     public int getHeight() {
        return View.getHeight();
    }

    @Override
    public int getTop() {
        return View.getTop();
    }

    @Override
    public void setTop(int top) {
        View.setTop(top);
    }

    @Override
    public void setBottom(int bottom) {
        View.setBottom(bottom);
    }

    @Override
    public int getLeft() {
        return View.getLeft();
    }

    @Override
    public void setLeft(int left) {
        View.setLeft(left);
    }

    @Override
    public int getRight() {
        return View.getRight();
    }

    @Override
    public void setRight(int right) {
        View.setRight(right);
    }

    @Override
    public float getX() {
        return View.getX();
    }

    @Override
    public void setX(float x) {
        View.setX(x);
    }

    @Override
    public float getY() {
        return View.getY();
    }

    @Override
    public void setY(float y) {
        View.setY(y);
    }

    @Override
    public float getZ() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return View.getZ();
        }
        return 0;
    }

    @Override
    public int getVisibility() {
        return View.getVisibility();
    }

    @Override
    public float getRotation() {
        return View.getRotation();
    }

    @Override
    public float getRotationY() {
        return View.getRotationY();
    }

    @Override
    public float getRotationX() {
        return View.getRotationX();
    }

    @Override
    public float getScaleX() {
        return View.getScaleX();
    }

    @Override
    public float getScaleY() {
        return View.getScaleY();
    }

    @Override
    public float getPivotX() {
        return View.getPivotX();
    }

    @Override
    public float getPivotY() {
        return View.getPivotY();
    }

    @Override
    public float getAlpha() {
        return View.getAlpha();
    }

    @Override
    public void setAlpha(float alpha) {
        View.setAlpha(alpha);
    }

    @Override
    public float getElevation() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return View.getElevation();
        }
        return 0;
    }



}
