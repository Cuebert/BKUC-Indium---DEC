package p283w3;

/* renamed from: w3.q8 */
/* loaded from: classes.dex */
public enum EnumC5335q8 implements InterfaceC5432y1 {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);


    /* renamed from: n */
    private final int f20070n;

    EnumC5335q8(int i10) {
        this.f20070n = i10;
    }

    @Override // p283w3.InterfaceC5432y1
    public final int zza() {
        return this.f20070n;
    }
}
