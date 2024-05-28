.class public Lc9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/a$a;


# static fields
.field private static b:Lc9/c;

.field private static c:Ljava/lang/String;

.field public static d:Lcom/google/common/util/concurrent/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/common/util/concurrent/q;->E()Lcom/google/common/util/concurrent/q;

    move-result-object v0

    sput-object v0, Lc9/c;->d:Lcom/google/common/util/concurrent/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc9/c;->a:Z

    return-void
.end method

.method public static synthetic b(Lc9/c;Lc9/a$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc9/c;->h(Lc9/a$a;Ljava/lang/String;)V

    return-void
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->x0()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->m()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lc9/c;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 3
    sput-object v0, Lc9/c;->c:Ljava/lang/String;

    const-string v0, ""

    return-object v0

    .line 4
    :cond_1
    sget-object v0, Lc9/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static g()Lc9/c;
    .locals 2

    .line 1
    sget-object v0, Lc9/c;->b:Lc9/c;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lc9/c;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lc9/c;->b:Lc9/c;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lc9/c;

    invoke-direct {v1}, Lc9/c;-><init>()V

    sput-object v1, Lc9/c;->b:Lc9/c;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lc9/c;->b:Lc9/c;

    return-object v0
.end method

.method private synthetic h(Lc9/a$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lc9/c;->a(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1, p2}, Lc9/a$a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    sput-object p1, Lc9/c;->c:Ljava/lang/String;

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    sput-object v0, Lc9/c;->c:Ljava/lang/String;

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc9/c;->a:Z

    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc9/c;->f(Landroid/content/Context;Lc9/a$a;)V

    return-void
.end method

.method public f(Landroid/content/Context;Lc9/a$a;)V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->x0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-boolean v0, p0, Lc9/c;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lc9/c;->a:Z

    .line 5
    new-instance v0, Lc9/a;

    new-instance v1, Lc9/b;

    invoke-direct {v1, p0, p2}, Lc9/b;-><init>(Lc9/c;Lc9/a$a;)V

    invoke-direct {v0, p1, v1}, Lc9/a;-><init>(Landroid/content/Context;Lc9/a$a;)V

    .line 6
    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 7
    sget-object p1, Lc9/c;->c:Ljava/lang/String;

    invoke-interface {p2, p1}, Lc9/a$a;->a(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method
