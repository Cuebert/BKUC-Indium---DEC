.class Ln7/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ln7/b;


# direct methods
.method private constructor <init>(Ln7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln7/b$b;->a:Ln7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ln7/b;Ln7/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ln7/b$b;-><init>(Ln7/b;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Lw6/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln7/b$b;->a:Ln7/b;

    invoke-static {v0}, Ln7/b;->e(Ln7/b;)Ln7/b$d;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "InfluxV2Queue"

    const-string v1, "fireAction: Close the existing socket..."

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Ln7/b$b$a;

    invoke-direct {v0, p0, p1}, Ln7/b$b$a;-><init>(Ln7/b$b;Lw6/a;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 4
    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
