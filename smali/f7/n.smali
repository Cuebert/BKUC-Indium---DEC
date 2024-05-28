.class public Lf7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/g0;
.implements Le8/a;
.implements Lf7/x$a;
.implements Lba/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/n$e;,
        Lf7/n$f;,
        Lf7/n$d;
    }
.end annotation


# static fields
.field private static N:Z


# instance fields
.field private A:Le8/b;

.field private B:Lcom/roblox/client/n;

.field private C:I

.field private D:J

.field private E:Lf7/j0;

.field private F:Landroid/content/ServiceConnection;

.field private G:Lf7/k0;

.field private H:Lf7/e;

.field private I:Landroid/view/ViewGroup;

.field private J:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private K:J

.field private L:Z

.field private M:Z

.field protected n:Lf7/i0;

.field private final o:Ljava/lang/String;

.field private p:Z

.field private q:Z

.field private r:Landroid/os/CountDownTimer;

.field private s:Lf7/n$d;

.field private final t:Landroid/os/Bundle;

.field private final u:J

.field private final v:Lf7/n$f;

.field private final w:Lf9/e;

.field private x:Lf7/w;

.field private y:Lf7/y;

.field private z:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ExperienceSession"

    .line 2
    iput-object v0, p0, Lf7/n;->o:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lf7/n;->p:Z

    const-wide/16 v1, 0x7530

    .line 4
    iput-wide v1, p0, Lf7/n;->u:J

    .line 5
    new-instance v1, Lf7/n$f;

    invoke-direct {v1, p0}, Lf7/n$f;-><init>(Lf7/n;)V

    iput-object v1, p0, Lf7/n;->v:Lf7/n$f;

    .line 6
    new-instance v1, Lf9/e;

    invoke-direct {v1}, Lf9/e;-><init>()V

    iput-object v1, p0, Lf7/n;->w:Lf9/e;

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lf7/n;->y:Lf7/y;

    .line 8
    iput-object v1, p0, Lf7/n;->F:Landroid/content/ServiceConnection;

    .line 9
    iput-boolean v0, p0, Lf7/n;->L:Z

    .line 10
    iput-boolean v0, p0, Lf7/n;->M:Z

    .line 11
    iput-object p1, p0, Lf7/n;->t:Landroid/os/Bundle;

    return-void
.end method

.method private A()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "Exiting immersive mode"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/i0;

    invoke-virtual {v0}, Lcom/roblox/client/i0;->o1()Lo7/b;

    move-result-object v0

    sget-object v1, Lf7/f0;->o:Lf7/f0;

    invoke-virtual {v0, v1}, Lo7/b;->i(Lf7/f0;)V

    .line 3
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lf7/n;->C:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method private B()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "finishGame:"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/d;

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0}, Lf7/n;->X()V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lf7/n;->y(Z)V

    :cond_0
    return-void
.end method

.method private F()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lf7/n;->B()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lf7/n;->Q(Z)V

    return-void
.end method

