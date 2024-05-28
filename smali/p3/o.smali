.class public final Lp3/o;
.super Lx2/e;
.source "SourceFile"

# interfaces
.implements Lq2/a;


# static fields
.field private static final l:Lx2/a$g;

.field private static final m:Lx2/a$a;

.field private static final n:Lx2/a;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Lp3/o;->l:Lx2/a$g;

    .line 2
    new-instance v1, Lp3/m;

    invoke-direct {v1}, Lp3/m;-><init>()V

    sput-object v1, Lp3/o;->m:Lx2/a$a;

    .line 3
    new-instance v2, Lx2/a;

    const-string v3, "Auth.Api.Identity.CredentialSaving.API"

    invoke-direct {v2, v3, v1, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v2, Lp3/o;->n:Lx2/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lq2/e;)V
    .locals 2

    .line 1
    sget-object v0, Lp3/o;->n:Lx2/a;

    sget-object v1, Lx2/e$a;->c:Lx2/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lx2/e;-><init>(Landroid/app/Activity;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    .line 2
    invoke-static {}, Lp3/c0;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lp3/o;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final g(Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;",
            ")",
            "Lg4/l<",
            "Lcom/google/android/gms/auth/api/identity/SavePasswordResult;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;->z(Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest$a;

    move-result-object p1

    iget-object v0, p0, Lp3/o;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest$a;->c(Ljava/lang/String;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest$a;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest$a;->a()Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/Feature;

    sget-object v2, Lp3/b0;->e:Lcom/google/android/gms/common/Feature;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    new-instance v1, Lp3/l;

    invoke-direct {v1, p0, p1}, Lp3/l;-><init>(Lp3/o;Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Ly2/k;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1, v3}, Lcom/google/android/gms/common/api/internal/d$a;->c(Z)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    const/16 v0, 0x600

    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/d$a;->e(I)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lx2/e;->n(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
