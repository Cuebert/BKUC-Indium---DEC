.class public Lq5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/f;


# static fields
.field private static final d:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private a:Lt5/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt5/b<",
            "Lq5/g;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lq5/e;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lq5/b;->a:Lq5/b;

    sput-object v0, Lq5/d;->d:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Lq5/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lj5/w;

    new-instance v1, Lq5/c;

    invoke-direct {v1, p1}, Lq5/c;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lj5/w;-><init>(Lt5/b;)V

    new-instance p1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sget-object v9, Lq5/d;->d:Ljava/util/concurrent/ThreadFactory;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0x1e

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {p0, v0, p2, p1}, Lq5/d;-><init>(Lt5/b;Ljava/util/Set;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method constructor <init>(Lt5/b;Ljava/util/Set;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt5/b<",
            "Lq5/g;",
            ">;",
            "Ljava/util/Set<",
            "Lq5/e;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lq5/d;->a:Lt5/b;

    .line 4
    iput-object p2, p0, Lq5/d;->b:Ljava/util/Set;

    .line 5
    iput-object p3, p0, Lq5/d;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    invoke-static {p0}, Lq5/d;->h(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;)Lq5/g;
    .locals 0

    invoke-static {p0}, Lq5/d;->g(Landroid/content/Context;)Lq5/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lj5/e;)Lq5/f;
    .locals 0

    invoke-static {p0}, Lq5/d;->f(Lj5/e;)Lq5/f;

    move-result-object p0

    return-object p0
.end method

.method public static e()Lj5/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj5/d<",
            "Lq5/f;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lq5/f;

    invoke-static {v0}, Lj5/d;->c(Ljava/lang/Class;)Lj5/d$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    .line 2
    invoke-static {v1}, Lj5/q;->h(Ljava/lang/Class;)Lj5/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    const-class v1, Lq5/e;

    .line 3
    invoke-static {v1}, Lj5/q;->j(Ljava/lang/Class;)Lj5/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj5/d$b;->b(Lj5/q;)Lj5/d$b;

    move-result-object v0

    sget-object v1, Lq5/a;->a:Lq5/a;

    .line 4
    invoke-virtual {v0, v1}, Lj5/d$b;->f(Lj5/h;)Lj5/d$b;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lj5/d$b;->d()Lj5/d;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic f(Lj5/e;)Lq5/f;
    .locals 3

    new-instance v0, Lq5/d;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lq5/e;

    invoke-interface {p0, v2}, Lj5/e;->b(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lq5/d;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    return-object v0
.end method

.method private static synthetic g(Landroid/content/Context;)Lq5/g;
    .locals 0

    invoke-static {p0}, Lq5/g;->a(Landroid/content/Context;)Lq5/g;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic h(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    const-string v1, "heartbeat-information-executor"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lq5/f$a;
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lq5/d;->a:Lt5/b;

    .line 3
    invoke-interface {v2}, Lt5/b;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq5/g;

    invoke-virtual {v2, p1, v0, v1}, Lq5/g;->d(Ljava/lang/String;J)Z

    move-result p1

    .line 4
    iget-object v2, p0, Lq5/d;->a:Lt5/b;

    invoke-interface {v2}, Lt5/b;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq5/g;

    invoke-virtual {v2, v0, v1}, Lq5/g;->c(J)Z

    move-result v0

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    .line 5
    sget-object p1, Lq5/f$a;->r:Lq5/f$a;

    return-object p1

    :cond_0
    if-eqz v0, :cond_1

    .line 6
    sget-object p1, Lq5/f$a;->q:Lq5/f$a;

    return-object p1

    :cond_1
    if-eqz p1, :cond_2

    .line 7
    sget-object p1, Lq5/f$a;->p:Lq5/f$a;

    return-object p1

    .line 8
    :cond_2
    sget-object p1, Lq5/f$a;->o:Lq5/f$a;

    return-object p1
.end method
