.class public interface abstract Lw/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/i;
.implements Lz/m;
.implements Lw/d1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/o2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/camera/core/y2;",
        ">",
        "Ljava/lang/Object;",
        "Lz/i<",
        "TT;>;",
        "Lz/m;",
        "Lw/d1;"
    }
.end annotation


# static fields
.field public static final n:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/c2;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/k0;",
            ">;"
        }
    .end annotation
.end field

.field public static final p:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/c2$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/k0$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final r:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final s:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroidx/camera/core/s;",
            ">;"
        }
    .end annotation
.end field

.field public static final t:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Landroidx/camera/core/s;

    const-class v1, Lw/c2;

    const-string v2, "camerax.core.useCase.defaultSessionConfig"

    .line 2
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/o2;->n:Lw/o0$a;

    .line 3
    const-class v1, Lw/k0;

    const-string v2, "camerax.core.useCase.defaultCaptureConfig"

    .line 4
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/o2;->o:Lw/o0$a;

    .line 5
    const-class v1, Lw/c2$d;

    const-string v2, "camerax.core.useCase.sessionConfigUnpacker"

    .line 6
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/o2;->p:Lw/o0$a;

    .line 7
    const-class v1, Lw/k0$b;

    const-string v2, "camerax.core.useCase.captureConfigUnpacker"

    .line 8
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/o2;->q:Lw/o0$a;

    .line 9
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v2, "camerax.core.useCase.surfaceOccupancyPriority"

    .line 10
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/o2;->r:Lw/o0$a;

    const-string v1, "camerax.core.useCase.cameraSelector"

    .line 11
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/o2;->s:Lw/o0$a;

    const-string v1, "camerax.core.useCase.targetFrameRate"

    .line 12
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/o2;->t:Lw/o0$a;

    return-void
.end method


# virtual methods
.method public abstract i(Lw/k0;)Lw/k0;
.end method

.method public abstract j(Lw/k0$b;)Lw/k0$b;
.end method

.method public abstract m(I)I
.end method

.method public abstract r(Lw/c2$d;)Lw/c2$d;
.end method

.method public abstract w(Lw/c2;)Lw/c2;
.end method

.method public abstract y(Landroidx/camera/core/s;)Landroidx/camera/core/s;
.end method
