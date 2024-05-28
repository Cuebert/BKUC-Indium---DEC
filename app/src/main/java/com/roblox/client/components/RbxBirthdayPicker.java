package com.roblox.client.components;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2909v;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import com.roblox.client.C2917z;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import p250t7.C4736a;

/* loaded from: classes.dex */
public class RbxBirthdayPicker extends LinearLayout {

    /* renamed from: A */
    private int f10811A;

    /* renamed from: B */
    private int f10812B;

    /* renamed from: C */
    private int f10813C;

    /* renamed from: D */
    private int f10814D;

    /* renamed from: E */
    private int f10815E;

    /* renamed from: F */
    private int f10816F;

    /* renamed from: G */
    private HashMap<Integer, String> f10817G;

    /* renamed from: H */
    private HashMap<Integer, String> f10818H;

    /* renamed from: n */
    public final String f10819n;

    /* renamed from: o */
    private Spinner f10820o;

    /* renamed from: p */
    private Spinner f10821p;

    /* renamed from: q */
    private Spinner f10822q;

    /* renamed from: r */
    private LinearLayout f10823r;

    /* renamed from: s */
    private RbxTextView f10824s;

    /* renamed from: t */
    private RbxTextView f10825t;

    /* renamed from: u */
    private InterfaceC2805f f10826u;

    /* renamed from: v */
    private ArrayList<Integer> f10827v;

    /* renamed from: w */
    private ArrayList<Integer> f10828w;

    /* renamed from: x */
    private ArrayList<Integer> f10829x;

    /* renamed from: y */
    private int f10830y;

    /* renamed from: z */
    private int f10831z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2758a();

        /* renamed from: n */
        int f10832n;

        /* renamed from: o */
        int f10833o;

        /* renamed from: p */
        int f10834p;

        /* renamed from: com.roblox.client.components.RbxBirthdayPicker$SavedState$a */
        /* loaded from: classes.dex */
        class C2758a implements Parcelable.Creator<SavedState> {
            C2758a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C2759a c2759a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10833o);
            parcel.writeInt(this.f10832n);
            parcel.writeInt(this.f10834p);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f10832n = -1;
            this.f10833o = -1;
            this.f10834p = -1;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f10832n = -1;
            this.f10833o = -1;
            this.f10834p = -1;
            this.f10833o = parcel.readInt();
            this.f10832n = parcel.readInt();
            this.f10834p = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxBirthdayPicker$a */
    /* loaded from: classes.dex */
    public class C2759a implements AdapterView.OnItemSelectedListener {
        C2759a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            boolean m12289m = RbxBirthdayPicker.this.m12289m();
            if (RbxBirthdayPicker.this.f10826u == null || !m12289m) {
                return;
            }
            RbxBirthdayPicker.this.f10826u.mo12420a(0, RbxBirthdayPicker.this.f10812B);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxBirthdayPicker$b */
    /* loaded from: classes.dex */
    public class C2760b implements AdapterView.OnItemSelectedListener {
        C2760b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            boolean m12290n = RbxBirthdayPicker.this.m12290n();
            if (RbxBirthdayPicker.this.f10826u == null || !m12290n) {
                return;
            }
            RbxBirthdayPicker.this.f10826u.mo12420a(1, RbxBirthdayPicker.this.f10813C);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.components.RbxBirthdayPicker$c */
    /* loaded from: classes.dex */
    public class C2761c implements AdapterView.OnItemSelectedListener {
        C2761c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            boolean m12291o = RbxBirthdayPicker.this.m12291o();
            if (RbxBirthdayPicker.this.f10826u == null || !m12291o) {
                return;
            }
            RbxBirthdayPicker.this.f10826u.mo12420a(2, RbxBirthdayPicker.this.f10814D);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.roblox.client.components.RbxBirthdayPicker$d */
    /* loaded from: classes.dex */
    class ViewOnTouchListenerC2762d implements View.OnTouchListener {
        ViewOnTouchListenerC2762d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.components.RbxBirthdayPicker$e */
    /* loaded from: classes.dex */
    public class C2763e<T> extends ArrayAdapter<T> {

        /* renamed from: n */
        private String f10839n;

        /* renamed from: o */
        private HashMap<Integer, String> f10840o;

        /* renamed from: p */
        private int f10841p;

