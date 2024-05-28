.class public Ll3/a;
.super Lx2/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/e<",
        "Lx2/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final k:Lx2/a$g;

.field private static final l:Lx2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Ll3/a;->k:Lx2/a$g;

    .line 2
    new-instance v1, Lx2/a;

    new-instance v2, Lt3/y2;

    invoke-direct {v2}, Lt3/y2;-><init>()V

    const-string v3, "Fido.FIDO2_API"

    invoke-direct {v1, v3, v2, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v1, Ll3/a;->l:Lx2/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Ll3/a;->l:Lx2/a;

    sget-object v1, Lx2/a$d;->m:Lx2/a$d$c;

    new-instance v2, Ly2/a;

    invoke-direct {v2}, Ly2/a;-><init>()V

    invoke-direct {p0, p1, v0, v1, v2}, Lx2/e;-><init>(Landroid/app/Activity;Lx2/a;Lx2/a$d;Ly2/m;)V

    return-void
.end method


# virtual methods
.method public y(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;)Lg4/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;",
            ")",
            "Lg4/l<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    new-instance v1, Ll3/b;

    invoke-direct {v1, p0, p1}, Ll3/b;-><init>(Ll3/a;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;)V

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Ly2/k;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    const/16 v0, 0x151f

    .line 3
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/d$a;->e(I)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lx2/e;->n(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
