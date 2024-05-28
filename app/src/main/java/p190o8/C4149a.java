package p190o8;

import android.os.AsyncTask;
import com.roblox.client.routing.model.RouteModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import p008a7.C0051i;
import p020b6.C1055f;
import p020b6.C1069t;
import p024bc.C1100c;
import p035c9.C1151k;

/* renamed from: o8.a */
/* loaded from: classes.dex */
public class C4149a {

    /* renamed from: d */
    private static final Object f16892d = new Object();

    /* renamed from: e */
    private static C4149a f16893e;

    /* renamed from: a */
    private C1100c f16894a;

    /* renamed from: b */
    private C4150b f16895b;

    /* renamed from: c */
    private Executor f16896c;

    /* renamed from: o8.a$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16897a;

        static {
            int[] iArr = new int[EnumC4151c.values().length];
            f16897a = iArr;
            try {
                iArr[EnumC4151c.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16897a[EnumC4151c.GAME_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o8.a$b */
    /* loaded from: classes.dex */
    public static class b extends AsyncTask<String, Void, List<C4152d>> {

        /* renamed from: a */
        private C1100c f16898a;

        /* renamed from: b */
        private C4150b f16899b;

        /* renamed from: c */
        private Executor f16900c;

        /* renamed from: d */
        private String f16901d;

        /* renamed from: e */
        private String f16902e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o8.a$b$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ List f16903n;

            a(List list) {
                this.f16903n = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                String m249c;
                for (C4152d c4152d : this.f16903n) {
                    C1151k.m6712f("AppRouter", "Trying to post event: " + c4152d.m17228a().m17225b());
                    C0051i m248b = C0051i.m248b(c4152d.m17228a().m17225b());
                    int i10 = a.f16897a[c4152d.m17228a().ordinal()];
                    if (i10 == 1) {
                        String str = c4152d.m17228a().m17227d()[0];
                        if (!c4152d.m17229b().containsKey(str)) {
                            b.this.f16899b.m17217c(c4152d.m17228a().m17225b(), b.this.f16901d);
                            return;
                        } else {
                            try {
                                m249c = C0051i.m249c(Long.valueOf(c4152d.m17229b().get(str)).longValue());
                            } catch (NumberFormatException unused) {
                                b.this.f16899b.m17218d(c4152d.m17228a().m17225b(), b.this.f16901d);
                                return;
                            }
                        }
                    } else if (i10 != 2) {
                        m249c = null;
                    } else {
                        String str2 = c4152d.m17228a().m17227d()[0];
                        if (!c4152d.m17229b().containsKey(str2)) {
                            b.this.f16899b.m17217c(c4152d.m17228a().m17225b(), b.this.f16901d);
                            return;
                        } else {
                            try {
                                m249c = String.valueOf(Long.valueOf(c4152d.m17229b().get(str2)).longValue());
                            } catch (NumberFormatException unused2) {
                                b.this.f16899b.m17218d(c4152d.m17228a().m17225b(), b.this.f16901d);
                                return;
                            }
                        }
                    }
                    if (m249c != null) {
                        m248b.m255i(m249c);
                        b.this.f16899b.m17223i();
                    } else {
                        b.this.f16899b.m17224j();
                    }
                    b.this.f16898a.m6469j(m248b);
                }
            }
        }

        b(C1100c c1100c, C4150b c4150b, Executor executor) {
            this.f16898a = c1100c;
            this.f16899b = c4150b;
            this.f16900c = executor;
        }

