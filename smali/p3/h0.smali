.class final Lp3/h0;
.super Lp3/m0;
.source "SourceFile"


# instance fields
.field final synthetic s:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;


# direct methods
.method constructor <init>(Lp3/l0;Lx2/f;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V
    .locals 0

    iput-object p3, p0, Lp3/h0;->s:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    invoke-direct {p0, p2}, Lp3/m0;-><init>(Lx2/f;)V

    return-void
.end method


# virtual methods
.method protected final synthetic d(Lcom/google/android/gms/common/api/Status;)Lx2/m;
    .locals 2

    new-instance v0, Lp3/f0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lp3/f0;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    return-object v0
.end method

.method protected final r(Landroid/content/Context;Lp3/r0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    new-instance p1, Lp3/g0;

    invoke-direct {p1, p0}, Lp3/g0;-><init>(Lp3/h0;)V

    iget-object v0, p0, Lp3/h0;->s:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    .line 2
    invoke-virtual {p2, p1, v0}, Lp3/r0;->J0(Lp3/q0;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V

    return-void
.end method