        /* renamed from: q */
        private int f10842q;

        public C2763e(Context context, int i10, List<T> list) {
            super(context, i10, list);
            this.f10840o = null;
            this.f10841p = i10;
        }

        /* renamed from: a */
        private View m12302a(int i10, View view, ViewGroup viewGroup, int i11) {
            if (view == null) {
                view = LayoutInflater.from(getContext()).inflate(i11, viewGroup, false);
            }
            TextView textView = (TextView) view;
            T item = getItem(i10);
            String str = this.f10840o.get(item);
            if (item.equals(-1)) {
                textView.setText(this.f10839n);
                textView.setTextColor(RbxBirthdayPicker.this.f10816F);
            } else if (str != null) {
                textView.setText(str);
                textView.setTextColor(RbxBirthdayPicker.this.f10815E);
            } else {
                textView.setText(item.toString());
                textView.setTextColor(RbxBirthdayPicker.this.f10815E);
            }
            return textView;
        }

        /* renamed from: b */
        private View m12303b(int i10, View view, ViewGroup viewGroup, int i11) {
            if (view == null) {
                view = LayoutInflater.from(getContext()).inflate(i11, viewGroup, false);
            }
            TextView textView = (TextView) view;
            textView.setText(this.f10839n);
            textView.setTextColor(RbxBirthdayPicker.this.f10816F);
            return view;
        }

        /* renamed from: c */
        private View m12304c(int i10, View view, ViewGroup viewGroup, int i11) {
            if (view == null) {
                view = LayoutInflater.from(getContext()).inflate(i11, viewGroup, false);
            }
            ((TextView) view).setText(this.f10839n);
            return view;
        }

        /* renamed from: d */
        public void m12305d(HashMap<Integer, String> hashMap) {
            this.f10840o = hashMap;
        }

        /* renamed from: e */
        public void m12306e(String str) {
            this.f10839n = str;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            if (getItem(i10).equals(-1)) {
                return m12304c(i10, view, viewGroup, this.f10842q);
            }
            if (this.f10840o != null) {
                return m12302a(i10, view, viewGroup, this.f10842q);
            }
            return super.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (getItem(i10).equals(-1)) {
                return m12303b(i10, view, viewGroup, this.f10841p);
            }
            if (this.f10840o != null) {
                return m12302a(i10, view, viewGroup, this.f10841p);
            }
            return super.getView(i10, view, viewGroup);
        }

        @Override // android.widget.ArrayAdapter
        public void setDropDownViewResource(int i10) {
            super.setDropDownViewResource(i10);
            this.f10842q = i10;
        }
    }

    public RbxBirthdayPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10819n = "RbxBirthdayPicker";
        this.f10812B = -1;
        this.f10813C = -1;
        this.f10814D = -1;
        m12287j(context, attributeSet);
    }

    private ArrayList<Integer> getDayList() {
        int i10;
        int i11 = this.f10813C;
        if (i11 != -1) {
            int i12 = this.f10830y;
            int i13 = this.f10814D;
            if (i12 == i13 && this.f10831z == i11) {
                i10 = this.f10811A;
            } else {
                i10 = m12288l(i11, i13);
            }
        } else {
            i10 = 31;
        }
        return new ArrayList<>(this.f10827v.subList(0, i10));
    }

    private ArrayList<Integer> getMonthList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 <= 11; i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    private ArrayList<Integer> getYearList() {
        int integer = getContext().getResources().getInteger(C2917z.f11925b);
        int integer2 = getContext().getResources().getInteger(C2917z.f11924a);
        if (integer >= 0 && integer <= integer2) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = this.f10830y - integer; i10 >= this.f10830y - integer2; i10--) {
                arrayList.add(Integer.valueOf(i10));
            }
            return arrayList;
        }
        throw new IllegalStateException("Invalid birthday max/min age config!");
    }

