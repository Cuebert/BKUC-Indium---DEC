.class public Lp2/e;
.super Lx2/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/e<",
        "Lo2/a$a;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method constructor <init>(Landroid/app/Activity;Lo2/a$a;)V
    .locals 2

    sget-object v0, Lo2/a;->b:Lx2/a;

    new-instance v1, Ly2/a;

    invoke-direct {v1}, Ly2/a;-><init>()V

    invoke-direct {p0, p1, v0, p2, v1}, Lx2/e;-><init>(Landroid/app/Activity;Lx2/a;Lx2/a$d;Ly2/m;)V

    return-void
.end method


# virtual methods
.method public A(Lcom/google/android/gms/auth/api/credentials/Credential;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/credentials/Credential;",
            ")",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lo2/a;->e:Lp2/d;

    invoke-virtual {p0}, Lx2/e;->j()Lx2/f;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lp2/d;->a(Lx2/f;Lcom/google/android/gms/auth/api/credentials/Credential;)Lx2/h;

    move-result-object p1

    invoke-static {p1}, Lz2/i;->c(Lx2/h;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public y(Lcom/google/android/gms/auth/api/credentials/Credential;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/credentials/Credential;",
            ")",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Lo2/a;->e:Lp2/d;

    .line 2
    invoke-virtual {p0}, Lx2/e;->j()Lx2/f;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lp2/d;->b(Lx2/f;Lcom/google/android/gms/auth/api/credentials/Credential;)Lx2/h;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lz2/i;->c(Lx2/h;)Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public z(Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/credentials/CredentialRequest;",
            ")",
            "Lg4/l<",
            "Lp2/a;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Lo2/a;->e:Lp2/d;

    .line 2
    invoke-virtual {p0}, Lx2/e;->j()Lx2/f;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lp2/d;->c(Lx2/f;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)Lx2/h;

    move-result-object p1

    new-instance v0, Lp2/a;

    invoke-direct {v0}, Lp2/a;-><init>()V

    .line 3
    invoke-static {p1, v0}, Lz2/i;->a(Lx2/h;Lx2/l;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
