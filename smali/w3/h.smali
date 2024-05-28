.class public abstract Lw3/h;
.super Lw3/z;
.source "SourceFile"

# interfaces
.implements Lw3/i;


# direct methods
.method public static i(Landroid/os/IBinder;)Lw3/i;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator"

    .line 1
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lw3/i;

    if-eqz v1, :cond_1

    .line 3
    check-cast v0, Lw3/i;

    return-object v0

    :cond_1
    new-instance v0, Lw3/g;

    .line 4
    invoke-direct {v0, p0}, Lw3/g;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
