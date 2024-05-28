.class public Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;
.super Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/roblox/engine/jni/EngineJavaCallback2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;-><init>(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    return-void
.end method

.method static synthetic A(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic B(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->n(I)V

    return-void
.end method

.method static synthetic C(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic D(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic p(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-super/range {p0 .. p5}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->o(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method static synthetic q(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;J)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->b(J)V

    return-void
.end method

.method static synthetic r(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->d()V

    return-void
.end method

.method static synthetic s(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->g(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic t(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;)V
    .locals 0

    invoke-super {p0}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->h()V

    return-void
.end method

.method static synthetic u(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->m(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic v(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->c(I)V

    return-void
.end method

.method static synthetic w(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->k(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic x(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->j(JLjava/lang/String;)V

    return-void
.end method

.method static synthetic y(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->l(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic z(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallbackWrapper;->a(I)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;

    invoke-direct {v1, p0, p1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$6;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(J)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$11;

    invoke-direct {v1, p0, p1, p2}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$11;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;J)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public c(I)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$15;

    invoke-direct {v1, p0, p1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$15;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$2;

    invoke-direct {v1, p0}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$2;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$7;

    invoke-direct {v1, p0, p1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$7;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;

    invoke-direct {v1, p0, p1, p2}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$10;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$12;

    invoke-direct {v1, p0, p1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$12;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$13;

    invoke-direct {v1, p0}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$13;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$9;

    invoke-direct {v1, p0, p1, p2}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$9;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public j(JLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$4;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$4;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public k(JLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v7, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;

    move-object v1, v7

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$3;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public l(JLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v7, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$5;

    move-object v1, v7

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$5;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$14;

    invoke-direct {v1, p0, p1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$14;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public n(I)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$8;

    invoke-direct {v1, p0, p1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$8;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public o(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 9

    iget-object v0, p0, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;->b:Landroid/os/Handler;

    new-instance v8, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;

    move-object v1, v8

    move-object v2, p0

    move-wide v3, p1

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback$1;-><init>(Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
