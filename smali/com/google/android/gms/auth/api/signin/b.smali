.class public Lcom/google/android/gms/auth/api/signin/b;
.super Lx2/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/e<",
        "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
        ">;"
    }
.end annotation


# static fields
.field private static final k:Lcom/google/android/gms/auth/api/signin/f;

.field static l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/auth/api/signin/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/signin/f;-><init>(Lt2/e;)V

    sput-object v0, Lcom/google/android/gms/auth/api/signin/b;->k:Lcom/google/android/gms/auth/api/signin/f;

    const/4 v0, 0x1

    sput v0, Lcom/google/android/gms/auth/api/signin/b;->l:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 3

    .line 1
    sget-object v0, Lo2/a;->c:Lx2/a;

    new-instance v1, Lx2/e$a$a;

    invoke-direct {v1}, Lx2/e$a$a;-><init>()V

    new-instance v2, Ly2/a;

    invoke-direct {v2}, Ly2/a;-><init>()V

    .line 2
    invoke-virtual {v1, v2}, Lx2/e$a$a;->c(Ly2/m;)Lx2/e$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lx2/e$a$a;->a()Lx2/e$a;

    move-result-object v1

    .line 3
    invoke-direct {p0, p1, v0, p2, v1}, Lx2/e;-><init>(Landroid/content/Context;Lx2/a;Lx2/a$d;Lx2/e$a;)V

    return-void
.end method

.method private final declared-synchronized z()I
    .locals 6

    monitor-enter p0

    .line 1
    :try_start_0
    sget v0, Lcom/google/android/gms/auth/api/signin/b;->l:I

    const/4 v1, 0x1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lx2/e;->q()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/google/android/gms/common/a;->o()Lcom/google/android/gms/common/a;

    move-result-object v1

    const v5, 0xbdfcb8

    .line 3
    invoke-virtual {v1, v0, v5}, Lcom/google/android/gms/common/a;->h(Landroid/content/Context;I)I

    move-result v5

    if-nez v5, :cond_0

    sput v4, Lcom/google/android/gms/auth/api/signin/b;->l:I

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 4
    invoke-virtual {v1, v0, v5, v4}, Lcom/google/android/gms/common/a;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "com.google.android.gms.auth.api.fallback"

    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    sput v2, Lcom/google/android/gms/auth/api/signin/b;->l:I

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    sput v3, Lcom/google/android/gms/auth/api/signin/b;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x2

    .line 6
    :cond_2
    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public d()Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lx2/e;->j()Lx2/f;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lx2/e;->q()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/b;->z()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-static {v0, v1, v2}, Lu2/m;->b(Lx2/f;Landroid/content/Context;Z)Lx2/h;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lz2/i;->c(Lx2/h;)Lg4/l;

    move-result-object v0

    return-object v0
.end method

.method public y()Lg4/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lx2/e;->j()Lx2/f;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lx2/e;->q()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/auth/api/signin/b;->z()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 4
    :goto_0
    invoke-static {v0, v1, v2}, Lu2/m;->a(Lx2/f;Landroid/content/Context;Z)Lx2/h;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lz2/i;->c(Lx2/h;)Lg4/l;

    move-result-object v0

    return-object v0
.end method
