.class abstract Lp3/m0;
.super Lcom/google/android/gms/common/api/internal/b;
.source "SourceFile"


# direct methods
.method constructor <init>(Lx2/f;)V
    .locals 1

    sget-object v0, Lo2/a;->b:Lx2/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/b;-><init>(Lx2/a;Lx2/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lx2/m;

    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->g(Lx2/m;)V

    return-void
.end method

.method protected final bridge synthetic m(Lx2/a$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lp3/n0;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->y()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lp3/r0;

    invoke-virtual {p0, v0, p1}, Lp3/m0;->r(Landroid/content/Context;Lp3/r0;)V

    return-void
.end method

.method protected abstract r(Landroid/content/Context;Lp3/r0;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;,
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
