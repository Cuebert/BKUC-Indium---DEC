.class public Le8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le8/b$d;
    }
.end annotation


# instance fields
.field private a:J

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Le8/a;

.field private e:Landroid/os/Handler;

.field private f:Lf7/e0;


# direct methods
.method public constructor <init>(Le8/a;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Le8/b;->a:J

    const-string v0, ""

    .line 3
    iput-object v0, p0, Le8/b;->b:Ljava/lang/String;

    .line 4
    new-instance v0, Le8/b$d;

    invoke-direct {v0, p0}, Le8/b$d;-><init>(Le8/b;)V

    iput-object v0, p0, Le8/b;->f:Lf7/e0;

    .line 5
    iput-object p1, p0, Le8/b;->d:Le8/a;

    .line 6
    iput-boolean p2, p0, Le8/b;->c:Z

    .line 7
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Le8/b;->e:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Le8/b;)Le8/a;
    .locals 0

    iget-object p0, p0, Le8/b;->d:Le8/a;

    return-object p0
.end method

.method static synthetic b(Le8/b;ZJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Le8/b;->e(ZJLjava/lang/String;)V

    return-void
.end method

.method private e(ZJLjava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In-App purchase finished: success = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", player="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", productId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "rbx.purchaseflow"

    invoke-static {v3, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-wide v4, p0, Le8/b;->a:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_0

    const-string p1, "AppShellFragment.inAppPurchaseFinished: userId == 0."

    .line 3
    invoke-static {v3, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Native call. Success="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-static {p1, p2, p3, p4}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeInGamePurchaseFinished(ZJLjava/lang/String;)V

    const-string p1, ""

    .line 6
    iput-object p1, p0, Le8/b;->b:Ljava/lang/String;

    .line 7
    iput-wide v6, p0, Le8/b;->a:J

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/CharSequence;)V
    .locals 12

    .line 1
    iget-object v0, p0, Le8/b;->d:Le8/a;

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Le8/b;->d:Le8/a;

    invoke-interface {v1}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    .line 3
    new-instance v3, Landroid/widget/TextView;

    iget-object v1, p0, Le8/b;->d:Le8/a;

    invoke-interface {v1}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    iget-object v1, p0, Le8/b;->d:Le8/a;

    invoke-interface {v1}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v1

    sget v2, Lcom/roblox/client/c0;->r3:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 6
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    add-int v9, v8, v1

    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    new-array v2, v1, [Ld9/a;

    const/4 v10, 0x0

    new-instance v11, Ld9/c;

    iget-object v4, p0, Le8/b;->d:Le8/a;

    invoke-interface {v4}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v5

    const/4 v6, 0x0

    move-object v4, v11

    invoke-direct/range {v4 .. v9}, Ld9/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    aput-object v11, v2, v10

    invoke-static {v3, p1, v2}, Ld9/b;->e(Landroid/widget/TextView;Ljava/lang/String;[Ld9/a;)V

    const/high16 p1, 0x41a00000    # 20.0f

    .line 8
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p1, 0x0

    .line 9
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v4, 0x96

    const/16 v5, 0x64

    const/16 v6, 0x96

    const/16 v7, 0x64

    move-object v2, v0

    .line 10
    invoke-virtual/range {v2 .. v7}, Landroidx/appcompat/app/b;->i(Landroid/view/View;IIII)V

    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 12
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public d(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le8/b;->d:Le8/a;

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Le8/b;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public g(JLjava/lang/String;)V
    .locals 8

    .line 1
    iput-wide p1, p0, Le8/b;->a:J

    .line 2
    iput-object p3, p0, Le8/b;->b:Ljava/lang/String;

    .line 3
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Le8/b;->d:Le8/a;

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roblox/client/n;->j(Landroid/app/Activity;)Lg8/a;

    move-result-object v1

    iget-object v6, p0, Le8/b;->f:Lf7/e0;

    move-object v3, p3

    move-wide v4, p1

    invoke-virtual/range {v1 .. v6}, Lg8/a;->a(Landroid/app/Activity;Ljava/lang/String;JLe8/g;)V

    :cond_0
    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Le8/b;->d:Le8/a;

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v4

    .line 8
    invoke-static {v4}, Lf8/h;->f0(Landroid/content/Context;)Lf8/h;

    move-result-object v1

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    iget-object v7, p0, Le8/b;->f:Lf7/e0;

    move-object v3, p3

    move-wide v5, p1

    invoke-interface/range {v1 .. v7}, Le8/d;->a(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLe8/g;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 10
    new-instance v0, Le8/b$b;

    invoke-direct {v0, p0}, Le8/b$b;-><init>(Le8/b;)V

    invoke-virtual {p0, v0}, Le8/b;->f(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, v0, p1, p2, p3}, Le8/b;->e(ZJLjava/lang/String;)V

    :cond_2
    return-void
.end method

.method public h(JLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    iput-wide p1, p0, Le8/b;->a:J

    .line 2
    iput-object p3, p0, Le8/b;->b:Ljava/lang/String;

    .line 3
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object p4, p0, Le8/b;->d:Le8/a;

    invoke-interface {p4}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result p4

    if-nez p4, :cond_0

    .line 6
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object p4

    invoke-virtual {p4, v1}, Lcom/roblox/client/n;->j(Landroid/app/Activity;)Lg8/a;

    move-result-object v0

    iget-object v5, p0, Le8/b;->f:Lf7/e0;

    move-object v2, p3

    move-wide v3, p1

    invoke-virtual/range {v0 .. v5}, Lg8/a;->a(Landroid/app/Activity;Ljava/lang/String;JLe8/g;)V

    :cond_0
    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Le8/b;->d:Le8/a;

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v4

    .line 8
    invoke-static {v4}, Lf8/h;->f0(Landroid/content/Context;)Lf8/h;

    move-result-object v1

    .line 9
    iget-object v7, p0, Le8/b;->f:Lf7/e0;

    move-object v2, p4

    move-object v3, p3

    move-wide v5, p1

    invoke-interface/range {v1 .. v7}, Le8/d;->a(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLe8/g;)Z

    move-result p4

    if-nez p4, :cond_2

    .line 10
    new-instance p4, Le8/b$a;

    invoke-direct {p4, p0}, Le8/b$a;-><init>(Le8/b;)V

    invoke-virtual {p0, p4}, Le8/b;->f(Ljava/lang/Runnable;)V

    const/4 p4, 0x0

    .line 11
    invoke-direct {p0, p4, p1, p2, p3}, Le8/b;->e(ZJLjava/lang/String;)V

    :cond_2
    return-void
.end method

.method public i(JLjava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    iput-wide p1, p0, Le8/b;->a:J

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->t1()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0, v1, p1, p2, p3}, Le8/b;->e(ZJLjava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p4, "rbx.purchaseflow"

    const-string v0, "Luobu purchasing not enabled"

    .line 5
    invoke-static {p4, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-direct {p0, v1, p1, p2, p3}, Le8/b;->e(ZJLjava/lang/String;)V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Le8/b;->d:Le8/a;

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v7

    .line 8
    invoke-static {v7}, Lf8/h;->f0(Landroid/content/Context;)Lf8/h;

    move-result-object v2

    const/4 v8, 0x1

    .line 9
    iget-object v9, p0, Le8/b;->f:Lf7/e0;

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v2 .. v9}, Le8/d;->b(JLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;ZLe8/g;)Z

    move-result p4

    if-nez p4, :cond_2

    .line 10
    new-instance p4, Le8/b$c;

    invoke-direct {p4, p0}, Le8/b$c;-><init>(Le8/b;)V

    invoke-virtual {p0, p4}, Le8/b;->f(Ljava/lang/Runnable;)V

    .line 11
    invoke-direct {p0, v1, p1, p2, p3}, Le8/b;->e(ZJLjava/lang/String;)V

    :cond_2
    return-void
.end method
