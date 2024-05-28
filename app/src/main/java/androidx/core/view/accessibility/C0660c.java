package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.os.C0622a;
import androidx.core.view.accessibility.InterfaceC0663f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p182o0.C4112e;

/* renamed from: androidx.core.view.accessibility.c */
/* loaded from: classes.dex */
public class C0660c {

    /* renamed from: d */
    private static int f3509d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f3510a;

    /* renamed from: b */
    public int f3511b = -1;

    /* renamed from: c */
    private int f3512c = -1;

    /* renamed from: androidx.core.view.accessibility.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: A */
        public static final a f3513A;

        /* renamed from: B */
        public static final a f3514B;

        /* renamed from: C */
        public static final a f3515C;

        /* renamed from: D */
        public static final a f3516D;

        /* renamed from: E */
        public static final a f3517E;

        /* renamed from: F */
        public static final a f3518F;

        /* renamed from: G */
        public static final a f3519G;

        /* renamed from: H */
        public static final a f3520H;

        /* renamed from: I */
        public static final a f3521I;

        /* renamed from: J */
        public static final a f3522J;

        /* renamed from: K */
        public static final a f3523K;

        /* renamed from: L */
        public static final a f3524L;

        /* renamed from: M */
        public static final a f3525M;

        /* renamed from: N */
        public static final a f3526N;

        /* renamed from: O */
        public static final a f3527O;

        /* renamed from: P */
        public static final a f3528P;

        /* renamed from: Q */
        public static final a f3529Q;

        /* renamed from: R */
        public static final a f3530R;

        /* renamed from: S */
        public static final a f3531S;

        /* renamed from: T */
        public static final a f3532T;

        /* renamed from: U */
        public static final a f3533U;

        /* renamed from: e */
        public static final a f3534e = new a(1, null);

        /* renamed from: f */
        public static final a f3535f = new a(2, null);

        /* renamed from: g */
        public static final a f3536g = new a(4, null);

        /* renamed from: h */
        public static final a f3537h = new a(8, null);

        /* renamed from: i */
        public static final a f3538i = new a(16, null);

        /* renamed from: j */
        public static final a f3539j = new a(32, null);

        /* renamed from: k */
        public static final a f3540k = new a(64, null);

        /* renamed from: l */
        public static final a f3541l = new a(128, null);

        /* renamed from: m */
        public static final a f3542m = new a(256, (CharSequence) null, (Class<? extends InterfaceC0663f.a>) InterfaceC0663f.b.class);

        /* renamed from: n */
        public static final a f3543n = new a(512, (CharSequence) null, (Class<? extends InterfaceC0663f.a>) InterfaceC0663f.b.class);

        /* renamed from: o */
        public static final a f3544o = new a(1024, (CharSequence) null, (Class<? extends InterfaceC0663f.a>) InterfaceC0663f.c.class);

        /* renamed from: p */
        public static final a f3545p = new a(2048, (CharSequence) null, (Class<? extends InterfaceC0663f.a>) InterfaceC0663f.c.class);

        /* renamed from: q */
        public static final a f3546q = new a(4096, null);

        /* renamed from: r */
        public static final a f3547r = new a(8192, null);

        /* renamed from: s */
        public static final a f3548s = new a(16384, null);

        /* renamed from: t */
        public static final a f3549t = new a(32768, null);

        /* renamed from: u */
        public static final a f3550u = new a(65536, null);

        /* renamed from: v */
        public static final a f3551v = new a(131072, (CharSequence) null, (Class<? extends InterfaceC0663f.a>) InterfaceC0663f.g.class);

        /* renamed from: w */
        public static final a f3552w = new a(262144, null);

        /* renamed from: x */
        public static final a f3553x = new a(524288, null);

        /* renamed from: y */
        public static final a f3554y = new a(1048576, null);

        /* renamed from: z */
        public static final a f3555z = new a(2097152, (CharSequence) null, (Class<? extends InterfaceC0663f.a>) InterfaceC0663f.h.class);

