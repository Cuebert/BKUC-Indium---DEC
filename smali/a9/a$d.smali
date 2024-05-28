.class La9/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La9/a;


# direct methods
.method constructor <init>(La9/a;)V
    .locals 0

    iput-object p1, p0, La9/a$d;->a:La9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private d(I)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ErrorCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Fragment2SV"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, La9/a$d;->a:La9/a;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    .line 3
    sget p1, Lcom/roblox/client/c0;->z2:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 4
    :pswitch_0
    sget p1, Lcom/roblox/client/c0;->z2:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 5
    :pswitch_1
    sget p1, Lcom/roblox/client/c0;->C2:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 6
    :pswitch_2
    sget p1, Lcom/roblox/client/c0;->D2:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 7
    :pswitch_3
    sget p1, Lcom/roblox/client/c0;->v2:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 8
    :pswitch_4
    sget p1, Lcom/roblox/client/c0;->x2:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 9
    :pswitch_5
    sget p1, Lcom/roblox/client/c0;->A2:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch -0x3ed
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, La9/a$d;->a:La9/a;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/roblox/client/c0;->y2:I

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, La9/a;->D2(ZLjava/lang/String;)V

    return-void
.end method

.method public b(I)V
    .locals 2

    .line 1
    iget-object v0, p0, La9/a$d;->a:La9/a;

    invoke-direct {p0, p1}, La9/a$d;->d(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/roblox/client/m0;->r2(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, La9/a$d;->a:La9/a;

    const/4 v0, 0x0

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, La9/a;->D2(ZLjava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La9/a$d;->a:La9/a;

    iput-object p1, v0, La9/a;->Q0:Ljava/lang/String;

    .line 2
    iput-object p2, v0, La9/a;->R0:Ljava/lang/String;

    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object p1

    sget p2, Lcom/roblox/client/c0;->w2:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, v2}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lcom/roblox/client/m0;->y2(Ljava/lang/String;I)V

    .line 4
    iget-object p1, p0, La9/a$d;->a:La9/a;

    const-string p2, ""

    invoke-virtual {p1, v1, p2}, La9/a;->D2(ZLjava/lang/String;)V

    return-void
.end method

.method public e(J)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/a$d;->a:La9/a;

    iget-object v0, v0, La9/a;->V0:La9/a$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, La9/a$e;->e(J)V

    :cond_0
    return-void
.end method
