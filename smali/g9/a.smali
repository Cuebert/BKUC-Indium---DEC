.class public abstract Lg9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/a$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field protected b:Lg9/b;

.field protected c:Lg9/a$a;

.field private d:Lf9/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg9/a$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lf9/e;

    invoke-direct {v0}, Lf9/e;-><init>()V

    iput-object v0, p0, Lg9/a;->d:Lf9/e;

    .line 3
    iput-object p1, p0, Lg9/a;->a:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lg9/a;->c:Lg9/a$a;

    return-void
.end method

.method private a(IIIII)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "doUpdateAppUISizes() vw:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " status:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " tbh:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " bm:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " rm:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.glview.layout"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p1, p2, p3, p4, p5}, Lcom/roblox/engine/jni/NativeGLInterface;->updateAppUISizes(IIIII)V

    return-void
.end method

.method private g(IF)I
    .locals 2

    int-to-float p1, p1

    div-float/2addr p1, p2

    float-to-double p1, p1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    add-double/2addr p1, v0

    double-to-int p1, p1

    return p1
.end method


# virtual methods
.method public b()F
    .locals 2

    iget-object v0, p0, Lg9/a;->d:Lf9/e;

    iget-object v1, p0, Lg9/a;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lf9/e;->b(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method public abstract c()Lg9/b;
.end method

.method protected d(Lg9/b;Z)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 1
    iget-object p2, p0, Lg9/a;->b:Lg9/b;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lg9/b;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    .line 2
    :cond_1
    iput-object p1, p0, Lg9/a;->b:Lg9/b;

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lg9/a;->b()F

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    iget-object v0, p1, Lg9/b;->a:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-direct {p0, v0, p2}, Lg9/a;->g(IF)I

    move-result v0

    .line 5
    iget v1, p1, Lg9/b;->f:I

    invoke-direct {p0, v1, p2}, Lg9/a;->g(IF)I

    move-result v4

    .line 6
    iget v1, p1, Lg9/b;->e:I

    if-lez v1, :cond_2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 7
    invoke-direct {p0, v1, p2}, Lg9/a;->g(IF)I

    move-result v6

    move-object v1, p0

    move v5, v0

    invoke-virtual/range {v1 .. v6}, Lg9/a;->f(ZIIII)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move v5, v0

    .line 8
    invoke-virtual/range {v1 .. v6}, Lg9/a;->f(ZIIII)V

    .line 9
    :goto_0
    invoke-virtual {p0}, Lg9/a;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    .line 10
    :cond_3
    iget v1, p1, Lg9/b;->c:I

    invoke-direct {p0, v1, p2}, Lg9/a;->g(IF)I

    move-result v5

    .line 11
    iget v1, p1, Lg9/b;->g:I

    invoke-direct {p0, v1, p2}, Lg9/a;->g(IF)I

    move-result v3

    .line 12
    iget p1, p1, Lg9/b;->d:I

    invoke-direct {p0, p1, p2}, Lg9/a;->g(IF)I

    move-result v6

    .line 13
    iget-object p1, p0, Lg9/a;->c:Lg9/a$a;

    if-eqz p1, :cond_4

    iget p1, p1, Lg9/a$a;->a:I

    move v4, p1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    const/4 v4, 0x0

    :goto_1
    move-object v1, p0

    move v2, v0

    .line 14
    invoke-direct/range {v1 .. v6}, Lg9/a;->a(IIIII)V

    return-void

    :catch_0
    move-exception p1

    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onGlobalLayout() exception:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.glview.layout"

    invoke-static {p2, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public e(Z)V
    .locals 1

    invoke-virtual {p0}, Lg9/a;->c()Lg9/b;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lg9/a;->d(Lg9/b;Z)V

    return-void
.end method

.method protected f(ZIIII)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onUpdateKeyboardSize() v:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " x:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " y:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " w:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " h:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.glview.layout"

    invoke-static {v1, v0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {p1, p2, p3, p4, p5}, Lcom/roblox/engine/jni/NativeGLInterface;->updateKeyboardSize(ZIIII)V

    return-void
.end method

.method protected h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
