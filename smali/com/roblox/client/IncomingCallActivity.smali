.class public Lcom/roblox/client/IncomingCallActivity;
.super Landroidx/appcompat/app/c;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/p;
.implements Lba/g$a;


# instance fields
.field private E:J

.field private F:Ljava/lang/String;

.field private G:Landroid/widget/ImageView;

.field private H:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method public static synthetic S0(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/IncomingCallActivity;->V0(Landroid/content/Intent;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic T0(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/IncomingCallActivity;->W0(Landroid/content/Intent;Landroid/view/View;)V

    return-void
.end method

.method public static U0(Landroid/content/Context;Landroid/content/Intent;Landroid/content/Intent;JLjava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/IncomingCallActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "EXTRA_ACCEPT_INTENT"

    .line 2
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_DECLINE_INTENT"

    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_CALLER_ID"

    .line 4
    invoke-virtual {p0, p1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object p0

    const-string p1, "EXTRA_CALLER_COMBINED_NAME"

    .line 5
    invoke-virtual {p0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private synthetic V0(Landroid/content/Intent;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic W0(Landroid/content/Intent;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const-string p1, "keyguard"

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/KeyguardManager;

    .line 3
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p2, v0, :cond_0

    const/4 p2, 0x0

    .line 4
    invoke-virtual {p1, p0, p2}, Landroid/app/KeyguardManager;->requestDismissKeyguard(Landroid/app/Activity;Landroid/app/KeyguardManager$KeyguardDismissCallback;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public K(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public L(Landroid/view/View;Landroidx/core/view/g0;)Landroidx/core/view/g0;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/core/view/g0$m;->c()I

    move-result v0

    invoke-static {}, Landroidx/core/view/g0$m;->d()I

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p2, v0}, Landroidx/core/view/g0;->f(I)Landroidx/core/graphics/b;

    move-result-object p2

    .line 2
    iget v0, p2, Landroidx/core/graphics/b;->b:I

    iget p2, p2, Landroidx/core/graphics/b;->d:I

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0, v1, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 3
    sget-object p1, Landroidx/core/view/g0;->b:Landroidx/core/view/g0;

    return-object p1
.end method

.method public T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public g0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onAvatarHeadshotsRetrievedEvent(La7/b;)V
    .locals 2
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    invoke-virtual {p1}, La7/b;->a()Ljava/util/ArrayList;

    move-result-object p1

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lt6/b;->b()Lt6/b;

    move-result-object p1

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-virtual {p1, v0, v1}, Lt6/b;->d(J)Lt6/a;

    move-result-object p1

    .line 3
    invoke-static {p0}, Lqa/t;->p(Landroid/content/Context;)Lqa/t;

    move-result-object v0

    invoke-virtual {p1}, Lt6/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqa/t;->k(Ljava/lang/String;)Lqa/x;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->G:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lqa/x;->c(Landroid/widget/ImageView;)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/d;->onCreate(Landroid/os/Bundle;)V

    .line 2
    sget p1, Lcom/roblox/client/a0;->c:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/core/view/f0;->a(Landroid/view/Window;Z)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "EXTRA_CALLER_ID"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "EXTRA_CALLER_COMBINED_NAME"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/IncomingCallActivity;->F:Ljava/lang/String;

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "EXTRA_ACCEPT_INTENT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v3, "EXTRA_DECLINE_INTENT"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    .line 10
    sget v3, Lcom/roblox/client/y;->k0:I

    invoke-virtual {p0, v3}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v4, Lcom/roblox/client/o;

    invoke-direct {v4, p0, v0}, Lcom/roblox/client/o;-><init>(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    sget v0, Lcom/roblox/client/y;->i0:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v3, Lcom/roblox/client/p;

    invoke-direct {v3, p0, p1}, Lcom/roblox/client/p;-><init>(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    sget p1, Lcom/roblox/client/y;->j0:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 13
    invoke-static {p1, p0}, Landroidx/core/view/v;->B0(Landroid/view/View;Landroidx/core/view/p;)V

    .line 14
    sget p1, Lcom/roblox/client/y;->l0:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/roblox/client/IncomingCallActivity;->G:Landroid/widget/ImageView;

    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 16
    sget p1, Lcom/roblox/client/y;->m0:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/roblox/client/IncomingCallActivity;->H:Landroid/widget/TextView;

    .line 17
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->R()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 18
    iget-object p1, p0, Lcom/roblox/client/IncomingCallActivity;->H:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roblox/client/IncomingCallActivity;->F:Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1b

    if-lt p1, v3, :cond_1

    .line 20
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setShowWhenLocked(Z)V

    .line 21
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTurnScreenOn(Z)V

    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const v0, 0x680081

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 23
    :goto_0
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lbc/c;->n(Ljava/lang/Object;)V

    .line 24
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lba/g;->g(Lba/g$a;)V

    .line 25
    iget-wide v3, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    cmp-long p1, v3, v1

    if-lez p1, :cond_5

    .line 26
    invoke-static {}, Lt6/b;->b()Lt6/b;

    move-result-object p1

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-virtual {p1, v0, v1}, Lt6/b;->d(J)Lt6/a;

    move-result-object p1

    if-nez p1, :cond_2

    .line 27
    invoke-static {}, Lx7/f;->b()Lcom/birbit/android/jobqueue/g;

    move-result-object p1

    new-instance v0, Lq7/e;

    iget-wide v1, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-direct {v0, v1, v2}, Lq7/e;-><init>(J)V

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/g;->c(Lcom/birbit/android/jobqueue/e;)V

    goto :goto_1

    .line 28
    :cond_2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->R()Z

    move-result v0

    if-nez v0, :cond_3

    .line 29
    iget-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->H:Landroid/widget/TextView;

    invoke-virtual {p1}, Lt6/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    :cond_3
    invoke-virtual {p1}, Lt6/a;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    .line 31
    invoke-static {}, Lx7/f;->b()Lcom/birbit/android/jobqueue/g;

    move-result-object p1

    new-instance v0, Lq7/c;

    iget-wide v1, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-direct {v0, v1, v2}, Lq7/c;-><init>(J)V

    invoke-virtual {p1, v0}, Lcom/birbit/android/jobqueue/g;->c(Lcom/birbit/android/jobqueue/e;)V

    goto :goto_1

    .line 32
    :cond_4
    invoke-static {p0}, Lqa/t;->p(Landroid/content/Context;)Lqa/t;

    move-result-object v0

    invoke-virtual {p1}, Lt6/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqa/t;->k(Ljava/lang/String;)Lqa/x;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->G:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lqa/x;->c(Landroid/widget/ImageView;)V

    :cond_5
    :goto_1
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/c;->onDestroy()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setShowWhenLocked(Z)V

    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTurnScreenOn(Z)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x680081

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    :goto_0
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->G:Landroid/widget/ImageView;

    .line 7
    iput-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->H:Landroid/widget/TextView;

    .line 8
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->p(Ljava/lang/Object;)V

    .line 9
    invoke-static {}, Lba/g;->y()Lba/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lba/g;->x(Lba/g$a;)V

    return-void
.end method

.method public onUserRetrievedEvent(La7/n;)V
    .locals 4
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-virtual {p1}, La7/n;->a()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->R()Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lt6/b;->b()Lt6/b;

    move-result-object p1

    iget-wide v0, p0, Lcom/roblox/client/IncomingCallActivity;->E:J

    invoke-virtual {p1, v0, v1}, Lt6/b;->d(J)Lt6/a;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/roblox/client/IncomingCallActivity;->H:Landroid/widget/TextView;

    invoke-virtual {p1}, Lt6/a;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public p(Ljava/lang/String;Z)V
    .locals 0

    return-void
.end method
