package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzak;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zze;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzs;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.BarhopperV2;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p110i3.BinderC3517b;
import p110i3.InterfaceC3516a;
import p153l6.C3884d;
import p296x3.AbstractBinderC5525b;
import p321z2.C5984j;

/* renamed from: com.google.mlkit.vision.barcode.bundled.internal.a */
/* loaded from: classes.dex */
final class BinderC2706a extends AbstractBinderC5525b {

    /* renamed from: c */
    private final RecognitionOptions f10299c;

    /* renamed from: d */
    private BarhopperV2 f10300d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2706a(Context context, zzs zzsVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f10299c = recognitionOptions;
        recognitionOptions.m10422a(zzsVar.m9198x());
    }

    /* renamed from: l */
    private static zzf m12078l(Barcode.CalendarDateTime calendarDateTime) {
        if (calendarDateTime == null) {
            return null;
        }
        return new zzf(calendarDateTime.year, calendarDateTime.month, calendarDateTime.day, calendarDateTime.hours, calendarDateTime.minutes, calendarDateTime.seconds, calendarDateTime.isUtc, calendarDateTime.rawValue);
    }

    /* renamed from: n */
    private final Barcode[] m12079n(ByteBuffer byteBuffer, zzak zzakVar) {
        BarhopperV2 barhopperV2 = (BarhopperV2) C5984j.m21286j(this.f10300d);
        if (((ByteBuffer) C5984j.m21286j(byteBuffer)).isDirect()) {
            return barhopperV2.m10419c(zzakVar.m9194A(), zzakVar.m9195x(), byteBuffer, this.f10299c);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV2.m10420e(zzakVar.m9194A(), zzakVar.m9195x(), byteBuffer.array(), this.f10299c);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV2.m10420e(zzakVar.m9194A(), zzakVar.m9195x(), bArr, this.f10299c);
    }

    @Override // p296x3.InterfaceC5526c
    /* renamed from: a */
    public final void mo12080a() {
        if (this.f10300d != null) {
            return;
        }
        BarhopperV2 barhopperV2 = new BarhopperV2();
        this.f10300d = barhopperV2;
        barhopperV2.m10418b();
    }

    @Override // p296x3.InterfaceC5526c
    /* renamed from: c */
    public final void mo12081c() {
        BarhopperV2 barhopperV2 = this.f10300d;
        if (barhopperV2 != null) {
            barhopperV2.close();
            this.f10300d = null;
        }
    }

    @Override // p296x3.InterfaceC5526c
    /* renamed from: w */
    public final List<zzq> mo12082w(InterfaceC3516a interfaceC3516a, zzak zzakVar) {
        Barcode[] m10421i;
        Barcode[] barcodeArr;
        Matrix matrix;
        int i10;
        zzh zzhVar;
        ArrayList arrayList;
        int i11;
        zzi zziVar;
        zzm[] zzmVarArr;
        zzj[] zzjVarArr;
        zze[] zzeVarArr;
        int m9196y = zzakVar.m9196y();
        if (m9196y != -1) {
            if (m9196y != 17) {
                if (m9196y == 35) {
                    m10421i = m12079n(((Image) C5984j.m21286j((Image) BinderC3517b.m15329n(interfaceC3516a))).getPlanes()[0].getBuffer(), zzakVar);
                } else if (m9196y != 842094169) {
                    int m9196y2 = zzakVar.m9196y();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unsupported image format: ");
                    sb2.append(m9196y2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            m10421i = m12079n((ByteBuffer) BinderC3517b.m15329n(interfaceC3516a), zzakVar);
        } else {
            m10421i = ((BarhopperV2) C5984j.m21286j(this.f10300d)).m10421i((Bitmap) BinderC3517b.m15329n(interfaceC3516a), this.f10299c);
        }
        ArrayList arrayList2 = new ArrayList();
        Matrix m16501d = C3884d.m16498b().m16501d(zzakVar.m9194A(), zzakVar.m9195x(), zzakVar.m9197z());
        int length = m10421i.length;
        int i12 = 0;
        while (i12 < length) {
            Barcode barcode = m10421i[i12];
            if (barcode.cornerPoints != null && m16501d != null) {
                float[] fArr = new float[8];
                int i13 = 0;
                while (true) {
                    if (i13 >= barcode.cornerPoints.length) {
                        break;
                    }
                    int i14 = i13 + i13;
                    fArr[i14] = r11[i13].x;
                    fArr[i14 + 1] = r11[i13].y;
                    i13++;
                }
                m16501d.mapPoints(fArr);
                int m9197z = zzakVar.m9197z();
                int i15 = 0;
                while (true) {
                    Point[] pointArr = barcode.cornerPoints;
                    int length2 = pointArr.length;
                    if (i15 >= length2) {
                        break;
                    }
                    Point point = pointArr[(i15 + m9197z) % length2];
                    int i16 = i15 + i15;
                    point.x = (int) fArr[i16];
                    point.y = (int) fArr[i16 + 1];
                    i15++;
                }
            }
            Barcode.Email email = barcode.email;
            zzj zzjVar = email != null ? new zzj(email.type, email.address, email.subject, email.body) : null;
            Barcode.Phone phone = barcode.phone;
            zzm zzmVar = phone != null ? new zzm(phone.type, phone.number) : null;
            Barcode.Sms sms = barcode.sms;
            zzn zznVar = sms != null ? new zzn(sms.message, sms.phoneNumber) : null;
            Barcode.WiFi wiFi = barcode.wifi;
            zzp zzpVar = wiFi != null ? new zzp(wiFi.ssid, wiFi.password, wiFi.encryptionType) : null;
            Barcode.UrlBookmark urlBookmark = barcode.url;
            zzo zzoVar = urlBookmark != null ? new zzo(urlBookmark.title, urlBookmark.url) : null;
            Barcode.GeoPoint geoPoint = barcode.geoPoint;
            zzk zzkVar = geoPoint != null ? new zzk(geoPoint.lat, geoPoint.lng) : null;
            Barcode.CalendarEvent calendarEvent = barcode.calendarEvent;
            zzg zzgVar = calendarEvent != null ? new zzg(calendarEvent.summary, calendarEvent.description, calendarEvent.location, calendarEvent.organizer, calendarEvent.status, m12078l(calendarEvent.start), m12078l(calendarEvent.end)) : null;
            Barcode.ContactInfo contactInfo = barcode.contactInfo;
            if (contactInfo != null) {
                Barcode.PersonName personName = contactInfo.name;
                zzl zzlVar = personName != null ? new zzl(personName.formattedName, personName.pronunciation, personName.prefix, personName.first, personName.middle, personName.last, personName.suffix) : null;
                String str = contactInfo.organization;
                String str2 = contactInfo.title;
                Barcode.Phone[] phoneArr = contactInfo.phones;
                if (phoneArr == null) {
                    zzmVarArr = null;
                } else {
                    zzm[] zzmVarArr2 = new zzm[phoneArr.length];
                    int i17 = 0;
                    while (i17 < phoneArr.length) {
                        Barcode.Phone phone2 = phoneArr[i17];
                        zzmVarArr2[i17] = new zzm(phone2.type, phone2.number);
                        i17++;
                        phoneArr = phoneArr;
                    }
                    zzmVarArr = zzmVarArr2;
                }
                Barcode.Email[] emailArr = contactInfo.emails;
                if (emailArr == null) {
                    barcodeArr = m10421i;
                    matrix = m16501d;
                    i10 = length;
                    zzjVarArr = null;
                } else {
                    zzj[] zzjVarArr2 = new zzj[emailArr.length];
                    int i18 = 0;
                    while (i18 < emailArr.length) {
                        Barcode[] barcodeArr2 = m10421i;
                        Barcode.Email email2 = emailArr[i18];
                        zzjVarArr2[i18] = new zzj(email2.type, email2.address, email2.subject, email2.body);
                        i18++;
                        emailArr = emailArr;
                        m10421i = barcodeArr2;
                        m16501d = m16501d;
                        length = length;
                    }
                    barcodeArr = m10421i;
                    matrix = m16501d;
                    i10 = length;
                    zzjVarArr = zzjVarArr2;
                }
                String[] strArr = contactInfo.urls;
                Barcode.Address[] addressArr = contactInfo.addresses;
                if (addressArr == null) {
                    zzeVarArr = null;
                } else {
                    zze[] zzeVarArr2 = new zze[addressArr.length];
                    for (int i19 = 0; i19 < addressArr.length; i19++) {
                        Barcode.Address address = addressArr[i19];
                        zzeVarArr2[i19] = new zze(address.type, address.addressLines);
                    }
                    zzeVarArr = zzeVarArr2;
                }
                zzhVar = new zzh(zzlVar, str, str2, zzmVarArr, zzjVarArr, strArr, zzeVarArr);
            } else {
                barcodeArr = m10421i;
                matrix = m16501d;
                i10 = length;
                zzhVar = null;
            }
            Barcode.DriverLicense driverLicense = barcode.driverLicense;
            if (driverLicense != null) {
                i11 = i12;
                arrayList = arrayList2;
                zziVar = new zzi(driverLicense.documentType, driverLicense.firstName, driverLicense.middleName, driverLicense.lastName, driverLicense.gender, driverLicense.addressStreet, driverLicense.addressCity, driverLicense.addressState, driverLicense.addressZip, driverLicense.licenseNumber, driverLicense.issueDate, driverLicense.expiryDate, driverLicense.birthDate, driverLicense.issuingCountry);
            } else {
                arrayList = arrayList2;
                i11 = i12;
                zziVar = null;
            }
            ArrayList arrayList3 = arrayList;
            arrayList3.add(new zzq(barcode.format, barcode.displayValue, barcode.rawValue, barcode.rawBytes, barcode.cornerPoints, barcode.valueFormat, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar));
            i12 = i11 + 1;
            arrayList2 = arrayList3;
            m10421i = barcodeArr;
            m16501d = matrix;
            length = i10;
        }
        return arrayList2;
    }
}
