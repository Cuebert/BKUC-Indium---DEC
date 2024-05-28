package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.AbstractC0664b;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import p039d.C2951d;
import p039d.C2953f;
import p039d.C2954g;
import p039d.C2955h;
import p039d.C2957j;
import p133k.InterfaceC3703e;

/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    private final View mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    final C0191f mAdapter;
    private final ViewOnClickListenerC0192g mCallbacks;
    private int mDefaultActionButtonContentDescription;
    final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    final DataSetObserver mModelDataSetObserver;
    PopupWindow.OnDismissListener mOnDismissListener;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    AbstractC0664b mProvider;

    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {
        private static final int[] TINT_ATTRS = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS);
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    /* loaded from: classes.dex */
    class C0186a extends DataSetObserver {
        C0186a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.mAdapter.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    /* loaded from: classes.dex */
    class ViewTreeObserverOnGlobalLayoutListenerC0187b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC0187b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.isShowingPopup()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                AbstractC0664b abstractC0664b = ActivityChooserView.this.mProvider;
                if (abstractC0664b != null) {
                    abstractC0664b.subUiVisibilityChanged(true);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    /* loaded from: classes.dex */
    class C0188c extends View.AccessibilityDelegate {
        C0188c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C0660c.m3511z0(accessibilityNodeInfo).m3529W(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    /* loaded from: classes.dex */
    class C0189d extends ForwardingListener {
        C0189d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public InterfaceC3703e getPopup() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStarted() {
            ActivityChooserView.this.showPopup();
            return true;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStopped() {
            ActivityChooserView.this.dismissPopup();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    /* loaded from: classes.dex */
    class C0190e extends DataSetObserver {
        C0190e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.updateAppearance();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    /* loaded from: classes.dex */
    public class C0191f extends BaseAdapter {

        /* renamed from: n */
        private ActivityChooserModel f993n;

        /* renamed from: o */
        private int f994o = 4;

        /* renamed from: p */
        private boolean f995p;

        /* renamed from: q */
        private boolean f996q;

        /* renamed from: r */
        private boolean f997r;

        C0191f() {
        }

        /* renamed from: a */
        public int m1102a() {
            return this.f993n.m1094f();
        }

        /* renamed from: b */
        public ActivityChooserModel m1103b() {
            return this.f993n;
        }

        /* renamed from: c */
        public ResolveInfo m1104c() {
            return this.f993n.m1096h();
        }

        /* renamed from: d */
        public int m1105d() {
            return this.f993n.m1097i();
        }

        /* renamed from: e */
        public boolean m1106e() {
            return this.f995p;
        }

        /* renamed from: f */
        public int m1107f() {
            int i10 = this.f994o;
            this.f994o = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i11 = 0;
            for (int i12 = 0; i12 < count; i12++) {
                view = getView(i12, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i11 = Math.max(i11, view.getMeasuredWidth());
            }
            this.f994o = i10;
            return i11;
        }

        /* renamed from: g */
        public void m1108g(ActivityChooserModel activityChooserModel) {
            ActivityChooserModel m1103b = ActivityChooserView.this.mAdapter.m1103b();
            if (m1103b != null && ActivityChooserView.this.isShown()) {
                m1103b.unregisterObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            this.f993n = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int m1094f = this.f993n.m1094f();
            if (!this.f995p && this.f993n.m1096h() != null) {
                m1094f--;
            }
            int min = Math.min(m1094f, this.f994o);
            return this.f997r ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f995p && this.f993n.m1096h() != null) {
                i10++;
            }
            return this.f993n.m1093e(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return (this.f997r && i10 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C2954g.f12297f, viewGroup, false);
                    inflate.setId(1);
                    ((TextView) inflate.findViewById(C2953f.f12262S)).setText(ActivityChooserView.this.getContext().getString(C2955h.f12315b));
                    return inflate;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != C2953f.f12289x) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C2954g.f12297f, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C2953f.f12287v);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C2953f.f12262S)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f995p && i10 == 0 && this.f996q) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        /* renamed from: h */
        public void m1109h(int i10) {
            if (this.f994o != i10) {
                this.f994o = i10;
                notifyDataSetChanged();
            }
        }

        /* renamed from: i */
        public void m1110i(boolean z10, boolean z11) {
            if (this.f995p == z10 && this.f996q == z11) {
                return;
            }
            this.f995p = z10;
            this.f996q = z11;
            notifyDataSetChanged();
        }

        /* renamed from: j */
        public void m1111j(boolean z10) {
            if (this.f997r != z10) {
                this.f997r = z10;
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0192g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        ViewOnClickListenerC0192g() {
        }

        /* renamed from: a */
        private void m1112a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.mOnDismissListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.mDefaultActivityButton) {
                activityChooserView.dismissPopup();
                Intent m1092b = ActivityChooserView.this.mAdapter.m1103b().m1092b(ActivityChooserView.this.mAdapter.m1103b().m1095g(ActivityChooserView.this.mAdapter.m1104c()));
                if (m1092b != null) {
                    m1092b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(m1092b);
                    return;
                }
                return;
            }
            if (view == activityChooserView.mExpandActivityOverflowButton) {
                activityChooserView.mIsSelectingDefaultActivity = false;
                activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m1112a();
            AbstractC0664b abstractC0664b = ActivityChooserView.this.mProvider;
            if (abstractC0664b != null) {
                abstractC0664b.subUiVisibilityChanged(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            int itemViewType = ((C0191f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.showPopupUnchecked(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.dismissPopup();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.mIsSelectingDefaultActivity) {
                if (i10 > 0) {
                    activityChooserView.mAdapter.m1103b().m1098o(i10);
                    return;
                }
                return;
            }
            if (!activityChooserView.mAdapter.m1106e()) {
                i10++;
            }
            Intent m1092b = ActivityChooserView.this.mAdapter.m1103b().m1092b(i10);
            if (m1092b != null) {
                m1092b.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(m1092b);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.mDefaultActivityButton) {
                if (activityChooserView.mAdapter.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.mIsSelectingDefaultActivity = true;
                    activityChooserView2.showPopupUnchecked(activityChooserView2.mInitialActivityCount);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        return true;
    }

    public ActivityChooserModel getDataModel() {
        return this.mAdapter.m1103b();
    }

    ListPopupWindow getListPopupWindow() {
        if (this.mListPopupWindow == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.mListPopupWindow = listPopupWindow;
            listPopupWindow.setAdapter(this.mAdapter);
            this.mListPopupWindow.setAnchorView(this);
            this.mListPopupWindow.setModal(true);
            this.mListPopupWindow.setOnItemClickListener(this.mCallbacks);
            this.mListPopupWindow.setOnDismissListener(this.mCallbacks);
        }
        return this.mListPopupWindow;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel m1103b = this.mAdapter.m1103b();
        if (m1103b != null) {
            m1103b.registerObserver(this.mModelDataSetObserver);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel m1103b = this.mAdapter.m1103b();
        if (m1103b != null) {
            m1103b.unregisterObserver(this.mModelDataSetObserver);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.mActivityChooserContent.layout(0, 0, i12 - i10, i13 - i11);
        if (isShowingPopup()) {
            return;
        }
        dismissPopup();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        View view = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        this.mAdapter.m1108g(activityChooserModel);
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.mDefaultActionButtonContentDescription = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.mExpandActivityOverflowButtonImage.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.mInitialActivityCount = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setProvider(AbstractC0664b abstractC0664b) {
        this.mProvider = abstractC0664b;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.mIsAttachedToWindow) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    void showPopupUnchecked(int i10) {
        if (this.mAdapter.m1103b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
            ?? r02 = this.mDefaultActivityButton.getVisibility() == 0 ? 1 : 0;
            int m1102a = this.mAdapter.m1102a();
            if (i10 != Integer.MAX_VALUE && m1102a > i10 + r02) {
                this.mAdapter.m1111j(true);
                this.mAdapter.m1109h(i10 - 1);
            } else {
                this.mAdapter.m1111j(false);
                this.mAdapter.m1109h(i10);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (listPopupWindow.isShowing()) {
                return;
            }
            if (!this.mIsSelectingDefaultActivity && r02 != 0) {
                this.mAdapter.m1110i(false, false);
            } else {
                this.mAdapter.m1110i(true, r02);
            }
            listPopupWindow.setContentWidth(Math.min(this.mAdapter.m1107f(), this.mListPopupMaxWidth));
            listPopupWindow.show();
            AbstractC0664b abstractC0664b = this.mProvider;
            if (abstractC0664b != null) {
                abstractC0664b.subUiVisibilityChanged(true);
            }
            listPopupWindow.getListView().setContentDescription(getContext().getString(C2955h.f12316c));
            listPopupWindow.getListView().setSelector(new ColorDrawable(0));
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    void updateAppearance() {
        if (this.mAdapter.getCount() > 0) {
            this.mExpandActivityOverflowButton.setEnabled(true);
        } else {
            this.mExpandActivityOverflowButton.setEnabled(false);
        }
        int m1102a = this.mAdapter.m1102a();
        int m1105d = this.mAdapter.m1105d();
        if (m1102a != 1 && (m1102a <= 1 || m1105d <= 0)) {
            this.mDefaultActivityButton.setVisibility(8);
        } else {
            this.mDefaultActivityButton.setVisibility(0);
            ResolveInfo m1104c = this.mAdapter.m1104c();
            PackageManager packageManager = getContext().getPackageManager();
            this.mDefaultActivityButtonImage.setImageDrawable(m1104c.loadIcon(packageManager));
            if (this.mDefaultActionButtonContentDescription != 0) {
                this.mDefaultActivityButton.setContentDescription(getContext().getString(this.mDefaultActionButtonContentDescription, m1104c.loadLabel(packageManager)));
            }
        }
        if (this.mDefaultActivityButton.getVisibility() == 0) {
            this.mActivityChooserContent.setBackgroundDrawable(this.mActivityChooserContentBackground);
        } else {
            this.mActivityChooserContent.setBackgroundDrawable(null);
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mModelDataSetObserver = new C0186a();
        this.mOnGlobalLayoutListener = new ViewTreeObserverOnGlobalLayoutListenerC0187b();
        this.mInitialActivityCount = 4;
        int[] iArr = C2957j.f12356E;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C0690v.m3849o0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        this.mInitialActivityCount = obtainStyledAttributes.getInt(C2957j.f12366G, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C2957j.f12361F);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C2954g.f12296e, (ViewGroup) this, true);
        ViewOnClickListenerC0192g viewOnClickListenerC0192g = new ViewOnClickListenerC0192g();
        this.mCallbacks = viewOnClickListenerC0192g;
        View findViewById = findViewById(C2953f.f12275j);
        this.mActivityChooserContent = findViewById;
        this.mActivityChooserContentBackground = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C2953f.f12283r);
        this.mDefaultActivityButton = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC0192g);
        frameLayout.setOnLongClickListener(viewOnClickListenerC0192g);
        int i11 = C2953f.f12288w;
        this.mDefaultActivityButtonImage = (ImageView) frameLayout.findViewById(i11);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C2953f.f12285t);
        frameLayout2.setOnClickListener(viewOnClickListenerC0192g);
        frameLayout2.setAccessibilityDelegate(new C0188c());
        frameLayout2.setOnTouchListener(new C0189d(frameLayout2));
        this.mExpandActivityOverflowButton = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i11);
        this.mExpandActivityOverflowButtonImage = imageView;
        imageView.setImageDrawable(drawable);
        C0191f c0191f = new C0191f();
        this.mAdapter = c0191f;
        c0191f.registerDataSetObserver(new C0190e());
        Resources resources = context.getResources();
        this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2951d.f12187d));
    }
}
