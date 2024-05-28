package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0168e;
import androidx.appcompat.view.menu.InterfaceC0174k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;
import p039d.C2957j;
import p133k.InterfaceC3703e;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0174k.a, View.OnClickListener, ActionMenuView.ActionMenuChildView {

    /* renamed from: n */
    C0170g f765n;

    /* renamed from: o */
    private CharSequence f766o;

    /* renamed from: p */
    private Drawable f767p;

    /* renamed from: q */
    C0168e.b f768q;

    /* renamed from: r */
    private ForwardingListener f769r;

    /* renamed from: s */
    AbstractC0163b f770s;

    /* renamed from: t */
    private boolean f771t;

    /* renamed from: u */
    private boolean f772u;

    /* renamed from: v */
    private int f773v;

    /* renamed from: w */
    private int f774w;

    /* renamed from: x */
    private int f775x;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0162a extends ForwardingListener {
        public C0162a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public InterfaceC3703e getPopup() {
            AbstractC0163b abstractC0163b = ActionMenuItemView.this.f770s;
            if (abstractC0163b != null) {
                return abstractC0163b.mo925a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStarted() {
            InterfaceC3703e popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0168e.b bVar = actionMenuItemView.f768q;
            return bVar != null && bVar.invokeItem(actionMenuItemView.f765n) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0163b {
        /* renamed from: a */
        public abstract InterfaceC3703e mo925a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    private boolean m920d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: e */
    private void m921e() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f766o);
        if (this.f767p != null && (!this.f765n.m1035B() || (!this.f771t && !this.f772u))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f766o : null);
        CharSequence contentDescription = this.f765n.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f765n.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f765n.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.setTooltipText(this, z12 ? null : this.f765n.getTitle());
        } else {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    /* renamed from: a */
    public boolean mo922a() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    /* renamed from: b */
    public void mo923b(C0170g c0170g, int i10) {
        this.f765n = c0170g;
        setIcon(c0170g.getIcon());
        setTitle(c0170g.m1042i(this));
        setId(c0170g.getItemId());
        setVisibility(c0170g.isVisible() ? 0 : 8);
        setEnabled(c0170g.isEnabled());
        if (c0170g.hasSubMenu() && this.f769r == null) {
            this.f769r = new C0162a();
        }
    }

    /* renamed from: c */
    public boolean m924c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    public C0170g getItemData() {
        return this.f765n;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return m924c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return m924c() && this.f765n.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0168e.b bVar = this.f768q;
        if (bVar != null) {
            bVar.invokeItem(this.f765n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f771t = m920d();
        m921e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean m924c = m924c();
        if (m924c && (i13 = this.f774w) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f773v);
        } else {
            i12 = this.f773v;
        }
        if (mode != 1073741824 && this.f773v > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (m924c || this.f767p == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f767p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.f765n.hasSubMenu() && (forwardingListener = this.f769r) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f772u != z10) {
            this.f772u = z10;
            C0170g c0170g = this.f765n;
            if (c0170g != null) {
                c0170g.m1038c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f767p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f775x;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        m921e();
    }

    public void setItemInvoker(C0168e.b bVar) {
        this.f768q = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f774w = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC0163b abstractC0163b) {
        this.f770s = abstractC0163b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f766o = charSequence;
        m921e();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f771t = m920d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2957j.f12572v, i10, 0);
        this.f773v = obtainStyledAttributes.getDimensionPixelSize(C2957j.f12577w, 0);
        obtainStyledAttributes.recycle();
        this.f775x = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f774w = -1;
        setSaveEnabled(false);
    }
}
