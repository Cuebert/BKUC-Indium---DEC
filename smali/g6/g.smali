.class public Lg6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/Object;

.field private static c:Lg6/g;


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg6/g;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/os/Looper;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv3/a;

    invoke-direct {v0, p1}, Lv3/a;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lg6/g;->a:Landroid/os/Handler;

    return-void
.end method

.method public static a()Lg6/g;
    .locals 4
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    sget-object v0, Lg6/g;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg6/g;->c:Lg6/g;

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "MLHandler"

    const/16 v3, 0x9

    .line 1
    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 2
    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 3
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lg6/g;

    .line 4
    invoke-direct {v2, v1}, Lg6/g;-><init>(Landroid/os/Looper;)V

    sput-object v2, Lg6/g;->c:Lg6/g;

    :cond_0
    sget-object v1, Lg6/g;->c:Lg6/g;

    .line 5
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static d()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    sget-object v0, Lg6/u;->n:Lg6/u;

    return-object v0
.end method

.method static synthetic e(Lg6/g;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lg6/g;->a:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/util/concurrent/Callable;)Lg4/l;
    .locals 2
    .param p1    # Ljava/util/concurrent/Callable;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TResultT;>;)",
            "Lg4/l<",
            "TResultT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lg4/m;

    invoke-direct {v0}, Lg4/m;-><init>()V

    new-instance v1, Lg6/t;

    .line 2
    invoke-direct {v1, p1, v0}, Lg6/t;-><init>(Ljava/util/concurrent/Callable;Lg4/m;)V

    invoke-virtual {p0, v1}, Lg6/g;->c(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Lg4/m;->a()Lg4/l;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    invoke-static {}, Lg6/g;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
