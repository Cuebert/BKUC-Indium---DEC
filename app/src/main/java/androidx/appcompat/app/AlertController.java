package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C0690v;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p039d.C2948a;
import p039d.C2953f;
import p039d.C2957j;
import p053e.DialogC3055b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f474A;

    /* renamed from: C */
    private Drawable f476C;

    /* renamed from: D */
    private ImageView f477D;

    /* renamed from: E */
    private TextView f478E;

    /* renamed from: F */
    private TextView f479F;

    /* renamed from: G */
    private View f480G;

    /* renamed from: H */
    ListAdapter f481H;

    /* renamed from: J */
    private int f483J;

    /* renamed from: K */
    private int f484K;

    /* renamed from: L */
    int f485L;

    /* renamed from: M */
    int f486M;

    /* renamed from: N */
    int f487N;

    /* renamed from: O */
    int f488O;

    /* renamed from: P */
    private boolean f489P;

    /* renamed from: R */
    Handler f491R;

    /* renamed from: a */
    private final Context f493a;

    /* renamed from: b */
    final DialogC3055b f494b;

    /* renamed from: c */
    private final Window f495c;

    /* renamed from: d */
    private final int f496d;

    /* renamed from: e */
    private CharSequence f497e;

    /* renamed from: f */
    private CharSequence f498f;

    /* renamed from: g */
    ListView f499g;

    /* renamed from: h */
    private View f500h;

    /* renamed from: i */
    private int f501i;

    /* renamed from: j */
    private int f502j;

    /* renamed from: k */
    private int f503k;

    /* renamed from: l */
    private int f504l;

    /* renamed from: m */
    private int f505m;

    /* renamed from: o */
    Button f507o;

    /* renamed from: p */
    private CharSequence f508p;

    /* renamed from: q */
    Message f509q;

    /* renamed from: r */
    private Drawable f510r;

    /* renamed from: s */
    Button f511s;

    /* renamed from: t */
    private CharSequence f512t;

    /* renamed from: u */
    Message f513u;

    /* renamed from: v */
    private Drawable f514v;

    /* renamed from: w */
    Button f515w;

    /* renamed from: x */
    private CharSequence f516x;

    /* renamed from: y */
    Message f517y;

    /* renamed from: z */
    private Drawable f518z;

    /* renamed from: n */
    private boolean f506n = false;

    /* renamed from: B */
    private int f475B = 0;

    /* renamed from: I */
    int f482I = -1;

    /* renamed from: Q */
    private int f490Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f492S = new ViewOnClickListenerC0143a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: n */
        private final int f519n;

        /* renamed from: o */
        private final int f520o;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2957j.f12505h2);
            this.f520o = obtainStyledAttributes.getDimensionPixelOffset(C2957j.f12510i2, -1);
            this.f519n = obtainStyledAttributes.getDimensionPixelOffset(C2957j.f12515j2, -1);
        }

        /* renamed from: a */
        public void m664a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f519n, getPaddingRight(), z11 ? getPaddingBottom() : this.f520o);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0143a implements View.OnClickListener {
        ViewOnClickListenerC0143a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f507o && (message3 = alertController.f509q) != null) {
                obtain = Message.obtain(message3);
            } else if (view == alertController.f511s && (message2 = alertController.f513u) != null) {
                obtain = Message.obtain(message2);
            } else {
                obtain = (view != alertController.f515w || (message = alertController.f517y) == null) ? null : Message.obtain(message);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f491R.obtainMessage(1, alertController2.f494b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0144b implements NestedScrollView.InterfaceC0698c {

        /* renamed from: a */
        final /* synthetic */ View f522a;

        /* renamed from: b */
        final /* synthetic */ View f523b;

        C0144b(View view, View view2) {
            this.f522a = view;
            this.f523b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0698c
        /* renamed from: a */
        public void mo665a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.m640g(nestedScrollView, this.f522a, this.f523b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0145c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ View f525n;

        /* renamed from: o */
        final /* synthetic */ View f526o;

        RunnableC0145c(View view, View view2) {
            this.f525n = view;
            this.f526o = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m640g(AlertController.this.f474A, this.f525n, this.f526o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0146d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f528a;

        /* renamed from: b */
        final /* synthetic */ View f529b;

        C0146d(View view, View view2) {
            this.f528a = view;
            this.f529b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.m640g(absListView, this.f528a, this.f529b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0147e implements Runnable {

        /* renamed from: n */
        final /* synthetic */ View f531n;

        /* renamed from: o */
        final /* synthetic */ View f532o;

        RunnableC0147e(View view, View view2) {
            this.f531n = view;
            this.f532o = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m640g(AlertController.this.f499g, this.f531n, this.f532o);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0148f {

        /* renamed from: A */
        public int f534A;

        /* renamed from: B */
        public int f535B;

        /* renamed from: C */
        public int f536C;

        /* renamed from: D */
        public int f537D;

        /* renamed from: F */
        public boolean[] f539F;

        /* renamed from: G */
        public boolean f540G;

        /* renamed from: H */
        public boolean f541H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f543J;

        /* renamed from: K */
        public Cursor f544K;

        /* renamed from: L */
        public String f545L;

        /* renamed from: M */
        public String f546M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f547N;

        /* renamed from: O */
        public e f548O;

        /* renamed from: a */
        public final Context f550a;

        /* renamed from: b */
        public final LayoutInflater f551b;

        /* renamed from: d */
        public Drawable f553d;

        /* renamed from: f */
        public CharSequence f555f;

        /* renamed from: g */
        public View f556g;

        /* renamed from: h */
        public CharSequence f557h;

        /* renamed from: i */
        public CharSequence f558i;

        /* renamed from: j */
        public Drawable f559j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f560k;

        /* renamed from: l */
        public CharSequence f561l;

        /* renamed from: m */
        public Drawable f562m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f563n;

        /* renamed from: o */
        public CharSequence f564o;

        /* renamed from: p */
        public Drawable f565p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f566q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f568s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f569t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f570u;

        /* renamed from: v */
        public CharSequence[] f571v;

        /* renamed from: w */
        public ListAdapter f572w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f573x;

        /* renamed from: y */
        public int f574y;

        /* renamed from: z */
        public View f575z;

        /* renamed from: c */
        public int f552c = 0;

        /* renamed from: e */
        public int f554e = 0;

        /* renamed from: E */
        public boolean f538E = false;

        /* renamed from: I */
        public int f542I = -1;

        /* renamed from: P */
        public boolean f549P = true;

        /* renamed from: r */
        public boolean f567r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: n */
            final /* synthetic */ RecycleListView f576n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f576n = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = C0148f.this.f539F;
                if (zArr != null && zArr[i10]) {
                    this.f576n.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: n */
            private final int f578n;

            /* renamed from: o */
            private final int f579o;

            /* renamed from: p */
            final /* synthetic */ RecycleListView f580p;

            /* renamed from: q */
            final /* synthetic */ AlertController f581q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f580p = recycleListView;
                this.f581q = alertController;
                Cursor cursor2 = getCursor();
                this.f578n = cursor2.getColumnIndexOrThrow(C0148f.this.f545L);
                this.f579o = cursor2.getColumnIndexOrThrow(C0148f.this.f546M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f578n));
                this.f580p.setItemChecked(cursor.getPosition(), cursor.getInt(this.f579o) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0148f.this.f551b.inflate(this.f581q.f486M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: n */
            final /* synthetic */ AlertController f583n;

            c(AlertController alertController) {
                this.f583n = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                C0148f.this.f573x.onClick(this.f583n.f494b, i10);
                if (C0148f.this.f541H) {
                    return;
                }
                this.f583n.f494b.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: n */
            final /* synthetic */ RecycleListView f585n;

            /* renamed from: o */
            final /* synthetic */ AlertController f586o;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f585n = recycleListView;
                this.f586o = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = C0148f.this.f539F;
                if (zArr != null) {
                    zArr[i10] = this.f585n.isItemChecked(i10);
                }
                C0148f.this.f543J.onClick(this.f586o.f494b, i10, this.f585n.isItemChecked(i10));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface e {
            /* renamed from: a */
            void m668a(ListView listView);
        }

        public C0148f(Context context) {
            this.f550a = context;
            this.f551b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m666b(AlertController alertController) {
            int i10;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f551b.inflate(alertController.f485L, (ViewGroup) null);
            if (this.f540G) {
                if (this.f544K == null) {
                    listAdapter = new a(this.f550a, alertController.f486M, R.id.text1, this.f571v, recycleListView);
                } else {
                    listAdapter = new b(this.f550a, this.f544K, false, recycleListView, alertController);
                }
            } else {
                if (this.f541H) {
                    i10 = alertController.f487N;
                } else {
                    i10 = alertController.f488O;
                }
                int i11 = i10;
                if (this.f544K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f550a, i11, this.f544K, new String[]{this.f545L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f572w;
                    if (listAdapter == null) {
                        listAdapter = new C0150h(this.f550a, i11, R.id.text1, this.f571v);
                    }
                }
            }
            e eVar = this.f548O;
            if (eVar != null) {
                eVar.m668a(recycleListView);
            }
            alertController.f481H = listAdapter;
            alertController.f482I = this.f542I;
            if (this.f573x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f543J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f547N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f541H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f540G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f499g = recycleListView;
        }

        /* renamed from: a */
        public void m667a(AlertController alertController) {
            View view = this.f556g;
            if (view != null) {
                alertController.m656m(view);
            } else {
                CharSequence charSequence = this.f555f;
                if (charSequence != null) {
                    alertController.m660r(charSequence);
                }
                Drawable drawable = this.f553d;
                if (drawable != null) {
                    alertController.m658o(drawable);
                }
                int i10 = this.f552c;
                if (i10 != 0) {
                    alertController.m657n(i10);
                }
                int i11 = this.f554e;
                if (i11 != 0) {
                    alertController.m657n(alertController.m650d(i11));
                }
            }
            CharSequence charSequence2 = this.f557h;
            if (charSequence2 != null) {
                alertController.m659p(charSequence2);
            }
            CharSequence charSequence3 = this.f558i;
            if (charSequence3 != null || this.f559j != null) {
                alertController.m655l(-1, charSequence3, this.f560k, null, this.f559j);
            }
            CharSequence charSequence4 = this.f561l;
            if (charSequence4 != null || this.f562m != null) {
                alertController.m655l(-2, charSequence4, this.f563n, null, this.f562m);
            }
            CharSequence charSequence5 = this.f564o;
            if (charSequence5 != null || this.f565p != null) {
                alertController.m655l(-3, charSequence5, this.f566q, null, this.f565p);
            }
            if (this.f571v != null || this.f544K != null || this.f572w != null) {
                m666b(alertController);
            }
            View view2 = this.f575z;
            if (view2 != null) {
                if (this.f538E) {
                    alertController.m663u(view2, this.f534A, this.f535B, this.f536C, this.f537D);
                    return;
                } else {
                    alertController.m662t(view2);
                    return;
                }
            }
            int i12 = this.f574y;
            if (i12 != 0) {
                alertController.m661s(i12);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    private static final class HandlerC0149g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f588a;

        public HandlerC0149g(DialogInterface dialogInterface) {
            this.f588a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f588a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0150h extends ArrayAdapter<CharSequence> {
        public C0150h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC3055b dialogC3055b, Window window) {
        this.f493a = context;
        this.f494b = dialogC3055b;
        this.f495c = window;
        this.f491R = new HandlerC0149g(dialogC3055b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C2957j.f12371H, C2948a.f12164p, 0);
        this.f483J = obtainStyledAttributes.getResourceId(C2957j.f12376I, 0);
        this.f484K = obtainStyledAttributes.getResourceId(C2957j.f12386K, 0);
        this.f485L = obtainStyledAttributes.getResourceId(C2957j.f12396M, 0);
        this.f486M = obtainStyledAttributes.getResourceId(C2957j.f12401N, 0);
        this.f487N = obtainStyledAttributes.getResourceId(C2957j.f12411P, 0);
        this.f488O = obtainStyledAttributes.getResourceId(C2957j.f12391L, 0);
        this.f489P = obtainStyledAttributes.getBoolean(C2957j.f12406O, true);
        this.f496d = obtainStyledAttributes.getDimensionPixelSize(C2957j.f12381J, 0);
        obtainStyledAttributes.recycle();
        dialogC3055b.m13508d(1);
    }

    /* renamed from: A */
    private static boolean m637A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2948a.f12163o, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m638a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m638a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m639b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    static void m640g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: j */
    private ViewGroup m641j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: k */
    private int m642k() {
        int i10 = this.f484K;
        if (i10 == 0) {
            return this.f483J;
        }
        return this.f490Q == 1 ? i10 : this.f483J;
    }

    /* renamed from: q */
    private void m643q(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f495c.findViewById(C2953f.f12245B);
        View findViewById2 = this.f495c.findViewById(C2953f.f12244A);
        if (Build.VERSION.SDK_INT >= 23) {
            C0690v.m3792E0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById == null && findViewById2 == null) {
            return;
        }
        if (this.f498f != null) {
            this.f474A.setOnScrollChangeListener(new C0144b(findViewById, findViewById2));
            this.f474A.post(new RunnableC0145c(findViewById, findViewById2));
            return;
        }
        ListView listView = this.f499g;
        if (listView != null) {
            listView.setOnScrollListener(new C0146d(findViewById, findViewById2));
            this.f499g.post(new RunnableC0147e(findViewById, findViewById2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: v */
    private void m644v(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f507o = button;
        button.setOnClickListener(this.f492S);
        if (TextUtils.isEmpty(this.f508p) && this.f510r == null) {
            this.f507o.setVisibility(8);
            i10 = 0;
        } else {
            this.f507o.setText(this.f508p);
            Drawable drawable = this.f510r;
            if (drawable != null) {
                int i11 = this.f496d;
                drawable.setBounds(0, 0, i11, i11);
                this.f507o.setCompoundDrawables(this.f510r, null, null, null);
            }
            this.f507o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f511s = button2;
        button2.setOnClickListener(this.f492S);
        if (TextUtils.isEmpty(this.f512t) && this.f514v == null) {
            this.f511s.setVisibility(8);
        } else {
            this.f511s.setText(this.f512t);
            Drawable drawable2 = this.f514v;
            if (drawable2 != null) {
                int i12 = this.f496d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f511s.setCompoundDrawables(this.f514v, null, null, null);
            }
            this.f511s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f515w = button3;
        button3.setOnClickListener(this.f492S);
        if (TextUtils.isEmpty(this.f516x) && this.f518z == null) {
            this.f515w.setVisibility(8);
        } else {
            this.f515w.setText(this.f516x);
            Drawable drawable3 = this.f518z;
            if (drawable3 != null) {
                int i13 = this.f496d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f515w.setCompoundDrawables(this.f518z, null, null, null);
            }
            this.f515w.setVisibility(0);
            i10 |= 4;
        }
        if (m637A(this.f493a)) {
            if (i10 == 1) {
                m639b(this.f507o);
            } else if (i10 == 2) {
                m639b(this.f511s);
            } else if (i10 == 4) {
                m639b(this.f515w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m645w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f495c.findViewById(C2953f.f12246C);
        this.f474A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f474A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f479F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f498f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f474A.removeView(this.f479F);
        if (this.f499g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f474A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f474A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f499g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m646x(ViewGroup viewGroup) {
        View view = this.f500h;
        if (view == null) {
            view = this.f501i != 0 ? LayoutInflater.from(this.f493a).inflate(this.f501i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !m638a(view)) {
            this.f495c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f495c.findViewById(C2953f.f12280o);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f506n) {
                frameLayout.setPadding(this.f502j, this.f503k, this.f504l, this.f505m);
            }
            if (this.f499g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: y */
    private void m647y(ViewGroup viewGroup) {
        if (this.f480G != null) {
            viewGroup.addView(this.f480G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f495c.findViewById(C2953f.f12264U).setVisibility(8);
            return;
        }
        this.f477D = (ImageView) this.f495c.findViewById(R.id.icon);
        if ((!TextUtils.isEmpty(this.f497e)) && this.f489P) {
            TextView textView = (TextView) this.f495c.findViewById(C2953f.f12276k);
            this.f478E = textView;
            textView.setText(this.f497e);
            int i10 = this.f475B;
            if (i10 != 0) {
                this.f477D.setImageResource(i10);
                return;
            }
            Drawable drawable = this.f476C;
            if (drawable != null) {
                this.f477D.setImageDrawable(drawable);
                return;
            } else {
                this.f478E.setPadding(this.f477D.getPaddingLeft(), this.f477D.getPaddingTop(), this.f477D.getPaddingRight(), this.f477D.getPaddingBottom());
                this.f477D.setVisibility(8);
                return;
            }
        }
        this.f495c.findViewById(C2953f.f12264U).setVisibility(8);
        this.f477D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    private void m648z() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f495c.findViewById(C2953f.f12291z);
        int i10 = C2953f.f12265V;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = C2953f.f12279n;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = C2953f.f12277l;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C2953f.f12281p);
        m646x(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup m641j = m641j(findViewById7, findViewById4);
        ViewGroup m641j2 = m641j(findViewById8, findViewById5);
        ViewGroup m641j3 = m641j(findViewById9, findViewById6);
        m645w(m641j2);
        m644v(m641j3);
        m647y(m641j);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (m641j == null || m641j.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (m641j3 == null || m641j3.getVisibility() == 8) ? false : true;
        if (!z12 && m641j2 != null && (findViewById2 = m641j2.findViewById(C2953f.f12260Q)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f474A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f498f == null && this.f499g == null) ? null : m641j.findViewById(C2953f.f12263T);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (m641j2 != null && (findViewById = m641j2.findViewById(C2953f.f12261R)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f499g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m664a(z11, z12);
        }
        if (!z10) {
            View view = this.f499g;
            if (view == null) {
                view = this.f474A;
            }
            if (view != null) {
                m643q(m641j2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f499g;
        if (listView2 == null || (listAdapter = this.f481H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f482I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    /* renamed from: c */
    public Button m649c(int i10) {
        if (i10 == -3) {
            return this.f515w;
        }
        if (i10 == -2) {
            return this.f511s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f507o;
    }

    /* renamed from: d */
    public int m650d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f493a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m651e() {
        return this.f499g;
    }

    /* renamed from: f */
    public void m652f() {
        this.f494b.setContentView(m642k());
        m648z();
    }

    /* renamed from: h */
    public boolean m653h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f474A;
        return nestedScrollView != null && nestedScrollView.m4083m(keyEvent);
    }

    /* renamed from: i */
    public boolean m654i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f474A;
        return nestedScrollView != null && nestedScrollView.m4083m(keyEvent);
    }

    /* renamed from: l */
    public void m655l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f491R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f516x = charSequence;
            this.f517y = message;
            this.f518z = drawable;
        } else if (i10 == -2) {
            this.f512t = charSequence;
            this.f513u = message;
            this.f514v = drawable;
        } else {
            if (i10 == -1) {
                this.f508p = charSequence;
                this.f509q = message;
                this.f510r = drawable;
                return;
            }
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: m */
    public void m656m(View view) {
        this.f480G = view;
    }

    /* renamed from: n */
    public void m657n(int i10) {
        this.f476C = null;
        this.f475B = i10;
        ImageView imageView = this.f477D;
        if (imageView != null) {
            if (i10 != 0) {
                imageView.setVisibility(0);
                this.f477D.setImageResource(this.f475B);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: o */
    public void m658o(Drawable drawable) {
        this.f476C = drawable;
        this.f475B = 0;
        ImageView imageView = this.f477D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f477D.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: p */
    public void m659p(CharSequence charSequence) {
        this.f498f = charSequence;
        TextView textView = this.f479F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m660r(CharSequence charSequence) {
        this.f497e = charSequence;
        TextView textView = this.f478E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void m661s(int i10) {
        this.f500h = null;
        this.f501i = i10;
        this.f506n = false;
    }

    /* renamed from: t */
    public void m662t(View view) {
        this.f500h = view;
        this.f501i = 0;
        this.f506n = false;
    }

    /* renamed from: u */
    public void m663u(View view, int i10, int i11, int i12, int i13) {
        this.f500h = view;
        this.f501i = 0;
        this.f506n = true;
        this.f502j = i10;
        this.f503k = i11;
        this.f504l = i12;
        this.f505m = i13;
    }
}
