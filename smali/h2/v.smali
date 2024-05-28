.class public Lh2/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Li2/d;

.field private final c:Lh2/x;

.field private final d:Lj2/b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Li2/d;Lh2/x;Lj2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh2/v;->a:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Lh2/v;->b:Li2/d;

    .line 4
    iput-object p3, p0, Lh2/v;->c:Lh2/x;

    .line 5
    iput-object p4, p0, Lh2/v;->d:Lj2/b;

    return-void
.end method

.method public static synthetic a(Lh2/v;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lh2/v;->d()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh2/v;)V
    .locals 0

    invoke-direct {p0}, Lh2/v;->e()V

    return-void
.end method

.method private synthetic d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lh2/v;->b:Li2/d;

    invoke-interface {v0}, Li2/d;->L()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La2/o;

    .line 2
    iget-object v2, p0, Lh2/v;->c:Lh2/x;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, Lh2/x;->a(La2/o;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic e()V
    .locals 2

    iget-object v0, p0, Lh2/v;->d:Lj2/b;

    new-instance v1, Lh2/t;

    invoke-direct {v1, p0}, Lh2/t;-><init>(Lh2/v;)V

    invoke-interface {v0, v1}, Lj2/b;->e(Lj2/b$a;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lh2/v;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lh2/u;

    invoke-direct {v1, p0}, Lh2/u;-><init>(Lh2/v;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
