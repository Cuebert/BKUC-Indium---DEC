package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.C0570c;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p025c.AbstractC1112a;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f442a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f443b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f444c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0137d> f445d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f446e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0136c<?>> f447f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f448g = new HashMap();

    /* renamed from: h */
    final Bundle f449h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: classes.dex */
    class C0134a<I> extends AbstractC0141b<I> {

        /* renamed from: a */
        final /* synthetic */ String f454a;

        /* renamed from: b */
        final /* synthetic */ int f455b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1112a f456c;

        C0134a(String str, int i10, AbstractC1112a abstractC1112a) {
            this.f454a = str;
            this.f455b = i10;
            this.f456c = abstractC1112a;
        }

        @Override // androidx.activity.result.AbstractC0141b
        /* renamed from: b */
        public void mo622b(I i10, C0570c c0570c) {
            ActivityResultRegistry.this.f446e.add(this.f454a);
            Integer num = ActivityResultRegistry.this.f444c.get(this.f454a);
            ActivityResultRegistry.this.mo593f(num != null ? num.intValue() : this.f455b, this.f456c, i10, c0570c);
        }

        @Override // androidx.activity.result.AbstractC0141b
        /* renamed from: c */
        public void mo623c() {
            ActivityResultRegistry.this.m621l(this.f454a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: classes.dex */
    public class C0135b<I> extends AbstractC0141b<I> {

        /* renamed from: a */
        final /* synthetic */ String f458a;

        /* renamed from: b */
        final /* synthetic */ int f459b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1112a f460c;

        C0135b(String str, int i10, AbstractC1112a abstractC1112a) {
            this.f458a = str;
            this.f459b = i10;
            this.f460c = abstractC1112a;
        }

        @Override // androidx.activity.result.AbstractC0141b
        /* renamed from: b */
        public void mo622b(I i10, C0570c c0570c) {
            ActivityResultRegistry.this.f446e.add(this.f458a);
            Integer num = ActivityResultRegistry.this.f444c.get(this.f458a);
            ActivityResultRegistry.this.mo593f(num != null ? num.intValue() : this.f459b, this.f460c, i10, c0570c);
        }

        @Override // androidx.activity.result.AbstractC0141b
        /* renamed from: c */
        public void mo623c() {
            ActivityResultRegistry.this.m621l(this.f458a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: classes.dex */
    public static class C0136c<O> {

        /* renamed from: a */
        final InterfaceC0140a<O> f462a;

        /* renamed from: b */
        final AbstractC1112a<?, O> f463b;

        C0136c(InterfaceC0140a<O> interfaceC0140a, AbstractC1112a<?, O> abstractC1112a) {
            this.f462a = interfaceC0140a;
            this.f463b = abstractC1112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: classes.dex */
    public static class C0137d {

        /* renamed from: a */
        final AbstractC0839f f464a;

        /* renamed from: b */
        private final ArrayList<InterfaceC0843j> f465b = new ArrayList<>();

        C0137d(AbstractC0839f abstractC0839f) {
            this.f464a = abstractC0839f;
        }

        /* renamed from: a */
        void m624a(InterfaceC0843j interfaceC0843j) {
            this.f464a.mo4889a(interfaceC0843j);
            this.f465b.add(interfaceC0843j);
        }

        /* renamed from: b */
        void m625b() {
            Iterator<InterfaceC0843j> it = this.f465b.iterator();
            while (it.hasNext()) {
                this.f464a.mo4891c(it.next());
            }
            this.f465b.clear();
        }
    }

    /* renamed from: a */
    private void m611a(int i10, String str) {
        this.f443b.put(Integer.valueOf(i10), str);
        this.f444c.put(str, Integer.valueOf(i10));
    }

    /* renamed from: d */
    private <O> void m612d(String str, int i10, Intent intent, C0136c<O> c0136c) {
        InterfaceC0140a<O> interfaceC0140a;
        if (c0136c != null && (interfaceC0140a = c0136c.f462a) != null) {
            interfaceC0140a.mo635a(c0136c.f463b.mo4538c(i10, intent));
        } else {
            this.f448g.remove(str);
            this.f449h.putParcelable(str, new ActivityResult(i10, intent));
        }
    }

    /* renamed from: e */
    private int m613e() {
        int nextInt = this.f442a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f443b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f442a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private int m614k(String str) {
        Integer num = this.f444c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int m613e = m613e();
        m611a(m613e, str);
        return m613e;
    }

    /* renamed from: b */
    public final boolean m615b(int i10, int i11, Intent intent) {
        String str = this.f443b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f446e.remove(str);
        m612d(str, i11, intent, this.f447f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m616c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        InterfaceC0140a<?> interfaceC0140a;
        String str = this.f443b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f446e.remove(str);
        C0136c<?> c0136c = this.f447f.get(str);
        if (c0136c != null && (interfaceC0140a = c0136c.f462a) != null) {
            interfaceC0140a.mo635a(o10);
            return true;
        }
        this.f449h.remove(str);
        this.f448g.put(str, o10);
        return true;
    }

    /* renamed from: f */
    public abstract <I, O> void mo593f(int i10, AbstractC1112a<I, O> abstractC1112a, @SuppressLint({"UnknownNullness"}) I i11, C0570c c0570c);

    /* renamed from: g */
    public final void m617g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f446e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f442a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f449h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f444c.containsKey(str)) {
                Integer remove = this.f444c.remove(str);
                if (!this.f449h.containsKey(str)) {
                    this.f443b.remove(remove);
                }
            }
            m611a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    /* renamed from: h */
    public final void m618h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f444c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f444c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f446e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f449h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f442a);
    }

    /* renamed from: i */
    public final <I, O> AbstractC0141b<I> m619i(final String str, InterfaceC0845l interfaceC0845l, final AbstractC1112a<I, O> abstractC1112a, final InterfaceC0140a<O> interfaceC0140a) {
        AbstractC0839f mo583f = interfaceC0845l.mo583f();
        if (!mo583f.mo4890b().m4895b(AbstractC0839f.c.STARTED)) {
            int m614k = m614k(str);
            C0137d c0137d = this.f445d.get(str);
            if (c0137d == null) {
                c0137d = new C0137d(mo583f);
            }
            c0137d.m624a(new InterfaceC0843j() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.InterfaceC0843j
                /* renamed from: e */
                public void mo592e(InterfaceC0845l interfaceC0845l2, AbstractC0839f.b bVar) {
                    if (AbstractC0839f.b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f447f.put(str, new C0136c<>(interfaceC0140a, abstractC1112a));
                        if (ActivityResultRegistry.this.f448g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f448g.get(str);
                            ActivityResultRegistry.this.f448g.remove(str);
                            interfaceC0140a.mo635a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f449h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f449h.remove(str);
                            interfaceC0140a.mo635a(abstractC1112a.mo4538c(activityResult.m608b(), activityResult.m607a()));
                            return;
                        }
                        return;
                    }
                    if (AbstractC0839f.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f447f.remove(str);
                    } else if (AbstractC0839f.b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.m621l(str);
                    }
                }
            });
            this.f445d.put(str, c0137d);
            return new C0134a(str, m614k, abstractC1112a);
        }
        throw new IllegalStateException("LifecycleOwner " + interfaceC0845l + " is attempting to register while current state is " + mo583f.mo4890b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final <I, O> AbstractC0141b<I> m620j(String str, AbstractC1112a<I, O> abstractC1112a, InterfaceC0140a<O> interfaceC0140a) {
        int m614k = m614k(str);
        this.f447f.put(str, new C0136c<>(interfaceC0140a, abstractC1112a));
        if (this.f448g.containsKey(str)) {
            Object obj = this.f448g.get(str);
            this.f448g.remove(str);
            interfaceC0140a.mo635a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f449h.getParcelable(str);
        if (activityResult != null) {
            this.f449h.remove(str);
            interfaceC0140a.mo635a(abstractC1112a.mo4538c(activityResult.m608b(), activityResult.m607a()));
        }
        return new C0135b(str, m614k, abstractC1112a);
    }

    /* renamed from: l */
    final void m621l(String str) {
        Integer remove;
        if (!this.f446e.contains(str) && (remove = this.f444c.remove(str)) != null) {
            this.f443b.remove(remove);
        }
        this.f447f.remove(str);
        if (this.f448g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f448g.get(str));
            this.f448g.remove(str);
        }
        if (this.f449h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f449h.getParcelable(str));
            this.f449h.remove(str);
        }
        C0137d c0137d = this.f445d.get(str);
        if (c0137d != null) {
            c0137d.m625b();
            this.f445d.remove(str);
        }
    }
}
