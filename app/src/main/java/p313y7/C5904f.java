package p313y7;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.roblox.client.C2745b0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2817d1;
import com.roblox.client.C2822f0;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import com.roblox.client.components.C2808i;
import com.roblox.client.components.C2812m;
import com.roblox.client.components.RobloxToolbar;
import p035c9.C1151k;
import p035c9.C1152l;
import p039d.C2953f;
import p314y8.EnumC5912f;
import p314y8.InterfaceC5909c;

/* renamed from: y7.f */
/* loaded from: classes.dex */
public class C5904f {

    /* renamed from: a */
    private Fragment f21756a;

    /* renamed from: b */
    private MenuItem f21757b;

    /* renamed from: c */
    private Menu f21758c;

    /* renamed from: d */
    private RobloxToolbar f21759d;

    /* renamed from: e */
    private e f21760e;

    /* renamed from: y7.f$a */
    /* loaded from: classes.dex */
    public class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        final /* synthetic */ SearchView f21761a;

        /* renamed from: y7.f$a$a */
        /* loaded from: classes.dex */
        class RunnableC6064a implements Runnable {
            RunnableC6064a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2812m.m12454d(C5904f.this.f21759d, C5904f.this.m21019i());
            }
        }

        a(SearchView searchView) {
            this.f21761a = searchView;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            C5904f c5904f = C5904f.this;
            c5904f.m21022m(c5904f.f21758c, C5904f.this.f21757b, true);
            C5904f c5904f2 = C5904f.this;
            c5904f2.m21021l(c5904f2.f21760e.mo21030b(), "searchClose");
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            if (C5904f.this.f21759d != null) {
                this.f21761a.post(new RunnableC6064a());
            }
            C5904f c5904f = C5904f.this;
            c5904f.m21022m(c5904f.f21758c, C5904f.this.f21757b, false);
            C5904f c5904f2 = C5904f.this;
            c5904f2.m21021l(c5904f2.f21760e.mo21030b(), "searchOpen");
            return true;
        }
    }

    /* renamed from: y7.f$b */
    /* loaded from: classes.dex */
    public class b implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ SearchView f21764a;

        b(SearchView searchView) {
            this.f21764a = searchView;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            return C5904f.this.f21760e.onQueryTextChange(str);
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            return C5904f.this.f21760e.mo21031d(this.f21764a, str);
        }
    }

    /* renamed from: y7.f$c */
    /* loaded from: classes.dex */
    public class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C1151k.m6712f("SearchMenuOption", "... onFocusChange: hasFocus = " + z10);
            if (z10) {
                return;
            }
            if (C5904f.this.f21756a != null) {
                C2817d1.m12470i(C5904f.this.f21756a.m4363p());
            }
            C5904f.this.f21757b.collapseActionView();
        }
    }

    /* renamed from: y7.f$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f21767a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f21767a = iArr;
            try {
                iArr[EnumC5912f.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21767a[EnumC5912f.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21767a[EnumC5912f.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: y7.f$e */
    /* loaded from: classes.dex */
    public interface e extends InterfaceC5909c {
        /* renamed from: a */
        String mo21029a();

        /* renamed from: b */
        int mo21030b();

        /* renamed from: d */
        boolean mo21031d(SearchView searchView, String str);

        boolean onQueryTextChange(String str);
    }

    public C5904f(Fragment fragment) {
        this.f21756a = fragment;
    }

    /* renamed from: i */
    public int m21019i() {
        int i10 = d.f21767a[this.f21760e.mo21034c().ordinal()];
        if (i10 == 1) {
            return C2913x.f11738K;
        }
        if (i10 != 2) {
            return C2913x.f11737J;
        }
        return C2913x.f11736I;
    }

    /* renamed from: j */
    private int m21020j() {
        int i10 = d.f21767a[this.f21760e.mo21034c().ordinal()];
        if (i10 == 1) {
            return C2913x.f11750W;
        }
        if (i10 != 2) {
            return C2913x.f11749V;
        }
        return C2913x.f11748U;
    }

    /* renamed from: l */
    public void m21021l(int i10, String str) {
        C1151k.m6712f("SearchMenuOption", "reportEvents: searchType = " + i10 + ", buttonEvent = " + str);
        if (i10 == 1) {
            C2822f0.m12482d("nativeMain", str, "users");
            return;
        }
        if (i10 == 2) {
            C2822f0.m12482d("nativeMain", str, "games");
        } else if (i10 == 3) {
            C2822f0.m12482d("nativeMain", str, "catalog");
        } else {
            if (i10 != 4) {
                return;
            }
            C2822f0.m12481c("nativeMain|friends", str);
        }
    }

    /* renamed from: m */
    public void m21022m(Menu menu, MenuItem menuItem, boolean z10) {
        if (menu != null) {
            for (int i10 = 0; i10 < menu.size(); i10++) {
                MenuItem item = menu.getItem(i10);
                if (item != menuItem) {
                    item.setVisible(z10);
                }
            }
        }
    }

    /* renamed from: q */
    private void m21023q() {
        SearchView searchView = (SearchView) this.f21757b.getActionView();
        this.f21757b.setOnActionExpandListener(new a(searchView));
        EditText editText = (EditText) searchView.findViewById(C2953f.f12253J);
        editText.setTextColor(-16777216);
        editText.setHintTextColor(-7829368);
        C2808i.m12429d(editText, editText.getContext(), "SourceSansPro-Regular.ttf");
        searchView.findViewById(C2953f.f12252I).setBackgroundResource(C2913x.f11735H);
        searchView.setQueryHint(searchView.getContext().getString(C2748c0.f10494B4));
        searchView.setOnQueryTextListener(new b(searchView));
        editText.setOnFocusChangeListener(new c());
    }

    /* renamed from: k */
    public MenuItem m21024k(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C2745b0.f10476c, menu);
        MenuItem findItem = menu.findItem(C2915y.f11852d);
        this.f21757b = findItem;
        findItem.setIcon(this.f21756a.m4307Q().getDrawable(m21020j()));
        m21023q();
        return this.f21757b;
    }

    /* renamed from: n */
    public void m21025n(Menu menu) {
        this.f21758c = menu;
    }

    /* renamed from: o */
    public void m21026o(e eVar) {
        this.f21760e = eVar;
    }

    /* renamed from: p */
    public void m21027p(RobloxToolbar robloxToolbar) {
        this.f21759d = robloxToolbar;
    }

    /* renamed from: r */
    public void m21028r() {
        ((SearchView) this.f21757b.getActionView()).setQueryHint(this.f21760e.mo21029a());
        boolean z10 = (C1152l.m6736g() && this.f21760e.mo21030b() == 2) ? false : true;
        this.f21757b.setVisible(z10);
        this.f21757b.setEnabled(z10);
    }
}