.method private G()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/roblox/client/y;->A0:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    .line 3
    new-instance v1, Lf7/k;

    invoke-direct {v1, v0}, Lf7/k;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private H(Landroid/view/View;)V
    .locals 3

    .line 1
    sget v0, Lcom/roblox/client/y;->f0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/RbxKeyboard;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setBackgroundColor(I)V

    .line 3
    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object v0

    const-string v1, "SourceSansPro-Regular.ttf"

    invoke-static {p1, v0, v1}, Lcom/roblox/client/components/i;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lf7/y;

    iget-object v1, p0, Lf7/n;->x:Lf7/w;

    iget-object v2, p0, Lf7/n;->v:Lf7/n$f;

    invoke-direct {v0, p1, v1, v2}, Lf7/y;-><init>(Lcom/roblox/client/RbxKeyboard;Lf7/w;Lf7/n$f;)V

    iput-object v0, p0, Lf7/n;->y:Lf7/y;

    .line 5
    invoke-static {}, Lcom/roblox/client/RobloxApplication;->a()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lf7/n;->y:Lf7/y;

    invoke-virtual {p1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method private synthetic J()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 2
    invoke-direct {p0}, Lf7/n;->X()V

    .line 3
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 4
    invoke-direct {p0}, Lf7/n;->A()V

    return-void
.end method

.method private static synthetic L(Landroid/view/View;)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private synthetic M(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    invoke-direct {p0}, Lf7/n;->F()V

    return-void
.end method

.method private synthetic N(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    invoke-direct {p0}, Lf7/n;->F()V

    return-void
.end method

.method private synthetic O(I)V
    .locals 2

    .line 1
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls7/b;->u(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/roblox/client/c0;->d3:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lf7/i;

    invoke-direct {v1, p0}, Lf7/i;-><init>(Lf7/n;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lf7/h;

    invoke-direct {v0, p0}, Lf7/h;-><init>(Lf7/n;)V

    .line 4
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private synthetic P(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf7/n;->p:Z

    if-nez v0, :cond_0

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    .line 2
    invoke-direct {p0}, Lf7/n;->z()V

    :cond_0
    return-void
.end method

.method private X()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf7/n;->J:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-eqz v0, :cond_0

    const-string v0, "rbx.screen"

    const-string v1, "removing GlobalLayoutListener"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, Lf7/n;->I:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lf7/n;->J:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lf7/n;->J:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    :cond_0
    return-void
.end method

.method private Y()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lf7/n;->D:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lf7/n;->D:J

    sub-long/2addr v0, v2

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Game duration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "ms."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ExperienceSession"

    invoke-static {v3, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v2

    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lx7/e;->u(Landroid/content/Context;J)V

    :cond_0
    return-void
.end method

.method private b0()V
    .locals 9

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->q()Z

    move-result v0

    const-wide/16 v1, 0x7530

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lga/b;->i()Lga/b;

    move-result-object v0

    const-string v3, "Backgrounding.General"

    invoke-virtual {v0, v3}, Lga/b;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 3
    new-instance v3, Lga/a;

    invoke-direct {v3, v0, v1, v2}, Lga/a;-><init>(Lorg/json/JSONObject;J)V

    .line 4
    invoke-virtual {v3}, Lga/a;->a()J

    move-result-wide v1

    :cond_0
    move-wide v5, v1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CountDownTimer constructed with delay:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    new-instance v0, Lf7/n$c;

    const-wide/16 v7, 0x3e8

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lf7/n$c;-><init>(Lf7/n;JJ)V

    .line 7
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    move-result-object v0

    iput-object v0, p0, Lf7/n;->r:Landroid/os/CountDownTimer;

    return-void
.end method

.method private declared-synchronized c0(Z)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lf7/n;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    :try_start_1
    iput-boolean v0, p0, Lf7/n;->L:Z

    .line 4
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->gameForegrounded()V

    if-eqz p1, :cond_1

    .line 5
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOnExperienceSessionResume()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOnFragmentStart()V

    .line 7
    :goto_0
    invoke-static {}, Lia/a;->f()Lia/a;

    move-result-object p1

    invoke-virtual {p1}, Lia/a;->d()V

    .line 8
    iget-object p1, p0, Lf7/n;->G:Lf7/k0;

    if-nez p1, :cond_2

    .line 9
    new-instance p1, Lf7/k0;

    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lf7/k0;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lf7/n;->G:Lf7/k0;

    .line 10
    invoke-virtual {p1}, Lf7/k0;->a()V

    .line 11
    :cond_2
    iget-object p1, p0, Lf7/n;->H:Lf7/e;

    if-nez p1, :cond_3

    .line 12
    new-instance p1, Lf7/e;

    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lf7/e;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lf7/n;->H:Lf7/e;

    .line 13
    invoke-virtual {p1}, Lf7/e;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized d0(Z)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lf7/n;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    :try_start_1
    iput-boolean v0, p0, Lf7/n;->L:Z

    .line 4
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->gameBackgrounded()V

    if-eqz p1, :cond_1

    .line 5
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOnExperienceSessionPause()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOnFragmentStop()V

    .line 7
    :goto_0
    invoke-static {}, Lia/a;->f()Lia/a;

    move-result-object p1

    invoke-virtual {p1}, Lia/a;->e()V

    .line 8
    iget-object p1, p0, Lf7/n;->G:Lf7/k0;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p1}, Lf7/k0;->b()V

    .line 10
    iput-object v0, p0, Lf7/n;->G:Lf7/k0;

    .line 11
    :cond_2
    iget-object p1, p0, Lf7/n;->H:Lf7/e;

    if-eqz p1, :cond_3

    .line 12
    invoke-virtual {p1}, Lf7/e;->r()V

    .line 13
    iput-object v0, p0, Lf7/n;->H:Lf7/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private f0(J)V
    .locals 2

    .line 1
    new-instance v0, Lf7/x;

    iget-object v1, p0, Lf7/n;->y:Lf7/y;

    invoke-direct {v0, p0, v1, p1, p2}, Lf7/x;-><init>(Lf7/x$a;Lf7/h0;J)V

    .line 2
    new-instance p1, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-object p2, p0, Lf7/n;->z:Landroid/os/Handler;

    invoke-direct {p1, p2, v0}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;-><init>(Landroid/os/Handler;Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    .line 3
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setImplementation(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    .line 4
    new-instance p1, Lf7/n$b;

    invoke-direct {p1, p0}, Lf7/n$b;-><init>(Lf7/n;)V

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setExitImplementation(Lcom/roblox/engine/jni/EngineExitJavaCallback2;)V

    return-void
.end method

.method private h0(J)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_7

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->P()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lga/b;->i()Lga/b;

    move-result-object v0

    const-string v2, "Engine.Interactivity.UICreation.NotchScreenSupport"

    invoke-virtual {v0, v2}, Lga/b;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 4
    new-instance v2, Lga/c;

    invoke-direct {v2, v0, p1, p2}, Lga/c;-><init>(Lorg/json/JSONObject;J)V

    .line 5
    invoke-virtual {v2}, Lga/c;->a()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p2

    invoke-interface {p2}, Lc7/e;->i0()Z

    move-result p2

    const/4 v0, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_5

    .line 7
    iget-object p2, p0, Lf7/n;->s:Lf7/n$d;

    if-nez p2, :cond_1

    return-void

    .line 8
    :cond_1
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-nez p2, :cond_2

    return-void

    .line 9
    :cond_2
    invoke-virtual {p2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    if-eqz p1, :cond_4

    .line 10
    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 11
    invoke-virtual {p0}, Lf7/n;->m()Lcom/roblox/client/k0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/k0;->Z0()Lo7/a;

    move-result-object p1

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo7/a;->d(Landroid/view/View;)V

    .line 12
    iget-object p1, p0, Lf7/n;->n:Lf7/i0;

    if-nez p1, :cond_3

    .line 13
    new-instance p1, Lf7/i0;

    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lf7/i0;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lf7/n;->n:Lf7/i0;

    .line 14
    :cond_3
    iget-object p1, p0, Lf7/n;->n:Lf7/i0;

    invoke-virtual {p0}, Lf7/n;->m()Lcom/roblox/client/k0;

    move-result-object p2

    invoke-virtual {p0}, Lf7/n;->m()Lcom/roblox/client/k0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/k0;->Z0()Lo7/a;

    move-result-object v0

    invoke-virtual {v0}, Lo7/a;->a()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lf7/i0;->f(Landroidx/lifecycle/l;Landroidx/lifecycle/LiveData;)V

    goto :goto_1

    .line 15
    :cond_4
    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 16
    invoke-static {}, Lpa/a;->b()Lpa/a;

    move-result-object p1

    invoke-virtual {p1, v2, v2, v2, v2}, Lpa/a;->a(FFFF)V

    goto :goto_1

    :cond_5
    if-eqz p1, :cond_6

    .line 17
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    .line 18
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    .line 19
    invoke-virtual {p0}, Lf7/n;->m()Lcom/roblox/client/k0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/k0;->Z0()Lo7/a;

    move-result-object p1

    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo7/a;->d(Landroid/view/View;)V

    .line 20
    new-instance p1, Lf7/i0;

    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lf7/i0;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lf7/n;->n:Lf7/i0;

    .line 21
    invoke-virtual {p0}, Lf7/n;->m()Lcom/roblox/client/k0;

    move-result-object p2

    invoke-virtual {p0}, Lf7/n;->m()Lcom/roblox/client/k0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/k0;->Z0()Lo7/a;

    move-result-object v0

    invoke-virtual {v0}, Lo7/a;->a()Landroidx/lifecycle/LiveData;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lf7/i0;->f(Landroidx/lifecycle/l;Landroidx/lifecycle/LiveData;)V

    goto :goto_1

    .line 22
    :cond_6
    invoke-static {}, Lpa/a;->b()Lpa/a;

    move-result-object p1

    invoke-virtual {p1, v2, v2, v2, v2}, Lpa/a;->a(FFFF)V

    :cond_7
    :goto_1
    return-void
.end method

.method public static synthetic l(Lf7/n;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0, p1}, Lf7/n;->N(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic n(Lf7/n;I)V
    .locals 0

    invoke-direct {p0, p1}, Lf7/n;->P(I)V

    return-void
.end method

.method public static synthetic o(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lf7/n;->L(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lf7/n;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lf7/n;->M(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic r(Lf7/n;)V
    .locals 0

    invoke-direct {p0}, Lf7/n;->J()V

    return-void
.end method

.method public static synthetic s(Lf7/n;I)V
    .locals 0

    invoke-direct {p0, p1}, Lf7/n;->O(I)V

    return-void
.end method

.method static synthetic t(Lf7/n;)Landroid/view/ViewGroup;
    .locals 0

    iget-object p0, p0, Lf7/n;->I:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic u(Lf7/n;)V
    .locals 0

    invoke-direct {p0}, Lf7/n;->B()V

    return-void
.end method

.method static synthetic v(Lf7/n;)V
    .locals 0

    invoke-direct {p0}, Lf7/n;->x()V

    return-void
.end method

.method private w()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "GameSession cancelScheduledGameExit"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/n;->r:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lf7/n;->r:Landroid/os/CountDownTimer;

    :cond_0
    return-void
.end method

.method private x()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string v0, "ExperienceSession"

    const-string v2, "endGameInBackground: call finish() on this GL activity."

    .line 2
    invoke-static {v0, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0, v1}, Lf7/n;->y(Z)V

    :cond_0
    const-string v0, "ES.endGameInBackground"

    .line 4
    invoke-static {v1, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    .line 5
    invoke-virtual {p0, v1}, Lf7/n;->Q(Z)V

    return-void
.end method

.method private z()V
    .locals 3

    const-string v0, "ExperienceSession"

    const-string v1, "Entering immersive mode"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "System visibility "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lf7/n;->C:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget v0, p0, Lf7/n;->C:I

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    iput v0, p0, Lf7/n;->C:I

    .line 5
    :cond_0
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1706

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 6
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/ActivityNativeMain;

    invoke-virtual {v0}, Lcom/roblox/client/i0;->o1()Lo7/b;

    move-result-object v0

    sget-object v1, Lf7/f0;->n:Lf7/f0;

    invoke-virtual {v0, v1}, Lo7/b;->i(Lf7/f0;)V

    .line 7
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/ActivityNativeMain;

    invoke-virtual {v0}, Lcom/roblox/client/i0;->o1()Lo7/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Lo7/b;->b(IIII)V

    return-void
.end method


# virtual methods
.method public C()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lf7/n;->s:Lf7/n$d;

    invoke-interface {v0}, Lf7/n$d;->f0()Landroidx/fragment/app/d;

    move-result-object v0

    return-object v0
.end method

.method public D()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lf7/n;->s:Lf7/n$d;

    invoke-interface {v0}, Lf7/n$d;->f0()Landroidx/fragment/app/d;

    move-result-object v0

    return-object v0
.end method

.method public E()F
    .locals 2

    iget-object v0, p0, Lf7/n;->w:Lf9/e;

    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf9/e;->b(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method public I()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf7/n;->s:Lf7/n$d;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/roblox/client/s;->a()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public K(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public Q(Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGameEnded: success = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", hasGameStarted = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lf7/n;->q:Z

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ExperienceSession"

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lf7/n;->q:Z

    return-void
.end method

.method public R()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSurfaceCreated: finished = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lf7/n;->p:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    const-string v1, "ES.onSurfaceCreated"

    .line 2
    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    return-void
.end method

.method public S()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSurfaceDestroyed: finished = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lf7/n;->p:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lf7/n;->L:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Call init, starting foreground service "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    move-object p5, p6

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p3

    invoke-virtual {p3}, Lb9/c;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 5
    :goto_0
    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object p3

    .line 6
    invoke-static {p3, p2, p5, p1}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 7
    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Landroidx/core/content/a;->k(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_2
    const-string p1, "Init call does not represent current user"

    .line 8
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public U()V
    .locals 3

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->z0()Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "ExperienceSession"

    if-eqz v0, :cond_0

    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object v0

    invoke-virtual {v0}, Lba/g;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Not pausing game session, user is in a call"

    .line 2
    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iput-boolean v1, p0, Lf7/n;->M:Z

    return-void

    :cond_0
    const-string v0, "Pause game session"

    .line 4
    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object v0, p0, Lf7/n;->B:Lcom/roblox/client/n;

    invoke-virtual {v0}, Lcom/roblox/client/n;->q()Lp8/a;

    move-result-object v0

    invoke-virtual {v0}, Lp8/a;->d()V

    .line 6
    invoke-direct {p0, v1}, Lf7/n;->d0(Z)V

    .line 7
    invoke-direct {p0}, Lf7/n;->b0()V

    .line 8
    invoke-direct {p0}, Lf7/n;->X()V

    return-void
.end method

.method public V(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lf7/n;->z:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lf7/n;->L:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Call active, starting foreground service "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    move-object p5, p6

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p3

    invoke-virtual {p3}, Lb9/c;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 5
    :goto_0
    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object p3

    .line 6
    invoke-static {p3, p2, p5, p1}, Lcom/roblox/client/pushnotification/v2/RealtimeNotificationForegroundService;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    .line 7
    invoke-virtual {p0}, Lf7/n;->D()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Landroidx/core/content/a;->k(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_2
    const-string p1, "Active call does not represent current user"

    .line 8
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public Z()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "Resume game session"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lf7/n;->M:Z

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, v0}, Lf7/n;->c0(Z)V

    .line 4
    invoke-direct {p0}, Lf7/n;->w()V

    .line 5
    iget-object v0, p0, Lf7/n;->B:Lcom/roblox/client/n;

    invoke-virtual {v0}, Lcom/roblox/client/n;->q()Lp8/a;

    move-result-object v0

    invoke-virtual {v0}, Lp8/a;->e()V

    return-void
.end method

.method public a(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf7/n;->E:Lf7/j0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lf7/n$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lf7/n$e;-><init>(Lf7/n;Lf7/n$a;)V

    iput-object v0, p0, Lf7/n;->E:Lf7/j0;

    .line 3
    :cond_0
    iget-object v0, p0, Lf7/n;->E:Lf7/j0;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/a;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public a0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lf7/n;->s:Lf7/n$d;

    invoke-interface {v0, p1}, Lcom/roblox/client/s;->b(Z)V

    return-void
.end method

.method public c(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf7/n;->A:Le8/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Le8/b;->i(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(I)V
    .locals 1

    new-instance v0, Lf7/m;

    invoke-direct {v0, p0, p1}, Lf7/m;-><init>(Lf7/n;I)V

    invoke-virtual {p0, v0}, Lf7/n;->V(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGameStarted: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ExperienceSession"

    invoke-static {p2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lf7/n;->q:Z

    .line 3
    iget-object p1, p0, Lf7/n;->B:Lcom/roblox/client/n;

    invoke-virtual {p1}, Lcom/roblox/client/n;->q()Lp8/a;

    move-result-object p1

    invoke-virtual {p1}, Lp8/a;->a()V

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lf7/n;->s:Lf7/n$d;

    if-eqz p1, :cond_0

    .line 6
    invoke-interface {p1}, Lf7/n$d;->o()V

    :cond_0
    return-void
.end method

.method public e0(Lf7/n$d;)V
    .locals 0

    iput-object p1, p0, Lf7/n;->s:Lf7/n$d;

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf7/n;->s:Lf7/n$d;

    invoke-interface {v0}, Lf7/n$d;->f0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, Lcom/roblox/client/g;->g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public g()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "onSettingsNotLoaded (detected from Game fragment)"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lf7/n;->y(Z)V

    :cond_0
    return-void
.end method

.method public g0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lf7/n;->M:Z

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lf7/n;->z:Landroid/os/Handler;

    new-instance p2, Lf7/n$a;

    invoke-direct {p2, p0}, Lf7/n$a;-><init>(Lf7/n;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lf7/n;->M:Z

    :cond_0
    return-void
.end method

.method public h(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGameLoaded: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/n;->y:Lf7/y;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1, p2}, Lf7/y;->C(J)V

    .line 4
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lf7/n;->D:J

    return-void
.end method

.method public i(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGameStarting: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ExperienceSession"

    invoke-static {p2, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lf7/n;->B:Lcom/roblox/client/n;

    invoke-virtual {p1}, Lcom/roblox/client/n;->q()Lp8/a;

    move-result-object p1

    invoke-virtual {p1}, Lp8/a;->b()V

    return-void
.end method

.method public i0()V
    .locals 6

    const-string v0, "ExperienceSession"

    const-string v1, "Start game session"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lf7/n;->z:Landroid/os/Handler;

    .line 3
    new-instance v0, Le8/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Le8/b;-><init>(Le8/a;Z)V

    iput-object v0, p0, Lf7/n;->A:Le8/b;

    .line 4
    invoke-direct {p0}, Lf7/n;->z()V

    .line 5
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v2, Lf7/j;

    invoke-direct {v2, p0}, Lf7/j;-><init>(Lf7/n;)V

    .line 7
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    .line 8
    invoke-direct {p0}, Lf7/n;->G()V

    .line 9
    iget-object v0, p0, Lf7/n;->t:Landroid/os/Bundle;

    .line 10
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v2

    sget v3, Lcom/roblox/client/y;->f:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lf7/n;->I:Landroid/view/ViewGroup;

    .line 11
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->m0()Z

    move-result v2

    const-wide/16 v3, 0x0

    if-nez v2, :cond_0

    .line 12
    invoke-direct {p0, v3, v4}, Lf7/n;->h0(J)V

    .line 13
    invoke-static {}, Lf7/j0;->j()Z

    move-result v2

    if-nez v2, :cond_0

    .line 14
    iget-object v2, p0, Lf7/n;->s:Lf7/n$d;

    invoke-interface {v2}, Lcom/roblox/client/s;->E()V

    .line 15
    :cond_0
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v2

    iput-object v2, p0, Lf7/n;->B:Lcom/roblox/client/n;

    .line 16
    new-instance v2, Lf7/c0;

    invoke-direct {v2, v0}, Lf7/c0;-><init>(Landroid/os/Bundle;)V

    const-string v5, "roblox_placeId"

    .line 17
    invoke-virtual {v0, v5, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Lf7/n;->K:J

    .line 18
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->m0()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    iget-wide v3, p0, Lf7/n;->K:J

    invoke-direct {p0, v3, v4}, Lf7/n;->h0(J)V

    .line 20
    invoke-static {}, Lf7/j0;->j()Z

    move-result v0

    if-nez v0, :cond_1

    .line 21
    iget-object v0, p0, Lf7/n;->s:Lf7/n$d;

    invoke-interface {v0}, Lcom/roblox/client/s;->E()V

    .line 22
    :cond_1
    invoke-static {}, Lcom/roblox/client/p0;->W0()V

    .line 23
    sget-boolean v0, Lf7/n;->N:Z

    if-nez v0, :cond_2

    .line 24
    sput-boolean v1, Lf7/n;->N:Z

    .line 25
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeGameGlobalInit()V

    .line 26
    :cond_2
    invoke-static {}, Lcom/roblox/client/p0;->V0()V

    .line 27
    new-instance v0, Lf7/w;

    invoke-direct {v0, p0, v2}, Lf7/w;-><init>(Lf7/n;Lf7/c0;)V

    iput-object v0, p0, Lf7/n;->x:Lf7/w;

    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1, v1, v1}, Lf7/w;->A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 29
    iget-object v0, p0, Lf7/n;->I:Landroid/view/ViewGroup;

    invoke-direct {p0, v0}, Lf7/n;->H(Landroid/view/View;)V

    .line 30
    iget-wide v0, p0, Lf7/n;->K:J

    invoke-direct {p0, v0, v1}, Lf7/n;->f0(J)V

    .line 31
    iget-object v0, p0, Lf7/n;->y:Lf7/y;

    iput-object v0, p0, Lf7/n;->J:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 32
    iget-object v0, p0, Lf7/n;->I:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lf7/n;->J:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, v0}, Lf7/n;->c0(Z)V

    .line 34
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationBackgrounded()V

    .line 35
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 36
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lba/g;->g(Lba/g$a;)V

    return-void
.end method

.method public j(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf7/n;->A:Le8/b;

    invoke-virtual {v0, p1, p2, p3}, Le8/b;->g(JLjava/lang/String;)V

    return-void
.end method

.method public k(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf7/n;->A:Le8/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Le8/b;->h(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public m()Lcom/roblox/client/k0;
    .locals 1

    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/i0;

    return-object v0
.end method

.method public p(Ljava/lang/String;Z)V
    .locals 0

    return-void
.end method

.method public y(Z)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ending game session with place ID "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lf7/n;->K:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lf7/n;->M:Z

    .line 3
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object v2

    invoke-virtual {v2, p0}, Lba/g;->x(Lba/g$a;)V

    if-nez p1, :cond_0

    .line 4
    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationForegrounded()V

    .line 5
    :cond_0
    invoke-direct {p0, v0}, Lf7/n;->d0(Z)V

    .line 6
    iget-boolean v0, p0, Lf7/n;->p:Z

    if-eqz v0, :cond_1

    const-string p1, "Trying to end the session but it has already ended."

    .line 7
    invoke-static {v1, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lf7/n;->p:Z

    .line 9
    invoke-direct {p0}, Lf7/n;->Y()V

    .line 10
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const/16 v3, 0x66

    const-string v4, "gameExitStatus"

    .line 11
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 12
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v3

    xor-int/2addr v0, v3

    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onDestroy: shutdown = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", hasGameStarted = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Lf7/n;->q:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_3

    .line 14
    iget-boolean v0, p0, Lf7/n;->q:Z

    if-eqz v0, :cond_3

    const-string v0, "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there..."

    .line 15
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_2

    .line 16
    iget-object p1, p0, Lf7/n;->x:Lf7/w;

    invoke-virtual {p1}, Lf7/w;->k()V

    goto :goto_0

    .line 17
    :cond_2
    iget-object p1, p0, Lf7/n;->x:Lf7/w;

    invoke-virtual {p1}, Lf7/w;->D()V

    .line 18
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object p1

    new-instance v0, Lf7/l;

    invoke-direct {v0, p0}, Lf7/l;-><init>(Lf7/n;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    .line 19
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setExitImplementation(Lcom/roblox/engine/jni/EngineExitJavaCallback2;)V

    .line 20
    iget-object p1, p0, Lf7/n;->s:Lf7/n$d;

    invoke-interface {p1, v2}, Lf7/n$d;->F(Landroid/os/Bundle;)V

    .line 21
    invoke-static {}, Lcom/roblox/client/RobloxApplication;->a()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lf7/n;->y:Lf7/y;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 22
    iget-wide v0, p0, Lf7/n;->K:J

    const-string p1, "SessionReporterState_GameExit"

    invoke-static {p1, v0, v1}, Lq8/a;->b(Ljava/lang/String;J)V

    return-void
.end method
