.class public Landroidx/camera/camera2/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/g;


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:Lu/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lr/z;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    goto :goto_0

    .line 3
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera id is not an integer: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unable to create CamcorderProfileProvider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CamcorderProfileProvider"

    invoke-static {v1, v0}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 4
    :goto_0
    iput-boolean v1, p0, Landroidx/camera/camera2/internal/d;->a:Z

    .line 5
    iput v0, p0, Landroidx/camera/camera2/internal/d;->b:I

    .line 6
    invoke-static {p1, p2}, Lt/g;->a(Ljava/lang/String;Lr/z;)Lw/y1;

    move-result-object p1

    const-class p2, Lt/e;

    .line 7
    invoke-virtual {p1, p2}, Lw/y1;->b(Ljava/lang/Class;)Lw/x1;

    move-result-object p1

    check-cast p1, Lt/e;

    .line 8
    new-instance p2, Lu/c;

    invoke-direct {p2, p1}, Lu/c;-><init>(Lt/e;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/d;->c:Lu/c;

    return-void
.end method
