.class public final Landroidx/camera/core/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/z$a;,
        Landroidx/camera/core/z$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz/i<",
        "Landroidx/camera/core/y;",
        ">;"
    }
.end annotation


# static fields
.field static final A:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field static final B:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/z$a;",
            ">;"
        }
    .end annotation
.end field

.field static final C:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/p2$c;",
            ">;"
        }
    .end annotation
.end field

.field static final D:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field static final E:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field static final F:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field static final G:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroidx/camera/core/s;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final z:Lw/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lw/a0$a;

    const-string v1, "camerax.core.appConfig.cameraFactoryProvider"

    .line 2
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z;->A:Lw/o0$a;

    .line 3
    const-class v0, Lw/z$a;

    const-string v1, "camerax.core.appConfig.deviceSurfaceManagerProvider"

    .line 4
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z;->B:Lw/o0$a;

    .line 5
    const-class v0, Lw/p2$c;

    const-string v1, "camerax.core.appConfig.useCaseConfigFactoryProvider"

    .line 6
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z;->C:Lw/o0$a;

    .line 7
    const-class v0, Ljava/util/concurrent/Executor;

    const-string v1, "camerax.core.appConfig.cameraExecutor"

    .line 8
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z;->D:Lw/o0$a;

    .line 9
    const-class v0, Landroid/os/Handler;

    const-string v1, "camerax.core.appConfig.schedulerHandler"

    .line 10
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z;->E:Lw/o0$a;

    .line 11
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "camerax.core.appConfig.minimumLoggingLevel"

    .line 12
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z;->F:Lw/o0$a;

    .line 13
    const-class v0, Landroidx/camera/core/s;

    const-string v1, "camerax.core.appConfig.availableCamerasLimiter"

    .line 14
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z;->G:Lw/o0$a;

    return-void
.end method

.method constructor <init>(Lw/u1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/camera/core/z;->z:Lw/u1;

    return-void
.end method


# virtual methods
.method public synthetic B(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lz/h;->a(Lz/i;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public H(Landroidx/camera/core/s;)Landroidx/camera/core/s;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/z;->z:Lw/u1;

    sget-object v1, Landroidx/camera/core/z;->G:Lw/o0$a;

    invoke-virtual {v0, v1, p1}, Lw/u1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/s;

    return-object p1
.end method

.method public I(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/z;->z:Lw/u1;

    sget-object v1, Landroidx/camera/core/z;->D:Lw/o0$a;

    invoke-virtual {v0, v1, p1}, Lw/u1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method public J(Lw/a0$a;)Lw/a0$a;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/z;->z:Lw/u1;

    sget-object v1, Landroidx/camera/core/z;->A:Lw/o0$a;

    invoke-virtual {v0, v1, p1}, Lw/u1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/a0$a;

    return-object p1
.end method

.method public K(Lw/z$a;)Lw/z$a;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/z;->z:Lw/u1;

    sget-object v1, Landroidx/camera/core/z;->B:Lw/o0$a;

    invoke-virtual {v0, v1, p1}, Lw/u1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/z$a;

    return-object p1
.end method

.method public L(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/z;->z:Lw/u1;

    sget-object v1, Landroidx/camera/core/z;->E:Lw/o0$a;

    invoke-virtual {v0, v1, p1}, Lw/u1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    return-object p1
.end method

.method public M(Lw/p2$c;)Lw/p2$c;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/z;->z:Lw/u1;

    sget-object v1, Landroidx/camera/core/z;->C:Lw/o0$a;

    invoke-virtual {v0, v1, p1}, Lw/u1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/p2$c;

    return-object p1
.end method

.method public synthetic a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->g(Lw/a2;Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lw/o0$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->f(Lw/a2;Lw/o0$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, Lw/z1;->e(Lw/a2;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Lw/o0$a;)Lw/o0$c;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->c(Lw/a2;Lw/o0$a;)Lw/o0$c;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Lw/o0$a;)Z
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->a(Lw/a2;Lw/o0$a;)Z

    move-result p1

    return p1
.end method

.method public o()Lw/o0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/z;->z:Lw/u1;

    return-object v0
.end method

.method public synthetic t(Lw/o0$a;Lw/o0$c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->h(Lw/a2;Lw/o0$a;Lw/o0$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic v(Ljava/lang/String;Lw/o0$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->b(Lw/a2;Ljava/lang/String;Lw/o0$b;)V

    return-void
.end method

.method public synthetic x(Lw/o0$a;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->d(Lw/a2;Lw/o0$a;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
