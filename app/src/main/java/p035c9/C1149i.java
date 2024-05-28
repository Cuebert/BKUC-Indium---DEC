package p035c9;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import qa.InterfaceC4342e0;

/* renamed from: c9.i */
/* loaded from: classes.dex */
public class C1149i {

    /* renamed from: c9.i$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC4342e0 {

        /* renamed from: a */
        private String f5494a;

        public a() {
            this("CircularBitmapImage:0");
        }

        @Override // qa.InterfaceC4342e0
        /* renamed from: a */
        public Bitmap mo6704a(Bitmap bitmap) {
            return C1149i.m6703a(bitmap, 0);
        }

        @Override // qa.InterfaceC4342e0
        /* renamed from: b */
        public String mo6705b() {
            return this.f5494a;
        }

        public a(String str) {
            this.f5494a = str;
        }
    }

    /* renamed from: a */
    public static Bitmap m6703a(Bitmap bitmap, int i10) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        Bitmap createBitmap2 = Bitmap.createBitmap((i10 == 1 || i10 == 2) ? min / 2 : min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        float f10 = min;
        float f11 = f10 / 2.0f;
        if (i10 == 0) {
            canvas.drawCircle(f11, f11, f11, paint);
        } else if (i10 == 1) {
            canvas.translate((-min) / 4, 0.0f);
            canvas.drawCircle((f11 / 2.0f) + f11, f11, f11, paint);
        } else if (i10 == 2) {
            canvas.translate((-min) / 4, 0.0f);
            canvas.drawCircle(f11 - (f11 / 2.0f), f11, f11, paint);
        } else if (i10 == 3) {
            canvas.drawCircle(f10, f10, f10, paint);
        } else if (i10 == 4) {
            canvas.drawCircle(f10, 0.0f, f10, paint);
        } else if (i10 == 5) {
            canvas.drawCircle(0.0f, f10, f10, paint);
        } else if (i10 == 6) {
            canvas.drawCircle(0.0f, 0.0f, f10, paint);
        }
        createBitmap.recycle();
        return createBitmap2;
    }
}
