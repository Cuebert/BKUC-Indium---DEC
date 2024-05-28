.class final Landroidx/camera/core/d2$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/d2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field protected final a:Lw/h1;

.field protected final b:Lw/j0;

.field protected final c:Lw/l0;

.field protected d:I

.field protected e:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(IIIILw/j0;Lw/l0;)V
    .locals 1

    .line 7
    new-instance v0, Landroidx/camera/core/t1;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/camera/core/t1;-><init>(IIII)V

    invoke-direct {p0, v0, p5, p6}, Landroidx/camera/core/d2$e;-><init>(Lw/h1;Lw/j0;Lw/l0;)V

    return-void
.end method

.method constructor <init>(Lw/h1;Lw/j0;Lw/l0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/d2$e;->e:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p1, p0, Landroidx/camera/core/d2$e;->a:Lw/h1;

    .line 4
    iput-object p2, p0, Landroidx/camera/core/d2$e;->b:Lw/j0;

    .line 5
    iput-object p3, p0, Landroidx/camera/core/d2$e;->c:Lw/l0;

    .line 6
    invoke-interface {p1}, Lw/h1;->d()I

    move-result p1

    iput p1, p0, Landroidx/camera/core/d2$e;->d:I

    return-void
.end method


# virtual methods
.method a()Landroidx/camera/core/d2;
    .locals 1

    new-instance v0, Landroidx/camera/core/d2;

    invoke-direct {v0, p0}, Landroidx/camera/core/d2;-><init>(Landroidx/camera/core/d2$e;)V

    return-object v0
.end method

.method b(I)Landroidx/camera/core/d2$e;
    .locals 0

    iput p1, p0, Landroidx/camera/core/d2$e;->d:I

    return-object p0
.end method

.method c(Ljava/util/concurrent/Executor;)Landroidx/camera/core/d2$e;
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/d2$e;->e:Ljava/util/concurrent/Executor;

    return-object p0
.end method
