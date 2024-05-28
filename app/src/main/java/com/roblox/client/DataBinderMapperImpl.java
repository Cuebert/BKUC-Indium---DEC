package com.roblox.client;

import android.util.SparseIntArray;
import androidx.databinding.AbstractC0767d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC0767d {

    /* renamed from: a */
    private static final SparseIntArray f10369a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f10369a = sparseIntArray;
        sparseIntArray.put(C2738a0.f10400D, 1);
    }

    @Override // androidx.databinding.AbstractC0767d
    /* renamed from: a */
    public List<AbstractC0767d> mo4254a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }
}
