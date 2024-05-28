.class public final Landroidx/camera/camera2/internal/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/p2;


# instance fields
.field final b:Landroidx/camera/camera2/internal/v1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Landroidx/camera/camera2/internal/v1;->b(Landroid/content/Context;)Landroidx/camera/camera2/internal/v1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/d1;->b:Landroidx/camera/camera2/internal/v1;

    return-void
.end method


# virtual methods
.method public a(Lw/p2$b;I)Lw/o0;
    .locals 10

    .line 1
    invoke-static {}, Lw/q1;->L()Lw/q1;

    move-result-object v0

    .line 2
    new-instance v1, Lw/c2$b;

    invoke-direct {v1}, Lw/c2$b;-><init>()V

    .line 3
    sget-object v2, Landroidx/camera/camera2/internal/d1$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v2, v3

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v3, v8, :cond_2

    if-eq v3, v7, :cond_1

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {v1, v6}, Lw/c2$b;->s(I)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {v1, v8}, Lw/c2$b;->s(I)V

    goto :goto_1

    :cond_2
    if-ne p2, v7, :cond_3

    const/4 v3, 0x5

    goto :goto_0

    :cond_3
    const/4 v3, 0x1

    .line 6
    :goto_0
    invoke-virtual {v1, v3}, Lw/c2$b;->s(I)V

    .line 7
    :goto_1
    sget-object v3, Lw/p2$b;->o:Lw/p2$b;

    if-ne p1, v3, :cond_4

    .line 8
    invoke-static {v1}, Lu/m;->a(Lw/c2$b;)V

    .line 9
    :cond_4
    sget-object v9, Lw/o2;->n:Lw/o0$a;

    invoke-virtual {v1}, Lw/c2$b;->m()Lw/c2;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 10
    sget-object v1, Lw/o2;->p:Lw/o0$a;

    sget-object v9, Landroidx/camera/camera2/internal/c1;->a:Landroidx/camera/camera2/internal/c1;

    invoke-virtual {v0, v1, v9}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 11
    new-instance v1, Lw/k0$a;

    invoke-direct {v1}, Lw/k0$a;-><init>()V

    .line 12
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v2, v2, v9

    if-eq v2, v8, :cond_7

    if-eq v2, v7, :cond_6

    if-eq v2, v6, :cond_6

    if-eq v2, v5, :cond_5

    goto :goto_3

    .line 13
    :cond_5
    invoke-virtual {v1, v6}, Lw/k0$a;->p(I)V

    goto :goto_3

    .line 14
    :cond_6
    invoke-virtual {v1, v8}, Lw/k0$a;->p(I)V

    goto :goto_3

    :cond_7
    if-ne p2, v7, :cond_8

    goto :goto_2

    :cond_8
    const/4 v4, 0x2

    .line 15
    :goto_2
    invoke-virtual {v1, v4}, Lw/k0$a;->p(I)V

    .line 16
    :goto_3
    sget-object p2, Lw/o2;->o:Lw/o0$a;

    invoke-virtual {v1}, Lw/k0$a;->h()Lw/k0;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 17
    sget-object p2, Lw/o2;->q:Lw/o0$a;

    .line 18
    sget-object v1, Lw/p2$b;->n:Lw/p2$b;

    if-ne p1, v1, :cond_9

    sget-object v1, Landroidx/camera/camera2/internal/a2;->c:Landroidx/camera/camera2/internal/a2;

    goto :goto_4

    .line 19
    :cond_9
    sget-object v1, Landroidx/camera/camera2/internal/l0;->a:Landroidx/camera/camera2/internal/l0;

    .line 20
    :goto_4
    invoke-virtual {v0, p2, v1}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    if-ne p1, v3, :cond_a

    .line 21
    sget-object p1, Lw/f1;->l:Lw/o0$a;

    iget-object p2, p0, Landroidx/camera/camera2/internal/d1;->b:Landroidx/camera/camera2/internal/v1;

    .line 22
    invoke-virtual {p2}, Landroidx/camera/camera2/internal/v1;->d()Landroid/util/Size;

    move-result-object p2

    .line 23
    invoke-virtual {v0, p1, p2}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 24
    :cond_a
    iget-object p1, p0, Landroidx/camera/camera2/internal/d1;->b:Landroidx/camera/camera2/internal/v1;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/v1;->c()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    .line 25
    sget-object p2, Lw/f1;->h:Lw/o0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lw/q1;->g(Lw/o0$a;Ljava/lang/Object;)V

    .line 26
    invoke-static {v0}, Lw/u1;->J(Lw/o0;)Lw/u1;

    move-result-object p1

    return-object p1
.end method
