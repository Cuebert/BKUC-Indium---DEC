.class public Lo8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo8/a$b;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/Object;

.field private static e:Lo8/a;


# instance fields
.field private a:Lbc/c;

.field private b:Lo8/b;

.field private c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo8/a;->d:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Lbc/c;Lo8/b;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lo8/a;->a:Lbc/c;

    .line 3
    iput-object p2, p0, Lo8/a;->b:Lo8/b;

    .line 4
    iput-object p3, p0, Lo8/a;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static a()Lo8/a;
    .locals 5

    .line 1
    sget-object v0, Lo8/a;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lo8/a;->e:Lo8/a;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lo8/a;

    .line 4
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v2

    new-instance v3, Lo8/b;

    invoke-direct {v3}, Lo8/b;-><init>()V

    sget-object v4, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-direct {v1, v2, v3, v4}, Lo8/a;-><init>(Lbc/c;Lo8/b;Ljava/util/concurrent/Executor;)V

    sput-object v1, Lo8/a;->e:Lo8/a;

    .line 5
    :cond_0
    sget-object v1, Lo8/a;->e:Lo8/a;

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
.method public b(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Lo8/a$b;

    iget-object v1, p0, Lo8/a;->a:Lbc/c;

    iget-object v2, p0, Lo8/a;->b:Lo8/b;

    iget-object v3, p0, Lo8/a;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Lo8/a$b;-><init>(Lbc/c;Lo8/b;Ljava/util/concurrent/Executor;)V

    iget-object v1, p0, Lo8/a;->c:Ljava/util/concurrent/Executor;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
