.class public Lx7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/d$e;,
        Lx7/d$d;
    }
.end annotation


# instance fields
.field private a:Z

.field private final b:Landroid/os/Handler;

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx7/d$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lx7/d;->b:Landroid/os/Handler;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx7/d;->c:Ljava/util/ArrayList;

    return-void
.end method

.method synthetic constructor <init>(Lx7/d$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx7/d;-><init>()V

    return-void
.end method

.method static synthetic a(Lx7/d;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lx7/d;->c:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static c()Lx7/d;
    .locals 1

    sget-object v0, Lx7/d$d;->a:Lx7/d;

    return-object v0
.end method

.method private e(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lx7/d;->b:Landroid/os/Handler;

    new-instance v1, Lx7/d$c;

    invoke-direct {v1, p0, p1, p2}, Lx7/d$c;-><init>(Lx7/d;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public b(Lx7/d$e;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx7/d;->a:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lx7/d;->b:Landroid/os/Handler;

    new-instance v1, Lx7/d$a;

    invoke-direct {v1, p0, p1}, Lx7/d$a;-><init>(Lx7/d;Lx7/d$e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "NotificationManager was not initialized"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    const-string p1, "NotificationManager"

    const-string v0, "init:"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lx7/d;->a:Z

    return-void
.end method

.method public f(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx7/d;->a:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1, p2}, Lx7/d;->e(ILandroid/os/Bundle;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "NotificationManager was not initialized"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lx7/d$e;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx7/d;->a:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lx7/d;->b:Landroid/os/Handler;

    new-instance v1, Lx7/d$b;

    invoke-direct {v1, p0, p1}, Lx7/d$b;-><init>(Lx7/d;Lx7/d$e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "NotificationManager was not initialized"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
