.class public Lu/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lw/y1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-class v0, Lt/a;

    invoke-virtual {p1, v0}, Lw/y1;->b(Ljava/lang/Class;)Lw/x1;

    move-result-object p1

    check-cast p1, Lt/a;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lu/a;->a:Landroid/util/Range;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lt/a;->b()Landroid/util/Range;

    move-result-object p1

    iput-object p1, p0, Lu/a;->a:Landroid/util/Range;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lq/a$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu/a;->a:Landroid/util/Range;

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v1, v0}, Lq/a$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;

    :cond_0
    return-void
.end method
