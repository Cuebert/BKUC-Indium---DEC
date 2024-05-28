.class public Lcom/roblox/client/qrscanner/CustomCaptureActivity;
.super Lcom/roblox/client/i0;
.source "SourceFile"


# instance fields
.field private S:Lcom/google/common/util/concurrent/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/m<",
            "Landroidx/camera/lifecycle/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/i0;-><init>()V

    return-void
.end method

.method public static synthetic A1(Lcom/roblox/client/qrscanner/CustomCaptureActivity;Li6/b;Landroidx/camera/core/l1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->J1(Li6/b;Landroidx/camera/core/l1;)V

    return-void
.end method

.method public static synthetic B1(Lcom/roblox/client/qrscanner/CustomCaptureActivity;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->H1(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic C1(Landroidx/camera/core/l1;Lg4/l;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->I1(Landroidx/camera/core/l1;Lg4/l;)V

    return-void
.end method

.method public static synthetic D1(Lcom/roblox/client/qrscanner/CustomCaptureActivity;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->G1(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic E1(Lcom/roblox/client/qrscanner/CustomCaptureActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->K1()V

    return-void
.end method

.method private synthetic G1(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li6/a;

    .line 3
    invoke-virtual {p1}, Li6/a;->b()Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "QrCodeScanResult"

    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    .line 6
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method private synthetic H1(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "QrCodeScanResult"

    const-string v1, ""

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static synthetic I1(Landroidx/camera/core/l1;Lg4/l;)V
    .locals 0

    invoke-interface {p0}, Landroidx/camera/core/l1;->close()V

    return-void
.end method

.method private synthetic J1(Li6/b;Landroidx/camera/core/l1;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Landroidx/camera/core/l1;->J()Landroid/media/Image;

    move-result-object v0

    invoke-interface {p2}, Landroidx/camera/core/l1;->q()Landroidx/camera/core/i1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/i1;->d()I

    move-result v1

    invoke-static {v0, v1}, Lk6/a;->a(Landroid/media/Image;I)Lk6/a;

    move-result-object v0

    .line 2
    invoke-interface {p1, v0}, Li6/b;->N(Lk6/a;)Lg4/l;

    move-result-object p1

    new-instance v0, Lm8/d;

    invoke-direct {v0, p0}, Lm8/d;-><init>(Lcom/roblox/client/qrscanner/CustomCaptureActivity;)V

    .line 3
    invoke-virtual {p1, v0}, Lg4/l;->f(Lg4/h;)Lg4/l;

    move-result-object p1

    new-instance v0, Lm8/c;

    invoke-direct {v0, p0}, Lm8/c;-><init>(Lcom/roblox/client/qrscanner/CustomCaptureActivity;)V

    .line 4
    invoke-virtual {p1, v0}, Lg4/l;->d(Lg4/g;)Lg4/l;

    move-result-object p1

    new-instance v0, Lm8/b;

    invoke-direct {v0, p2}, Lm8/b;-><init>(Landroidx/camera/core/l1;)V

    .line 5
    invoke-virtual {p1, v0}, Lg4/l;->b(Lg4/f;)Lg4/l;

    return-void
.end method

.method private synthetic K1()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->S:Lcom/google/common/util/concurrent/m;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/lifecycle/e;

    .line 2
    invoke-virtual {p0, v0}, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->F1(Landroidx/camera/lifecycle/e;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3
    :catch_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "QrCodeScanResult"

    const-string v2, ""

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method


# virtual methods
.method F1(Landroidx/camera/lifecycle/e;)V
    .locals 9

    .line 1
    new-instance v0, Landroidx/camera/core/z1$b;

    invoke-direct {v0}, Landroidx/camera/core/z1$b;-><init>()V

    .line 2
    invoke-virtual {v0}, Landroidx/camera/core/z1$b;->c()Landroidx/camera/core/z1;

    move-result-object v0

    .line 3
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->s()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Landroidx/camera/core/s$a;

    invoke-direct {v1}, Landroidx/camera/core/s$a;-><init>()V

    .line 5
    invoke-virtual {v1}, Landroidx/camera/core/s$a;->b()Landroidx/camera/core/s;

    move-result-object v1

    goto :goto_0

    .line 6
    :cond_0
    new-instance v1, Landroidx/camera/core/s$a;

    invoke-direct {v1}, Landroidx/camera/core/s$a;-><init>()V

    .line 7
    invoke-virtual {v1, v2}, Landroidx/camera/core/s$a;->d(I)Landroidx/camera/core/s$a;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Landroidx/camera/core/s$a;->b()Landroidx/camera/core/s;

    move-result-object v1

    .line 9
    :goto_0
    sget v3, Lcom/roblox/client/y;->H0:I

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 10
    invoke-virtual {v3}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Landroidx/camera/core/z1$d;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/camera/core/z1;->S(Landroidx/camera/core/z1$d;)V

    .line 11
    new-instance v3, Li6/c$a;

    invoke-direct {v3}, Li6/c$a;-><init>()V

    const/16 v4, 0x100

    const/4 v5, 0x0

    new-array v6, v5, [I

    .line 12
    invoke-virtual {v3, v4, v6}, Li6/c$a;->b(I[I)Li6/c$a;

    move-result-object v3

    .line 13
    invoke-virtual {v3}, Li6/c$a;->a()Li6/c;

    move-result-object v3

    .line 14
    invoke-static {v3}, Li6/d;->a(Li6/c;)Li6/b;

    move-result-object v3

    .line 15
    new-instance v4, Landroidx/camera/core/n0$c;

    invoke-direct {v4}, Landroidx/camera/core/n0$c;-><init>()V

    new-instance v6, Landroid/util/Size;

    const/16 v7, 0x500

    const/16 v8, 0x2d0

    invoke-direct {v6, v7, v8}, Landroid/util/Size;-><init>(II)V

    .line 16
    invoke-virtual {v4, v6}, Landroidx/camera/core/n0$c;->l(Landroid/util/Size;)Landroidx/camera/core/n0$c;

    move-result-object v4

    .line 17
    invoke-virtual {v4, v5}, Landroidx/camera/core/n0$c;->f(I)Landroidx/camera/core/n0$c;

    move-result-object v4

    .line 18
    invoke-virtual {v4}, Landroidx/camera/core/n0$c;->c()Landroidx/camera/core/n0;

    move-result-object v4

    .line 19
    invoke-static {p0}, Landroidx/core/content/a;->f(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v6

    new-instance v7, Lm8/a;

    invoke-direct {v7, p0, v3}, Lm8/a;-><init>(Lcom/roblox/client/qrscanner/CustomCaptureActivity;Li6/b;)V

    invoke-virtual {v4, v6, v7}, Landroidx/camera/core/n0;->Y(Ljava/util/concurrent/Executor;Landroidx/camera/core/n0$a;)V

    const/4 v3, 0x2

    new-array v3, v3, [Landroidx/camera/core/y2;

    aput-object v4, v3, v5

    aput-object v0, v3, v2

    .line 20
    invoke-virtual {p1, p0, v1, v3}, Landroidx/camera/lifecycle/e;->e(Landroidx/lifecycle/l;Landroidx/camera/core/s;[Landroidx/camera/core/y2;)Landroidx/camera/core/k;

    return-void
.end method

.method public backButtonPressed(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finishAfterTransition()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    sget p1, Lcom/roblox/client/a0;->b:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/i0;->setContentView(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "FONT_PATH_MESSAGE"

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-static {p1}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p1

    .line 6
    sget v0, Lcom/roblox/client/y;->G0:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 7
    sget v1, Lcom/roblox/client/y;->g1:I

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 9
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 10
    invoke-static {p0}, Landroidx/camera/lifecycle/e;->f(Landroid/content/Context;)Lcom/google/common/util/concurrent/m;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/qrscanner/CustomCaptureActivity;->S:Lcom/google/common/util/concurrent/m;

    .line 11
    new-instance v0, Lm8/e;

    invoke-direct {v0, p0}, Lm8/e;-><init>(Lcom/roblox/client/qrscanner/CustomCaptureActivity;)V

    .line 12
    invoke-static {p0}, Landroidx/core/content/a;->f(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v1

    .line 13
    invoke-interface {p1, v0, v1}, Lcom/google/common/util/concurrent/m;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
