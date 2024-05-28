.class public abstract Lcom/roblox/client/k0;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# static fields
.field protected static G:I

.field protected static H:I


# instance fields
.field protected E:Lo7/a;

.field private F:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    .line 2
    new-instance v0, Lo7/a;

    invoke-direct {v0}, Lo7/a;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/k0;->E:Lo7/a;

    return-void
.end method

.method private a1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/roblox/client/k0;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    .line 3
    sget v1, Lcom/roblox/client/c0;->G2:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->k(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    .line 4
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    if-eqz p2, :cond_1

    .line 5
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/b$a;->n(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/b$a;

    .line 6
    :cond_1
    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private b1(Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/roblox/client/k0;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    .line 3
    sget v1, Lcom/roblox/client/c0;->G2:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->k(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    .line 4
    invoke-virtual {v0, p2}, Landroidx/appcompat/app/b$a;->t(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    if-eqz p3, :cond_1

    .line 6
    invoke-virtual {v0, p3}, Landroidx/appcompat/app/b$a;->n(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/b$a;

    .line 7
    :cond_1
    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method


# virtual methods
.method protected S0()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->i0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/roblox/client/p0;->l0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x7

    goto :goto_0

    :cond_1
    const/4 v0, 0x6

    :goto_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public varargs T0(I[Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/roblox/client/k0;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 3
    :try_start_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bad format: format="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". args="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "RobloxBaseActivity"

    invoke-static {p2, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    sget p1, Lcom/roblox/client/c0;->s3:I

    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/4 p2, 0x0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/roblox/client/k0;->a1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public U0(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/k0;->a1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public V0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roblox/client/k0;->b1(Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public W0(I)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/k0;->a1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public X0(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/k0;->a1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public Y0(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/k0;->a1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public Z0()Lo7/a;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/k0;->E:Lo7/a;

    return-object v0
.end method

.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 2
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v1

    invoke-virtual {v1, p1}, Ls7/b;->d(Landroid/content/Context;)Ls7/f;

    move-result-object v1

    .line 3
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v2

    invoke-virtual {v2}, Ls7/b;->j()Ls7/f;

    move-result-object v2

    .line 4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " -> Locale: base = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "; default = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v1}, Ls7/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; user = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v2}, Ls7/f;->c()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    const-string v4, "null"

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "rbx.locale"

    .line 7
    invoke-static {v4, v3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v2, :cond_1

    .line 8
    invoke-virtual {v2}, Ls7/f;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ls7/f;->c()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-static {v1}, Ls7/b;->b(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 10
    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    .line 12
    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public c1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/k0;->F:Z

    return v0
.end method

.method public d1(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public e1(Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public isDestroyed()Z
    .locals 2

    sget-object v0, Landroidx/lifecycle/f$c;->n:Landroidx/lifecycle/f$c;

    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->f()Landroidx/lifecycle/f;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$c;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lw8/k;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "RobloxBaseActivity"

    const-string v1, "onCreate: App was previously destroyed due to process death"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/d;->onCreate(Landroid/os/Bundle;)V

    return-void

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/roblox/client/p0;->T0(Landroid/content/Context;)V

    .line 5
    invoke-static {p0}, Lh7/b;->e(Landroid/content/Context;)V

    .line 6
    invoke-super {p0, p1}, Landroidx/fragment/app/d;->onCreate(Landroid/os/Bundle;)V

    .line 7
    sget p1, Lcom/roblox/client/k0;->G:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/roblox/client/k0;->G:I

    if-nez p1, :cond_1

    .line 8
    new-instance p1, Lp7/a;

    invoke-direct {p1}, Lp7/a;-><init>()V

    invoke-static {p1}, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->setImplementation(Li9/a;)V

    .line 9
    new-instance p1, Lp7/b;

    invoke-direct {p1, p0}, Lp7/b;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->setImplementation(Lj9/a;)V

    .line 10
    invoke-static {}, Lq8/a;->a()V

    const-wide/16 v0, 0x0

    const-string p1, "SessionReporterState_ApplicationStart"

    .line 11
    invoke-static {p1, v0, v1}, Lq8/a;->b(Ljava/lang/String;J)V

    .line 12
    :cond_1
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p1

    invoke-virtual {p1}, Lb9/c;->l()V

    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .line 1
    invoke-static {}, Lw8/k;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "RobloxBaseActivity"

    const-string v1, "onDestroy: App was previously destroyed due to process death"

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/c;->onDestroy()V

    .line 4
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lh7/b;->a()V

    .line 6
    :cond_0
    invoke-static {p0}, Lc9/m;->c(Landroid/content/Context;)V

    return-void

    .line 7
    :cond_1
    invoke-super {p0}, Landroidx/appcompat/app/c;->onDestroy()V

    .line 8
    sget v0, Lcom/roblox/client/k0;->G:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/roblox/client/k0;->G:I

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    const-string v2, "SessionReporterState_ApplicationTerminate"

    .line 9
    invoke-static {v2, v0, v1}, Lq8/a;->b(Ljava/lang/String;J)V

    :cond_2
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/d;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method protected onPause()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/roblox/client/k0;->F:Z

    .line 2
    sget-object v0, Lcom/roblox/client/p0;->o:Landroid/content/SharedPreferences;

    const-string v1, "webview_url"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-static {v1, v0}, Lh7/b;->f(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    invoke-super {p0}, Landroidx/fragment/app/d;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/d;->onResume()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/roblox/client/k0;->F:Z

    .line 3
    invoke-static {}, Lh7/b;->g()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lr8/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const-string v1, "RESTART_AFTER_PROCESS_DEATH"

    .line 2
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/c;->onStart()V

    .line 2
    sget v0, Lcom/roblox/client/k0;->H:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/roblox/client/k0;->H:I

    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 1
    invoke-static {}, Lh7/b;->h()V

    .line 2
    invoke-super {p0}, Landroidx/appcompat/app/c;->onStop()V

    .line 3
    sget v0, Lcom/roblox/client/k0;->H:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/roblox/client/k0;->H:I

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onTrimMemory: in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", level = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxBaseActivity"

    invoke-static {v1, v0}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    .line 3
    invoke-static {v1, p1}, Lcom/roblox/client/RobloxApplication;->b(Ljava/lang/String;I)V

    return-void
.end method
