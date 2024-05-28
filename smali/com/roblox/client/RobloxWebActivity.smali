.class public Lcom/roblox/client/RobloxWebActivity;
.super Lcom/roblox/client/i0;
.source "SourceFile"

# interfaces
.implements Lx7/d$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/RobloxWebActivity$DataModelFocusLifecycleObserver;
    }
.end annotation


# instance fields
.field protected S:I

.field protected T:I

.field protected U:Landroidx/appcompat/widget/Toolbar;

.field private V:Lcom/roblox/client/RobloxWebActivity$DataModelFocusLifecycleObserver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/i0;-><init>()V

    .line 2
    new-instance v0, Lcom/roblox/client/RobloxWebActivity$DataModelFocusLifecycleObserver;

    invoke-direct {v0, p0}, Lcom/roblox/client/RobloxWebActivity$DataModelFocusLifecycleObserver;-><init>(Lcom/roblox/client/RobloxWebActivity;)V

    iput-object v0, p0, Lcom/roblox/client/RobloxWebActivity;->V:Lcom/roblox/client/RobloxWebActivity$DataModelFocusLifecycleObserver;

    return-void
.end method

.method private A1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "FEATURE_EXTRA"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "PATH_EXTRA"

    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private B1(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-class v1, Lcom/roblox/client/t0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/t0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/t0;

    invoke-virtual {v0, p1}, Lcom/roblox/client/t0;->X2(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private D1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-class v1, Lcom/roblox/client/t0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/t0;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/t0;

    invoke-virtual {v0}, Lcom/roblox/client/t0;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method public C1(JJ)V
    .locals 5

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "FEATURE_EXTRA"

    const-string v2, "CHAT_TAG"

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-wide/16 v1, -0x1

    cmp-long v3, p1, v1

    if-eqz v3, :cond_0

    const-string v4, "CONVERSATION_ID_EXTRA"

    .line 3
    invoke-virtual {v0, v4, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    :cond_0
    cmp-long p1, p3, v1

    if-eqz p1, :cond_1

    const-string p2, "USER_ID_EXTRA"

    .line 4
    invoke-virtual {v0, p2, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    :cond_1
    if-nez p1, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    const/4 p1, -0x1

    .line 5
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 6
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public U(Ly8/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    check-cast v0, Lcom/roblox/client/components/RobloxToolbar;

    invoke-virtual {v0, p1}, Lcom/roblox/client/components/RobloxToolbar;->U(Ly8/f;)V

    .line 2
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->U(Ly8/f;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-class v1, Lcom/roblox/client/t0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/t0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/roblox/client/t0;->Q2()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    :cond_0
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 4
    iget v0, p0, Lcom/roblox/client/RobloxWebActivity;->S:I

    iget v1, p0, Lcom/roblox/client/RobloxWebActivity;->T:I

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    :cond_1
    return-void
.end method

.method public onCloseOverlayEvent(La7/d;)V
    .locals 0
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Lcom/roblox/client/i0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    sget p1, Lcom/roblox/client/a0;->i:I

    invoke-virtual {p0, p1}, Lcom/roblox/client/i0;->setContentView(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v0, "URL_EXTRA"

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "TITLE_EXTRA"

    .line 5
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA"

    .line 6
    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    const-string v4, "USE_GENERIC_WEB_FRAG_EXTRA"

    .line 7
    invoke-virtual {p1, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    goto :goto_0

    :cond_0
    move-object v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto/16 :goto_4

    .line 9
    :cond_1
    sget v5, Lcom/roblox/client/y;->t1:I

    invoke-virtual {p0, v5}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroidx/appcompat/widget/Toolbar;

    iput-object v5, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    .line 10
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    if-eqz v4, :cond_2

    .line 11
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roblox/client/n;->b()Le7/b;

    move-result-object v4

    const-string v6, "TITLE_STRING"

    .line 12
    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    const-string v6, "HAS_PARENT"

    .line 13
    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "HIDE_ACCESSORY_BUTTONS_EXTRA"

    .line 14
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    const-string v6, "HIDE_ACCESSORY_BUTTONS"

    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "SEARCH_PARAMS"

    .line 15
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v2, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object v2, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 17
    iput v1, p0, Lcom/roblox/client/RobloxWebActivity;->S:I

    .line 18
    iput v1, p0, Lcom/roblox/client/RobloxWebActivity;->T:I

    goto :goto_3

    .line 19
    :cond_2
    new-instance v4, Lcom/roblox/client/t0;

    invoke-direct {v4}, Lcom/roblox/client/t0;-><init>()V

    .line 20
    iget-object v6, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    sget v2, Lcom/roblox/client/c0;->J2:I

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v6, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 21
    invoke-static {}, Lcom/roblox/client/p0;->n0()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 22
    iget-object v2, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    invoke-static {p0}, Lcom/roblox/client/p0;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 23
    :cond_4
    iget-object v2, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    instance-of v6, v2, Lcom/roblox/client/components/RobloxToolbar;

    if-eqz v6, :cond_5

    .line 24
    check-cast v2, Lcom/roblox/client/components/RobloxToolbar;

    new-instance v6, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v6}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    invoke-virtual {v2, v6}, Lcom/roblox/client/components/RobloxToolbar;->setIconDelegate(Lcom/roblox/client/components/RobloxToolbar$e;)V

    goto :goto_2

    .line 25
    :cond_5
    sget v6, Lcom/roblox/client/x;->m:I

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 26
    :goto_2
    iget-object v2, p0, Lcom/roblox/client/RobloxWebActivity;->U:Landroidx/appcompat/widget/Toolbar;

    new-instance v6, Lcom/roblox/client/RobloxWebActivity$a;

    invoke-direct {v6, p0}, Lcom/roblox/client/RobloxWebActivity$a;-><init>(Lcom/roblox/client/RobloxWebActivity;)V

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUserGameSettingsGetReducedMotion()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 28
    iput v1, p0, Lcom/roblox/client/RobloxWebActivity;->S:I

    .line 29
    iput v1, p0, Lcom/roblox/client/RobloxWebActivity;->T:I

    goto :goto_3

    :cond_6
    const/high16 v2, 0x10a0000

    .line 30
    iput v2, p0, Lcom/roblox/client/RobloxWebActivity;->S:I

    .line 31
    sget v2, Lcom/roblox/client/t;->a:I

    iput v2, p0, Lcom/roblox/client/RobloxWebActivity;->T:I

    :goto_3
    if-eqz v3, :cond_7

    .line 32
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->f()Landroidx/lifecycle/f;

    move-result-object v2

    iget-object v3, p0, Lcom/roblox/client/RobloxWebActivity;->V:Lcom/roblox/client/RobloxWebActivity$DataModelFocusLifecycleObserver;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/k;)V

    .line 33
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/t;

    move-result-object v2

    const-string v3, "DEFAULT_URL"

    .line 34
    invoke-virtual {v5, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "USING_LOGIN_WEB_URL"

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    .line 36
    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    invoke-virtual {v4, v5}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 38
    sget p1, Lcom/roblox/client/y;->H1:I

    const-class v0, Lcom/roblox/client/t0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v4, v0}, Landroidx/fragment/app/t;->c(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/t;

    .line 39
    invoke-virtual {v2}, Landroidx/fragment/app/t;->h()I

    :goto_4
    return-void
.end method

.method public onNavigateToConversationEvent(La7/h;)V
    .locals 4
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RWF.onNavigateToConversationEvent() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, La7/h;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, La7/h;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxActivity"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-wide v0, p1, La7/h;->a:J

    iget-wide v2, p1, La7/h;->b:J

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/roblox/client/RobloxWebActivity;->C1(JJ)V

    return-void
.end method

.method public onNavigateToFeatureEvent(La7/i;)V
    .locals 2
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v1, "ABUSE_REPORT_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p1, La7/i;->b:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/roblox/client/g;->d(Landroid/app/Activity;Ljava/lang/String;Z)V

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v1, "FRIEND_FINDER_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    const-string v1, "UNIVERSAL_FRIENDS_TAG"

    .line 4
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p1, La7/i;->a:Ljava/lang/String;

    iget-object p1, p1, La7/i;->b:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/roblox/client/RobloxWebActivity;->A1(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 6
    :cond_2
    :goto_0
    invoke-static {}, Lcom/roblox/client/p0;->N()Ljava/lang/String;

    move-result-object p1

    .line 7
    sget v0, Lcom/roblox/client/c0;->Q2:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{\"searchType\":\"Players\"}"

    .line 8
    invoke-static {p0, p1, v0, v1}, Lcom/roblox/client/g;->g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public onNavigateToLuaEvent(Lcom/roblox/client/t0$e;)V
    .locals 0
    .annotation runtime Lbc/j;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onPushNotificationRegistrationFailedEvent(La7/k;)V
    .locals 1
    .annotation runtime Lbc/j;
    .end annotation

    .line 1
    invoke-virtual {p1}, La7/k;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PushNotificationRegistrationFailed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    sget p1, Lcom/roblox/client/c0;->e4:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 3
    invoke-direct {p0}, Lcom/roblox/client/RobloxWebActivity;->D1()V

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/roblox/client/i0;->onStart()V

    .line 2
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lx7/d;->b(Lx7/d$e;)V

    .line 3
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->n(Ljava/lang/Object;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 1
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lx7/d;->g(Lx7/d$e;)V

    .line 2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbc/c;->p(Ljava/lang/Object;)V

    .line 3
    invoke-super {p0}, Lcom/roblox/client/i0;->onStop()V

    return-void
.end method

.method public onWebSearchEvent(La7/p;)V
    .locals 2
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RWA.onWebSearchEvent() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, La7/p;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxActivity"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget v0, p1, La7/p;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p1, La7/p;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/roblox/client/p0;->K0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p1, La7/p;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/roblox/client/p0;->I0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_2
    iget-object p1, p1, La7/p;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/roblox/client/p0;->J0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_3
    iget-object p1, p1, La7/p;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/roblox/client/p0;->L0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_4

    .line 7
    invoke-static {p0}, Lcom/roblox/client/d1;->i(Landroid/app/Activity;)V

    .line 8
    invoke-direct {p0, p1}, Lcom/roblox/client/RobloxWebActivity;->B1(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public q(ILandroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0x65

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "FEATURE_EXTRA"

    const-string v1, "LAUNCH_GAME"

    .line 2
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "game_init_params"

    .line 3
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 p2, -0x1

    .line 4
    invoke-virtual {p0, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_1
    const-string p1, "RobloxActivity"

    const-string v0, "(RobloxWebActivity) handleNotification() Logout event..."

    .line 6
    invoke-static {p1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    sget p1, Lcom/roblox/client/c0;->o:I

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 8
    invoke-static {}, Lr8/c;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    invoke-static {}, Lx7/b;->m()V

    .line 10
    :cond_2
    invoke-static {p2}, Lx7/b;->f(Landroid/os/Bundle;)Lx7/b$f;

    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/roblox/client/i0;->p1(Lx7/b$f;)V

    :goto_0
    return-void
.end method
