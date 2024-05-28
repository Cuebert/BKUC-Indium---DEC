.class public abstract Ld5/t;
.super Ld5/n;
.source "SourceFile"

# interfaces
.implements Ld5/u;


# direct methods
.method public static l(Landroid/os/IBinder;)Ld5/u;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    .line 1
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Ld5/u;

    if-eqz v1, :cond_1

    .line 2
    check-cast v0, Ld5/u;

    return-object v0

    :cond_1
    new-instance v0, Ld5/s;

    invoke-direct {v0, p0}, Ld5/s;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
