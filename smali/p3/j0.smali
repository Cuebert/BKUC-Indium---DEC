.class final Lp3/j0;
.super Lp3/m0;
.source "SourceFile"


# instance fields
.field final synthetic s:Lcom/google/android/gms/auth/api/credentials/Credential;


# direct methods
.method constructor <init>(Lp3/l0;Lx2/f;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 0

    iput-object p3, p0, Lp3/j0;->s:Lcom/google/android/gms/auth/api/credentials/Credential;

    invoke-direct {p0, p2}, Lp3/m0;-><init>(Lx2/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic d(Lcom/google/android/gms/common/api/Status;)Lx2/m;
    .locals 0

    return-object p1
.end method

.method protected final r(Landroid/content/Context;Lp3/r0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance p1, Lp3/k0;

    invoke-direct {p1, p0}, Lp3/k0;-><init>(Ly2/c;)V

    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbp;

    iget-object v1, p0, Lp3/j0;->s:Lcom/google/android/gms/auth/api/credentials/Credential;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth-api/zbp;-><init>(Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {p2, p1, v0}, Lp3/r0;->n(Lp3/q0;Lcom/google/android/gms/internal/auth-api/zbp;)V

    return-void
.end method
