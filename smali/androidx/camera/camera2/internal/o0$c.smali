.class Landroidx/camera/camera2/internal/o0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final i:J

.field private static final j:J


# instance fields
.field private final a:I

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Landroidx/camera/camera2/internal/t;

.field private final d:Lu/l;

.field private final e:Z

.field private f:J

.field final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/camera2/internal/o0$d;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroidx/camera/camera2/internal/o0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    sput-wide v1, Landroidx/camera/camera2/internal/o0$c;->i:J

    const-wide/16 v1, 0x5

    .line 2
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Landroidx/camera/camera2/internal/o0$c;->j:J

    return-void
.end method

.method constructor <init>(ILjava/util/concurrent/Executor;Landroidx/camera/camera2/internal/t;ZLu/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-wide v0, Landroidx/camera/camera2/internal/o0$c;->i:J

    iput-wide v0, p0, Landroidx/camera/camera2/internal/o0$c;->f:J

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/o0$c;->g:Ljava/util/List;

    .line 4
    new-instance v0, Landroidx/camera/camera2/internal/o0$c$a;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/o0$c$a;-><init>(Landroidx/camera/camera2/internal/o0$c;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/o0$c;->h:Landroidx/camera/camera2/internal/o0$d;

    .line 5
    iput p1, p0, Landroidx/camera/camera2/internal/o0$c;->a:I

    .line 6
    iput-object p2, p0, Landroidx/camera/camera2/internal/o0$c;->b:Ljava/util/concurrent/Executor;

    .line 7
    iput-object p3, p0, Landroidx/camera/camera2/internal/o0$c;->c:Landroidx/camera/camera2/internal/t;

    .line 8
    iput-boolean p4, p0, Landroidx/camera/camera2/internal/o0$c;->e:Z

    .line 9
    iput-object p5, p0, Landroidx/camera/camera2/internal/o0$c;->d:Lu/l;

    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/o0$c;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/o0$c;->o()V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/camera2/internal/o0$c;Lw/k0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/o0$c;->p(Lw/k0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/camera2/internal/o0$c;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/o0$c;->k(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Landroidx/camera/camera2/internal/o0$c;Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/o0$c;->n(Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/camera/camera2/internal/o0$c;Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/o0$c;->m(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/camera/camera2/internal/o0$c;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/m;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/o0$c;->l(ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/m;

    move-result-object p0

    return-object p0
.end method

.method private h(Lw/k0$a;)V
    .locals 3

    .line 1
    new-instance v0, Lq/a$a;

    invoke-direct {v0}, Lq/a$a;-><init>()V

    .line 2
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x3

    .line 3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 4
    invoke-virtual {v0, v1, v2}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    .line 5
    invoke-virtual {v0}, Lq/a$a;->c()Lq/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lw/k0$a;->e(Lw/o0;)V

    return-void
.end method

.method private i(Lw/k0$a;Lw/k0;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/o0$c;->a:I

    const/4 v1, -0x1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/o0$c;->e:Z

    if-nez v0, :cond_0

    const/4 p2, 0x4

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p2}, Lw/k0;->g()I

    move-result v0

    if-eq v0, v1, :cond_2

    .line 3
    invoke-virtual {p2}, Lw/k0;->g()I

    move-result p2

    const/4 v0, 0x5

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, -0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x2

    :goto_1
    if-eq p2, v1, :cond_3

    .line 4
    invoke-virtual {p1, p2}, Lw/k0$a;->p(I)V

    :cond_3
    return-void
.end method

.method private k(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    new-instance v1, Landroidx/camera/camera2/internal/e;

    invoke-direct {v1, p1}, Landroidx/camera/camera2/internal/e;-><init>(Landroid/hardware/camera2/CaptureResult;)V

    .line 2
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->g()Lw/l;

    move-result-object p1

    sget-object v2, Lw/l;->o:Lw/l;

    const/4 v3, 0x1

    if-eq p1, v2, :cond_2

    .line 3
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->g()Lw/l;

    move-result-object p1

    sget-object v2, Lw/l;->n:Lw/l;

    if-eq p1, v2, :cond_2

    .line 4
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->h()Lw/m;

    move-result-object p1

    sget-object v2, Lw/m;->q:Lw/m;

    if-eq p1, v2, :cond_2

    .line 5
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->h()Lw/m;

    move-result-object p1

    sget-object v2, Lw/m;->r:Lw/m;

    if-eq p1, v2, :cond_2

    .line 6
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->h()Lw/m;

    move-result-object p1

    sget-object v2, Lw/m;->s:Lw/m;

    if-eq p1, v2, :cond_2

    .line 7
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->h()Lw/m;

    move-result-object p1

    sget-object v2, Lw/m;->t:Lw/m;

    if-ne p1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 8
    :goto_1
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->f()Lw/k;

    move-result-object v2

    sget-object v4, Lw/k;->r:Lw/k;

    if-eq v2, v4, :cond_4

    .line 9
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->f()Lw/k;

    move-result-object v2

    sget-object v4, Lw/k;->q:Lw/k;

    if-eq v2, v4, :cond_4

    .line 10
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->f()Lw/k;

    move-result-object v2

    sget-object v4, Lw/k;->n:Lw/k;

    if-ne v2, v4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v2, 0x1

    .line 11
    :goto_3
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->i()Lw/n;

    move-result-object v4

    sget-object v5, Lw/n;->q:Lw/n;

    if-eq v4, v5, :cond_6

    .line 12
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->i()Lw/n;

    move-result-object v4

    sget-object v5, Lw/n;->n:Lw/n;

    if-ne v4, v5, :cond_5

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v4, 0x1

    .line 13
    :goto_5
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "checkCaptureResult, AE="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->f()Lw/k;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " AF ="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->h()Lw/m;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " AWB="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {v1}, Landroidx/camera/camera2/internal/e;->i()Lw/n;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "Camera2CapturePipeline"

    .line 16
    invoke-static {v5, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_7

    if-eqz v2, :cond_7

    if-eqz v4, :cond_7

    const/4 v0, 0x1

    :cond_7
    return v0
.end method

.method private synthetic l(ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/m;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/o0;->a(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    sget-wide v0, Landroidx/camera/camera2/internal/o0$c;->j:J

    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/o0$c;->q(J)V

    .line 3
    :cond_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/o0$c;->h:Landroidx/camera/camera2/internal/o0$d;

    invoke-interface {p1, p2}, Landroidx/camera/camera2/internal/o0$d;->b(Landroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/m;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-wide v0, p0, Landroidx/camera/camera2/internal/o0$c;->f:J

    new-instance p1, Landroidx/camera/camera2/internal/p0;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/p0;-><init>(Landroidx/camera/camera2/internal/o0$c;)V

    invoke-direct {p0, v0, v1, p1}, Landroidx/camera/camera2/internal/o0$c;->s(JLandroidx/camera/camera2/internal/o0$e$a;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 3
    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/m;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/camera/camera2/internal/o0$c;->r(Ljava/util/List;I)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method

.method private synthetic o()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/o0$c;->h:Landroidx/camera/camera2/internal/o0$d;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/o0$d;->c()V

    return-void
.end method

.method private synthetic p(Lw/k0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Landroidx/camera/camera2/internal/o0$c$b;

    invoke-direct {v0, p0, p2}, Landroidx/camera/camera2/internal/o0$c$b;-><init>(Landroidx/camera/camera2/internal/o0$c;Landroidx/concurrent/futures/c$a;)V

    invoke-virtual {p1, v0}, Lw/k0$a;->c(Lw/h;)V

    const-string p1, "submitStillCapture"

    return-object p1
.end method

.method private q(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/camera/camera2/internal/o0$c;->f:J

    return-void
.end method

.method private s(JLandroidx/camera/camera2/internal/o0$e$a;)Lcom/google/common/util/concurrent/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/camera/camera2/internal/o0$e$a;",
            ")",
            "Lcom/google/common/util/concurrent/m<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/camera/camera2/internal/o0$e;

    invoke-direct {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/o0$e;-><init>(JLandroidx/camera/camera2/internal/o0$e$a;)V

    .line 2
    iget-object p1, p0, Landroidx/camera/camera2/internal/o0$c;->c:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1, v0}, Landroidx/camera/camera2/internal/t;->s(Landroidx/camera/camera2/internal/t$c;)V

    .line 3
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/o0$e;->c()Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method g(Landroidx/camera/camera2/internal/o0$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/o0$c;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method j(Ljava/util/List;I)Lcom/google/common/util/concurrent/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;I)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v1

    .line 2
    iget-object v2, p0, Landroidx/camera/camera2/internal/o0$c;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/o0$c;->h:Landroidx/camera/camera2/internal/o0$d;

    invoke-interface {v1}, Landroidx/camera/camera2/internal/o0$d;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    invoke-direct {p0, v1, v2, v0}, Landroidx/camera/camera2/internal/o0$c;->s(JLandroidx/camera/camera2/internal/o0$e$a;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {v0}, Ly/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/m;

    move-result-object v0

    .line 5
    :goto_0
    invoke-static {v0}, Ly/d;->a(Lcom/google/common/util/concurrent/m;)Ly/d;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/t0;

    invoke-direct {v1, p0, p2}, Landroidx/camera/camera2/internal/t0;-><init>(Landroidx/camera/camera2/internal/o0$c;I)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/o0$c;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/s0;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/s0;-><init>(Landroidx/camera/camera2/internal/o0$c;)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/o0$c;->b:Ljava/util/concurrent/Executor;

    .line 6
    invoke-virtual {v0, v1, v2}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object v1

    .line 7
    :cond_1
    invoke-static {v1}, Ly/d;->a(Lcom/google/common/util/concurrent/m;)Ly/d;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/u0;

    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/camera2/internal/u0;-><init>(Landroidx/camera/camera2/internal/o0$c;Ljava/util/List;I)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/o0$c;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    move-result-object p1

    .line 8
    new-instance p2, Landroidx/camera/camera2/internal/r0;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/r0;-><init>(Landroidx/camera/camera2/internal/o0$c;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/o0$c;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2, v0}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method r(Ljava/util/List;I)Lcom/google/common/util/concurrent/m;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k0;",
            ">;I)",
            "Lcom/google/common/util/concurrent/m<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw/k0;

    .line 4
    invoke-static {v2}, Lw/k0$a;->k(Lw/k0;)Lw/k0$a;

    move-result-object v3

    const/4 v4, 0x0

    .line 5
    invoke-virtual {v2}, Lw/k0;->g()I

    move-result v5

    const/4 v6, 0x5

    if-ne v5, v6, :cond_1

    .line 6
    iget-object v5, p0, Landroidx/camera/camera2/internal/o0$c;->c:Landroidx/camera/camera2/internal/t;

    .line 7
    invoke-virtual {v5}, Landroidx/camera/camera2/internal/t;->G()Landroidx/camera/camera2/internal/b3;

    move-result-object v5

    invoke-interface {v5}, Landroidx/camera/camera2/internal/b3;->d()Landroidx/camera/core/l1;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 8
    iget-object v6, p0, Landroidx/camera/camera2/internal/o0$c;->c:Landroidx/camera/camera2/internal/t;

    .line 9
    invoke-virtual {v6}, Landroidx/camera/camera2/internal/t;->G()Landroidx/camera/camera2/internal/b3;

    move-result-object v6

    invoke-interface {v6, v5}, Landroidx/camera/camera2/internal/b3;->c(Landroidx/camera/core/l1;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_1

    .line 10
    invoke-interface {v5}, Landroidx/camera/core/l1;->q()Landroidx/camera/core/i1;

    move-result-object v4

    .line 11
    invoke-static {v4}, Lw/r;->a(Landroidx/camera/core/i1;)Lw/q;

    move-result-object v4

    :cond_1
    if-eqz v4, :cond_2

    .line 12
    invoke-virtual {v3, v4}, Lw/k0$a;->n(Lw/q;)V

    goto :goto_2

    .line 13
    :cond_2
    invoke-direct {p0, v3, v2}, Landroidx/camera/camera2/internal/o0$c;->i(Lw/k0$a;Lw/k0;)V

    .line 14
    :goto_2
    iget-object v2, p0, Landroidx/camera/camera2/internal/o0$c;->d:Lu/l;

    invoke-virtual {v2, p2}, Lu/l;->c(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 15
    invoke-direct {p0, v3}, Landroidx/camera/camera2/internal/o0$c;->h(Lw/k0$a;)V

    .line 16
    :cond_3
    new-instance v2, Landroidx/camera/camera2/internal/q0;

    invoke-direct {v2, p0, v3}, Landroidx/camera/camera2/internal/q0;-><init>(Landroidx/camera/camera2/internal/o0$c;Lw/k0$a;)V

    invoke-static {v2}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/m;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-virtual {v3}, Lw/k0$a;->h()Lw/k0;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :cond_4
    iget-object p1, p0, Landroidx/camera/camera2/internal/o0$c;->c:Landroidx/camera/camera2/internal/t;

    invoke-virtual {p1, v1}, Landroidx/camera/camera2/internal/t;->c0(Ljava/util/List;)V

    .line 19
    invoke-static {v0}, Ly/f;->c(Ljava/util/Collection;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    return-object p1
.end method