    /* renamed from: j */
    private void m12287j(Context context, AttributeSet attributeSet) {
        if (C2877p0.m12933l0()) {
            LayoutInflater.from(context).inflate(C2738a0.f10402F, (ViewGroup) getRootView());
        } else {
            LayoutInflater.from(context).inflate(C2738a0.f10401E, (ViewGroup) getRootView());
        }
        this.f10820o = (Spinner) findViewById(C2915y.f11811K0);
        this.f10821p = (Spinner) findViewById(C2915y.f11814L0);
        this.f10822q = (Spinner) findViewById(C2915y.f11818N0);
        this.f10823r = (LinearLayout) findViewById(C2915y.f11808J0);
        this.f10824s = (RbxTextView) findViewById(C2915y.f11805I0);
        this.f10825t = (RbxTextView) findViewById(C2915y.f11816M0);
        this.f10815E = getResources().getColor(C2909v.f11694c);
        this.f10816F = getResources().getColor(C2909v.f11701j);
        this.f10820o.setContentDescription(C4736a.m18881c(context, C2748c0.f10695n0, new Object[0]));
        this.f10821p.setContentDescription(C4736a.m18881c(context, C2748c0.f10701o0, new Object[0]));
        this.f10822q.setContentDescription(C4736a.m18881c(context, C2748c0.f10707p0, new Object[0]));
        this.f10825t.setText(C4736a.m18881c(context, C2748c0.f10490B0, new Object[0]));
        this.f10824s.setText(C4736a.m18881c(context, C2748c0.f10543L1, new Object[0]));
        this.f10817G = new HashMap<>();
        String[] strArr = {C4736a.m18881c(context, C2748c0.f10750w1, new Object[0]), C4736a.m18881c(context, C2748c0.f10744v1, new Object[0]), C4736a.m18881c(context, C2748c0.f10768z1, new Object[0]), C4736a.m18881c(context, C2748c0.f10726s1, new Object[0]), C4736a.m18881c(context, C2748c0.f10485A1, new Object[0]), C4736a.m18881c(context, C2748c0.f10762y1, new Object[0]), C4736a.m18881c(context, C2748c0.f10756x1, new Object[0]), C4736a.m18881c(context, C2748c0.f10732t1, new Object[0]), C4736a.m18881c(context, C2748c0.f10503D1, new Object[0]), C4736a.m18881c(context, C2748c0.f10497C1, new Object[0]), C4736a.m18881c(context, C2748c0.f10491B1, new Object[0]), C4736a.m18881c(context, C2748c0.f10738u1, new Object[0])};
        int i10 = 0;
        for (int i11 = 12; i10 < i11; i11 = 12) {
            this.f10817G.put(Integer.valueOf(i10), strArr[i10]);
            i10++;
        }
        Calendar calendar = Calendar.getInstance();
        this.f10830y = calendar.get(1);
        this.f10831z = calendar.get(2);
        this.f10811A = calendar.get(5);
        this.f10818H = new HashMap<>();
        String[] strArr2 = {C4736a.m18881c(context, C2748c0.f10527I0, new Object[0]), C4736a.m18881c(context, C2748c0.f10582T0, new Object[0]), C4736a.m18881c(context, C2748c0.f10642e1, new Object[0]), C4736a.m18881c(context, C2748c0.f10660h1, new Object[0]), C4736a.m18881c(context, C2748c0.f10666i1, new Object[0]), C4736a.m18881c(context, C2748c0.f10672j1, new Object[0]), C4736a.m18881c(context, C2748c0.f10678k1, new Object[0]), C4736a.m18881c(context, C2748c0.f10684l1, new Object[0]), C4736a.m18881c(context, C2748c0.f10690m1, new Object[0]), C4736a.m18881c(context, C2748c0.f10532J0, new Object[0]), C4736a.m18881c(context, C2748c0.f10537K0, new Object[0]), C4736a.m18881c(context, C2748c0.f10542L0, new Object[0]), C4736a.m18881c(context, C2748c0.f10547M0, new Object[0]), C4736a.m18881c(context, C2748c0.f10552N0, new Object[0]), C4736a.m18881c(context, C2748c0.f10557O0, new Object[0]), C4736a.m18881c(context, C2748c0.f10562P0, new Object[0]), C4736a.m18881c(context, C2748c0.f10567Q0, new Object[0]), C4736a.m18881c(context, C2748c0.f10572R0, new Object[0]), C4736a.m18881c(context, C2748c0.f10577S0, new Object[0]), C4736a.m18881c(context, C2748c0.f10587U0, new Object[0]), C4736a.m18881c(context, C2748c0.f10592V0, new Object[0]), C4736a.m18881c(context, C2748c0.f10597W0, new Object[0]), C4736a.m18881c(context, C2748c0.f10602X0, new Object[0]), C4736a.m18881c(context, C2748c0.f10607Y0, new Object[0]), C4736a.m18881c(context, C2748c0.f10612Z0, new Object[0]), C4736a.m18881c(context, C2748c0.f10618a1, new Object[0]), C4736a.m18881c(context, C2748c0.f10624b1, new Object[0]), C4736a.m18881c(context, C2748c0.f10630c1, new Object[0]), C4736a.m18881c(context, C2748c0.f10636d1, new Object[0]), C4736a.m18881c(context, C2748c0.f10648f1, new Object[0]), C4736a.m18881c(context, C2748c0.f10654g1, new Object[0])};
        this.f10827v = new ArrayList<>();
        for (int i12 = 1; i12 <= 31; i12++) {
            this.f10827v.add(Integer.valueOf(i12));
        }
        for (int i13 = 1; i13 <= 31; i13++) {
            this.f10818H.put(Integer.valueOf(i13), strArr2[i13 - 1]);
        }
        this.f10828w = getYearList();
        this.f10829x = getMonthList();
        if (isInEditMode()) {
            return;
        }
        ArrayList<Integer> dayList = getDayList();
        dayList.add(0, -1);
        ArrayList<Integer> yearList = getYearList();
        yearList.add(0, -1);
        ArrayList<Integer> monthList = getMonthList();
        monthList.add(0, -1);
        setDaySpinner(dayList);
        setYearSpinner(yearList);
        setMonthSpinner(monthList);
        this.f10820o.setOnItemSelectedListener(new C2759a());
        this.f10821p.setOnItemSelectedListener(new C2760b());
        this.f10822q.setOnItemSelectedListener(new C2761c());
    }

