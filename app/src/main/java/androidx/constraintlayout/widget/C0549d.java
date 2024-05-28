package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0550e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p107i0.C3465a;
import p121j0.C3591a;

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C0549d {

    /* renamed from: d */
    private static final int[] f2553d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f2554e;

    /* renamed from: a */
    private HashMap<String, C0546a> f2555a = new HashMap<>();

    /* renamed from: b */
    private boolean f2556b = true;

    /* renamed from: c */
    private HashMap<Integer, a> f2557c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f2558a;

        /* renamed from: b */
        public final d f2559b = new d();

        /* renamed from: c */
        public final c f2560c = new c();

        /* renamed from: d */
        public final b f2561d = new b();

        /* renamed from: e */
        public final e f2562e = new e();

        /* renamed from: f */
        public HashMap<String, C0546a> f2563f = new HashMap<>();

        /* renamed from: f */
        public void m2593f(int i10, ConstraintLayout.C0544b c0544b) {
            this.f2558a = i10;
            b bVar = this.f2561d;
            bVar.f2605h = c0544b.f2469d;
            bVar.f2607i = c0544b.f2471e;
            bVar.f2609j = c0544b.f2473f;
            bVar.f2611k = c0544b.f2475g;
            bVar.f2612l = c0544b.f2477h;
            bVar.f2613m = c0544b.f2479i;
            bVar.f2614n = c0544b.f2481j;
            bVar.f2615o = c0544b.f2483k;
            bVar.f2616p = c0544b.f2485l;
            bVar.f2617q = c0544b.f2493p;
            bVar.f2618r = c0544b.f2494q;
            bVar.f2619s = c0544b.f2495r;
            bVar.f2620t = c0544b.f2496s;
            bVar.f2621u = c0544b.f2503z;
            bVar.f2622v = c0544b.f2437A;
            bVar.f2623w = c0544b.f2438B;
            bVar.f2624x = c0544b.f2487m;
            bVar.f2625y = c0544b.f2489n;
            bVar.f2626z = c0544b.f2491o;
            bVar.f2565A = c0544b.f2453Q;
            bVar.f2566B = c0544b.f2454R;
            bVar.f2567C = c0544b.f2455S;
            bVar.f2603g = c0544b.f2467c;
            bVar.f2599e = c0544b.f2463a;
            bVar.f2601f = c0544b.f2465b;
            bVar.f2595c = ((ViewGroup.MarginLayoutParams) c0544b).width;
            bVar.f2597d = ((ViewGroup.MarginLayoutParams) c0544b).height;
            bVar.f2568D = ((ViewGroup.MarginLayoutParams) c0544b).leftMargin;
            bVar.f2569E = ((ViewGroup.MarginLayoutParams) c0544b).rightMargin;
            bVar.f2570F = ((ViewGroup.MarginLayoutParams) c0544b).topMargin;
            bVar.f2571G = ((ViewGroup.MarginLayoutParams) c0544b).bottomMargin;
            bVar.f2580P = c0544b.f2442F;
            bVar.f2581Q = c0544b.f2441E;
            bVar.f2583S = c0544b.f2444H;
            bVar.f2582R = c0544b.f2443G;
            bVar.f2606h0 = c0544b.f2456T;
            bVar.f2608i0 = c0544b.f2457U;
            bVar.f2584T = c0544b.f2445I;
            bVar.f2585U = c0544b.f2446J;
            bVar.f2586V = c0544b.f2449M;
            bVar.f2587W = c0544b.f2450N;
            bVar.f2588X = c0544b.f2447K;
            bVar.f2589Y = c0544b.f2448L;
            bVar.f2590Z = c0544b.f2451O;
            bVar.f2592a0 = c0544b.f2452P;
            bVar.f2604g0 = c0544b.f2458V;
            bVar.f2575K = c0544b.f2498u;
            bVar.f2577M = c0544b.f2500w;
            bVar.f2574J = c0544b.f2497t;
            bVar.f2576L = c0544b.f2499v;
            bVar.f2579O = c0544b.f2501x;
            bVar.f2578N = c0544b.f2502y;
            bVar.f2572H = c0544b.getMarginEnd();
            this.f2561d.f2573I = c0544b.getMarginStart();
        }

        /* renamed from: g */
        public void m2594g(int i10, C0550e.a aVar) {
            m2593f(i10, aVar);
            this.f2559b.f2638d = aVar.f2657p0;
            e eVar = this.f2562e;
            eVar.f2642b = aVar.f2660s0;
            eVar.f2643c = aVar.f2661t0;
            eVar.f2644d = aVar.f2662u0;
            eVar.f2645e = aVar.f2663v0;
            eVar.f2646f = aVar.f2664w0;
            eVar.f2647g = aVar.f2665x0;
            eVar.f2648h = aVar.f2666y0;
            eVar.f2649i = aVar.f2667z0;
            eVar.f2650j = aVar.f2655A0;
            eVar.f2651k = aVar.f2656B0;
            eVar.f2653m = aVar.f2659r0;
            eVar.f2652l = aVar.f2658q0;
        }

        /* renamed from: h */
        public void m2595h(AbstractC0547b abstractC0547b, int i10, C0550e.a aVar) {
            m2594g(i10, aVar);
            if (abstractC0547b instanceof Barrier) {
                b bVar = this.f2561d;
                bVar.f2598d0 = 1;
                Barrier barrier = (Barrier) abstractC0547b;
                bVar.f2594b0 = barrier.getType();
                this.f2561d.f2600e0 = barrier.getReferencedIds();
                this.f2561d.f2596c0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void m2596d(ConstraintLayout.C0544b c0544b) {
            b bVar = this.f2561d;
            c0544b.f2469d = bVar.f2605h;
            c0544b.f2471e = bVar.f2607i;
            c0544b.f2473f = bVar.f2609j;
            c0544b.f2475g = bVar.f2611k;
            c0544b.f2477h = bVar.f2612l;
            c0544b.f2479i = bVar.f2613m;
            c0544b.f2481j = bVar.f2614n;
            c0544b.f2483k = bVar.f2615o;
            c0544b.f2485l = bVar.f2616p;
            c0544b.f2493p = bVar.f2617q;
            c0544b.f2494q = bVar.f2618r;
            c0544b.f2495r = bVar.f2619s;
            c0544b.f2496s = bVar.f2620t;
            ((ViewGroup.MarginLayoutParams) c0544b).leftMargin = bVar.f2568D;
            ((ViewGroup.MarginLayoutParams) c0544b).rightMargin = bVar.f2569E;
            ((ViewGroup.MarginLayoutParams) c0544b).topMargin = bVar.f2570F;
            ((ViewGroup.MarginLayoutParams) c0544b).bottomMargin = bVar.f2571G;
            c0544b.f2501x = bVar.f2579O;
            c0544b.f2502y = bVar.f2578N;
            c0544b.f2498u = bVar.f2575K;
            c0544b.f2500w = bVar.f2577M;
            c0544b.f2503z = bVar.f2621u;
            c0544b.f2437A = bVar.f2622v;
            c0544b.f2487m = bVar.f2624x;
            c0544b.f2489n = bVar.f2625y;
            c0544b.f2491o = bVar.f2626z;
            c0544b.f2438B = bVar.f2623w;
            c0544b.f2453Q = bVar.f2565A;
            c0544b.f2454R = bVar.f2566B;
            c0544b.f2442F = bVar.f2580P;
            c0544b.f2441E = bVar.f2581Q;
            c0544b.f2444H = bVar.f2583S;
            c0544b.f2443G = bVar.f2582R;
            c0544b.f2456T = bVar.f2606h0;
            c0544b.f2457U = bVar.f2608i0;
            c0544b.f2445I = bVar.f2584T;
            c0544b.f2446J = bVar.f2585U;
            c0544b.f2449M = bVar.f2586V;
            c0544b.f2450N = bVar.f2587W;
            c0544b.f2447K = bVar.f2588X;
            c0544b.f2448L = bVar.f2589Y;
            c0544b.f2451O = bVar.f2590Z;
            c0544b.f2452P = bVar.f2592a0;
            c0544b.f2455S = bVar.f2567C;
            c0544b.f2467c = bVar.f2603g;
            c0544b.f2463a = bVar.f2599e;
            c0544b.f2465b = bVar.f2601f;
            ((ViewGroup.MarginLayoutParams) c0544b).width = bVar.f2595c;
            ((ViewGroup.MarginLayoutParams) c0544b).height = bVar.f2597d;
            String str = bVar.f2604g0;
            if (str != null) {
                c0544b.f2458V = str;
            }
            c0544b.setMarginStart(bVar.f2573I);
            c0544b.setMarginEnd(this.f2561d.f2572H);
            c0544b.m2549a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.f2561d.m2598a(this.f2561d);
            aVar.f2560c.m2600a(this.f2560c);
            aVar.f2559b.m2602a(this.f2559b);
            aVar.f2562e.m2604a(this.f2562e);
            aVar.f2558a = this.f2558a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: k0 */
        private static SparseIntArray f2564k0;

        /* renamed from: c */
        public int f2595c;

        /* renamed from: d */
        public int f2597d;

        /* renamed from: e0 */
        public int[] f2600e0;

        /* renamed from: f0 */
        public String f2602f0;

        /* renamed from: g0 */
        public String f2604g0;

        /* renamed from: a */
        public boolean f2591a = false;

        /* renamed from: b */
        public boolean f2593b = false;

        /* renamed from: e */
        public int f2599e = -1;

        /* renamed from: f */
        public int f2601f = -1;

        /* renamed from: g */
        public float f2603g = -1.0f;

        /* renamed from: h */
        public int f2605h = -1;

        /* renamed from: i */
        public int f2607i = -1;

        /* renamed from: j */
        public int f2609j = -1;

        /* renamed from: k */
        public int f2611k = -1;

        /* renamed from: l */
        public int f2612l = -1;

        /* renamed from: m */
        public int f2613m = -1;

        /* renamed from: n */
        public int f2614n = -1;

        /* renamed from: o */
        public int f2615o = -1;

        /* renamed from: p */
        public int f2616p = -1;

        /* renamed from: q */
        public int f2617q = -1;

        /* renamed from: r */
        public int f2618r = -1;

        /* renamed from: s */
        public int f2619s = -1;

        /* renamed from: t */
        public int f2620t = -1;

        /* renamed from: u */
        public float f2621u = 0.5f;

        /* renamed from: v */
        public float f2622v = 0.5f;

        /* renamed from: w */
        public String f2623w = null;

        /* renamed from: x */
        public int f2624x = -1;

        /* renamed from: y */
        public int f2625y = 0;

        /* renamed from: z */
        public float f2626z = 0.0f;

        /* renamed from: A */
        public int f2565A = -1;

        /* renamed from: B */
        public int f2566B = -1;

        /* renamed from: C */
        public int f2567C = -1;

        /* renamed from: D */
        public int f2568D = -1;

        /* renamed from: E */
        public int f2569E = -1;

        /* renamed from: F */
        public int f2570F = -1;

        /* renamed from: G */
        public int f2571G = -1;

        /* renamed from: H */
        public int f2572H = -1;

        /* renamed from: I */
        public int f2573I = -1;

        /* renamed from: J */
        public int f2574J = -1;

        /* renamed from: K */
        public int f2575K = -1;

        /* renamed from: L */
        public int f2576L = -1;

        /* renamed from: M */
        public int f2577M = -1;

        /* renamed from: N */
        public int f2578N = -1;

        /* renamed from: O */
        public int f2579O = -1;

        /* renamed from: P */
        public float f2580P = -1.0f;

        /* renamed from: Q */
        public float f2581Q = -1.0f;

        /* renamed from: R */
        public int f2582R = 0;

        /* renamed from: S */
        public int f2583S = 0;

        /* renamed from: T */
        public int f2584T = 0;

        /* renamed from: U */
        public int f2585U = 0;

        /* renamed from: V */
        public int f2586V = -1;

        /* renamed from: W */
        public int f2587W = -1;

        /* renamed from: X */
        public int f2588X = -1;

        /* renamed from: Y */
        public int f2589Y = -1;

        /* renamed from: Z */
        public float f2590Z = 1.0f;

        /* renamed from: a0 */
        public float f2592a0 = 1.0f;

        /* renamed from: b0 */
        public int f2594b0 = -1;

        /* renamed from: c0 */
        public int f2596c0 = 0;

        /* renamed from: d0 */
        public int f2598d0 = -1;

        /* renamed from: h0 */
        public boolean f2606h0 = false;

        /* renamed from: i0 */
        public boolean f2608i0 = false;

        /* renamed from: j0 */
        public boolean f2610j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2564k0 = sparseIntArray;
            sparseIntArray.append(C0554i.f2705F3, 24);
            f2564k0.append(C0554i.f2711G3, 25);
            f2564k0.append(C0554i.f2723I3, 28);
            f2564k0.append(C0554i.f2729J3, 29);
            f2564k0.append(C0554i.f2759O3, 35);
            f2564k0.append(C0554i.f2753N3, 34);
            f2564k0.append(C0554i.f2937q3, 4);
            f2564k0.append(C0554i.f2931p3, 3);
            f2564k0.append(C0554i.f2919n3, 1);
            f2564k0.append(C0554i.f2789T3, 6);
            f2564k0.append(C0554i.f2795U3, 7);
            f2564k0.append(C0554i.f2979x3, 17);
            f2564k0.append(C0554i.f2985y3, 18);
            f2564k0.append(C0554i.f2991z3, 19);
            f2564k0.append(C0554i.f2818Y2, 26);
            f2564k0.append(C0554i.f2735K3, 31);
            f2564k0.append(C0554i.f2741L3, 32);
            f2564k0.append(C0554i.f2973w3, 10);
            f2564k0.append(C0554i.f2967v3, 9);
            f2564k0.append(C0554i.f2813X3, 13);
            f2564k0.append(C0554i.f2832a4, 16);
            f2564k0.append(C0554i.f2819Y3, 14);
            f2564k0.append(C0554i.f2801V3, 11);
            f2564k0.append(C0554i.f2825Z3, 15);
            f2564k0.append(C0554i.f2807W3, 12);
            f2564k0.append(C0554i.f2777R3, 38);
            f2564k0.append(C0554i.f2693D3, 37);
            f2564k0.append(C0554i.f2687C3, 39);
            f2564k0.append(C0554i.f2771Q3, 40);
            f2564k0.append(C0554i.f2681B3, 20);
            f2564k0.append(C0554i.f2765P3, 36);
            f2564k0.append(C0554i.f2961u3, 5);
            f2564k0.append(C0554i.f2699E3, 76);
            f2564k0.append(C0554i.f2747M3, 76);
            f2564k0.append(C0554i.f2717H3, 76);
            f2564k0.append(C0554i.f2925o3, 76);
            f2564k0.append(C0554i.f2913m3, 76);
            f2564k0.append(C0554i.f2838b3, 23);
            f2564k0.append(C0554i.f2852d3, 27);
            f2564k0.append(C0554i.f2866f3, 30);
            f2564k0.append(C0554i.f2873g3, 8);
            f2564k0.append(C0554i.f2845c3, 33);
            f2564k0.append(C0554i.f2859e3, 2);
            f2564k0.append(C0554i.f2824Z2, 22);
            f2564k0.append(C0554i.f2831a3, 21);
            f2564k0.append(C0554i.f2943r3, 61);
            f2564k0.append(C0554i.f2955t3, 62);
            f2564k0.append(C0554i.f2949s3, 63);
            f2564k0.append(C0554i.f2783S3, 69);
            f2564k0.append(C0554i.f2675A3, 70);
            f2564k0.append(C0554i.f2901k3, 71);
            f2564k0.append(C0554i.f2887i3, 72);
            f2564k0.append(C0554i.f2894j3, 73);
            f2564k0.append(C0554i.f2907l3, 74);
            f2564k0.append(C0554i.f2880h3, 75);
        }

        /* renamed from: a */
        public void m2598a(b bVar) {
            this.f2591a = bVar.f2591a;
            this.f2595c = bVar.f2595c;
            this.f2593b = bVar.f2593b;
            this.f2597d = bVar.f2597d;
            this.f2599e = bVar.f2599e;
            this.f2601f = bVar.f2601f;
            this.f2603g = bVar.f2603g;
            this.f2605h = bVar.f2605h;
            this.f2607i = bVar.f2607i;
            this.f2609j = bVar.f2609j;
            this.f2611k = bVar.f2611k;
            this.f2612l = bVar.f2612l;
            this.f2613m = bVar.f2613m;
            this.f2614n = bVar.f2614n;
            this.f2615o = bVar.f2615o;
            this.f2616p = bVar.f2616p;
            this.f2617q = bVar.f2617q;
            this.f2618r = bVar.f2618r;
            this.f2619s = bVar.f2619s;
            this.f2620t = bVar.f2620t;
            this.f2621u = bVar.f2621u;
            this.f2622v = bVar.f2622v;
            this.f2623w = bVar.f2623w;
            this.f2624x = bVar.f2624x;
            this.f2625y = bVar.f2625y;
            this.f2626z = bVar.f2626z;
            this.f2565A = bVar.f2565A;
            this.f2566B = bVar.f2566B;
            this.f2567C = bVar.f2567C;
            this.f2568D = bVar.f2568D;
            this.f2569E = bVar.f2569E;
            this.f2570F = bVar.f2570F;
            this.f2571G = bVar.f2571G;
            this.f2572H = bVar.f2572H;
            this.f2573I = bVar.f2573I;
            this.f2574J = bVar.f2574J;
            this.f2575K = bVar.f2575K;
            this.f2576L = bVar.f2576L;
            this.f2577M = bVar.f2577M;
            this.f2578N = bVar.f2578N;
            this.f2579O = bVar.f2579O;
            this.f2580P = bVar.f2580P;
            this.f2581Q = bVar.f2581Q;
            this.f2582R = bVar.f2582R;
            this.f2583S = bVar.f2583S;
            this.f2584T = bVar.f2584T;
            this.f2585U = bVar.f2585U;
            this.f2586V = bVar.f2586V;
            this.f2587W = bVar.f2587W;
            this.f2588X = bVar.f2588X;
            this.f2589Y = bVar.f2589Y;
            this.f2590Z = bVar.f2590Z;
            this.f2592a0 = bVar.f2592a0;
            this.f2594b0 = bVar.f2594b0;
            this.f2596c0 = bVar.f2596c0;
            this.f2598d0 = bVar.f2598d0;
            this.f2604g0 = bVar.f2604g0;
            int[] iArr = bVar.f2600e0;
            if (iArr != null) {
                this.f2600e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2600e0 = null;
            }
            this.f2602f0 = bVar.f2602f0;
            this.f2606h0 = bVar.f2606h0;
            this.f2608i0 = bVar.f2608i0;
            this.f2610j0 = bVar.f2610j0;
        }

        /* renamed from: b */
        void m2599b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0554i.f2812X2);
            this.f2593b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f2564k0.get(index);
                if (i11 == 80) {
                    this.f2606h0 = obtainStyledAttributes.getBoolean(index, this.f2606h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f2616p = C0549d.m2579o(obtainStyledAttributes, index, this.f2616p);
                            break;
                        case 2:
                            this.f2571G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2571G);
                            break;
                        case 3:
                            this.f2615o = C0549d.m2579o(obtainStyledAttributes, index, this.f2615o);
                            break;
                        case 4:
                            this.f2614n = C0549d.m2579o(obtainStyledAttributes, index, this.f2614n);
                            break;
                        case 5:
                            this.f2623w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f2565A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2565A);
                            break;
                        case 7:
                            this.f2566B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2566B);
                            break;
                        case 8:
                            this.f2572H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2572H);
                            break;
                        case 9:
                            this.f2620t = C0549d.m2579o(obtainStyledAttributes, index, this.f2620t);
                            break;
                        case 10:
                            this.f2619s = C0549d.m2579o(obtainStyledAttributes, index, this.f2619s);
                            break;
                        case 11:
                            this.f2577M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2577M);
                            break;
                        case 12:
                            this.f2578N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2578N);
                            break;
                        case 13:
                            this.f2574J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2574J);
                            break;
                        case 14:
                            this.f2576L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2576L);
                            break;
                        case 15:
                            this.f2579O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2579O);
                            break;
                        case 16:
                            this.f2575K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2575K);
                            break;
                        case 17:
                            this.f2599e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2599e);
                            break;
                        case 18:
                            this.f2601f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2601f);
                            break;
                        case 19:
                            this.f2603g = obtainStyledAttributes.getFloat(index, this.f2603g);
                            break;
                        case 20:
                            this.f2621u = obtainStyledAttributes.getFloat(index, this.f2621u);
                            break;
                        case 21:
                            this.f2597d = obtainStyledAttributes.getLayoutDimension(index, this.f2597d);
                            break;
                        case 22:
                            this.f2595c = obtainStyledAttributes.getLayoutDimension(index, this.f2595c);
                            break;
                        case 23:
                            this.f2568D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2568D);
                            break;
                        case 24:
                            this.f2605h = C0549d.m2579o(obtainStyledAttributes, index, this.f2605h);
                            break;
                        case 25:
                            this.f2607i = C0549d.m2579o(obtainStyledAttributes, index, this.f2607i);
                            break;
                        case 26:
                            this.f2567C = obtainStyledAttributes.getInt(index, this.f2567C);
                            break;
                        case 27:
                            this.f2569E = obtainStyledAttributes.getDimensionPixelSize(index, this.f2569E);
                            break;
                        case 28:
                            this.f2609j = C0549d.m2579o(obtainStyledAttributes, index, this.f2609j);
                            break;
                        case 29:
                            this.f2611k = C0549d.m2579o(obtainStyledAttributes, index, this.f2611k);
                            break;
                        case 30:
                            this.f2573I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2573I);
                            break;
                        case 31:
                            this.f2617q = C0549d.m2579o(obtainStyledAttributes, index, this.f2617q);
                            break;
                        case 32:
                            this.f2618r = C0549d.m2579o(obtainStyledAttributes, index, this.f2618r);
                            break;
                        case 33:
                            this.f2570F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2570F);
                            break;
                        case 34:
                            this.f2613m = C0549d.m2579o(obtainStyledAttributes, index, this.f2613m);
                            break;
                        case 35:
                            this.f2612l = C0549d.m2579o(obtainStyledAttributes, index, this.f2612l);
                            break;
                        case 36:
                            this.f2622v = obtainStyledAttributes.getFloat(index, this.f2622v);
                            break;
                        case 37:
                            this.f2581Q = obtainStyledAttributes.getFloat(index, this.f2581Q);
                            break;
                        case 38:
                            this.f2580P = obtainStyledAttributes.getFloat(index, this.f2580P);
                            break;
                        case 39:
                            this.f2582R = obtainStyledAttributes.getInt(index, this.f2582R);
                            break;
                        case 40:
                            this.f2583S = obtainStyledAttributes.getInt(index, this.f2583S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f2584T = obtainStyledAttributes.getInt(index, this.f2584T);
                                    break;
                                case 55:
                                    this.f2585U = obtainStyledAttributes.getInt(index, this.f2585U);
                                    break;
                                case 56:
                                    this.f2586V = obtainStyledAttributes.getDimensionPixelSize(index, this.f2586V);
                                    break;
                                case 57:
                                    this.f2587W = obtainStyledAttributes.getDimensionPixelSize(index, this.f2587W);
                                    break;
                                case 58:
                                    this.f2588X = obtainStyledAttributes.getDimensionPixelSize(index, this.f2588X);
                                    break;
                                case 59:
                                    this.f2589Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2589Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f2624x = C0549d.m2579o(obtainStyledAttributes, index, this.f2624x);
                                            break;
                                        case 62:
                                            this.f2625y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2625y);
                                            break;
                                        case 63:
                                            this.f2626z = obtainStyledAttributes.getFloat(index, this.f2626z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f2590Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f2592a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f2594b0 = obtainStyledAttributes.getInt(index, this.f2594b0);
                                                    break;
                                                case 73:
                                                    this.f2596c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2596c0);
                                                    break;
                                                case 74:
                                                    this.f2602f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f2610j0 = obtainStyledAttributes.getBoolean(index, this.f2610j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2564k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f2604g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2564k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2608i0 = obtainStyledAttributes.getBoolean(index, this.f2608i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: h */
        private static SparseIntArray f2627h;

        /* renamed from: a */
        public boolean f2628a = false;

        /* renamed from: b */
        public int f2629b = -1;

        /* renamed from: c */
        public String f2630c = null;

        /* renamed from: d */
        public int f2631d = -1;

        /* renamed from: e */
        public int f2632e = 0;

        /* renamed from: f */
        public float f2633f = Float.NaN;

        /* renamed from: g */
        public float f2634g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2627h = sparseIntArray;
            sparseIntArray.append(C0554i.f2908l4, 1);
            f2627h.append(C0554i.f2920n4, 2);
            f2627h.append(C0554i.f2926o4, 3);
            f2627h.append(C0554i.f2902k4, 4);
            f2627h.append(C0554i.f2895j4, 5);
            f2627h.append(C0554i.f2914m4, 6);
        }

        /* renamed from: a */
        public void m2600a(c cVar) {
            this.f2628a = cVar.f2628a;
            this.f2629b = cVar.f2629b;
            this.f2630c = cVar.f2630c;
            this.f2631d = cVar.f2631d;
            this.f2632e = cVar.f2632e;
            this.f2634g = cVar.f2634g;
            this.f2633f = cVar.f2633f;
        }

        /* renamed from: b */
        void m2601b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0554i.f2888i4);
            this.f2628a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2627h.get(index)) {
                    case 1:
                        this.f2634g = obtainStyledAttributes.getFloat(index, this.f2634g);
                        break;
                    case 2:
                        this.f2631d = obtainStyledAttributes.getInt(index, this.f2631d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2630c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2630c = C3465a.f14386c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2632e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2629b = C0549d.m2579o(obtainStyledAttributes, index, this.f2629b);
                        break;
                    case 6:
                        this.f2633f = obtainStyledAttributes.getFloat(index, this.f2633f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public boolean f2635a = false;

        /* renamed from: b */
        public int f2636b = 0;

        /* renamed from: c */
        public int f2637c = 0;

        /* renamed from: d */
        public float f2638d = 1.0f;

        /* renamed from: e */
        public float f2639e = Float.NaN;

        /* renamed from: a */
        public void m2602a(d dVar) {
            this.f2635a = dVar.f2635a;
            this.f2636b = dVar.f2636b;
            this.f2638d = dVar.f2638d;
            this.f2639e = dVar.f2639e;
            this.f2637c = dVar.f2637c;
        }

        /* renamed from: b */
        void m2603b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0554i.f2980x4);
            this.f2635a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C0554i.f2992z4) {
                    this.f2638d = obtainStyledAttributes.getFloat(index, this.f2638d);
                } else if (index == C0554i.f2986y4) {
                    this.f2636b = obtainStyledAttributes.getInt(index, this.f2636b);
                    this.f2636b = C0549d.f2553d[this.f2636b];
                } else if (index == C0554i.f2682B4) {
                    this.f2637c = obtainStyledAttributes.getInt(index, this.f2637c);
                } else if (index == C0554i.f2676A4) {
                    this.f2639e = obtainStyledAttributes.getFloat(index, this.f2639e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: n */
        private static SparseIntArray f2640n;

        /* renamed from: a */
        public boolean f2641a = false;

        /* renamed from: b */
        public float f2642b = 0.0f;

        /* renamed from: c */
        public float f2643c = 0.0f;

        /* renamed from: d */
        public float f2644d = 0.0f;

        /* renamed from: e */
        public float f2645e = 1.0f;

        /* renamed from: f */
        public float f2646f = 1.0f;

        /* renamed from: g */
        public float f2647g = Float.NaN;

        /* renamed from: h */
        public float f2648h = Float.NaN;

        /* renamed from: i */
        public float f2649i = 0.0f;

        /* renamed from: j */
        public float f2650j = 0.0f;

        /* renamed from: k */
        public float f2651k = 0.0f;

        /* renamed from: l */
        public boolean f2652l = false;

        /* renamed from: m */
        public float f2653m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2640n = sparseIntArray;
            sparseIntArray.append(C0554i.f2802V4, 1);
            f2640n.append(C0554i.f2808W4, 2);
            f2640n.append(C0554i.f2814X4, 3);
            f2640n.append(C0554i.f2790T4, 4);
            f2640n.append(C0554i.f2796U4, 5);
            f2640n.append(C0554i.f2766P4, 6);
            f2640n.append(C0554i.f2772Q4, 7);
            f2640n.append(C0554i.f2778R4, 8);
            f2640n.append(C0554i.f2784S4, 9);
            f2640n.append(C0554i.f2820Y4, 10);
            f2640n.append(C0554i.f2826Z4, 11);
        }

        /* renamed from: a */
        public void m2604a(e eVar) {
            this.f2641a = eVar.f2641a;
            this.f2642b = eVar.f2642b;
            this.f2643c = eVar.f2643c;
            this.f2644d = eVar.f2644d;
            this.f2645e = eVar.f2645e;
            this.f2646f = eVar.f2646f;
            this.f2647g = eVar.f2647g;
            this.f2648h = eVar.f2648h;
            this.f2649i = eVar.f2649i;
            this.f2650j = eVar.f2650j;
            this.f2651k = eVar.f2651k;
            this.f2652l = eVar.f2652l;
            this.f2653m = eVar.f2653m;
        }

        /* renamed from: b */
        void m2605b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0554i.f2760O4);
            this.f2641a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2640n.get(index)) {
                    case 1:
                        this.f2642b = obtainStyledAttributes.getFloat(index, this.f2642b);
                        break;
                    case 2:
                        this.f2643c = obtainStyledAttributes.getFloat(index, this.f2643c);
                        break;
                    case 3:
                        this.f2644d = obtainStyledAttributes.getFloat(index, this.f2644d);
                        break;
                    case 4:
                        this.f2645e = obtainStyledAttributes.getFloat(index, this.f2645e);
                        break;
                    case 5:
                        this.f2646f = obtainStyledAttributes.getFloat(index, this.f2646f);
                        break;
                    case 6:
                        this.f2647g = obtainStyledAttributes.getDimension(index, this.f2647g);
                        break;
                    case 7:
                        this.f2648h = obtainStyledAttributes.getDimension(index, this.f2648h);
                        break;
                    case 8:
                        this.f2649i = obtainStyledAttributes.getDimension(index, this.f2649i);
                        break;
                    case 9:
                        this.f2650j = obtainStyledAttributes.getDimension(index, this.f2650j);
                        break;
                    case 10:
                        this.f2651k = obtainStyledAttributes.getDimension(index, this.f2651k);
                        break;
                    case 11:
                        this.f2652l = true;
                        this.f2653m = obtainStyledAttributes.getDimension(index, this.f2653m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2554e = sparseIntArray;
        sparseIntArray.append(C0554i.f2958u0, 25);
        f2554e.append(C0554i.f2964v0, 26);
        f2554e.append(C0554i.f2976x0, 29);
        f2554e.append(C0554i.f2982y0, 30);
        f2554e.append(C0554i.f2696E0, 36);
        f2554e.append(C0554i.f2690D0, 35);
        f2554e.append(C0554i.f2842c0, 4);
        f2554e.append(C0554i.f2835b0, 3);
        f2554e.append(C0554i.f2821Z, 1);
        f2554e.append(C0554i.f2744M0, 6);
        f2554e.append(C0554i.f2750N0, 7);
        f2554e.append(C0554i.f2891j0, 17);
        f2554e.append(C0554i.f2898k0, 18);
        f2554e.append(C0554i.f2904l0, 19);
        f2554e.append(C0554i.f2945s, 27);
        f2554e.append(C0554i.f2988z0, 32);
        f2554e.append(C0554i.f2672A0, 33);
        f2554e.append(C0554i.f2884i0, 10);
        f2554e.append(C0554i.f2877h0, 9);
        f2554e.append(C0554i.f2768Q0, 13);
        f2554e.append(C0554i.f2786T0, 16);
        f2554e.append(C0554i.f2774R0, 14);
        f2554e.append(C0554i.f2756O0, 11);
        f2554e.append(C0554i.f2780S0, 15);
        f2554e.append(C0554i.f2762P0, 12);
        f2554e.append(C0554i.f2714H0, 40);
        f2554e.append(C0554i.f2946s0, 39);
        f2554e.append(C0554i.f2940r0, 41);
        f2554e.append(C0554i.f2708G0, 42);
        f2554e.append(C0554i.f2934q0, 20);
        f2554e.append(C0554i.f2702F0, 37);
        f2554e.append(C0554i.f2870g0, 5);
        f2554e.append(C0554i.f2952t0, 82);
        f2554e.append(C0554i.f2684C0, 82);
        f2554e.append(C0554i.f2970w0, 82);
        f2554e.append(C0554i.f2828a0, 82);
        f2554e.append(C0554i.f2815Y, 82);
        f2554e.append(C0554i.f2975x, 24);
        f2554e.append(C0554i.f2987z, 28);
        f2554e.append(C0554i.f2737L, 31);
        f2554e.append(C0554i.f2743M, 8);
        f2554e.append(C0554i.f2981y, 34);
        f2554e.append(C0554i.f2671A, 2);
        f2554e.append(C0554i.f2963v, 23);
        f2554e.append(C0554i.f2969w, 21);
        f2554e.append(C0554i.f2957u, 22);
        f2554e.append(C0554i.f2677B, 43);
        f2554e.append(C0554i.f2755O, 44);
        f2554e.append(C0554i.f2725J, 45);
        f2554e.append(C0554i.f2731K, 46);
        f2554e.append(C0554i.f2719I, 60);
        f2554e.append(C0554i.f2707G, 47);
        f2554e.append(C0554i.f2713H, 48);
        f2554e.append(C0554i.f2683C, 49);
        f2554e.append(C0554i.f2689D, 50);
        f2554e.append(C0554i.f2695E, 51);
        f2554e.append(C0554i.f2701F, 52);
        f2554e.append(C0554i.f2749N, 53);
        f2554e.append(C0554i.f2720I0, 54);
        f2554e.append(C0554i.f2910m0, 55);
        f2554e.append(C0554i.f2726J0, 56);
        f2554e.append(C0554i.f2916n0, 57);
        f2554e.append(C0554i.f2732K0, 58);
        f2554e.append(C0554i.f2922o0, 59);
        f2554e.append(C0554i.f2849d0, 61);
        f2554e.append(C0554i.f2863f0, 62);
        f2554e.append(C0554i.f2856e0, 63);
        f2554e.append(C0554i.f2761P, 64);
        f2554e.append(C0554i.f2810X0, 65);
        f2554e.append(C0554i.f2797V, 66);
        f2554e.append(C0554i.f2816Y0, 67);
        f2554e.append(C0554i.f2798V0, 79);
        f2554e.append(C0554i.f2951t, 38);
        f2554e.append(C0554i.f2792U0, 68);
        f2554e.append(C0554i.f2738L0, 69);
        f2554e.append(C0554i.f2928p0, 70);
        f2554e.append(C0554i.f2785T, 71);
        f2554e.append(C0554i.f2773R, 72);
        f2554e.append(C0554i.f2779S, 73);
        f2554e.append(C0554i.f2791U, 74);
        f2554e.append(C0554i.f2767Q, 75);
        f2554e.append(C0554i.f2804W0, 76);
        f2554e.append(C0554i.f2678B0, 77);
        f2554e.append(C0554i.f2822Z0, 78);
        f2554e.append(C0554i.f2809X, 80);
        f2554e.append(C0554i.f2803W, 81);
    }

    /* renamed from: j */
    private int[] m2576j(View view, String str) {
        int i10;
        Object m2540g;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = C0553h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m2540g = ((ConstraintLayout) view.getParent()).m2540g(0, trim)) != null && (m2540g instanceof Integer)) {
                i10 = ((Integer) m2540g).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    /* renamed from: k */
    private a m2577k(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0554i.f2939r);
        m2580p(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: l */
    private a m2578l(int i10) {
        if (!this.f2557c.containsKey(Integer.valueOf(i10))) {
            this.f2557c.put(Integer.valueOf(i10), new a());
        }
        return this.f2557c.get(Integer.valueOf(i10));
    }

    /* renamed from: o */
    public static int m2579o(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* renamed from: p */
    private void m2580p(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != C0554i.f2951t && C0554i.f2737L != index && C0554i.f2743M != index) {
                aVar.f2560c.f2628a = true;
                aVar.f2561d.f2593b = true;
                aVar.f2559b.f2635a = true;
                aVar.f2562e.f2641a = true;
            }
            switch (f2554e.get(index)) {
                case 1:
                    b bVar = aVar.f2561d;
                    bVar.f2616p = m2579o(typedArray, index, bVar.f2616p);
                    break;
                case 2:
                    b bVar2 = aVar.f2561d;
                    bVar2.f2571G = typedArray.getDimensionPixelSize(index, bVar2.f2571G);
                    break;
                case 3:
                    b bVar3 = aVar.f2561d;
                    bVar3.f2615o = m2579o(typedArray, index, bVar3.f2615o);
                    break;
                case 4:
                    b bVar4 = aVar.f2561d;
                    bVar4.f2614n = m2579o(typedArray, index, bVar4.f2614n);
                    break;
                case 5:
                    aVar.f2561d.f2623w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f2561d;
                    bVar5.f2565A = typedArray.getDimensionPixelOffset(index, bVar5.f2565A);
                    break;
                case 7:
                    b bVar6 = aVar.f2561d;
                    bVar6.f2566B = typedArray.getDimensionPixelOffset(index, bVar6.f2566B);
                    break;
                case 8:
                    b bVar7 = aVar.f2561d;
                    bVar7.f2572H = typedArray.getDimensionPixelSize(index, bVar7.f2572H);
                    break;
                case 9:
                    b bVar8 = aVar.f2561d;
                    bVar8.f2620t = m2579o(typedArray, index, bVar8.f2620t);
                    break;
                case 10:
                    b bVar9 = aVar.f2561d;
                    bVar9.f2619s = m2579o(typedArray, index, bVar9.f2619s);
                    break;
                case 11:
                    b bVar10 = aVar.f2561d;
                    bVar10.f2577M = typedArray.getDimensionPixelSize(index, bVar10.f2577M);
                    break;
                case 12:
                    b bVar11 = aVar.f2561d;
                    bVar11.f2578N = typedArray.getDimensionPixelSize(index, bVar11.f2578N);
                    break;
                case 13:
                    b bVar12 = aVar.f2561d;
                    bVar12.f2574J = typedArray.getDimensionPixelSize(index, bVar12.f2574J);
                    break;
                case 14:
                    b bVar13 = aVar.f2561d;
                    bVar13.f2576L = typedArray.getDimensionPixelSize(index, bVar13.f2576L);
                    break;
                case 15:
                    b bVar14 = aVar.f2561d;
                    bVar14.f2579O = typedArray.getDimensionPixelSize(index, bVar14.f2579O);
                    break;
                case 16:
                    b bVar15 = aVar.f2561d;
                    bVar15.f2575K = typedArray.getDimensionPixelSize(index, bVar15.f2575K);
                    break;
                case 17:
                    b bVar16 = aVar.f2561d;
                    bVar16.f2599e = typedArray.getDimensionPixelOffset(index, bVar16.f2599e);
                    break;
                case 18:
                    b bVar17 = aVar.f2561d;
                    bVar17.f2601f = typedArray.getDimensionPixelOffset(index, bVar17.f2601f);
                    break;
                case 19:
                    b bVar18 = aVar.f2561d;
                    bVar18.f2603g = typedArray.getFloat(index, bVar18.f2603g);
                    break;
                case 20:
                    b bVar19 = aVar.f2561d;
                    bVar19.f2621u = typedArray.getFloat(index, bVar19.f2621u);
                    break;
                case 21:
                    b bVar20 = aVar.f2561d;
                    bVar20.f2597d = typedArray.getLayoutDimension(index, bVar20.f2597d);
                    break;
                case 22:
                    d dVar = aVar.f2559b;
                    dVar.f2636b = typedArray.getInt(index, dVar.f2636b);
                    d dVar2 = aVar.f2559b;
                    dVar2.f2636b = f2553d[dVar2.f2636b];
                    break;
                case 23:
                    b bVar21 = aVar.f2561d;
                    bVar21.f2595c = typedArray.getLayoutDimension(index, bVar21.f2595c);
                    break;
                case 24:
                    b bVar22 = aVar.f2561d;
                    bVar22.f2568D = typedArray.getDimensionPixelSize(index, bVar22.f2568D);
                    break;
                case 25:
                    b bVar23 = aVar.f2561d;
                    bVar23.f2605h = m2579o(typedArray, index, bVar23.f2605h);
                    break;
                case 26:
                    b bVar24 = aVar.f2561d;
                    bVar24.f2607i = m2579o(typedArray, index, bVar24.f2607i);
                    break;
                case 27:
                    b bVar25 = aVar.f2561d;
                    bVar25.f2567C = typedArray.getInt(index, bVar25.f2567C);
                    break;
                case 28:
                    b bVar26 = aVar.f2561d;
                    bVar26.f2569E = typedArray.getDimensionPixelSize(index, bVar26.f2569E);
                    break;
                case 29:
                    b bVar27 = aVar.f2561d;
                    bVar27.f2609j = m2579o(typedArray, index, bVar27.f2609j);
                    break;
                case 30:
                    b bVar28 = aVar.f2561d;
                    bVar28.f2611k = m2579o(typedArray, index, bVar28.f2611k);
                    break;
                case 31:
                    b bVar29 = aVar.f2561d;
                    bVar29.f2573I = typedArray.getDimensionPixelSize(index, bVar29.f2573I);
                    break;
                case 32:
                    b bVar30 = aVar.f2561d;
                    bVar30.f2617q = m2579o(typedArray, index, bVar30.f2617q);
                    break;
                case 33:
                    b bVar31 = aVar.f2561d;
                    bVar31.f2618r = m2579o(typedArray, index, bVar31.f2618r);
                    break;
                case 34:
                    b bVar32 = aVar.f2561d;
                    bVar32.f2570F = typedArray.getDimensionPixelSize(index, bVar32.f2570F);
                    break;
                case 35:
                    b bVar33 = aVar.f2561d;
                    bVar33.f2613m = m2579o(typedArray, index, bVar33.f2613m);
                    break;
                case 36:
                    b bVar34 = aVar.f2561d;
                    bVar34.f2612l = m2579o(typedArray, index, bVar34.f2612l);
                    break;
                case 37:
                    b bVar35 = aVar.f2561d;
                    bVar35.f2622v = typedArray.getFloat(index, bVar35.f2622v);
                    break;
                case 38:
                    aVar.f2558a = typedArray.getResourceId(index, aVar.f2558a);
                    break;
                case 39:
                    b bVar36 = aVar.f2561d;
                    bVar36.f2581Q = typedArray.getFloat(index, bVar36.f2581Q);
                    break;
                case 40:
                    b bVar37 = aVar.f2561d;
                    bVar37.f2580P = typedArray.getFloat(index, bVar37.f2580P);
                    break;
                case 41:
                    b bVar38 = aVar.f2561d;
                    bVar38.f2582R = typedArray.getInt(index, bVar38.f2582R);
                    break;
                case 42:
                    b bVar39 = aVar.f2561d;
                    bVar39.f2583S = typedArray.getInt(index, bVar39.f2583S);
                    break;
                case 43:
                    d dVar3 = aVar.f2559b;
                    dVar3.f2638d = typedArray.getFloat(index, dVar3.f2638d);
                    break;
                case 44:
                    e eVar = aVar.f2562e;
                    eVar.f2652l = true;
                    eVar.f2653m = typedArray.getDimension(index, eVar.f2653m);
                    break;
                case 45:
                    e eVar2 = aVar.f2562e;
                    eVar2.f2643c = typedArray.getFloat(index, eVar2.f2643c);
                    break;
                case 46:
                    e eVar3 = aVar.f2562e;
                    eVar3.f2644d = typedArray.getFloat(index, eVar3.f2644d);
                    break;
                case 47:
                    e eVar4 = aVar.f2562e;
                    eVar4.f2645e = typedArray.getFloat(index, eVar4.f2645e);
                    break;
                case 48:
                    e eVar5 = aVar.f2562e;
                    eVar5.f2646f = typedArray.getFloat(index, eVar5.f2646f);
                    break;
                case 49:
                    e eVar6 = aVar.f2562e;
                    eVar6.f2647g = typedArray.getDimension(index, eVar6.f2647g);
                    break;
                case 50:
                    e eVar7 = aVar.f2562e;
                    eVar7.f2648h = typedArray.getDimension(index, eVar7.f2648h);
                    break;
                case 51:
                    e eVar8 = aVar.f2562e;
                    eVar8.f2649i = typedArray.getDimension(index, eVar8.f2649i);
                    break;
                case 52:
                    e eVar9 = aVar.f2562e;
                    eVar9.f2650j = typedArray.getDimension(index, eVar9.f2650j);
                    break;
                case 53:
                    e eVar10 = aVar.f2562e;
                    eVar10.f2651k = typedArray.getDimension(index, eVar10.f2651k);
                    break;
                case 54:
                    b bVar40 = aVar.f2561d;
                    bVar40.f2584T = typedArray.getInt(index, bVar40.f2584T);
                    break;
                case 55:
                    b bVar41 = aVar.f2561d;
                    bVar41.f2585U = typedArray.getInt(index, bVar41.f2585U);
                    break;
                case 56:
                    b bVar42 = aVar.f2561d;
                    bVar42.f2586V = typedArray.getDimensionPixelSize(index, bVar42.f2586V);
                    break;
                case 57:
                    b bVar43 = aVar.f2561d;
                    bVar43.f2587W = typedArray.getDimensionPixelSize(index, bVar43.f2587W);
                    break;
                case 58:
                    b bVar44 = aVar.f2561d;
                    bVar44.f2588X = typedArray.getDimensionPixelSize(index, bVar44.f2588X);
                    break;
                case 59:
                    b bVar45 = aVar.f2561d;
                    bVar45.f2589Y = typedArray.getDimensionPixelSize(index, bVar45.f2589Y);
                    break;
                case 60:
                    e eVar11 = aVar.f2562e;
                    eVar11.f2642b = typedArray.getFloat(index, eVar11.f2642b);
                    break;
                case 61:
                    b bVar46 = aVar.f2561d;
                    bVar46.f2624x = m2579o(typedArray, index, bVar46.f2624x);
                    break;
                case 62:
                    b bVar47 = aVar.f2561d;
                    bVar47.f2625y = typedArray.getDimensionPixelSize(index, bVar47.f2625y);
                    break;
                case 63:
                    b bVar48 = aVar.f2561d;
                    bVar48.f2626z = typedArray.getFloat(index, bVar48.f2626z);
                    break;
                case 64:
                    c cVar = aVar.f2560c;
                    cVar.f2629b = m2579o(typedArray, index, cVar.f2629b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2560c.f2630c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2560c.f2630c = C3465a.f14386c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f2560c.f2632e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f2560c;
                    cVar2.f2634g = typedArray.getFloat(index, cVar2.f2634g);
                    break;
                case 68:
                    d dVar4 = aVar.f2559b;
                    dVar4.f2639e = typedArray.getFloat(index, dVar4.f2639e);
                    break;
                case 69:
                    aVar.f2561d.f2590Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2561d.f2592a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f2561d;
                    bVar49.f2594b0 = typedArray.getInt(index, bVar49.f2594b0);
                    break;
                case 73:
                    b bVar50 = aVar.f2561d;
                    bVar50.f2596c0 = typedArray.getDimensionPixelSize(index, bVar50.f2596c0);
                    break;
                case 74:
                    aVar.f2561d.f2602f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f2561d;
                    bVar51.f2610j0 = typedArray.getBoolean(index, bVar51.f2610j0);
                    break;
                case 76:
                    c cVar3 = aVar.f2560c;
                    cVar3.f2631d = typedArray.getInt(index, cVar3.f2631d);
                    break;
                case 77:
                    aVar.f2561d.f2604g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f2559b;
                    dVar5.f2637c = typedArray.getInt(index, dVar5.f2637c);
                    break;
                case 79:
                    c cVar4 = aVar.f2560c;
                    cVar4.f2633f = typedArray.getFloat(index, cVar4.f2633f);
                    break;
                case 80:
                    b bVar52 = aVar.f2561d;
                    bVar52.f2606h0 = typedArray.getBoolean(index, bVar52.f2606h0);
                    break;
                case 81:
                    b bVar53 = aVar.f2561d;
                    bVar53.f2608i0 = typedArray.getBoolean(index, bVar53.f2608i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2554e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2554e.get(index));
                    break;
            }
        }
    }

    /* renamed from: c */
    public void m2581c(ConstraintLayout constraintLayout) {
        m2582d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: d */
    public void m2582d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2557c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (this.f2557c.containsKey(Integer.valueOf(id))) {
                if (this.f2556b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f2557c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f2557c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f2561d.f2598d0 = 1;
                        }
                        int i11 = aVar.f2561d.f2598d0;
                        if (i11 != -1 && i11 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f2561d.f2594b0);
                            barrier.setMargin(aVar.f2561d.f2596c0);
                            barrier.setAllowsGoneWidget(aVar.f2561d.f2610j0);
                            b bVar = aVar.f2561d;
                            int[] iArr = bVar.f2600e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f2602f0;
                                if (str != null) {
                                    bVar.f2600e0 = m2576j(barrier, str);
                                    barrier.setReferencedIds(aVar.f2561d.f2600e0);
                                }
                            }
                        }
                        ConstraintLayout.C0544b c0544b = (ConstraintLayout.C0544b) childAt.getLayoutParams();
                        c0544b.m2549a();
                        aVar.m2596d(c0544b);
                        if (z10) {
                            C0546a.m2556c(childAt, aVar.f2563f);
                        }
                        childAt.setLayoutParams(c0544b);
                        d dVar = aVar.f2559b;
                        if (dVar.f2637c == 0) {
                            childAt.setVisibility(dVar.f2636b);
                        }
                        childAt.setAlpha(aVar.f2559b.f2638d);
                        childAt.setRotation(aVar.f2562e.f2642b);
                        childAt.setRotationX(aVar.f2562e.f2643c);
                        childAt.setRotationY(aVar.f2562e.f2644d);
                        childAt.setScaleX(aVar.f2562e.f2645e);
                        childAt.setScaleY(aVar.f2562e.f2646f);
                        if (!Float.isNaN(aVar.f2562e.f2647g)) {
                            childAt.setPivotX(aVar.f2562e.f2647g);
                        }
                        if (!Float.isNaN(aVar.f2562e.f2648h)) {
                            childAt.setPivotY(aVar.f2562e.f2648h);
                        }
                        childAt.setTranslationX(aVar.f2562e.f2649i);
                        childAt.setTranslationY(aVar.f2562e.f2650j);
                        childAt.setTranslationZ(aVar.f2562e.f2651k);
                        e eVar = aVar.f2562e;
                        if (eVar.f2652l) {
                            childAt.setElevation(eVar.f2653m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            } else {
                Log.w("ConstraintSet", "id unknown " + C3591a.m15408a(childAt));
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f2557c.get(num);
            int i12 = aVar2.f2561d.f2598d0;
            if (i12 != -1 && i12 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar2.f2561d;
                int[] iArr2 = bVar2.f2600e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f2602f0;
                    if (str2 != null) {
                        bVar2.f2600e0 = m2576j(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f2561d.f2600e0);
                    }
                }
                barrier2.setType(aVar2.f2561d.f2594b0);
                barrier2.setMargin(aVar2.f2561d.f2596c0);
                ConstraintLayout.C0544b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m2569n();
                aVar2.m2596d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f2561d.f2591a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0544b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.m2596d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: e */
    public void m2583e(int i10, int i11) {
        if (this.f2557c.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f2557c.get(Integer.valueOf(i10));
            switch (i11) {
                case 1:
                    b bVar = aVar.f2561d;
                    bVar.f2607i = -1;
                    bVar.f2605h = -1;
                    bVar.f2568D = -1;
                    bVar.f2574J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f2561d;
                    bVar2.f2611k = -1;
                    bVar2.f2609j = -1;
                    bVar2.f2569E = -1;
                    bVar2.f2576L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f2561d;
                    bVar3.f2613m = -1;
                    bVar3.f2612l = -1;
                    bVar3.f2570F = -1;
                    bVar3.f2575K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f2561d;
                    bVar4.f2614n = -1;
                    bVar4.f2615o = -1;
                    bVar4.f2571G = -1;
                    bVar4.f2577M = -1;
                    return;
                case 5:
                    aVar.f2561d.f2616p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f2561d;
                    bVar5.f2617q = -1;
                    bVar5.f2618r = -1;
                    bVar5.f2573I = -1;
                    bVar5.f2579O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f2561d;
                    bVar6.f2619s = -1;
                    bVar6.f2620t = -1;
                    bVar6.f2572H = -1;
                    bVar6.f2578N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: f */
    public void m2584f(Context context, int i10) {
        m2585g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    /* renamed from: g */
    public void m2585g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2557c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.C0544b c0544b = (ConstraintLayout.C0544b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2556b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2557c.containsKey(Integer.valueOf(id))) {
                this.f2557c.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2557c.get(Integer.valueOf(id));
            aVar.f2563f = C0546a.m2554a(this.f2555a, childAt);
            aVar.m2593f(id, c0544b);
            aVar.f2559b.f2636b = childAt.getVisibility();
            aVar.f2559b.f2638d = childAt.getAlpha();
            aVar.f2562e.f2642b = childAt.getRotation();
            aVar.f2562e.f2643c = childAt.getRotationX();
            aVar.f2562e.f2644d = childAt.getRotationY();
            aVar.f2562e.f2645e = childAt.getScaleX();
            aVar.f2562e.f2646f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f2562e;
                eVar.f2647g = pivotX;
                eVar.f2648h = pivotY;
            }
            aVar.f2562e.f2649i = childAt.getTranslationX();
            aVar.f2562e.f2650j = childAt.getTranslationY();
            aVar.f2562e.f2651k = childAt.getTranslationZ();
            e eVar2 = aVar.f2562e;
            if (eVar2.f2652l) {
                eVar2.f2653m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f2561d.f2610j0 = barrier.m2529o();
                aVar.f2561d.f2600e0 = barrier.getReferencedIds();
                aVar.f2561d.f2594b0 = barrier.getType();
                aVar.f2561d.f2596c0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: h */
    public void m2586h(C0550e c0550e) {
        int childCount = c0550e.getChildCount();
        this.f2557c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = c0550e.getChildAt(i10);
            C0550e.a aVar = (C0550e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2556b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2557c.containsKey(Integer.valueOf(id))) {
                this.f2557c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f2557c.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC0547b) {
                aVar2.m2595h((AbstractC0547b) childAt, id, aVar);
            }
            aVar2.m2594g(id, aVar);
        }
    }

    /* renamed from: i */
    public void m2587i(int i10, int i11, int i12, float f10) {
        b bVar = m2578l(i10).f2561d;
        bVar.f2624x = i11;
        bVar.f2625y = i12;
        bVar.f2626z = f10;
    }

    /* renamed from: m */
    public void m2588m(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a m2577k = m2577k(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m2577k.f2561d.f2591a = true;
                    }
                    this.f2557c.put(Integer.valueOf(m2577k.f2558a), m2577k);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0093. Please report as an issue. */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2589n(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0549d.m2589n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
