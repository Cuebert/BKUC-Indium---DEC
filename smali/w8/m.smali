.class public Lw8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lw8/m;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private static a()Ln9/b;
    .locals 5

    .line 1
    new-instance v0, Lc9/e;

    invoke-direct {v0}, Lc9/e;-><init>()V

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->G()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {}, Lcom/roblox/client/p0;->E()Ljava/lang/String;

    move-result-object v2

    .line 4
    new-instance v3, Ln9/b;

    .line 5
    invoke-static {}, Lcom/roblox/client/p0;->K()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v0, v1}, Lc9/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {v0, v2}, Lc9/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "api"

    :goto_0
    invoke-direct {v3, v4, v1, v0}, Ln9/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object p0, Lw8/m;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->Z0()Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-static {p0}, Ln9/g;->j(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lw8/m;->a()Ln9/b;

    move-result-object p0

    invoke-static {p0}, Ln9/g;->g(Ln9/b;)V

    .line 5
    new-instance p0, Lh7/s;

    invoke-direct {p0}, Lh7/s;-><init>()V

    invoke-static {p0}, Ln9/g;->f(Lo9/a;)V

    .line 6
    new-instance p0, Lo9/c;

    invoke-direct {p0}, Lo9/c;-><init>()V

    invoke-static {p0}, Ln9/g;->h(Lo9/e;)V

    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lu6/d;

    invoke-direct {v0, p0}, Lu6/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p0}, Lu6/d;->a(Landroid/content/Context;)Lu6/c;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roblox/client/p0;->g0(Landroid/content/Context;Lu6/c;)V

    return-void
.end method
