.class Landroidx/camera/camera2/internal/g0$g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/g0$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private a:J

.field final synthetic b:Landroidx/camera/camera2/internal/g0$g;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/g0$g;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/camera/camera2/internal/g0$g$a;->b:Landroidx/camera/camera2/internal/g0$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Landroidx/camera/camera2/internal/g0$g$a;->a:J

    return-void
.end method


# virtual methods
.method a()Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0$g$a;->b()J

    move-result-wide v0

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0$g$a;->d()I

    move-result v2

    int-to-long v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    cmp-long v6, v0, v2

    if-ltz v6, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0$g$a;->e()V

    return v5

    :cond_1
    return v4
.end method

.method b()J
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Landroidx/camera/camera2/internal/g0$g$a;->a:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 3
    iput-wide v0, p0, Landroidx/camera/camera2/internal/g0$g$a;->a:J

    .line 4
    :cond_0
    iget-wide v2, p0, Landroidx/camera/camera2/internal/g0$g$a;->a:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method c()I
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g$a;->b:Landroidx/camera/camera2/internal/g0$g;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/g0$g;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x2bc

    return v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/g0$g$a;->b()J

    move-result-wide v0

    const-wide/32 v2, 0x1d4c0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    const/16 v0, 0x3e8

    return v0

    :cond_1
    const-wide/32 v2, 0x493e0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    const/16 v0, 0x7d0

    return v0

    :cond_2
    const/16 v0, 0xfa0

    return v0
.end method

.method d()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/g0$g$a;->b:Landroidx/camera/camera2/internal/g0$g;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/g0$g;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x2710

    return v0

    :cond_0
    const v0, 0x1b7740

    return v0
.end method

.method e()V
    .locals 2

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/camera/camera2/internal/g0$g$a;->a:J

    return-void
.end method
