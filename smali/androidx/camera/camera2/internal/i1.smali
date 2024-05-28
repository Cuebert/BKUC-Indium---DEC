.class Landroidx/camera/camera2/internal/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw/g0;

.field private final b:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Landroidx/camera/core/t;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lw/g0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/camera/camera2/internal/i1;->a:Lw/g0;

    .line 3
    new-instance p1, Landroidx/lifecycle/r;

    invoke-direct {p1}, Landroidx/lifecycle/r;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/i1;->b:Landroidx/lifecycle/r;

    .line 4
    sget-object v0, Landroidx/camera/core/t$b;->r:Landroidx/camera/core/t$b;

    invoke-static {v0}, Landroidx/camera/core/t;->a(Landroidx/camera/core/t$b;)Landroidx/camera/core/t;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/r;->m(Ljava/lang/Object;)V

    return-void
.end method

.method private b()Landroidx/camera/core/t;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i1;->a:Lw/g0;

    invoke-virtual {v0}, Lw/g0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/camera/core/t$b;->o:Landroidx/camera/core/t$b;

    invoke-static {v0}, Landroidx/camera/core/t;->a(Landroidx/camera/core/t$b;)Landroidx/camera/core/t;

    move-result-object v0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Landroidx/camera/core/t$b;->n:Landroidx/camera/core/t$b;

    invoke-static {v0}, Landroidx/camera/core/t;->a(Landroidx/camera/core/t$b;)Landroidx/camera/core/t;

    move-result-object v0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/camera/core/t;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/i1;->b:Landroidx/lifecycle/r;

    return-object v0
.end method

.method public c(Lw/d0$a;Landroidx/camera/core/t$a;)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/camera/camera2/internal/i1$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown internal camera state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 3
    :pswitch_0
    sget-object v0, Landroidx/camera/core/t$b;->r:Landroidx/camera/core/t$b;

    invoke-static {v0, p2}, Landroidx/camera/core/t;->b(Landroidx/camera/core/t$b;Landroidx/camera/core/t$a;)Landroidx/camera/core/t;

    move-result-object v0

    goto :goto_0

    .line 4
    :pswitch_1
    sget-object v0, Landroidx/camera/core/t$b;->q:Landroidx/camera/core/t$b;

    invoke-static {v0, p2}, Landroidx/camera/core/t;->b(Landroidx/camera/core/t$b;Landroidx/camera/core/t$a;)Landroidx/camera/core/t;

    move-result-object v0

    goto :goto_0

    .line 5
    :pswitch_2
    sget-object v0, Landroidx/camera/core/t$b;->p:Landroidx/camera/core/t$b;

    invoke-static {v0, p2}, Landroidx/camera/core/t;->b(Landroidx/camera/core/t$b;Landroidx/camera/core/t$a;)Landroidx/camera/core/t;

    move-result-object v0

    goto :goto_0

    .line 6
    :pswitch_3
    sget-object v0, Landroidx/camera/core/t$b;->o:Landroidx/camera/core/t$b;

    invoke-static {v0, p2}, Landroidx/camera/core/t;->b(Landroidx/camera/core/t$b;Landroidx/camera/core/t$a;)Landroidx/camera/core/t;

    move-result-object v0

    goto :goto_0

    .line 7
    :pswitch_4
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i1;->b()Landroidx/camera/core/t;

    move-result-object v0

    .line 8
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "New public camera state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "CameraStateMachine"

    invoke-static {p2, p1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Landroidx/camera/camera2/internal/i1;->b:Landroidx/lifecycle/r;

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/t;

    .line 10
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Publishing new public camera state "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Landroidx/camera/camera2/internal/i1;->b:Landroidx/lifecycle/r;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/r;->m(Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
