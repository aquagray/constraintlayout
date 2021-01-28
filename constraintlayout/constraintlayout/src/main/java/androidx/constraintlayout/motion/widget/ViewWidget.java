package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;

import androidx.constraintlayout.core.motion.utils.ClRect;
import androidx.constraintlayout.core.motion.utils.Widget;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewWidget implements Widget {
    android.view.View mView;
    ViewWidgetFactory factory;

    public ViewWidget(View view, ViewWidgetFactory viewWidgetFactory) {
        mView = view;
        viewWidgetFactory = viewWidgetFactory;
    }

    static class ViewWidgetFactory {
        HashMap<View, ViewWidget> mWidgetMap = new HashMap<View, ViewWidget>();
        ArrayList<ViewWidget> mEmpty = new ArrayList<ViewWidget>();

        ViewWidget getWidget(View view) {
            if (mWidgetMap.containsKey(view)) {
                return mWidgetMap.get(view);
            }
            if (!mEmpty.isEmpty()) {
                ViewWidget reuse = mEmpty.remove(0);
                if (reuse != null) {
                    reuse.mView = view;
                    return reuse;
                }
            }
            ViewWidget ret = new ViewWidget(view, this);
            mWidgetMap.put(view, ret);
            return ret;
        }
    }

    @Override
    public void setRotation(float rotation) {
        mView.setRotation(rotation);
    }

    @Override
    public void setRotationY(float rotationY) {
        mView.setRotationY(rotationY);
    }

    @Override
    public void setRotationX(float rotationX) {
        mView.setRotationX(rotationX);
    }

    @Override
    public void setScaleX(float scaleX) {
        mView.setScaleX(scaleX);
    }

    @Override
    public void setScaleY(float scaleY) {
        mView.setScaleY(scaleY);
    }

    @Override
    public void setPivotX(float pivotX) {
        mView.setPivotX(pivotX);
    }

    @Override
    public void setPivotY(float pivotY) {
        mView.setPivotY(pivotY);
    }

    @Override
    public void setElevation(float elevation) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mView.setElevation(elevation);
        }
    }

    @Override
    public float getTranslationX() {
        return mView.getTranslationX();
    }

    @Override
    public float getTranslationY() {
        return mView.getTranslationY();
    }

    @Override
    public float getTranslationZ() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return mView.getTranslationZ();
        }
        return 0;
    }

    @Override
    public boolean isLayoutRequested() {
        return mView.isLayoutRequested();
    }

    @Override
    public void setTranslationX(float translationX) {
        mView.setTranslationX(translationX);
    }

    @Override
    public void setTranslationY(float translationY) {
        mView.setTranslationY(translationY);
    }

    @Override
    public void setTranslationZ(float translationZ) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mView.setTranslationZ(translationZ);
        }
    }

    @Override
    public void layout(int l, int t, int r, int b) {
        mView.layout(l, t, r, b);
    }

    @Override
    public void measureExactly(int width, int height) {
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.EXACTLY);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(height, View.MeasureSpec.EXACTLY);
        mView.measure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public int getWidth() {
        return mView.getWidth();
    }

    @Override
    public int getHeight() {
        return mView.getHeight();
    }

    @Override
    public int getTop() {
        return mView.getTop();
    }

    @Override
    public void setTop(int top) {
        mView.setTop(top);
    }

    @Override
    public void setBottom(int bottom) {
        mView.setBottom(bottom);
    }

    @Override
    public int getLeft() {
        return mView.getLeft();
    }

    @Override
    public void setLeft(int left) {
        mView.setLeft(left);
    }

    @Override
    public int getRight() {
        return mView.getRight();
    }

    @Override
    public void setRight(int right) {
        mView.setRight(right);
    }

    @Override
    public float getX() {
        return mView.getX();
    }

    @Override
    public void setX(float x) {
        mView.setX(x);
    }

    @Override
    public float getY() {
        return mView.getY();
    }

    @Override
    public void setY(float y) {
        mView.setY(y);
    }

    @Override
    public float getZ() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return mView.getZ();
        }
        return 0;
    }

    @Override
    public int getVisibility() {
        return mView.getVisibility();
    }

    @Override
    public float getRotation() {
        return mView.getRotation();
    }

    @Override
    public float getRotationY() {
        return mView.getRotationY();
    }

    @Override
    public float getRotationX() {
        return mView.getRotationX();
    }

    @Override
    public float getScaleX() {
        return mView.getScaleX();
    }

    @Override
    public float getScaleY() {
        return mView.getScaleY();
    }

    @Override
    public float getPivotX() {
        return mView.getPivotX();
    }

    @Override
    public float getPivotY() {
        return mView.getPivotY();
    }

    @Override
    public float getAlpha() {
        return mView.getAlpha();
    }

    @Override
    public void setAlpha(float alpha) {
        mView.setAlpha(alpha);
    }

    @Override
    public float getElevation() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return mView.getElevation();
        }
        return 0;
    }

    @Override
    public Widget getParent() {
        return null;
    }

    @Override
    public Widget findViewById(int mTransformPivotTarget) {
        return null;
    }

    @Override
    public Widget findSiblingId(int id) {
        return null;
    }

    @Override
    public int getBottom() {
        return mView.getBottom();
    }

    @Override
    public void setVisibility(int visibility) {
        mView.setVisibility(visibility);
    }

    @Override
    public int getId() {
        return mView.getId();
    }

    @Override
    public String getConstraintTag() {
        String tag = ((ConstraintLayout.LayoutParams) (mView.getLayoutParams())).constraintTag;
        return tag;
    }

    @Override
    public Object getContext() {
        return mView.getContext();
    }

    @Override
    public String getTypeName() {
        return mView.getResources().getResourceTypeName(mView.getId());
    }

    @Override
    public int getMeasuredWidth() {
        return mView.getMeasuredWidth();
    }

    @Override
    public int getMeasuredHeight() {
        return mView.getMeasuredHeight();
    }

    @Override
    public Class getWidgetClass() {
        return mView.getClass();
    }

    @Override
    public Object getPlatformObject() {
        return mView;
    }

    @Override
    public Matrix getMatrix() {
        android.graphics.Matrix m = mView.getMatrix();
        return new Matrix() {
            @Override
            public void mapRect(ClRect rect) {
                RectF rectF = new RectF();
                rectF.bottom = rect.bottom;
                rectF.top = rect.top;
                rectF.left = rect.left;
                rectF.right = rect.right;
                m.mapRect(rectF);
                rect.bottom = rectF.bottom;
                rect.top = rectF.top;
                rect.left = rectF.left;
                rect.right = rectF.right;
            }
        };
    }

    @Override
    public void parentViewTransition(int mViewTransitionOnNegativeCross, Widget call) {
        ((MotionLayout) mView.getParent()).viewTransition(mViewTransitionOnNegativeCross, ((ViewWidget) call).mView);
    }

    @Override
    public void setTag(int tag, Object value) {
        mView.setTag(tag, value);
    }

    @Override
    public Object getTag(int tag) {
        return mView.getTag(tag);
    }


}
