package p091gc;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p193ob.AbstractC4179h0;
import p193ob.C4169c0;
import p193ob.C4200y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gc.p */
/* loaded from: classes.dex */
public abstract class AbstractC3344p<T> {

    /* renamed from: gc.p$a */
    /* loaded from: classes.dex */
    class a extends AbstractC3344p<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p091gc.AbstractC3344p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14683a(C3346r c3346r, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC3344p.this.mo14683a(c3346r, it.next());
            }
        }
    }

    /* renamed from: gc.p$b */
    /* loaded from: classes.dex */
    class b extends AbstractC3344p<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC3344p.this.mo14683a(c3346r, Array.get(obj, i10));
            }
        }
    }

    /* renamed from: gc.p$c */
    /* loaded from: classes.dex */
    static final class c<T> extends AbstractC3344p<T> {

        /* renamed from: a */
        private final Method f13907a;

        /* renamed from: b */
        private final int f13908b;

        /* renamed from: c */
        private final InterfaceC3334f<T, AbstractC4179h0> f13909c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Method method, int i10, InterfaceC3334f<T, AbstractC4179h0> interfaceC3334f) {
            this.f13907a = method;
            this.f13908b = i10;
            this.f13909c = interfaceC3334f;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, T t10) {
            if (t10 != null) {
                try {
                    c3346r.m14712l(this.f13909c.mo14629a(t10));
                    return;
                } catch (IOException e10) {
                    throw C3353y.m14771p(this.f13907a, e10, this.f13908b, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            }
            throw C3353y.m14770o(this.f13907a, this.f13908b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* renamed from: gc.p$d */
    /* loaded from: classes.dex */
    static final class d<T> extends AbstractC3344p<T> {

        /* renamed from: a */
        private final String f13910a;

        /* renamed from: b */
        private final InterfaceC3334f<T, String> f13911b;

        /* renamed from: c */
        private final boolean f13912c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, InterfaceC3334f<T, String> interfaceC3334f, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f13910a = str;
            this.f13911b = interfaceC3334f;
            this.f13912c = z10;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, T t10) throws IOException {
            String mo14629a;
            if (t10 == null || (mo14629a = this.f13911b.mo14629a(t10)) == null) {
                return;
            }
            c3346r.m14703a(this.f13910a, mo14629a, this.f13912c);
        }
    }

    /* renamed from: gc.p$e */
    /* loaded from: classes.dex */
    static final class e<T> extends AbstractC3344p<Map<String, T>> {

        /* renamed from: a */
        private final Method f13913a;

        /* renamed from: b */
        private final int f13914b;

        /* renamed from: c */
        private final InterfaceC3334f<T, String> f13915c;

        /* renamed from: d */
        private final boolean f13916d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Method method, int i10, InterfaceC3334f<T, String> interfaceC3334f, boolean z10) {
            this.f13913a = method;
            this.f13914b = i10;
            this.f13915c = interfaceC3334f;
            this.f13916d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p091gc.AbstractC3344p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14683a(C3346r c3346r, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value == null) {
                            throw C3353y.m14770o(this.f13913a, this.f13914b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                        }
                        String mo14629a = this.f13915c.mo14629a(value);
                        if (mo14629a != null) {
                            c3346r.m14703a(key, mo14629a, this.f13916d);
                        } else {
                            throw C3353y.m14770o(this.f13913a, this.f13914b, "Field map value '" + value + "' converted to null by " + this.f13915c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C3353y.m14770o(this.f13913a, this.f13914b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C3353y.m14770o(this.f13913a, this.f13914b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: gc.p$f */
    /* loaded from: classes.dex */
    static final class f<T> extends AbstractC3344p<T> {

        /* renamed from: a */
        private final String f13917a;

        /* renamed from: b */
        private final InterfaceC3334f<T, String> f13918b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(String str, InterfaceC3334f<T, String> interfaceC3334f) {
            Objects.requireNonNull(str, "name == null");
            this.f13917a = str;
            this.f13918b = interfaceC3334f;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, T t10) throws IOException {
            String mo14629a;
            if (t10 == null || (mo14629a = this.f13918b.mo14629a(t10)) == null) {
                return;
            }
            c3346r.m14704b(this.f13917a, mo14629a);
        }
    }

    /* renamed from: gc.p$g */
    /* loaded from: classes.dex */
    static final class g<T> extends AbstractC3344p<Map<String, T>> {

        /* renamed from: a */
        private final Method f13919a;

        /* renamed from: b */
        private final int f13920b;

        /* renamed from: c */
        private final InterfaceC3334f<T, String> f13921c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Method method, int i10, InterfaceC3334f<T, String> interfaceC3334f) {
            this.f13919a = method;
            this.f13920b = i10;
            this.f13921c = interfaceC3334f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p091gc.AbstractC3344p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14683a(C3346r c3346r, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value == null) {
                            throw C3353y.m14770o(this.f13919a, this.f13920b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                        }
                        c3346r.m14704b(key, this.f13921c.mo14629a(value));
                    } else {
                        throw C3353y.m14770o(this.f13919a, this.f13920b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C3353y.m14770o(this.f13919a, this.f13920b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: gc.p$h */
    /* loaded from: classes.dex */
    static final class h extends AbstractC3344p<C4200y> {

        /* renamed from: a */
        private final Method f13922a;

        /* renamed from: b */
        private final int f13923b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(Method method, int i10) {
            this.f13922a = method;
            this.f13923b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p091gc.AbstractC3344p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14683a(C3346r c3346r, C4200y c4200y) {
            if (c4200y != null) {
                c3346r.m14705c(c4200y);
                return;
            }
            throw C3353y.m14770o(this.f13922a, this.f13923b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: gc.p$i */
    /* loaded from: classes.dex */
    static final class i<T> extends AbstractC3344p<T> {

        /* renamed from: a */
        private final Method f13924a;

        /* renamed from: b */
        private final int f13925b;

        /* renamed from: c */
        private final C4200y f13926c;

        /* renamed from: d */
        private final InterfaceC3334f<T, AbstractC4179h0> f13927d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public i(Method method, int i10, C4200y c4200y, InterfaceC3334f<T, AbstractC4179h0> interfaceC3334f) {
            this.f13924a = method;
            this.f13925b = i10;
            this.f13926c = c4200y;
            this.f13927d = interfaceC3334f;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                c3346r.m14706d(this.f13926c, this.f13927d.mo14629a(t10));
            } catch (IOException e10) {
                throw C3353y.m14770o(this.f13924a, this.f13925b, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    /* renamed from: gc.p$j */
    /* loaded from: classes.dex */
    static final class j<T> extends AbstractC3344p<Map<String, T>> {

        /* renamed from: a */
        private final Method f13928a;

        /* renamed from: b */
        private final int f13929b;

        /* renamed from: c */
        private final InterfaceC3334f<T, AbstractC4179h0> f13930c;

        /* renamed from: d */
        private final String f13931d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(Method method, int i10, InterfaceC3334f<T, AbstractC4179h0> interfaceC3334f, String str) {
            this.f13928a = method;
            this.f13929b = i10;
            this.f13930c = interfaceC3334f;
            this.f13931d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p091gc.AbstractC3344p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14683a(C3346r c3346r, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value == null) {
                            throw C3353y.m14770o(this.f13928a, this.f13929b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                        }
                        c3346r.m14706d(C4200y.m17554g("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f13931d), this.f13930c.mo14629a(value));
                    } else {
                        throw C3353y.m14770o(this.f13928a, this.f13929b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C3353y.m14770o(this.f13928a, this.f13929b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: gc.p$k */
    /* loaded from: classes.dex */
    static final class k<T> extends AbstractC3344p<T> {

        /* renamed from: a */
        private final Method f13932a;

        /* renamed from: b */
        private final int f13933b;

        /* renamed from: c */
        private final String f13934c;

        /* renamed from: d */
        private final InterfaceC3334f<T, String> f13935d;

        /* renamed from: e */
        private final boolean f13936e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public k(Method method, int i10, String str, InterfaceC3334f<T, String> interfaceC3334f, boolean z10) {
            this.f13932a = method;
            this.f13933b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f13934c = str;
            this.f13935d = interfaceC3334f;
            this.f13936e = z10;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, T t10) throws IOException {
            if (t10 != null) {
                c3346r.m14708f(this.f13934c, this.f13935d.mo14629a(t10), this.f13936e);
                return;
            }
            throw C3353y.m14770o(this.f13932a, this.f13933b, "Path parameter \"" + this.f13934c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: gc.p$l */
    /* loaded from: classes.dex */
    static final class l<T> extends AbstractC3344p<T> {

        /* renamed from: a */
        private final String f13937a;

        /* renamed from: b */
        private final InterfaceC3334f<T, String> f13938b;

        /* renamed from: c */
        private final boolean f13939c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public l(String str, InterfaceC3334f<T, String> interfaceC3334f, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f13937a = str;
            this.f13938b = interfaceC3334f;
            this.f13939c = z10;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, T t10) throws IOException {
            String mo14629a;
            if (t10 == null || (mo14629a = this.f13938b.mo14629a(t10)) == null) {
                return;
            }
            c3346r.m14709g(this.f13937a, mo14629a, this.f13939c);
        }
    }

    /* renamed from: gc.p$m */
    /* loaded from: classes.dex */
    static final class m<T> extends AbstractC3344p<Map<String, T>> {

        /* renamed from: a */
        private final Method f13940a;

        /* renamed from: b */
        private final int f13941b;

        /* renamed from: c */
        private final InterfaceC3334f<T, String> f13942c;

        /* renamed from: d */
        private final boolean f13943d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public m(Method method, int i10, InterfaceC3334f<T, String> interfaceC3334f, boolean z10) {
            this.f13940a = method;
            this.f13941b = i10;
            this.f13942c = interfaceC3334f;
            this.f13943d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p091gc.AbstractC3344p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14683a(C3346r c3346r, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value == null) {
                            throw C3353y.m14770o(this.f13940a, this.f13941b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                        }
                        String mo14629a = this.f13942c.mo14629a(value);
                        if (mo14629a != null) {
                            c3346r.m14709g(key, mo14629a, this.f13943d);
                        } else {
                            throw C3353y.m14770o(this.f13940a, this.f13941b, "Query map value '" + value + "' converted to null by " + this.f13942c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C3353y.m14770o(this.f13940a, this.f13941b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C3353y.m14770o(this.f13940a, this.f13941b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: gc.p$n */
    /* loaded from: classes.dex */
    static final class n<T> extends AbstractC3344p<T> {

        /* renamed from: a */
        private final InterfaceC3334f<T, String> f13944a;

        /* renamed from: b */
        private final boolean f13945b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public n(InterfaceC3334f<T, String> interfaceC3334f, boolean z10) {
            this.f13944a = interfaceC3334f;
            this.f13945b = z10;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            c3346r.m14709g(this.f13944a.mo14629a(t10), null, this.f13945b);
        }
    }

    /* renamed from: gc.p$o */
    /* loaded from: classes.dex */
    static final class o extends AbstractC3344p<C4169c0.b> {

        /* renamed from: a */
        static final o f13946a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p091gc.AbstractC3344p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14683a(C3346r c3346r, C4169c0.b bVar) {
            if (bVar != null) {
                c3346r.m14707e(bVar);
            }
        }
    }

    /* renamed from: gc.p$p */
    /* loaded from: classes.dex */
    static final class p extends AbstractC3344p<Object> {

        /* renamed from: a */
        private final Method f13947a;

        /* renamed from: b */
        private final int f13948b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public p(Method method, int i10) {
            this.f13947a = method;
            this.f13948b = i10;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, Object obj) {
            if (obj != null) {
                c3346r.m14713m(obj);
                return;
            }
            throw C3353y.m14770o(this.f13947a, this.f13948b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: gc.p$q */
    /* loaded from: classes.dex */
    static final class q<T> extends AbstractC3344p<T> {

        /* renamed from: a */
        final Class<T> f13949a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public q(Class<T> cls) {
            this.f13949a = cls;
        }

        @Override // p091gc.AbstractC3344p
        /* renamed from: a */
        void mo14683a(C3346r c3346r, T t10) {
            c3346r.m14710h(this.f13949a, t10);
        }
    }

    AbstractC3344p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo14683a(C3346r c3346r, T t10) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC3344p<Object> m14684b() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC3344p<Iterable<T>> m14685c() {
        return new a();
    }
}
