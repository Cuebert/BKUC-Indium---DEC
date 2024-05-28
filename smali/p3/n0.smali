.class public final Lp3/n0;
.super Lcom/google/android/gms/common/internal/c;
.source "SourceFile"


# instance fields
.field private final I:Lo2/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Lo2/a$a;Lx2/f$a;Lx2/f$b;)V
    .locals 7

    const/16 v3, 0x44

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/c;-><init>(Landroid/content/Context;Landroid/os/Looper;ILz2/b;Lx2/f$a;Lx2/f$b;)V

    new-instance p1, Lo2/a$a$a;

    if-nez p4, :cond_0

    .line 2
    sget-object p4, Lo2/a$a;->q:Lo2/a$a;

    :cond_0
    invoke-direct {p1, p4}, Lo2/a$a$a;-><init>(Lo2/a$a;)V

    .line 3
    invoke-static {}, Lp3/c0;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo2/a$a$a;->a(Ljava/lang/String;)Lo2/a$a$a;

    new-instance p2, Lo2/a$a;

    .line 4
    invoke-direct {p2, p1}, Lo2/a$a;-><init>(Lo2/a$a$a;)V

    iput-object p2, p0, Lp3/n0;->I:Lo2/a$a;

    return-void
.end method


# virtual methods
.method protected final A()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lp3/n0;->I:Lo2/a$a;

    invoke-virtual {v0}, Lo2/a$a;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method protected final E()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method protected final F()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method

.method public final h()I
    .locals 1

    const v0, 0xc35000

    return v0
.end method

.method protected final synthetic s(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    .line 1
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lp3/r0;

    if-eqz v1, :cond_1

    .line 2
    move-object p1, v0

    check-cast p1, Lp3/r0;

    goto :goto_0

    :cond_1
    new-instance v0, Lp3/r0;

    invoke-direct {v0, p1}, Lp3/r0;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
