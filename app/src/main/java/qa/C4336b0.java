package qa;

import java.io.PrintWriter;

/* renamed from: qa.b0 */
/* loaded from: classes.dex */
public class C4336b0 {

    /* renamed from: a */
    public final int f17623a;

    /* renamed from: b */
    public final int f17624b;

    /* renamed from: c */
    public final long f17625c;

    /* renamed from: d */
    public final long f17626d;

    /* renamed from: e */
    public final long f17627e;

    /* renamed from: f */
    public final long f17628f;

    /* renamed from: g */
    public final long f17629g;

    /* renamed from: h */
    public final long f17630h;

    /* renamed from: i */
    public final long f17631i;

    /* renamed from: j */
    public final long f17632j;

    /* renamed from: k */
    public final int f17633k;

    /* renamed from: l */
    public final int f17634l;

    /* renamed from: m */
    public final int f17635m;

    /* renamed from: n */
    public final long f17636n;

    public C4336b0(int i10, int i11, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12, int i13, int i14, long j18) {
        this.f17623a = i10;
        this.f17624b = i11;
        this.f17625c = j10;
        this.f17626d = j11;
        this.f17627e = j12;
        this.f17628f = j13;
        this.f17629g = j14;
        this.f17630h = j15;
        this.f17631i = j16;
        this.f17632j = j17;
        this.f17633k = i12;
        this.f17634l = i13;
        this.f17635m = i14;
        this.f17636n = j18;
    }

    /* renamed from: a */
    public void m17893a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f17623a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f17624b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f17624b / this.f17623a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f17625c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f17626d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f17633k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f17627e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f17630h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f17634l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f17628f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f17635m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f17629g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f17631i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f17632j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f17623a + ", size=" + this.f17624b + ", cacheHits=" + this.f17625c + ", cacheMisses=" + this.f17626d + ", downloadCount=" + this.f17633k + ", totalDownloadSize=" + this.f17627e + ", averageDownloadSize=" + this.f17630h + ", totalOriginalBitmapSize=" + this.f17628f + ", totalTransformedBitmapSize=" + this.f17629g + ", averageOriginalBitmapSize=" + this.f17631i + ", averageTransformedBitmapSize=" + this.f17632j + ", originalBitmapCount=" + this.f17634l + ", transformedBitmapCount=" + this.f17635m + ", timeStamp=" + this.f17636n + '}';
    }
}
