.class final Lu2/i;
.super Lu2/l;
.source "SourceFile"


# direct methods
.method constructor <init>(Lx2/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lu2/l;-><init>(Lx2/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic d(Lcom/google/android/gms/common/api/Status;)Lx2/m;
    .locals 0

    return-object p1
.end method

.method protected final bridge synthetic m(Lx2/a$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lu2/g;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/b;->D()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lu2/s;

    new-instance v1, Lu2/h;

    invoke-direct {v1, p0}, Lu2/h;-><init>(Lu2/i;)V

    .line 3
    invoke-virtual {p1}, Lu2/g;->m0()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1

    .line 4
    invoke-virtual {v0, v1, p1}, Lu2/s;->J0(Lu2/r;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