    /* renamed from: l */
    private int m12288l(int i10, int i11) {
        return i10 == 1 ? (i11 != -1 && new GregorianCalendar().isLeapYear(i11)) ? 29 : 28 : (i10 == 3 || i10 == 5 || i10 == 8 || i10 == 10) ? 30 : 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m12289m() {
        int i10 = this.f10812B;
        this.f10812B = ((Integer) this.f10820o.getSelectedItem()).intValue();
        if (((Integer) this.f10820o.getItemAtPosition(0)).intValue() == -1 && this.f10812B != -1) {
            m12292t();
        }
        return i10 != this.f10812B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m12290n() {
        int i10 = this.f10813C;
        this.f10813C = ((Integer) this.f10821p.getSelectedItem()).intValue();
        m12292t();
        if (((Integer) this.f10821p.getItemAtPosition(0)).intValue() == -1 && this.f10813C != -1) {
            m12293u();
        }
        return i10 != this.f10813C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public boolean m12291o() {
        int i10 = this.f10814D;
        this.f10814D = ((Integer) this.f10822q.getSelectedItem()).intValue();
        m12293u();
        if (((Integer) this.f10822q.getItemAtPosition(0)).intValue() == -1 && this.f10814D != -1) {
            m12294v();
        }
        return i10 != this.f10814D;
    }

    private void setDaySpinner(List<Integer> list) {
        C2763e c2763e = new C2763e(getContext(), C2738a0.f10406J, list);
        c2763e.setDropDownViewResource(C2738a0.f10405I);
        c2763e.m12306e("--");
        c2763e.m12305d(this.f10818H);
        this.f10820o.setAdapter((SpinnerAdapter) c2763e);
    }

    private void setMonthSpinner(List<Integer> list) {
        C2763e c2763e = new C2763e(getContext(), C2738a0.f10406J, list);
        c2763e.setDropDownViewResource(C2738a0.f10405I);
        c2763e.m12306e("--");
        c2763e.m12305d(this.f10817G);
        this.f10821p.setAdapter((SpinnerAdapter) c2763e);
    }

    private void setYearSpinner(List<Integer> list) {
        C2763e c2763e = new C2763e(getContext(), C2738a0.f10406J, list);
        c2763e.setDropDownViewResource(C2738a0.f10405I);
        c2763e.m12306e("----");
        this.f10822q.setAdapter((SpinnerAdapter) c2763e);
    }

    /* renamed from: t */
    private void m12292t() {
        ArrayList<Integer> dayList = getDayList();
        if (this.f10812B == -1) {
            dayList.add(0, -1);
        }
        int size = dayList.size() - 1;
        int intValue = dayList.get(size).intValue();
        int indexOf = dayList.indexOf(Integer.valueOf(this.f10812B));
        setDaySpinner(dayList);
        if (this.f10812B > intValue) {
            this.f10820o.setSelection(size);
        } else if (indexOf == -1) {
            this.f10820o.setSelection(0);
        } else {
            this.f10820o.setSelection(indexOf);
        }
    }

    /* renamed from: u */
    private void m12293u() {
        List<Integer> list;
        if (this.f10813C == -1) {
            if (this.f10814D == this.f10830y) {
                list = new ArrayList<>(this.f10829x.subList(0, this.f10831z + 1));
            } else {
                list = getMonthList();
            }
            list.add(0, -1);
        } else if (this.f10814D == this.f10830y) {
            list = this.f10829x.subList(0, this.f10831z + 1);
        } else {
            list = this.f10829x;
        }
        int size = list.size() - 1;
        int intValue = list.get(size).intValue();
        int indexOf = list.indexOf(Integer.valueOf(this.f10813C));
        setMonthSpinner(list);
        if (this.f10813C > intValue) {
            this.f10821p.setSelection(size);
        } else if (indexOf == -1) {
            this.f10821p.setSelection(0);
        } else {
            this.f10821p.setSelection(indexOf);
        }
    }

    /* renamed from: v */
    private void m12294v() {
        int indexOf = this.f10828w.indexOf(Integer.valueOf(this.f10814D));
        setYearSpinner(this.f10828w);
        if (indexOf == -1) {
            this.f10822q.setSelection(0);
        } else {
            this.f10822q.setSelection(indexOf);
        }
    }

    public int getDay() {
        return ((Integer) this.f10820o.getSelectedItem()).intValue();
    }

    public int getMonth() {
        return ((Integer) this.f10821p.getSelectedItem()).intValue();
    }

    public InterfaceC2805f getRbxDateChangedListener() {
        return this.f10826u;
    }

    public int getYear() {
        return ((Integer) this.f10822q.getSelectedItem()).intValue();
    }

    /* renamed from: k */
    public void m12295k() {
        startAnimation(C2807h.m12423b(this));
        ViewOnTouchListenerC2762d viewOnTouchListenerC2762d = new ViewOnTouchListenerC2762d();
        this.f10820o.setOnTouchListener(viewOnTouchListenerC2762d);
        this.f10821p.setOnTouchListener(viewOnTouchListenerC2762d);
        this.f10822q.setOnTouchListener(viewOnTouchListenerC2762d);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m12296p(savedState.f10833o, savedState.f10832n, savedState.f10834p);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10833o = this.f10813C;
        savedState.f10832n = this.f10812B;
        savedState.f10834p = this.f10814D;
        return savedState;
    }

    /* renamed from: p */
    public void m12296p(int i10, int i11, int i12) {
        this.f10814D = i12;
        m12294v();
        this.f10813C = i10;
        m12293u();
        this.f10812B = i11;
        m12292t();
    }

    /* renamed from: q */
    public void m12297q() {
        this.f10823r.setBackgroundResource(C2913x.f11728A);
        if (this.f10824s.getVisibility() != 0) {
            C2807h.m12422a(this.f10824s, 0, 0.0f, 1.0f, 200L);
        }
    }

    /* renamed from: r */
    public void m12298r() {
        this.f10823r.setBackgroundResource(C2913x.f11729B);
        this.f10824s.setVisibility(4);
    }

    /* renamed from: s */
    public void m12299s() {
        startAnimation(C2807h.m12425d(this));
        this.f10820o.setOnTouchListener(null);
        this.f10821p.setOnTouchListener(null);
        this.f10822q.setOnTouchListener(null);
    }

    public void setRbxDateChangedListener(InterfaceC2805f interfaceC2805f) {
        this.f10826u = interfaceC2805f;
    }

    public void setTitle(String str) {
        this.f10825t.setText(str);
        if (str != null && str.length() != 0) {
            this.f10825t.setVisibility(0);
        } else {
            this.f10825t.setVisibility(8);
        }
    }

    public void setTitleColor(int i10) {
        this.f10825t.setTextColor(i10);
    }
}
