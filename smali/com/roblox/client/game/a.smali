.class public Lcom/roblox/client/game/a;
.super Lcom/roblox/client/m0;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Lf9/b$e;
.implements Landroid/view/View$OnClickListener;
.implements Le8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/game/a$d;,
        Lcom/roblox/client/game/a$e;,
        Lcom/roblox/client/game/a$c;,
        Lcom/roblox/client/game/a$g;,
        Lcom/roblox/client/game/a$f;
    }
.end annotation


# instance fields
.field public final Q0:Ljava/lang/String;

.field private R0:Lcom/roblox/client/game/a$g;

.field private S0:Landroid/view/SurfaceView;

.field private T0:Landroid/view/View;

.field private U0:Landroid/view/View;

.field private V0:Lf9/e;

.field private W0:Lg9/a;

.field private X0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private Y0:Landroid/os/Handler;

.field private Z0:Lf7/h0;

.field private a1:Z

.field private b1:Lcom/roblox/client/h;

.field private c1:Le8/b;

.field private d1:Lcom/roblox/client/game/a$f;

.field private e1:Lcom/roblox/client/game/a$d;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/m0;-><init>()V

    const-string v0, "AppShellFragment"

    .line 2
    iput-object v0, p0, Lcom/roblox/client/game/a;->Q0:Ljava/lang/String;

    .line 3
    new-instance v0, Lf9/e;

    invoke-direct {v0}, Lf9/e;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/game/a;->V0:Lf9/e;

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roblox/client/game/a;->Y0:Landroid/os/Handler;

    .line 5
    new-instance v0, Lcom/roblox/client/game/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/roblox/client/game/a$d;-><init>(Lcom/roblox/client/game/a;Lcom/roblox/client/game/a$a;)V

    .line 6
    new-instance v1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-object v2, p0, Lcom/roblox/client/game/a;->Y0:Landroid/os/Handler;

    invoke-direct {v1, v2, v0}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;-><init>(Landroid/os/Handler;Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    .line 7
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/roblox/client/game/b;->D(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    .line 8
    new-instance v1, Lcom/roblox/client/h;

    invoke-direct {v1, p0}, Lcom/roblox/client/h;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v1, p0, Lcom/roblox/client/game/a;->b1:Lcom/roblox/client/h;

    .line 9
    new-instance v1, Le8/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Le8/b;-><init>(Le8/a;Z)V

    iput-object v1, p0, Lcom/roblox/client/game/a;->c1:Le8/b;

    .line 10
    iput-object v0, p0, Lcom/roblox/client/game/a;->e1:Lcom/roblox/client/game/a$d;

    return-void
.end method

.method static synthetic A2(Lcom/roblox/client/game/a;)Lcom/roblox/client/game/a$f;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/a;->d1:Lcom/roblox/client/game/a$f;

    return-object p0
.end method

.method static synthetic B2(Lcom/roblox/client/game/a;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/a;->T0:Landroid/view/View;

    return-object p0
.end method

.method static synthetic C2(Lcom/roblox/client/game/a;)Lg9/a;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/a;->W0:Lg9/a;

    return-object p0
.end method

.method static synthetic D2(Lcom/roblox/client/game/a;)Lcom/roblox/client/h;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/a;->b1:Lcom/roblox/client/h;

    return-object p0
.end method

.method static synthetic E2(Lcom/roblox/client/game/a;)Lcom/roblox/client/game/a$g;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/a;->R0:Lcom/roblox/client/game/a$g;

    return-object p0
.end method

.method static synthetic F2(Lcom/roblox/client/game/a;)Lf7/h0;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/a;->Z0:Lf7/h0;

    return-object p0
.end method

.method static synthetic G2(Lcom/roblox/client/game/a;)Le8/b;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/a;->c1:Le8/b;

    return-object p0
.end method

.method private H2()Lg9/a$a;
    .locals 5

    .line 1
    new-instance v0, Lg9/a$a;

    invoke-direct {v0}, Lg9/a$a;-><init>()V

    .line 2
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roblox/client/w;->d:I

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 4
    iget v1, v1, Landroid/util/TypedValue;->data:I

    invoke-static {v1}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lg9/a$a;->a:I

    return-object v0
.end method

.method private J2(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/y;->f0:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/RbxKeyboard;

    .line 2
    invoke-virtual {p1}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 3
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setBackgroundColor(I)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    const-string v1, "SourceSansPro-Regular.ttf"

    invoke-static {p1, v0, v1}, Lcom/roblox/client/components/i;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lf7/d0;

    invoke-direct {v0, p1}, Lf7/d0;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    iput-object v0, p0, Lcom/roblox/client/game/a;->Z0:Lf7/h0;

    return-void
.end method

.method private K2()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/game/a;->H2()Lg9/a$a;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/roblox/client/game/a$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2, v0}, Lcom/roblox/client/game/a$a;-><init>(Lcom/roblox/client/game/a;Landroid/content/Context;Lg9/a$a;)V

    iput-object v1, p0, Lcom/roblox/client/game/a;->W0:Lg9/a;

    .line 3
    new-instance v0, Lcom/roblox/client/game/a$b;

    invoke-direct {v0, p0}, Lcom/roblox/client/game/a$b;-><init>(Lcom/roblox/client/game/a;)V

    iput-object v0, p0, Lcom/roblox/client/game/a;->X0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 4
    iget-object v0, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/a;->X0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private L2(Landroid/view/View;)V
    .locals 1

    const-string p1, "AppShellFragment"

    const-string v0, "initSurfaceView()"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/y;->k1:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceView;

    iput-object p1, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setFocusable(Z)V

    .line 4
    iget-object p1, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setFocusableInTouchMode(Z)V

    .line 5
    iget-object p1, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method private M2()V
    .locals 2

    const-string v0, "AppShellFragment"

    const-string v1, "loadSettings()"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/roblox/client/game/a;->U0:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    invoke-static {}, Lcom/roblox/client/p0;->G0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/client/game/d;->b(Landroid/content/Context;Landroid/app/Activity;)Lcom/roblox/client/game/b$d;

    move-result-object v0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/game/d;->a(Landroid/content/Context;)Lcom/roblox/client/game/b$d;

    move-result-object v0

    .line 6
    :goto_0
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roblox/client/game/b;->j(Lcom/roblox/client/game/b$d;)V

    .line 7
    iget-object v0, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setVisibility(I)V

    return-void
.end method

.method private N2()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->G0()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/b;->h()Lcom/roblox/client/game/b$d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/client/game/b$d;->a:Landroid/app/Activity;

    .line 4
    :cond_0
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/game/b;->F(Landroid/view/Surface;)V

    .line 5
    iget-object v0, p0, Lcom/roblox/client/game/a;->R0:Lcom/roblox/client/game/a$g;

    if-eqz v0, :cond_1

    .line 6
    invoke-interface {v0}, Lcom/roblox/client/game/a$g;->R()V

    :cond_1
    return-void
.end method

.method static synthetic z2(Lcom/roblox/client/game/a;)Landroid/view/SurfaceView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    return-object p0
.end method


# virtual methods
.method public D0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p1, "AppShellFragment"

    const-string p2, "onCreateView:"

    .line 1
    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Lcom/roblox/client/game/a;->L2(Landroid/view/View;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/roblox/client/game/a;->J2(Landroid/view/View;)V

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/game/a;->K2()V

    .line 5
    iget-object p2, p0, Lcom/roblox/client/game/a;->d1:Lcom/roblox/client/game/a$f;

    invoke-interface {p2}, Lcom/roblox/client/s;->a()Z

    move-result p2

    iput-boolean p2, p0, Lcom/roblox/client/game/a;->a1:Z

    if-eqz p2, :cond_0

    .line 6
    invoke-direct {p0}, Lcom/roblox/client/game/a;->N2()V

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p2

    sget p3, Lcom/roblox/client/y;->f1:I

    invoke-virtual {p2, p3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/roblox/client/game/a;->U0:Landroid/view/View;

    .line 8
    sget p3, Lcom/roblox/client/y;->e1:I

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/roblox/client/game/b;->l()Z

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_1

    .line 10
    iget-object p2, p0, Lcom/roblox/client/game/a;->U0:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object p2, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {p2, p3}, Landroid/view/SurfaceView;->setVisibility(I)V

    :goto_0
    return-object p1
.end method

.method public E0()V
    .locals 2

    .line 1
    invoke-static {}, Lw8/k;->A()Z

    move-result v0

    const-string v1, "AppShellFragment"

    if-eqz v0, :cond_0

    const-string v0, "onDestroy: App was previously destroyed due to process death"

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->E0()V

    return-void

    .line 4
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->E0()V

    const-string v0, "onDestroy()"

    .line 5
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object v0, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method public G0()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->G0()V

    const-string v0, "AppShellFragment"

    const-string v1, "onDestroyView()"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/a;->X0:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public H0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/c;->H0()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/roblox/client/game/a;->d1:Lcom/roblox/client/game/a$f;

    return-void
.end method

.method public I2()Landroid/view/Surface;
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/game/a;->a1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public J0(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Z)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onHiddenChanged() hidden:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AppShellFragment"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    .line 3
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/game/b;->t()V

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/roblox/client/game/a;->a1:Z

    if-nez p1, :cond_1

    const-string p1, "onHiddenChanged() surface not yet created - show surface"

    .line 5
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object p1, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/roblox/client/game/a;->U0:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/game/a;->S0:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/roblox/client/game/b;->F(Landroid/view/Surface;)V

    :goto_0
    return-void
.end method

.method public P0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->P0()V

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/game/a;->d1:Lcom/roblox/client/game/a$f;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/roblox/client/s;->z()V

    :cond_0
    return-void
.end method

.method public U0()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->U0()V

    .line 2
    iget-object v0, p0, Lcom/roblox/client/game/a;->U0:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/game/a;->M2()V

    :cond_0
    return-void
.end method

.method public W0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/m0;->W0()V

    .line 2
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    invoke-virtual {v0}, Lx7/g;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/roblox/client/game/a;->e1:Lcom/roblox/client/game/a$d;

    invoke-virtual {v0}, Lcom/roblox/client/game/a$d;->s()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/a;->d1:Lcom/roblox/client/game/a$f;

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {v0}, Lcom/roblox/client/s;->E()V

    .line 6
    :cond_1
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lla/c;->s(Landroid/content/Context;)V

    return-void
.end method

.method public X0()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/roblox/client/m0;->X0()V

    const-string v0, "AppShellFragment"

    const-string v1, "onStop()"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lfa/a;->a()Lfa/a;

    move-result-object v0

    invoke-virtual {v0}, Lfa/a;->c()V

    .line 4
    invoke-static {}, Lla/c;->r()Lla/c;

    move-result-object v0

    invoke-virtual {v0}, Lla/c;->t()V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/game/a;->a1:Z

    return v0
.end method

.method public d()F
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/a;->V0:Lf9/e;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf9/e;->b(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method public m()Lcom/roblox/client/k0;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/k0;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lcom/roblox/client/y;->e1:I

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/roblox/client/m0;->q2()Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/game/a;->M2()V

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p2, "AppShellFragment"

    const-string p3, "surfaceChanged()"

    .line 1
    invoke-static {p2, p3}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Z

    move-result p2

    if-nez p2, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/roblox/client/game/a;->d()F

    move-result p2

    .line 4
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p3

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, Lcom/roblox/client/game/b;->H(Landroid/view/Surface;F)V

    :cond_0
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "AppShellFragment"

    const-string v0, "surfaceCreated()"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/game/a;->a1:Z

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Start the lua app"

    .line 4
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-direct {p0}, Lcom/roblox/client/game/a;->N2()V

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "AppShellFragment"

    const-string v0, "surfaceDestroyed()"

    .line 1
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/roblox/client/game/a;->a1:Z

    .line 3
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/game/b;->G()V

    return-void
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->t0(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object p1

    sget v0, Lcom/roblox/client/y;->l:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/game/a;->T0:Landroid/view/View;

    return-void
.end method

.method public v0(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->v0(Landroid/app/Activity;)V

    .line 2
    instance-of v0, p1, Lcom/roblox/client/game/a$f;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/roblox/client/game/a$f;

    iput-object p1, p0, Lcom/roblox/client/game/a;->d1:Lcom/roblox/client/game/a$f;

    goto :goto_0

    :cond_0
    const-string p1, "AppShellFragment"

    const-string v0, "Error: AppShellFragment cannot find the listener!"

    .line 4
    invoke-static {p1, v0}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public w0(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/c;->w0(Landroid/content/Context;)V

    .line 2
    instance-of v0, p1, Lcom/roblox/client/game/a$g;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/roblox/client/game/a$g;

    iput-object p1, p0, Lcom/roblox/client/game/a;->R0:Lcom/roblox/client/game/a$g;

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must implement OnFragmentInteractionListener"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public z0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lw8/k;->A()Z

    move-result v0

    const-string v1, "AppShellFragment"

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->z0(Landroid/os/Bundle;)V

    return-void

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lcom/roblox/client/m0;->z0(Landroid/os/Bundle;)V

    const-string p1, "onCreate:"

    .line 5
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/roblox/client/game/b;->E(Landroid/content/Context;)V

    .line 7
    invoke-static {}, Lcom/roblox/client/p0;->G0()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roblox/client/game/d;->b(Landroid/content/Context;Landroid/app/Activity;)Lcom/roblox/client/game/b$d;

    move-result-object p1

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/game/d;->a(Landroid/content/Context;)Lcom/roblox/client/game/b$d;

    move-result-object p1

    .line 10
    :goto_0
    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/client/game/b;->j(Lcom/roblox/client/game/b$d;)V

    return-void
.end method