        /* renamed from: a */
        final Object f3556a;

        /* renamed from: b */
        private final int f3557b;

        /* renamed from: c */
        private final Class<? extends InterfaceC0663f.a> f3558c;

        /* renamed from: d */
        protected final InterfaceC0663f f3559d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f3513A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            f3514B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC0663f.e.class);
            f3515C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            f3516D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f3517E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            f3518F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            f3519G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f3520H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f3521I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f3522J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f3523K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f3524L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, InterfaceC0663f.f.class);
            f3525M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC0663f.d.class);
            f3526N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f3527O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f3528P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f3529Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f3530R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null, null);
            f3531S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.CTRL, null, null, null);
            f3532T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.FUNCTION, null, null, null);
            f3533U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.KEYCODE_0, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        /* renamed from: a */
        public a m3574a(CharSequence charSequence, InterfaceC0663f interfaceC0663f) {
            return new a(null, this.f3557b, charSequence, interfaceC0663f, this.f3558c);
        }

        /* renamed from: b */
        public int m3575b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3556a).getId();
        }

        /* renamed from: c */
        public CharSequence m3576c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3556a).getLabel();
        }

        /* renamed from: d */
        public boolean m3577d(View view, Bundle bundle) {
            if (this.f3559d == null) {
                return false;
            }
            InterfaceC0663f.a aVar = null;
            Class<? extends InterfaceC0663f.a> cls = this.f3558c;
            if (cls != null) {
                try {
                    InterfaceC0663f.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        newInstance.m3596a(bundle);
                        aVar = newInstance;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = newInstance;
                        Class<? extends InterfaceC0663f.a> cls2 = this.f3558c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.f3559d.mo3595a(view, aVar);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            return this.f3559d.mo3595a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f3556a;
            return obj2 == null ? aVar.f3556a == null : obj2.equals(aVar.f3556a);
        }

        public int hashCode() {
            Object obj = this.f3556a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String m3504i = C0660c.m3504i(this.f3557b);
            if (m3504i.equals("ACTION_UNKNOWN") && m3576c() != null) {
                m3504i = m3576c().toString();
            }
            sb2.append(m3504i);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, InterfaceC0663f interfaceC0663f) {
            this(null, i10, charSequence, interfaceC0663f, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends InterfaceC0663f.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, InterfaceC0663f interfaceC0663f, Class<? extends InterfaceC0663f.a> cls) {
            this.f3557b = i10;
            this.f3559d = interfaceC0663f;
            if (obj == null) {
                this.f3556a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f3556a = obj;
            }
            this.f3558c = cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.accessibility.c$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Bundle m3578a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final Object f3560a;

        c(Object obj) {
            this.f3560a = obj;
        }

        /* renamed from: a */
        public static c m3579a(int i10, int i11, boolean z10, int i12) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        final Object f3561a;

        d(Object obj) {
            this.f3561a = obj;
        }

        /* renamed from: a */
        public static d m3580a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    private C0660c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3510a = accessibilityNodeInfo;
    }

    /* renamed from: L */
    public static C0660c m3496L() {
        return m3511z0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: M */
    public static C0660c m3497M(View view) {
        return m3511z0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: N */
    public static C0660c m3498N(C0660c c0660c) {
        return m3511z0(AccessibilityNodeInfo.obtain(c0660c.f3510a));
    }

    /* renamed from: R */
    private void m3499R(View view) {
        SparseArray<WeakReference<ClickableSpan>> m3508u = m3508u(view);
        if (m3508u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < m3508u.size(); i10++) {
                if (m3508u.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                m3508u.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    /* renamed from: T */
    private void m3500T(int i10, boolean z10) {
        Bundle m3561r = m3561r();
        if (m3561r != null) {
            int i11 = m3561r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            m3561r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    /* renamed from: d */
    private void m3501d(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    /* renamed from: f */
    private void m3502f() {
        b.m3578a(this.f3510a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.m3578a(this.f3510a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.m3578a(this.f3510a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.m3578a(this.f3510a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: g */
    private List<Integer> m3503g(String str) {
        ArrayList<Integer> integerArrayList = b.m3578a(this.f3510a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.m3578a(this.f3510a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: i */
    static String m3504i(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: k */
    private boolean m3505k(int i10) {
        Bundle m3561r = m3561r();
        return m3561r != null && (m3561r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    /* renamed from: p */
    public static ClickableSpan[] m3506p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: s */
    private SparseArray<WeakReference<ClickableSpan>> m3507s(View view) {
        SparseArray<WeakReference<ClickableSpan>> m3508u = m3508u(view);
        if (m3508u != null) {
            return m3508u;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C4112e.f16693I, sparseArray);
        return sparseArray;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m3508u(View view) {
        return (SparseArray) view.getTag(C4112e.f16693I);
    }

    /* renamed from: y */
    private boolean m3509y() {
        return !m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    private int m3510z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f3509d;
        f3509d = i11 + 1;
        return i11;
    }

    /* renamed from: z0 */
    public static C0660c m3511z0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0660c(accessibilityNodeInfo);
    }

    /* renamed from: A */
    public boolean m3512A() {
        return this.f3510a.isCheckable();
    }

    /* renamed from: B */
    public boolean m3513B() {
        return this.f3510a.isChecked();
    }

    /* renamed from: C */
    public boolean m3514C() {
        return this.f3510a.isClickable();
    }

    /* renamed from: D */
    public boolean m3515D() {
        return this.f3510a.isEnabled();
    }

    /* renamed from: E */
    public boolean m3516E() {
        return this.f3510a.isFocusable();
    }

    /* renamed from: F */
    public boolean m3517F() {
        return this.f3510a.isFocused();
    }

    /* renamed from: G */
    public boolean m3518G() {
        return this.f3510a.isLongClickable();
    }

    /* renamed from: H */
    public boolean m3519H() {
        return this.f3510a.isPassword();
    }

    /* renamed from: I */
    public boolean m3520I() {
        return this.f3510a.isScrollable();
    }

    /* renamed from: J */
    public boolean m3521J() {
        return this.f3510a.isSelected();
    }

    /* renamed from: K */
    public boolean m3522K() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3510a.isShowingHintText();
        }
        return m3505k(4);
    }

    /* renamed from: O */
    public boolean m3523O(int i10, Bundle bundle) {
        return this.f3510a.performAction(i10, bundle);
    }

    @Deprecated
    /* renamed from: P */
    public void m3524P() {
    }

    /* renamed from: Q */
    public boolean m3525Q(a aVar) {
        return this.f3510a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3556a);
    }

    /* renamed from: S */
    public void m3526S(boolean z10) {
        this.f3510a.setAccessibilityFocused(z10);
    }

    @Deprecated
    /* renamed from: U */
    public void m3527U(Rect rect) {
        this.f3510a.setBoundsInParent(rect);
    }

    /* renamed from: V */
    public void m3528V(Rect rect) {
        this.f3510a.setBoundsInScreen(rect);
    }

    /* renamed from: W */
    public void m3529W(boolean z10) {
        this.f3510a.setCanOpenPopup(z10);
    }

    /* renamed from: X */
    public void m3530X(boolean z10) {
        this.f3510a.setCheckable(z10);
    }

    /* renamed from: Y */
    public void m3531Y(boolean z10) {
        this.f3510a.setChecked(z10);
    }

    /* renamed from: Z */
    public void m3532Z(CharSequence charSequence) {
        this.f3510a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void m3533a(int i10) {
        this.f3510a.addAction(i10);
    }

    /* renamed from: a0 */
    public void m3534a0(boolean z10) {
        this.f3510a.setClickable(z10);
    }

    /* renamed from: b */
    public void m3535b(a aVar) {
        this.f3510a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3556a);
    }

    /* renamed from: b0 */
    public void m3536b0(Object obj) {
        this.f3510a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((c) obj).f3560a);
    }

    /* renamed from: c */
    public void m3537c(View view, int i10) {
        this.f3510a.addChild(view, i10);
    }

    /* renamed from: c0 */
    public void m3538c0(Object obj) {
        this.f3510a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((d) obj).f3561a);
    }

    /* renamed from: d0 */
    public void m3539d0(CharSequence charSequence) {
        this.f3510a.setContentDescription(charSequence);
    }

    /* renamed from: e */
    public void m3540e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m3502f();
            m3499R(view);
            ClickableSpan[] m3506p = m3506p(charSequence);
            if (m3506p == null || m3506p.length <= 0) {
                return;
            }
            m3561r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C4112e.f16704a);
            SparseArray<WeakReference<ClickableSpan>> m3507s = m3507s(view);
            for (int i10 = 0; i10 < m3506p.length; i10++) {
                int m3510z = m3510z(m3506p[i10], m3507s);
                m3507s.put(m3510z, new WeakReference<>(m3506p[i10]));
                m3501d(m3506p[i10], (Spanned) charSequence, m3510z);
            }
        }
    }

    /* renamed from: e0 */
    public void m3541e0(boolean z10) {
        this.f3510a.setEnabled(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0660c)) {
            return false;
        }
        C0660c c0660c = (C0660c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3510a;
        if (accessibilityNodeInfo == null) {
            if (c0660c.f3510a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c0660c.f3510a)) {
            return false;
        }
        return this.f3512c == c0660c.f3512c && this.f3511b == c0660c.f3511b;
    }

    /* renamed from: f0 */
    public void m3542f0(CharSequence charSequence) {
        this.f3510a.setError(charSequence);
    }

    /* renamed from: g0 */
    public void m3543g0(boolean z10) {
        this.f3510a.setFocusable(z10);
    }

    /* renamed from: h */
    public List<a> m3544h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3510a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new a(actionList.get(i10)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: h0 */
    public void m3545h0(boolean z10) {
        this.f3510a.setFocused(z10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3510a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void m3546i0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3510a.setHeading(z10);
        } else {
            m3500T(2, z10);
        }
    }

    @Deprecated
    /* renamed from: j */
    public int m3547j() {
        return this.f3510a.getActions();
    }

    /* renamed from: j0 */
    public void m3548j0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3510a.setHintText(charSequence);
        } else {
            b.m3578a(this.f3510a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: k0 */
    public void m3549k0(int i10) {
        this.f3510a.setMaxTextLength(i10);
    }

    @Deprecated
    /* renamed from: l */
    public void m3550l(Rect rect) {
        this.f3510a.getBoundsInParent(rect);
    }

    /* renamed from: l0 */
    public void m3551l0(CharSequence charSequence) {
        this.f3510a.setPackageName(charSequence);
    }

    /* renamed from: m */
    public void m3552m(Rect rect) {
        this.f3510a.getBoundsInScreen(rect);
    }

    /* renamed from: m0 */
    public void m3553m0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3510a.setPaneTitle(charSequence);
        } else {
            b.m3578a(this.f3510a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: n */
    public int m3554n() {
        return this.f3510a.getChildCount();
    }

    /* renamed from: n0 */
    public void m3555n0(View view) {
        this.f3511b = -1;
        this.f3510a.setParent(view);
    }

    /* renamed from: o */
    public CharSequence m3556o() {
        return this.f3510a.getClassName();
    }

    /* renamed from: o0 */
    public void m3557o0(View view, int i10) {
        this.f3511b = i10;
        this.f3510a.setParent(view, i10);
    }

    /* renamed from: p0 */
    public void m3558p0(CharSequence charSequence) {
        b.m3578a(this.f3510a).putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: q */
    public CharSequence m3559q() {
        return this.f3510a.getContentDescription();
    }

    /* renamed from: q0 */
    public void m3560q0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3510a.setScreenReaderFocusable(z10);
        } else {
            m3500T(1, z10);
        }
    }

    /* renamed from: r */
    public Bundle m3561r() {
        return b.m3578a(this.f3510a);
    }

    /* renamed from: r0 */
    public void m3562r0(boolean z10) {
        this.f3510a.setScrollable(z10);
    }

    /* renamed from: s0 */
    public void m3563s0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3510a.setShowingHintText(z10);
        } else {
            m3500T(4, z10);
        }
    }

    /* renamed from: t */
    public CharSequence m3564t() {
        return this.f3510a.getPackageName();
    }

    /* renamed from: t0 */
    public void m3565t0(View view, int i10) {
        this.f3512c = i10;
        this.f3510a.setSource(view, i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m3550l(rect);
        sb2.append("; boundsInParent: " + rect);
        m3552m(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m3564t());
        sb2.append("; className: ");
        sb2.append(m3556o());
        sb2.append("; text: ");
        sb2.append(m3567v());
        sb2.append("; contentDescription: ");
        sb2.append(m3559q());
        sb2.append("; viewId: ");
        sb2.append(m3571x());
        sb2.append("; uniqueId: ");
        sb2.append(m3569w());
        sb2.append("; checkable: ");
        sb2.append(m3512A());
        sb2.append("; checked: ");
        sb2.append(m3513B());
        sb2.append("; focusable: ");
        sb2.append(m3516E());
        sb2.append("; focused: ");
        sb2.append(m3517F());
        sb2.append("; selected: ");
        sb2.append(m3521J());
        sb2.append("; clickable: ");
        sb2.append(m3514C());
        sb2.append("; longClickable: ");
        sb2.append(m3518G());
        sb2.append("; enabled: ");
        sb2.append(m3515D());
        sb2.append("; password: ");
        sb2.append(m3519H());
        sb2.append("; scrollable: " + m3520I());
        sb2.append("; [");
        List<a> m3544h = m3544h();
        for (int i10 = 0; i10 < m3544h.size(); i10++) {
            a aVar = m3544h.get(i10);
            String m3504i = m3504i(aVar.m3575b());
            if (m3504i.equals("ACTION_UNKNOWN") && aVar.m3576c() != null) {
                m3504i = aVar.m3576c().toString();
            }
            sb2.append(m3504i);
            if (i10 != m3544h.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u0 */
    public void m3566u0(CharSequence charSequence) {
        if (C0622a.m3334b()) {
            this.f3510a.setStateDescription(charSequence);
        } else {
            b.m3578a(this.f3510a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: v */
    public CharSequence m3567v() {
        if (m3509y()) {
            List<Integer> m3503g = m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> m3503g2 = m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> m3503g3 = m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> m3503g4 = m3503g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3510a.getText(), 0, this.f3510a.getText().length()));
            for (int i10 = 0; i10 < m3503g.size(); i10++) {
                spannableString.setSpan(new C0658a(m3503g4.get(i10).intValue(), this, m3561r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m3503g.get(i10).intValue(), m3503g2.get(i10).intValue(), m3503g3.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f3510a.getText();
    }

    /* renamed from: v0 */
    public void m3568v0(CharSequence charSequence) {
        this.f3510a.setText(charSequence);
    }

    /* renamed from: w */
    public String m3569w() {
        if (C0622a.m3335c()) {
            return this.f3510a.getUniqueId();
        }
        return b.m3578a(this.f3510a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: w0 */
    public void m3570w0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f3510a.setTraversalAfter(view);
        }
    }

    /* renamed from: x */
    public String m3571x() {
        return this.f3510a.getViewIdResourceName();
    }

    /* renamed from: x0 */
    public void m3572x0(boolean z10) {
        this.f3510a.setVisibleToUser(z10);
    }

    /* renamed from: y0 */
    public AccessibilityNodeInfo m3573y0() {
        return this.f3510a;
    }
}
