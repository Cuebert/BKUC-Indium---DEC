package com.roblox.robloxapp;

import android.util.SparseIntArray;
import androidx.databinding.AbstractC0767d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC0767d {

    /* renamed from: a */
    private static final SparseIntArray f12116a = new SparseIntArray(0);

    @Override // androidx.databinding.AbstractC0767d
    /* renamed from: a */
    public List<AbstractC0767d> mo4254a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.roblox.client.DataBinderMapperImpl());
        return arrayList;
    }
}
