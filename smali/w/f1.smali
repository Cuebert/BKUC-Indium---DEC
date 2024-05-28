.class public interface abstract Lw/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/a2;


# static fields
.field public static final g:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Landroidx/camera/core/e;

    const-string v1, "camerax.core.imageOutput.targetAspectRatio"

    .line 2
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/f1;->g:Lw/o0$a;

    .line 3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "camerax.core.imageOutput.targetRotation"

    .line 4
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/f1;->h:Lw/o0$a;

    const-string v1, "camerax.core.imageOutput.appTargetRotation"

    .line 5
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/f1;->i:Lw/o0$a;

    .line 6
    const-class v0, Landroid/util/Size;

    const-string v1, "camerax.core.imageOutput.targetResolution"

    .line 7
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/f1;->j:Lw/o0$a;

    .line 8
    const-class v0, Landroid/util/Size;

    const-string v1, "camerax.core.imageOutput.defaultResolution"

    .line 9
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/f1;->k:Lw/o0$a;

    .line 10
    const-class v0, Landroid/util/Size;

    const-string v1, "camerax.core.imageOutput.maxResolution"

    .line 11
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/f1;->l:Lw/o0$a;

    .line 12
    const-class v0, Ljava/util/List;

    const-string v1, "camerax.core.imageOutput.supportedResolutions"

    .line 13
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/f1;->m:Lw/o0$a;

    return-void
.end method


# virtual methods
.method public abstract A(I)I
.end method

.method public abstract E(I)I
.end method

.method public abstract f(Landroid/util/Size;)Landroid/util/Size;
.end method

.method public abstract k(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;)",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract l()Z
.end method

.method public abstract n()I
.end method

.method public abstract u(Landroid/util/Size;)Landroid/util/Size;
.end method

.method public abstract z(Landroid/util/Size;)Landroid/util/Size;
.end method
