.class public Lx7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/g$f;,
        Lx7/g$d;,
        Lx7/g$e;
    }
.end annotation


# instance fields
.field private a:J

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lx7/g;->a:J

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lx7/g;->b:Z

    .line 4
    invoke-direct {p0}, Lx7/g;->l()V

    return-void
.end method

.method private a(Ly7/c$b;)V
    .locals 3

    .line 1
    new-instance v0, Lx7/g$c;

    invoke-direct {v0, p0, p1}, Lx7/g$c;-><init>(Lx7/g;Ly7/c$b;)V

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->u0()Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {}, Lh7/g;->a()Lh7/f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, p1, v2, v2, v0}, Lh7/f;->a(Ljava/lang/String;Li7/c;[Lh7/b$a;Lh7/l;)Lh7/d;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lh7/a;->c()V

    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "notification"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 2
    invoke-virtual {p1}, Landroid/app/NotificationManager;->cancelAll()V

    :cond_0
    return-void
.end method

.method public static e()Lx7/g;
    .locals 1

    sget-object v0, Lx7/g$e;->a:Lx7/g;

    return-object v0
.end method

.method public static h()Z
    .locals 5

    invoke-static {}, Lcom/roblox/client/p0;->P()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "userid_long"

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private l()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->P()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "username"

    const-string v2, ""

    .line 2
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "displayName"

    .line 3
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "userid_long"

    const-wide/16 v4, -0x1

    .line 4
    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    iput-wide v6, p0, Lx7/g;->a:J

    cmp-long v3, v6, v4

    if-nez v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "userid"

    .line 5
    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    int-to-long v3, v3

    iput-wide v3, p0, Lx7/g;->a:J

    .line 6
    :cond_0
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v3

    const/4 v4, 0x1

    const-string v5, "under13"

    invoke-interface {v0, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v3, v0}, Lb9/c;->o(Z)V

    .line 7
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lb9/c;->u(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lb9/c;->n(Ljava/lang/String;)V

    return-void
.end method

.method public static m()Lorg/json/JSONObject;
    .locals 9

    const-string v0, "displayName"

    const-string v1, ""

    const-string v2, "username"

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->P()Landroid/content/SharedPreferences;

    move-result-object v3

    .line 2
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v5, "userId"

    const-string v6, "userid_long"

    const-wide/16 v7, -0x1

    .line 3
    invoke-interface {v3, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v5, "isUnder13"

    const-string v6, "under13"

    const/4 v7, 0x1

    .line 4
    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 5
    invoke-interface {v3, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    .line 7
    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "invalid UserInfo json"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private o(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lx7/g;->b:Z

    const-wide/16 v0, -0x1

    .line 2
    invoke-virtual {p0, v0, v1}, Lx7/g;->s(J)V

    .line 3
    invoke-direct {p0}, Lx7/g;->u()V

    .line 4
    invoke-direct {p0}, Lx7/g;->t()V

    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, v0}, Lx7/g;->v(Z)V

    .line 6
    invoke-static {}, Lt6/b;->b()Lt6/b;

    move-result-object v0

    invoke-virtual {v0}, Lt6/b;->a()V

    .line 7
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->a()V

    .line 8
    invoke-static {}, Lh8/p;->c()Lh8/p;

    move-result-object v0

    invoke-virtual {v0}, Lh8/p;->a()V

    .line 9
    invoke-direct {p0, p1}, Lx7/g;->b(Landroid/content/Context;)V

    return-void
.end method

.method private q(J)V
    .locals 1

    .line 1
    iput-wide p1, p0, Lx7/g;->a:J

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lx7/g;->b:Z

    .line 3
    invoke-direct {p0}, Lx7/g;->r()V

    .line 4
    invoke-static {}, Lb9/b;->c()Lb9/b;

    move-result-object p1

    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p2

    invoke-virtual {p2}, Lb9/c;->k()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Username"

    invoke-virtual {p1, p2, v0}, Lb9/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private r()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->P()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-string v3, "user_logged_in_time"

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private t()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->P()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_auth_cookie_expir_key"

    .line 2
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private u()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->P()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "user_logged_in_time"

    .line 2
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private v(Z)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/roblox/client/p0;->P()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "userid"

    .line 2
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "under13"

    const-string v2, "userid_long"

    const-string v3, "displayName"

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 4
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 5
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p1

    invoke-virtual {p1}, Lb9/c;->k()Ljava/lang/String;

    move-result-object p1

    const-string v4, "username"

    invoke-interface {v0, v4, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 7
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p1

    invoke-virtual {p1}, Lb9/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 8
    iget-wide v3, p0, Lx7/g;->a:J

    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 9
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p1

    invoke-virtual {p1}, Lb9/c;->m()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 10
    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;ZLy7/c$b;)V
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    invoke-direct {p0, p3}, Lx7/g;->a(Ly7/c$b;)V

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lx7/g;->o(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Lcom/roblox/client/n;->h()Lcom/roblox/client/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/n;->q()Lp8/a;

    move-result-object p1

    invoke-virtual {p1}, Lp8/a;->c()V

    return-void
.end method

.method public d(Lh7/m;)V
    .locals 1

    .line 1
    new-instance v0, Lb9/a;

    invoke-direct {v0, p1}, Lb9/a;-><init>(Lh7/m;)V

    .line 2
    invoke-virtual {v0}, Lb9/a;->b()V

    const-string p1, "activeSession"

    .line 3
    invoke-static {p1}, Lx7/e;->e(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Lb9/a;->c()V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lx7/g;->b:Z

    return v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lx7/g;->a:J

    return-wide v0
.end method

.method public i()Z
    .locals 5

    iget-wide v0, p0, Lx7/g;->a:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Landroid/content/Context;Ljava/lang/String;Lx7/g$f;)V
    .locals 6

    const-string v0, ""

    const-string v1, "SessionManager"

    const-string v2, "didLoggedIn"

    .line 1
    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x1

    .line 2
    iput-boolean v1, p0, Lx7/g;->b:Z

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "userId"

    .line 5
    iget-wide v2, p0, Lx7/g;->a:J

    invoke-virtual {v1, p2, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lx7/g;->a:J

    .line 6
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p2

    iget-wide v2, p0, Lx7/g;->a:J

    invoke-virtual {p2, v2, v3}, Lb9/c;->t(J)V

    .line 7
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p2

    const-string v2, "isUnder13"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {p2, v2}, Lb9/c;->o(Z)V

    const-string p2, "username"

    .line 8
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v2

    invoke-virtual {v2}, Lb9/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 9
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v2

    invoke-virtual {v2, p2}, Lb9/c;->u(Ljava/lang/String;)V

    const-string p2, "displayName"

    .line 10
    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v2

    invoke-virtual {v2, p2}, Lb9/c;->n(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 12
    invoke-direct {p0, p2}, Lx7/g;->v(Z)V

    .line 13
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v2

    const-string v3, "membershipType"

    invoke-virtual {v1, v3, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p2

    invoke-virtual {v2, p2}, Lb9/c;->p(I)V

    const-string p2, "countryCode"

    .line 14
    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAccountInfoFromLua: Exception: + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lc9/k;->i(Ljava/lang/String;)I

    .line 16
    :cond_0
    :goto_0
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p2

    invoke-virtual {p2}, Lb9/c;->k()Ljava/lang/String;

    move-result-object v5

    .line 17
    new-instance p2, Lw7/a;

    iget-wide v3, p0, Lx7/g;->a:J

    const-string v2, "PostLogin"

    move-object v0, p2

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lw7/a;-><init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V

    .line 18
    new-instance p1, Lx7/g$b;

    invoke-direct {p1, p0, p3}, Lx7/g$b;-><init>(Lx7/g;Lx7/g$f;)V

    invoke-virtual {p2, p1}, Lw7/a;->g(Lw7/a$e;)V

    .line 19
    invoke-virtual {p2}, Lcom/roblox/client/components/c;->e()V

    return-void
.end method

.method public k(Ljava/lang/String;J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSignUpOK: username:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", userId:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.login"

    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0, p2, p3}, Lx7/g;->q(J)V

    return-void
.end method

.method public n(Lx7/g$d;Lh7/f;)V
    .locals 2

    .line 1
    new-instance v0, Lx7/g$a;

    invoke-direct {v0, p0, p1}, Lx7/g$a;-><init>(Lx7/g;Lx7/g$d;)V

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->h()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 3
    invoke-interface {p2, p1, v1, v0}, Lh7/f;->b(Ljava/lang/String;[Lh7/b$a;Lh7/l;)Lh7/c;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lh7/a;->c()V

    return-void
.end method

.method public p(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lx7/g;->b:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->U0()V

    :cond_0
    return-void
.end method

.method public s(J)V
    .locals 0

    iput-wide p1, p0, Lx7/g;->a:J

    return-void
.end method