        /* renamed from: d */
        private List<C4152d> m17204d(List<String> list, HashMap<String, String> hashMap) {
            C4152d c4152d;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    EnumC4151c valueOf = EnumC4151c.valueOf(list.get(i10).toUpperCase());
                    if (i10 == list.size() - 1) {
                        if (valueOf.m17226c() != hashMap.size()) {
                            C1151k.m6712f("AppRouter", "Incorrect number of parameters. Stop building routes.");
                            this.f16899b.m17220f(valueOf.m17225b(), this.f16901d);
                            return arrayList;
                        }
                        c4152d = new C4152d(valueOf, hashMap);
                    } else {
                        c4152d = new C4152d(valueOf);
                    }
                    arrayList.add(c4152d);
                } catch (IllegalArgumentException unused) {
                    C1151k.m6712f("AppRouter", "AppTarget not recognized. Stop building routes.");
                }
            }
            return arrayList;
        }

        /* renamed from: f */
        private String m17205f(String str) {
            int indexOf = str.indexOf(47);
            if (indexOf == -1) {
                return null;
            }
            return str.substring(0, indexOf);
        }

        /* renamed from: g */
        private List<String> m17206g(String str) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/")));
            if (arrayList.size() == 0) {
                return arrayList;
            }
            arrayList.remove(0);
            if (arrayList.size() == 0) {
                return arrayList;
            }
            String[] split = ((String) arrayList.get(arrayList.size() - 1)).split("\\?");
            if (split.length == 0) {
                return arrayList;
            }
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(split[0]);
            return arrayList;
        }

        /* renamed from: i */
        private RouteModel m17207i(String str) {
            try {
                return (RouteModel) new C1055f().m6305j(str, RouteModel.class);
            } catch (C1069t unused) {
                C1151k.m6712f("AppRouter", "Invalid json string.");
                this.f16899b.m17219e(str);
                return null;
            }
        }

        /* renamed from: j */
        private List<C4152d> m17208j(String str) {
            ArrayList arrayList = new ArrayList();
            String m17210m = m17210m(str);
            C1151k.m6707a("AppRouter", "Path: " + m17210m);
            if (m17210m == null) {
                return arrayList;
            }
            this.f16902e = m17205f(m17210m);
            C1151k.m6707a("AppRouter", "ActionType: " + this.f16902e);
            List<String> m17206g = m17206g(m17210m);
            C1151k.m6707a("AppRouter", "Actions: " + m17206g);
            return m17206g.size() == 0 ? arrayList : m17204d(m17206g, m17213h(m17210m));
        }

        /* renamed from: k */
        private void m17209k(List<C4152d> list) {
            this.f16900c.execute(new a(list));
        }

        /* renamed from: m */
        private String m17210m(String str) {
            int indexOf = str.indexOf("://");
            if (indexOf == -1) {
                return null;
            }
            return str.substring(indexOf + 3);
        }

        /* renamed from: n */
        private boolean m17211n(RouteModel routeModel) {
            String str = routeModel.android_default_action_handler;
            if (str != null) {
                return "native".equals(str);
            }
            return "native".equals(routeModel.default_action_handler);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<C4152d> doInBackground(String... strArr) {
            this.f16899b.m17222h();
            RouteModel m17207i = m17207i(strArr[0]);
            if (m17207i == null) {
                return Collections.emptyList();
            }
            C1151k.m6707a("AppRouter", "defaultActionHandler: " + m17207i.default_action_handler + ". action: " + m17207i.default_action);
            if (m17211n(m17207i)) {
                this.f16899b.m17216b();
                String str = m17207i.default_action;
                this.f16901d = str;
                List<C4152d> m17208j = m17208j(str);
                if (m17208j.size() == 0) {
                    this.f16899b.m17221g(this.f16901d);
                }
                return m17208j;
            }
            this.f16899b.m17215a();
            C1151k.m6707a("AppRouter", "Should be handled by Lua.");
            return Collections.emptyList();
        }

        /* renamed from: h */
        public HashMap<String, String> m17213h(String str) {
            String str2;
            String[] split = str.split("\\?");
            HashMap<String, String> hashMap = new HashMap<>();
            if (split.length < 2 || (str2 = split[1]) == null) {
                return hashMap;
            }
            for (String str3 : str2.split("&")) {
                if (str3 != null) {
                    String[] split2 = str3.split("=");
                    if (split2.length == 2) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<C4152d> list) {
            super.onPostExecute(list);
            m17209k(list);
        }
    }

    C4149a(C1100c c1100c, C4150b c4150b, Executor executor) {
        this.f16894a = c1100c;
        this.f16895b = c4150b;
        this.f16896c = executor;
    }

    /* renamed from: a */
    public static C4149a m17199a() {
        C4149a c4149a;
        synchronized (f16892d) {
            if (f16893e == null) {
                f16893e = new C4149a(C1100c.m6458d(), new C4150b(), AsyncTask.THREAD_POOL_EXECUTOR);
            }
            c4149a = f16893e;
        }
        return c4149a;
    }

    /* renamed from: b */
    public void m17200b(String str) {
        new b(this.f16894a, this.f16895b, this.f16896c).executeOnExecutor(this.f16896c, str);
    }
}
