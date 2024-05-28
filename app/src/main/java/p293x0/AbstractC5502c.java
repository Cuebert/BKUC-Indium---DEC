package p293x0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: x0.c */
/* loaded from: classes.dex */
public abstract class AbstractC5502c extends AbstractC5500a {

    /* renamed from: v */
    private int f20529v;

    /* renamed from: w */
    private int f20530w;

    /* renamed from: x */
    private LayoutInflater f20531x;

    @Deprecated
    public AbstractC5502c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f20530w = i10;
        this.f20529v = i10;
        this.f20531x = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p293x0.AbstractC5500a
    /* renamed from: g */
    public View mo20236g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f20531x.inflate(this.f20530w, viewGroup, false);
    }

    @Override // p293x0.AbstractC5500a
    /* renamed from: h */
    public View mo1305h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f20531x.inflate(this.f20529v, viewGroup, false);
    }
}
