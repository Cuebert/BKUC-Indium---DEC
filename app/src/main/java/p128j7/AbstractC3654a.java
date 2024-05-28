package p128j7;

/* renamed from: j7.a */
/* loaded from: classes.dex */
public abstract class AbstractC3654a<T> implements InterfaceC3657d<T> {

    /* renamed from: a */
    protected int f15352a;

    /* renamed from: b */
    protected int f15353b;

    /* renamed from: c */
    protected int f15354c;

    /* renamed from: d */
    protected final float f15355d;

    public AbstractC3654a(int i10, int i11, float f10) {
        this.f15352a = i10;
        this.f15354c = i11;
        this.f15355d = f10;
    }

    @Override // p128j7.InterfaceC3657d
    /* renamed from: a */
    public void mo15563a() {
        this.f15353b++;
        this.f15352a = (int) (this.f15352a * this.f15355d);
    }

    @Override // p128j7.InterfaceC3657d
    /* renamed from: b */
    public boolean mo15564b() {
        return this.f15353b < this.f15354c;
    }

    @Override // p128j7.InterfaceC3657d
    /* renamed from: c */
    public int mo15565c() {
        return this.f15352a;
    }
}
