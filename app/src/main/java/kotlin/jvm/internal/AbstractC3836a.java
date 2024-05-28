package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p036cb.C1164b;
import p104hb.EnumC3460i;
import p104hb.InterfaceC3453b;
import p104hb.InterfaceC3455d;
import p104hb.InterfaceC3459h;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractC3836a implements InterfaceC3453b, Serializable {
    public static final Object NO_RECEIVER = a.f15892n;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC3453b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.a$a */
    /* loaded from: classes.dex */
    private static class a implements Serializable {

        /* renamed from: n */
        private static final a f15892n = new a();

        private a() {
        }
    }

    public AbstractC3836a() {
        this(NO_RECEIVER);
    }

    @Override // p104hb.InterfaceC3453b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p104hb.InterfaceC3453b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC3453b compute() {
        InterfaceC3453b interfaceC3453b = this.reflected;
        if (interfaceC3453b != null) {
            return interfaceC3453b;
        }
        InterfaceC3453b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract InterfaceC3453b computeReflected();

    @Override // p104hb.InterfaceC3452a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC3455d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C3851p.m16269c(cls) : C3851p.m16268b(cls);
    }

    @Override // p104hb.InterfaceC3453b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC3453b getReflected() {
        InterfaceC3453b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C1164b();
    }

    @Override // p104hb.InterfaceC3453b
    public InterfaceC3459h getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p104hb.InterfaceC3453b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p104hb.InterfaceC3453b
    public EnumC3460i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p104hb.InterfaceC3453b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p104hb.InterfaceC3453b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p104hb.InterfaceC3453b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p104hb.InterfaceC3453b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected AbstractC3836a(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC3836a(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
