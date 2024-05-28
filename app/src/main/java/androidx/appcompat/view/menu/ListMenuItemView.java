package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0174k;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.C0690v;
import p039d.C2948a;
import p039d.C2953f;
import p039d.C2954g;
import p039d.C2957j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0174k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    private Drawable f780A;

    /* renamed from: B */
    private boolean f781B;

    /* renamed from: C */
    private LayoutInflater f782C;

    /* renamed from: D */
    private boolean f783D;

    /* renamed from: n */
    private C0170g f784n;

    /* renamed from: o */
    private ImageView f785o;

    /* renamed from: p */
    private RadioButton f786p;

    /* renamed from: q */
    private TextView f787q;

    /* renamed from: r */
    private CheckBox f788r;

    /* renamed from: s */
    private TextView f789s;

    /* renamed from: t */
    private ImageView f790t;

    /* renamed from: u */
    private ImageView f791u;

    /* renamed from: v */
    private LinearLayout f792v;

    /* renamed from: w */
    private Drawable f793w;

    /* renamed from: x */
    private int f794x;

    /* renamed from: y */
    private Context f795y;

    /* renamed from: z */
    private boolean f796z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2948a.f12136E);
    }

    /* renamed from: c */
    private void m926c(View view) {
        m927d(view, -1);
    }

    /* renamed from: d */
    private void m927d(View view, int i10) {
        LinearLayout linearLayout = this.f792v;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    /* renamed from: e */
    private void m928e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C2954g.f12301j, (ViewGroup) this, false);
        this.f788r = checkBox;
        m926c(checkBox);
    }

    /* renamed from: f */
    private void m929f() {
        ImageView imageView = (ImageView) getInflater().inflate(C2954g.f12302k, (ViewGroup) this, false);
        this.f785o = imageView;
        m927d(imageView, 0);
    }

    /* renamed from: g */
    private void m930g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C2954g.f12304m, (ViewGroup) this, false);
        this.f786p = radioButton;
        m926c(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f782C == null) {
            this.f782C = LayoutInflater.from(getContext());
        }
        return this.f782C;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f790t;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    /* renamed from: a */
    public boolean mo922a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f791u;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f791u.getLayoutParams();
        rect.top += this.f791u.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    /* renamed from: b */
    public void mo923b(C0170g c0170g, int i10) {
        this.f784n = c0170g;
        setVisibility(c0170g.isVisible() ? 0 : 8);
        setTitle(c0170g.m1042i(this));
        setCheckable(c0170g.isCheckable());
        m931h(c0170g.m1034A(), c0170g.m1040g());
        setIcon(c0170g.getIcon());
        setEnabled(c0170g.isEnabled());
        setSubMenuArrowVisible(c0170g.hasSubMenu());
        setContentDescription(c0170g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0174k.a
    public C0170g getItemData() {
        return this.f784n;
    }

    /* renamed from: h */
    public void m931h(boolean z10, char c10) {
        int i10 = (z10 && this.f784n.m1034A()) ? 0 : 8;
        if (i10 == 0) {
            this.f789s.setText(this.f784n.m1041h());
        }
        if (this.f789s.getVisibility() != i10) {
            this.f789s.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0690v.m3859t0(this, this.f793w);
        TextView textView = (TextView) findViewById(C2953f.f12262S);
        this.f787q = textView;
        int i10 = this.f794x;
        if (i10 != -1) {
            textView.setTextAppearance(this.f795y, i10);
        }
        this.f789s = (TextView) findViewById(C2953f.f12255L);
        ImageView imageView = (ImageView) findViewById(C2953f.f12258O);
        this.f790t = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f780A);
        }
        this.f791u = (ImageView) findViewById(C2953f.f12286u);
        this.f792v = (LinearLayout) findViewById(C2953f.f12278m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f785o != null && this.f796z) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f785o.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f786p == null && this.f788r == null) {
            return;
        }
        if (this.f784n.m1046m()) {
            if (this.f786p == null) {
                m930g();
            }
            compoundButton = this.f786p;
            compoundButton2 = this.f788r;
        } else {
            if (this.f788r == null) {
                m928e();
            }
            compoundButton = this.f788r;
            compoundButton2 = this.f786p;
        }
        if (z10) {
            compoundButton.setChecked(this.f784n.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f788r;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f786p;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f784n.m1046m()) {
            if (this.f786p == null) {
                m930g();
            }
            compoundButton = this.f786p;
        } else {
            if (this.f788r == null) {
                m928e();
            }
            compoundButton = this.f788r;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f783D = z10;
        this.f796z = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f791u;
        if (imageView != null) {
            imageView.setVisibility((this.f781B || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f784n.m1059z() || this.f783D;
        if (z10 || this.f796z) {
            ImageView imageView = this.f785o;
            if (imageView == null && drawable == null && !this.f796z) {
                return;
            }
            if (imageView == null) {
                m929f();
            }
            if (drawable == null && !this.f796z) {
                this.f785o.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f785o;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f785o.getVisibility() != 0) {
                this.f785o.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f787q.setText(charSequence);
            if (this.f787q.getVisibility() != 0) {
                this.f787q.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f787q.getVisibility() != 8) {
            this.f787q.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, C2957j.f12458Y1, i10, 0);
        this.f793w = obtainStyledAttributes.getDrawable(C2957j.f12469a2);
        this.f794x = obtainStyledAttributes.getResourceId(C2957j.f12463Z1, -1);
        this.f796z = obtainStyledAttributes.getBoolean(C2957j.f12475b2, false);
        this.f795y = context;
        this.f780A = obtainStyledAttributes.getDrawable(C2957j.f12480c2);
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C2948a.f12133B, 0);
        this.f781B = obtainStyledAttributes2.hasValue(0);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }
}
