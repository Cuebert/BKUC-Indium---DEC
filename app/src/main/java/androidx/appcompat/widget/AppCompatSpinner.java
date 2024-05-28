package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.DialogC0152b;
import androidx.core.view.C0690v;
import p039d.C2948a;
import p066f.C3121a;
import p133k.InterfaceC3703e;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {R.attr.spinnerMode};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final C0250c mBackgroundTintHelper;
    int mDropDownWidth;
    private ForwardingListener mForwardingListener;
    private InterfaceC0200f mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    final Rect mTempRect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0194a();

        /* renamed from: n */
        boolean f1006n;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        /* loaded from: classes.dex */
        class C0194a implements Parcelable.Creator<SavedState> {
            C0194a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1006n ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1006n = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    /* loaded from: classes.dex */
    class C0195a extends ForwardingListener {

        /* renamed from: n */
        final /* synthetic */ C0199e f1007n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0195a(View view, C0199e c0199e) {
            super(view);
            this.f1007n = c0199e;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public InterfaceC3703e getPopup() {
            return this.f1007n;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        @SuppressLint({"SyntheticAccessor"})
        public boolean onForwardingStarted() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.showPopup();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    /* loaded from: classes.dex */
    class ViewTreeObserverOnGlobalLayoutListenerC0196b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC0196b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.showPopup();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    /* loaded from: classes.dex */
    class DialogInterfaceOnClickListenerC0197c implements InterfaceC0200f, DialogInterface.OnClickListener {

        /* renamed from: n */
        DialogC0152b f1010n;

        /* renamed from: o */
        private ListAdapter f1011o;

        /* renamed from: p */
        private CharSequence f1012p;

        DialogInterfaceOnClickListenerC0197c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        /* renamed from: a */
        public void mo1123a(CharSequence charSequence) {
            this.f1012p = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        /* renamed from: b */
        public void mo1124b(int i10) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        /* renamed from: c */
        public void mo1125c(int i10, int i11) {
            if (this.f1011o == null) {
                return;
            }
            DialogC0152b.a aVar = new DialogC0152b.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f1012p;
            if (charSequence != null) {
                aVar.m714t(charSequence);
            }
            DialogC0152b m695a = aVar.m712r(this.f1011o, AppCompatSpinner.this.getSelectedItemPosition(), this).m695a();
            this.f1010n = m695a;
            ListView m692f = m695a.m692f();
            m692f.setTextDirection(i10);
            m692f.setTextAlignment(i11);
            this.f1010n.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        /* renamed from: d */
        public CharSequence mo1126d() {
            return this.f1012p;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public void dismiss() {
            DialogC0152b dialogC0152b = this.f1010n;
            if (dialogC0152b != null) {
                dialogC0152b.dismiss();
                this.f1010n = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public int getVerticalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public boolean isShowing() {
            DialogC0152b dialogC0152b = this.f1010n;
            if (dialogC0152b != null) {
                return dialogC0152b.isShowing();
            }
            return false;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f1011o.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public void setAdapter(ListAdapter listAdapter) {
            this.f1011o = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e(AppCompatSpinner.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public void setHorizontalOffset(int i10) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public void setVerticalOffset(int i10) {
            Log.e(AppCompatSpinner.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    /* loaded from: classes.dex */
    public static class C0198d implements ListAdapter, SpinnerAdapter {

        /* renamed from: n */
        private SpinnerAdapter f1014n;

        /* renamed from: o */
        private ListAdapter f1015o;

        public C0198d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1014n = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1015o = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter)) {
                    android.widget.ThemedSpinnerAdapter themedSpinnerAdapter = (android.widget.ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter2 = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter2.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter2.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1015o;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1014n;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1014n;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1014n;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1014n;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1014n;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1015o;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1014n;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1014n;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    /* loaded from: classes.dex */
    class C0199e extends ListPopupWindow implements InterfaceC0200f {

        /* renamed from: n */
        private CharSequence f1016n;

        /* renamed from: o */
        ListAdapter f1017o;

        /* renamed from: p */
        private final Rect f1018p;

        /* renamed from: q */
        private int f1019q;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: n */
            final /* synthetic */ AppCompatSpinner f1021n;

            a(AppCompatSpinner appCompatSpinner) {
                this.f1021n = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0199e c0199e = C0199e.this;
                    AppCompatSpinner.this.performItemClick(view, i10, c0199e.f1017o.getItemId(i10));
                }
                C0199e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0199e c0199e = C0199e.this;
                if (!c0199e.m1130h(AppCompatSpinner.this)) {
                    C0199e.this.dismiss();
                } else {
                    C0199e.this.m1128f();
                    C0199e.super.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: n */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1024n;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1024n = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1024n);
                }
            }
        }

        public C0199e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1018p = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new a(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        /* renamed from: a */
        public void mo1123a(CharSequence charSequence) {
            this.f1016n = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        /* renamed from: b */
        public void mo1124b(int i10) {
            this.f1019q = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        /* renamed from: c */
        public void mo1125c(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            m1128f();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(i10);
            listView.setTextAlignment(i11);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (isShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            setOnDismissListener(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        /* renamed from: d */
        public CharSequence mo1126d() {
            return this.f1016n;
        }

        /* renamed from: f */
        void m1128f() {
            int m1129g;
            Drawable background = getBackground();
            int i10 = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.mTempRect);
                i10 = ViewUtils.isLayoutRtl(AppCompatSpinner.this) ? AppCompatSpinner.this.mTempRect.right : -AppCompatSpinner.this.mTempRect.left;
            } else {
                Rect rect = AppCompatSpinner.this.mTempRect;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.mDropDownWidth;
            if (i11 == -2) {
                int compatMeasureContentWidth = appCompatSpinner.compatMeasureContentWidth((SpinnerAdapter) this.f1017o, getBackground());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.mTempRect;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (compatMeasureContentWidth > i13) {
                    compatMeasureContentWidth = i13;
                }
                setContentWidth(Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(i11);
            }
            if (ViewUtils.isLayoutRtl(AppCompatSpinner.this)) {
                m1129g = i10 + (((width - paddingRight) - getWidth()) - m1129g());
            } else {
                m1129g = i10 + paddingLeft + m1129g();
            }
            setHorizontalOffset(m1129g);
        }

        /* renamed from: g */
        public int m1129g() {
            return this.f1019q;
        }

        /* renamed from: h */
        boolean m1130h(View view) {
            return C0690v.m3813T(view) && view.getGlobalVisibleRect(this.f1018p);
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0200f
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.f1017o = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0200f {
        /* renamed from: a */
        void mo1123a(CharSequence charSequence);

        /* renamed from: b */
        void mo1124b(int i10);

        /* renamed from: c */
        void mo1125c(int i10, int i11);

        /* renamed from: d */
        CharSequence mo1126d();

        void dismiss();

        Drawable getBackground();

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i10);

        void setVerticalOffset(int i10);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        return i11 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1176b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f != null) {
            return interfaceC0200f.getHorizontalOffset();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f != null) {
            return interfaceC0200f.getVerticalOffset();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        return super.getDropDownWidth();
    }

    final InterfaceC0200f getInternalPopup() {
        return this.mPopup;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f != null) {
            return interfaceC0200f.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        return interfaceC0200f != null ? interfaceC0200f.mo1126d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            return c0250c.m1177c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            return c0250c.m1178d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f == null || !interfaceC0200f.isShowing()) {
            return;
        }
        this.mPopup.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.mPopup == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1006n || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0196b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0200f interfaceC0200f = this.mPopup;
        savedState.f1006n = interfaceC0200f != null && interfaceC0200f.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.mForwardingListener;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f != null) {
            if (interfaceC0200f.isShowing()) {
                return true;
            }
            showPopup();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1180f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1181g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f != null) {
            interfaceC0200f.mo1124b(i10);
            this.mPopup.setHorizontalOffset(i10);
        } else {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f != null) {
            interfaceC0200f.setVerticalOffset(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f != null) {
            interfaceC0200f.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C3121a.m13770d(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0200f interfaceC0200f = this.mPopup;
        if (interfaceC0200f != null) {
            interfaceC0200f.mo1123a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1183i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0250c c0250c = this.mBackgroundTintHelper;
        if (c0250c != null) {
            c0250c.m1184j(mode);
        }
    }

    void showPopup() {
        this.mPopup.mo1125c(getTextDirection(), getTextAlignment());
    }

    public AppCompatSpinner(Context context, int i10) {
        this(context, null, C2948a.f12144M, i10);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.setAdapter(new C0198d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2948a.f12144M);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r11 == null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.appcompat.widget.AppCompatSpinner, android.view.View, android.widget.Spinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
