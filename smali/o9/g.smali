.class public Lo9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo9/g$c;
    }
.end annotation


# static fields
.field private static final e:Ljava/lang/Object;

.field private static f:Lo9/g;


# instance fields
.field private a:Ln9/c;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lo9/g$c;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo9/g;->e:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Ln9/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lo9/g;->c:Ljava/util/Set;

    .line 3
    new-instance v0, Lo9/g$a;

    invoke-direct {v0, p0}, Lo9/g$a;-><init>(Lo9/g;)V

    iput-object v0, p0, Lo9/g;->d:Ljava/lang/Runnable;

    .line 4
    iput-object p1, p0, Lo9/g;->a:Ln9/c;

    return-void
.end method

.method static synthetic a(Lo9/g;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lo9/g;->c:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic b(Lo9/g;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lo9/g;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lo9/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lo9/g;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lo9/g;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lo9/g;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lo9/g;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lo9/g;->d:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic f(Lo9/g;)Ln9/c;
    .locals 0

    iget-object p0, p0, Lo9/g;->a:Ln9/c;

    return-object p0
.end method

.method private g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, ".ROBLOSECURITY"

    .line 1
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    return-object v0

    .line 2
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x3b

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v0, v2, :cond_2

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    :cond_2
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static h()Lo9/g;
    .locals 6

    .line 1
    sget-object v0, Lo9/g;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lo9/g;->f:Lo9/g;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lo9/g;

    new-instance v2, Ln9/e;

    new-instance v3, Lo9/d;

    .line 4
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v4

    const/16 v5, 0xc8

    invoke-direct {v3, v4, v5}, Lo9/d;-><init>(Ljava/util/concurrent/Executor;I)V

    new-instance v4, Ln9/e$a;

    invoke-direct {v4}, Ln9/e$a;-><init>()V

    invoke-direct {v2, v3, v4}, Ln9/e;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    invoke-direct {v1, v2}, Lo9/g;-><init>(Ln9/c;)V

    sput-object v1, Lo9/g;->f:Lo9/g;

    .line 5
    :cond_0
    sget-object v1, Lo9/g;->f:Lo9/g;

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


# virtual methods
.method public i(Lo9/g$c;)V
    .locals 2

    const-string v0, "rbx.platform"

    const-string v1, "WebViewCookieHandler.registerCookieObserver()."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lo9/g;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j(Lo9/g$c;)V
    .locals 2

    const-string v0, "rbx.platform"

    const-string v1, "WebViewCookieHandler.unregisterCookieObserver()."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lo9/g;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo9/g;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lo9/g;->a:Ln9/c;

    invoke-interface {v0}, Ln9/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lo9/g$b;

    invoke-direct {v1, p0, p1}, Lo9/g$b;-><init>(Lo9/g;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
