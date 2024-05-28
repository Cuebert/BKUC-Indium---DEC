.class public final Lq/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/h0<",
        "Lq/a;",
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

    iput-object v0, p0, Lq/a$a;->a:Lw/q1;

    return-void
.end method


# virtual methods
.method public a()Lw/p1;
    .locals 1

    iget-object v0, p0, Lq/a$a;->a:Lw/q1;

    return-object v0
.end method

.method public c()Lq/a;
    .locals 2

    new-instance v0, Lq/a;

    iget-object v1, p0, Lq/a$a;->a:Lw/q1;

    invoke-static {v1}, Lw/u1;->J(Lw/o0;)Lw/u1;

    move-result-object v1

    invoke-direct {v0, v1}, Lq/a;-><init>(Lw/o0;)V

    return-object v0
.end method

.method public d(Lw/o0;)Lq/a$a;
    .locals 4

    .line 1
    invoke-interface {p1}, Lw/o0;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/o0$a;

    .line 2
    iget-object v2, p0, Lq/a$a;->a:Lw/q1;

    invoke-interface {p1, v1}, Lw/o0;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Lq/a$a;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lq/a;->H(Landroid/hardware/camera2/CaptureRequest$Key;)Lw/o0$a;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lq/a$a;->a:Lw/q1;

    invoke-virtual {v0, p1, p2}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    return-object p0
.end method
