.class public final Lu2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lc3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc3/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "GoogleSignInCommon"

    invoke-direct {v0, v2, v1}, Lc3/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lu2/m;->a:Lc3/a;

    return-void
.end method

.method public static a(Lx2/f;Landroid/content/Context;Z)Lx2/h;
    .locals 3

    .line 1
    sget-object v0, Lu2/m;->a:Lc3/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Revoking access"

    invoke-virtual {v0, v2, v1}, Lc3/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p1}, Lu2/b;->b(Landroid/content/Context;)Lu2/b;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lu2/b;->e()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {p1}, Lu2/m;->c(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    .line 5
    invoke-static {v0}, Lu2/d;->a(Ljava/lang/String;)Lx2/h;

    move-result-object p0

    return-object p0

    .line 6
    :cond_0
    new-instance p1, Lu2/k;

    invoke-direct {p1, p0}, Lu2/k;-><init>(Lx2/f;)V

    invoke-virtual {p0, p1}, Lx2/f;->b(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lx2/f;Landroid/content/Context;Z)Lx2/h;
    .locals 3

    .line 1
    sget-object v0, Lu2/m;->a:Lc3/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Signing out"

    invoke-virtual {v0, v2, v1}, Lc3/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {p1}, Lu2/m;->c(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/api/Status;

    invoke-static {p1, p0}, Lx2/i;->b(Lcom/google/android/gms/common/api/Status;Lx2/f;)Lx2/h;

    move-result-object p0

    return-object p0

    .line 4
    :cond_0
    new-instance p1, Lu2/i;

    invoke-direct {p1, p0}, Lu2/i;-><init>(Lx2/f;)V

    invoke-virtual {p0, p1}, Lx2/f;->b(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lu2/n;->a(Landroid/content/Context;)Lu2/n;

    move-result-object p0

    invoke-virtual {p0}, Lu2/n;->b()V

    .line 2
    invoke-static {}, Lx2/f;->c()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx2/f;

    .line 3
    invoke-virtual {v0}, Lx2/f;->f()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/api/internal/c;->a()V

    return-void
.end method
