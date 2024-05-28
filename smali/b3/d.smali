.class public final Lb3/d;
.super Lx2/e;
.source "SourceFile"

# interfaces
.implements Lz2/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/e<",
        "Lz2/o;",
        ">;",
        "Lz2/n;"
    }
.end annotation


# static fields
.field private static final k:Lx2/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$g<",
            "Lb3/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lx2/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a$a<",
            "Lb3/e;",
            "Lz2/o;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Lz2/o;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic n:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Lb3/d;->k:Lx2/a$g;

    new-instance v1, Lb3/c;

    invoke-direct {v1}, Lb3/c;-><init>()V

    sput-object v1, Lb3/d;->l:Lx2/a$a;

    new-instance v2, Lx2/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v2, Lb3/d;->m:Lx2/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lz2/o;)V
    .locals 2

    sget-object v0, Lb3/d;->m:Lx2/a;

    sget-object v1, Lx2/e$a;->c:Lx2/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lx2/e;-><init>(Landroid/content/Context;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/common/internal/TelemetryData;)Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/internal/TelemetryData;",
            ")",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/Feature;

    sget-object v2, Lr3/d;->a:Lcom/google/android/gms/common/Feature;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/api/internal/d$a;

    .line 3
    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/internal/d$a;->c(Z)Lcom/google/android/gms/common/api/internal/d$a;

    new-instance v1, Lb3/b;

    invoke-direct {v1, p1}, Lb3/b;-><init>(Lcom/google/android/gms/common/internal/TelemetryData;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Ly2/k;)Lcom/google/android/gms/common/api/internal/d$a;

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Lx2/e;->l(Lcom/google/android/gms/common/api/internal/d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
