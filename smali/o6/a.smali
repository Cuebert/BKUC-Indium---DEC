.class public Lo6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/b$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/a$a;
    }
.end annotation


# static fields
.field private static j:Lo6/a;


# instance fields
.field private a:Landroid/content/SharedPreferences;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:J

.field private g:I

.field private h:Ljava/lang/Boolean;

.field private i:Lo6/a$a;


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lo6/a;->b:I

    .line 3
    iput v0, p0, Lo6/a;->c:I

    .line 4
    iput v0, p0, Lo6/a;->d:I

    .line 5
    iput v0, p0, Lo6/a;->e:I

    const-wide/16 v1, 0x0

    .line 6
    iput-wide v1, p0, Lo6/a;->f:J

    .line 7
    iput v0, p0, Lo6/a;->g:I

    .line 8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lo6/a;->h:Ljava/lang/Boolean;

    return-void
.end method

.method public static e()Lo6/a;
    .locals 2

    .line 1
    sget-object v0, Lo6/a;->j:Lo6/a;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    const-class v0, Lo6/a;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lo6/a;->j:Lo6/a;

    if-nez v1, :cond_1

    .line 4
    new-instance v1, Lo6/a;

    invoke-direct {v1}, Lo6/a;-><init>()V

    sput-object v1, Lo6/a;->j:Lo6/a;

    .line 5
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    sget-object v0, Lo6/a;->j:Lo6/a;

    return-object v0

    :catchall_0
    move-exception v1

    .line 7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private f()Lx7/e;
    .locals 1

    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/content/Context;)V
    .locals 1

    const-string v0, "rate_me_maybe"

    .line 1
    invoke-static {p0, v0}, Lc9/p;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string p0, "RateMeMaybe"

    const-string v0, "Cleared RateMeMaybe shared preferences."

    .line 2
    invoke-static {p0, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private k(Landroid/app/Activity;)V
    .locals 2

    .line 1
    check-cast p1, Landroidx/appcompat/app/c;

    invoke-virtual {p1}, Landroidx/fragment/app/d;->y0()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "rmmFragment"

    .line 2
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v1, Lo6/b;

    invoke-direct {v1}, Lo6/b;-><init>()V

    .line 4
    invoke-virtual {v1, p0}, Lo6/b;->q2(Lo6/b$a;)V

    .line 5
    :try_start_0
    invoke-virtual {v1, p1, v0}, Landroidx/fragment/app/c;->o2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lo6/a;->f()Lx7/e;

    move-result-object p1

    const-string v0, "Mobile-Ratings-Shown-Android"

    invoke-virtual {p1, v0}, Lx7/e;->A(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RateMeMaybe"

    invoke-static {v0, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION"

    const/4 v2, 0x1

    .line 2
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 4
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "market://details?id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 8
    :catch_0
    sget v0, Lcom/roblox/client/c0;->a:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 10
    :goto_0
    iget-object p1, p0, Lo6/a;->i:Lo6/a$a;

    if-eqz p1, :cond_0

    .line 11
    invoke-interface {p1}, Lo6/a$a;->c()V

    .line 12
    :cond_0
    invoke-direct {p0}, Lo6/a;->f()Lx7/e;

    move-result-object p1

    const-string v0, "Mobile-Ratings-Yes-Tapped-Android"

    invoke-virtual {p1, v0}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION"

    const/4 v2, 0x1

    .line 2
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 4
    iget-object v0, p0, Lo6/a;->i:Lo6/a$a;

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0}, Lo6/a$a;->a()V

    .line 6
    :cond_0
    invoke-direct {p0}, Lo6/a;->f()Lx7/e;

    move-result-object v0

    const-string v1, "Mobile-Ratings-NotNow-Tapped-Android"

    invoke-virtual {v0, v1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo6/a;->h:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lo6/a;->d()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lo6/a;->b()V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo6/a;->i:Lo6/a$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lo6/a$a;->b()V

    .line 3
    :cond_0
    invoke-direct {p0}, Lo6/a;->f()Lx7/e;

    move-result-object v0

    const-string v1, "Mobile-Ratings-RemindMe-Tapped-Android"

    invoke-virtual {v0, v1}, Lx7/e;->A(Ljava/lang/String;)V

    return-void
.end method

.method public g(Landroid/content/Context;)V
    .locals 6

    const-string v0, "rate_me_maybe"

    .line 1
    invoke-static {p1, v0}, Lc9/p;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v2, "CURRENT_APP_VERSION"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "2.622.471"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-static {p1}, Lo6/a;->h(Landroid/content/Context;)V

    .line 5
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 6
    :cond_0
    iget-object p1, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH"

    const-wide/16 v2, 0x0

    invoke-interface {p1, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long p1, v4, v2

    if-nez p1, :cond_1

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 8
    :cond_1
    iget-object p1, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "PREF_TOTAL_LAUNCH_COUNT"

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 9
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 10
    iget-object p1, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "PREF_LAUNCHES_SINCE_LAST_PROMPT"

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 11
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public i(Landroid/app/Activity;)V
    .locals 19

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v2, "PREF_DONT_SHOW_AGAIN_FOR_THIS_VERSION"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static/range {p1 .. p1}, Lc9/l;->f(Landroid/content/Context;)Z

    move-result v1

    const-string v2, "RateMeMaybe"

    if-nez v1, :cond_1

    const-string v1, "No Play Store installed on device."

    .line 3
    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 4
    :cond_1
    iget v1, v0, Lo6/a;->g:I

    iget-object v4, v0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v5, "PREF_GAMES_PLAYED"

    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    if-le v1, v4, :cond_2

    const-string v1, "Hasn\'t played a number games higher than the minimum requested."

    .line 5
    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 6
    :cond_2
    iget-wide v4, v0, Lo6/a;->f:J

    iget-object v1, v0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v6, "PREF_LONGEST_GAME_DURATION"

    const-wide/16 v7, 0x0

    invoke-interface {v1, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v9

    cmp-long v1, v4, v9

    if-lez v1, :cond_3

    const-string v1, "Hasn\'t played a game for more than the minimum time requested."

    .line 7
    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 8
    :cond_3
    iget-object v1, v0, Lo6/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 9
    iget-object v4, v0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v5, "PREF_TOTAL_LAUNCH_COUNT"

    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 11
    iget-object v9, v0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v10, "PREF_TIME_OF_ABSOLUTE_FIRST_LAUNCH"

    invoke-interface {v9, v10, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v9

    .line 12
    iget-object v11, v0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v12, "PREF_TIME_OF_LAST_PROMPT"

    invoke-interface {v11, v12, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v13

    .line 13
    iget-object v11, v0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v15, "PREF_LAUNCHES_SINCE_LAST_PROMPT"

    invoke-interface {v11, v15, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v11

    .line 14
    iget v3, v0, Lo6/a;->b:I

    if-lt v4, v3, :cond_6

    sub-long v3, v5, v9

    iget v9, v0, Lo6/a;->c:I

    int-to-long v9, v9

    const-wide/32 v16, 0x5265c00

    mul-long v9, v9, v16

    cmp-long v18, v3, v9

    if-ltz v18, :cond_6

    const-string v3, "Enough time until initial prompt."

    .line 15
    invoke-static {v2, v3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    cmp-long v3, v13, v7

    if-eqz v3, :cond_5

    .line 16
    iget v3, v0, Lo6/a;->d:I

    if-lt v11, v3, :cond_4

    sub-long v3, v5, v13

    iget v7, v0, Lo6/a;->e:I

    int-to-long v7, v7

    mul-long v7, v7, v16

    cmp-long v9, v3, v7

    if-ltz v9, :cond_4

    goto :goto_0

    :cond_4
    const-string v3, "User has seen a prompt recently || (Not enough launches since last prompt || Not enough time since last prompt)"

    .line 17
    invoke-static {v2, v3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1

    :cond_5
    :goto_0
    const-string v3, "User has not seen a prompt || (Enough launches since last prompt && Enough time since last prompt)"

    .line 19
    invoke-static {v2, v3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    invoke-interface {v1, v12, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const/4 v2, 0x0

    .line 21
    invoke-interface {v1, v15, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 22
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    invoke-direct/range {p0 .. p1}, Lo6/a;->k(Landroid/app/Activity;)V

    goto :goto_1

    :cond_6
    const-string v3, "Not enough time until initial prompt."

    .line 24
    invoke-static {v2, v3}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_1
    return-void
.end method

.method public j(IIIIJI)V
    .locals 0

    .line 1
    iput p1, p0, Lo6/a;->b:I

    .line 2
    iput p2, p0, Lo6/a;->c:I

    .line 3
    iput p3, p0, Lo6/a;->d:I

    .line 4
    iput p4, p0, Lo6/a;->e:I

    .line 5
    iput-wide p5, p0, Lo6/a;->f:J

    .line 6
    iput p7, p0, Lo6/a;->g:I

    return-void
.end method

.method public l(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const-string v2, "PREF_LONGEST_GAME_DURATION"

    const-wide/16 v3, 0x0

    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long v1, p1, v3

    if-lez v1, :cond_0

    .line 3
    invoke-interface {v0, v2, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 4
    :cond_0
    iget-object p1, p0, Lo6/a;->a:Landroid/content/SharedPreferences;

    const/4 p2, 0x0

    const-string v1, "PREF_GAMES_PLAYED"

    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 5
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
