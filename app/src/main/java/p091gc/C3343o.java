package p091gc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p091gc.InterfaceC3334f;
import p193ob.AbstractC4183j0;

/* JADX INFO: Access modifiers changed from: package-private */
@IgnoreJRERequirement
/* renamed from: gc.o */
/* loaded from: classes.dex */
public final class C3343o extends InterfaceC3334f.a {

    /* renamed from: a */
    static final InterfaceC3334f.a f13903a = new C3343o();

    @IgnoreJRERequirement
    /* renamed from: gc.o$a */
    /* loaded from: classes.dex */
    static final class a<T> implements InterfaceC3334f<AbstractC4183j0, Optional<T>> {

        /* renamed from: a */
        final InterfaceC3334f<AbstractC4183j0, T> f13904a;

        a(InterfaceC3334f<AbstractC4183j0, T> interfaceC3334f) {
            this.f13904a = interfaceC3334f;
        }

        @Override // p091gc.InterfaceC3334f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> mo14629a(AbstractC4183j0 abstractC4183j0) throws IOException {
            return Optional.ofNullable(this.f13904a.mo14629a(abstractC4183j0));
        }
    }

    C3343o() {
    }

    @Override // p091gc.InterfaceC3334f.a
    /* renamed from: d */
    public InterfaceC3334f<AbstractC4183j0, ?> mo14628d(Type type, Annotation[] annotationArr, C3349u c3349u) {
        if (InterfaceC3334f.a.m14649b(type) != Optional.class) {
            return null;
        }
        return new a(c3349u.m14745h(InterfaceC3334f.a.m14648a(0, (ParameterizedType) type), annotationArr));
    }
}
