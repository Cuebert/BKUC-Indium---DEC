.class public final Lv/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/h0<",
        "Lv/j;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lw/q1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lw/q1;->L()Lw/q1;

    move-result-object v0

    iput-object v0, p0, Lv/j$a;->a:Lw/q1;

    return-void
.end method

.method public static synthetic c(Lv/j$a;Lw/o0;Lw/o0$a;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lv/j$a;->f(Lv/j$a;Lw/o0;Lw/o0$a;)Z

    move-result p0

    return p0
.end method

.method public static e(Lw/o0;)Lv/j$a;
    .locals 3

    .line 1
    new-instance v0, Lv/j$a;

    invoke-direct {v0}, Lv/j$a;-><init>()V

    .line 2
    new-instance v1, Lv/i;

    invoke-direct {v1, v0, p0}, Lv/i;-><init>(Lv/j$a;Lw/o0;)V

    const-string v2, "camera2.captureRequest.option."

    invoke-interface {p0, v2, v1}, Lw/o0;->v(Ljava/lang/String;Lw/o0$b;)V

    return-object v0
.end method

.method private static synthetic f(Lv/j$a;Lw/o0;Lw/o0$a;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv/j$a;->a()Lw/p1;

    move-result-object p0

    .line 2
    invoke-interface {p1, p2}, Lw/o0;->d(Lw/o0$a;)Lw/o0$c;

    move-result-object v0

    .line 3
    invoke-interface {p1, p2}, Lw/o0;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object p1

    .line 4
    invoke-interface {p0, p2, v0, p1}, Lw/p1;->G(Lw/o0$a;Lw/o0$c;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public a()Lw/p1;
    .locals 1

    iget-object v0, p0, Lv/j$a;->a:Lw/q1;

    return-object v0
.end method

.method public d()Lv/j;
    .locals 2

    new-instance v0, Lv/j;

    iget-object v1, p0, Lv/j$a;->a:Lw/q1;

    invoke-static {v1}, Lw/u1;->J(Lw/o0;)Lw/u1;

    move-result-object v1

    invoke-direct {v0, v1}, Lv/j;-><init>(Lw/o0;)V

    return-object v0
.end method

.method public g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lv/j$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Lv/j$a;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lq/a;->H(Landroid/hardware/camera2/CaptureRequest$Key;)Lw/o0$a;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lv/j$a;->a:Lw/q1;

    invoke-virtual {v0, p1, p2}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    return-object p0
.end method
