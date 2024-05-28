.class Lw/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Lw/d0$a;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lw/g0$b;


# direct methods
.method constructor <init>(Lw/d0$a;Ljava/util/concurrent/Executor;Lw/g0$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/g0$a;->a:Lw/d0$a;

    .line 3
    iput-object p2, p0, Lw/g0$a;->b:Ljava/util/concurrent/Executor;

    .line 4
    iput-object p3, p0, Lw/g0$a;->c:Lw/g0$b;

    return-void
.end method


# virtual methods
.method a()Lw/d0$a;
    .locals 1

    iget-object v0, p0, Lw/g0$a;->a:Lw/d0$a;

    return-object v0
.end method

.method b()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lw/g0$a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lw/g0$a;->c:Lw/g0$b;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lw/f0;

    invoke-direct {v2, v1}, Lw/f0;-><init>(Lw/g0$b;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "CameraStateRegistry"

    const-string v2, "Unable to notify camera."

    .line 2
    invoke-static {v1, v2, v0}, Landroidx/camera/core/q1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method c(Lw/d0$a;)Lw/d0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g0$a;->a:Lw/d0$a;

    .line 2
    iput-object p1, p0, Lw/g0$a;->a:Lw/d0$a;

    return-object v0
.end method
