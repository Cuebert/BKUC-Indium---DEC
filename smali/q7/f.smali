.class public abstract Lq7/f;
.super Lcom/birbit/android/jobqueue/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq7/f$a;
    }
.end annotation


# static fields
.field private static E:Landroid/os/Handler;


# instance fields
.field private final C:Ljava/lang/String;

.field private D:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lq7/f;->u()Lo1/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lq7/f;-><init>(Lo1/d;)V

    return-void
.end method

.method protected constructor <init>(Lo1/d;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/birbit/android/jobqueue/e;-><init>(Lo1/d;)V

    const-string p1, "RobloxJob"

    .line 3
    iput-object p1, p0, Lq7/f;->C:Ljava/lang/String;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lq7/f;->D:Ljava/lang/Throwable;

    return-void
.end method

.method public static u()Lo1/d;
    .locals 2

    new-instance v0, Lo1/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo1/d;-><init>(I)V

    return-object v0
.end method

.method protected static v()Landroid/os/Handler;
    .locals 3

    .line 1
    sget-object v0, Lq7/f;->E:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lq7/f;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lq7/f;->E:Landroid/os/Handler;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lq7/f;->E:Landroid/os/Handler;

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
    sget-object v0, Lq7/f;->E:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public l()V
    .locals 0

    return-void
.end method

.method protected m(I)V
    .locals 2

    new-instance v0, Lq7/f$a;

    iget-object v1, p0, Lq7/f;->D:Ljava/lang/Throwable;

    invoke-direct {v0, p0, p1, v1}, Lq7/f$a;-><init>(Lq7/f;ILjava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lq7/f;->w(Lq7/f$a;)V

    return-void
.end method

.method protected t(Ljava/lang/Throwable;II)Lo1/e;
    .locals 0

    .line 1
    iput-object p1, p0, Lq7/f;->D:Ljava/lang/Throwable;

    .line 2
    sget-object p1, Lo1/e;->f:Lo1/e;

    return-object p1
.end method

.method protected abstract w(Lq7/f$a;)V
.end method
