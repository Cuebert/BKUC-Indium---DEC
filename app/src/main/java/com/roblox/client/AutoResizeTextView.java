package com.roblox.client;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.widget.TextView;

/* loaded from: classes.dex */
public class AutoResizeTextView extends TextView {

    /* renamed from: n */
    private RectF f10355n;

    /* renamed from: o */
    private RectF f10356o;

    /* renamed from: p */
    private SparseIntArray f10357p;

    /* renamed from: q */
    private TextPaint f10358q;

    /* renamed from: r */
    private float f10359r;

    /* renamed from: s */
    private float f10360s;

    /* renamed from: t */
    private float f10361t;

    /* renamed from: u */
    private float f10362u;

    /* renamed from: v */
    private int f10363v;

    /* renamed from: w */
    private int f10364w;

    /* renamed from: x */
    private boolean f10365x;

    /* renamed from: y */
    private boolean f10366y;

    /* renamed from: z */
    private final InterfaceC2730b f10367z;

    /* renamed from: com.roblox.client.AutoResizeTextView$a */
    /* loaded from: classes.dex */
    class C2729a implements InterfaceC2730b {
        C2729a() {
        }

        @Override // com.roblox.client.AutoResizeTextView.InterfaceC2730b
        /* renamed from: a */
        public int mo12192a(int i10, RectF rectF) {
            AutoResizeTextView.this.f10358q.setTextSize(i10);
            String charSequence = AutoResizeTextView.this.getText().toString();
            if (AutoResizeTextView.this.getTransformationMethod() instanceof SingleLineTransformationMethod) {
                AutoResizeTextView.this.f10355n.bottom = AutoResizeTextView.this.f10358q.getFontSpacing();
                AutoResizeTextView.this.f10355n.right = AutoResizeTextView.this.f10358q.measureText(charSequence);
            } else {
                StaticLayout staticLayout = new StaticLayout(charSequence, AutoResizeTextView.this.f10358q, AutoResizeTextView.this.f10363v, Layout.Alignment.ALIGN_NORMAL, AutoResizeTextView.this.f10360s, AutoResizeTextView.this.f10361t, true);
                AutoResizeTextView.this.f10355n.bottom = staticLayout.getHeight();
                int i11 = -1;
                for (int i12 = 0; i12 < staticLayout.getLineCount(); i12++) {
                    if (i11 < staticLayout.getLineWidth(i12)) {
                        i11 = (int) staticLayout.getLineWidth(i12);
                    }
                }
                AutoResizeTextView.this.f10355n.right = i11;
            }
            AutoResizeTextView.this.f10355n.offsetTo(0.0f, 0.0f);
            return rectF.contains(AutoResizeTextView.this.f10355n) ? -1 : 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.AutoResizeTextView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2730b {
        /* renamed from: a */
        int mo12192a(int i10, RectF rectF);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10355n = new RectF();
        this.f10360s = 1.0f;
        this.f10361t = 0.0f;
        this.f10362u = 20.0f;
        this.f10365x = true;
        this.f10367z = new C2729a();
        m12190i();
    }

    /* renamed from: f */
    private void m12187f(String str) {
        if (this.f10366y) {
            int i10 = (int) this.f10362u;
            int measuredHeight = (getMeasuredHeight() - getCompoundPaddingBottom()) - getCompoundPaddingTop();
            int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.f10363v = measuredWidth;
            RectF rectF = this.f10356o;
            rectF.right = measuredWidth;
            rectF.bottom = measuredHeight;
            super.setTextSize(0, m12189h(i10, (int) this.f10359r, this.f10367z, rectF));
        }
    }

    /* renamed from: g */
    private static int m12188g(int i10, int i11, InterfaceC2730b interfaceC2730b, RectF rectF) {
        int i12 = i11 - 1;
        int i13 = i10;
        while (i10 <= i12) {
            i13 = (i10 + i12) >>> 1;
            int mo12192a = interfaceC2730b.mo12192a(i13, rectF);
            if (mo12192a >= 0) {
                if (mo12192a <= 0) {
                    break;
                }
                i13--;
                i12 = i13;
            } else {
                int i14 = i13 + 1;
                i13 = i10;
                i10 = i14;
            }
        }
        return i13;
    }

    /* renamed from: h */
    private int m12189h(int i10, int i11, InterfaceC2730b interfaceC2730b, RectF rectF) {
        if (!this.f10365x) {
            return m12188g(i10, i11, interfaceC2730b, rectF);
        }
        String charSequence = getText().toString();
        int length = charSequence == null ? 0 : charSequence.length();
        int i12 = this.f10357p.get(length);
        if (i12 != 0) {
            return i12;
        }
        int m12188g = m12188g(i10, i11, interfaceC2730b, rectF);
        this.f10357p.put(length, m12188g);
        return m12188g;
    }

    /* renamed from: i */
    private void m12190i() {
        this.f10358q = new TextPaint(getPaint());
        this.f10359r = getTextSize();
        this.f10356o = new RectF();
        this.f10357p = new SparseIntArray();
        if (this.f10364w == 0) {
            this.f10364w = -1;
        }
        this.f10366y = true;
    }

    /* renamed from: j */
    private void m12191j() {
        m12187f(getText().toString());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f10357p.clear();
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        m12191j();
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m12191j();
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f10360s = f11;
        this.f10361t = f10;
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        super.setLines(i10);
        this.f10364w = i10;
        m12191j();
    }

    @Override // android.widget.TextView
    public void setSingleLine() {
        super.setSingleLine();
        this.f10364w = 1;
        m12191j();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m12187f(charSequence.toString());
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        this.f10359r = f10;
        this.f10357p.clear();
        m12187f(getText().toString());
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
        if (z10) {
            this.f10364w = 1;
        } else {
            this.f10364w = -1;
        }
        m12191j();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.f10359r = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        this.f10357p.clear();
        m12187f(getText().toString());
    }
}
