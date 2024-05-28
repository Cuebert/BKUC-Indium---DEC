.class Lcom/roblox/client/login/mvp/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/login/mvp/f$b;,
        Lcom/roblox/client/login/mvp/f$c;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Lb9/c;

.field private d:Lb9/b;

.field private e:Lc9/p;


# direct methods
.method constructor <init>(Lb9/c;Lb9/b;Lc9/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/roblox/client/login/mvp/f;->a:I

    .line 3
    iput-object p1, p0, Lcom/roblox/client/login/mvp/f;->c:Lb9/c;

    .line 4
    iput-object p2, p0, Lcom/roblox/client/login/mvp/f;->d:Lb9/b;

    .line 5
    iput-object p3, p0, Lcom/roblox/client/login/mvp/f;->e:Lc9/p;

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/login/mvp/f;Lcom/roblox/client/login/mvp/f$c;)Lcom/roblox/client/login/mvp/e;
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/login/mvp/f;->h(Lcom/roblox/client/login/mvp/f$c;)Lcom/roblox/client/login/mvp/e;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/roblox/client/login/mvp/f;Lcom/roblox/client/login/mvp/f$c;Lcom/roblox/client/login/mvp/f$b;)Lcom/roblox/client/login/mvp/e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/login/mvp/f;->i(Lcom/roblox/client/login/mvp/f$c;Lcom/roblox/client/login/mvp/f$b;)Lcom/roblox/client/login/mvp/e;

    move-result-object p0

    return-object p0
.end method

.method private h(Lcom/roblox/client/login/mvp/f$c;)Lcom/roblox/client/login/mvp/e;
    .locals 3

    .line 1
    new-instance v0, Lcom/roblox/client/login/mvp/e;

    invoke-direct {v0}, Lcom/roblox/client/login/mvp/e;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    iget p1, p1, Lv9/a;->a:I

    goto :goto_0

    :cond_0
    const/16 p1, 0x3e8

    :goto_0
    const/16 v1, -0x7da

    if-eqz p1, :cond_3

    const/4 v2, 0x3

    if-eq p1, v2, :cond_2

    const/16 v2, 0x8

    if-eq p1, v2, :cond_1

    .line 3
    iput v1, v0, Lcom/roblox/client/login/mvp/e;->c:I

    const-string p1, "FailureUnknownError"

    .line 4
    iput-object p1, v0, Lcom/roblox/client/login/mvp/e;->a:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/16 p1, -0x7dc

    .line 5
    iput p1, v0, Lcom/roblox/client/login/mvp/e;->c:I

    const-string p1, "FailureCredentialNotSupported"

    .line 6
    iput-object p1, v0, Lcom/roblox/client/login/mvp/e;->a:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/16 p1, -0x7db

    .line 7
    iput p1, v0, Lcom/roblox/client/login/mvp/e;->c:I

    const-string p1, "FailureInvalidUsernamePassword"

    .line 8
    iput-object p1, v0, Lcom/roblox/client/login/mvp/e;->a:Ljava/lang/String;

    goto :goto_1

    .line 9
    :cond_3
    iput v1, v0, Lcom/roblox/client/login/mvp/e;->c:I

    const-string p1, "FailureServerError"

    .line 10
    iput-object p1, v0, Lcom/roblox/client/login/mvp/e;->a:Ljava/lang/String;

    :goto_1
    const-string p1, "Android-AppLogin-Failure-400-BadRequest"

    .line 11
    iput-object p1, v0, Lcom/roblox/client/login/mvp/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method private i(Lcom/roblox/client/login/mvp/f$c;Lcom/roblox/client/login/mvp/f$b;)Lcom/roblox/client/login/mvp/e;
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget p1, p1, Lv9/a;->a:I

    goto :goto_0

    :cond_0
    const/16 p1, 0x3e8

    :goto_0
    const/16 v0, -0x7e6

    const/4 v1, 0x1

    if-eq p1, v1, :cond_8

    const/4 v1, 0x2

    if-eq p1, v1, :cond_7

    const/4 v1, 0x4

    if-eq p1, v1, :cond_6

    const/4 p2, 0x5

    if-eq p1, p2, :cond_5

    const/4 p2, 0x6

    if-eq p1, p2, :cond_4

    const/16 p2, 0x9

    if-eq p1, p2, :cond_3

    const/16 p2, 0xa

    if-eq p1, p2, :cond_2

    const/16 p2, 0xe

    if-eq p1, p2, :cond_1

    const/16 v0, -0x7da

    const-string p1, "FailureUnknownError"

    const-string p2, "Android-AppLogin-Failure-UnknownError"

    goto :goto_2

    :cond_1
    const/16 v0, -0x7e7

    const-string p1, "FailureLuobuUser"

    const-string p2, "Android-AppLogin-Failure-403-LuobuUser"

    goto :goto_2

    :cond_2
    const/16 v0, -0x7e1

    const-string p1, "FailureUnverifiedCredentials"

    const-string p2, "Android-AppLogin-Failure-403-UnverifiedCredentials"

    goto :goto_2

    :cond_3
    const/16 v0, -0x7e0

    const-string p1, "FailureDefaultLoginRequired"

    const-string p2, "Android-AppLogin-Failure-403-DefaultLoginRequired"

    goto :goto_2

    :cond_4
    const/16 v0, -0x7df

    const-string p1, "FailureTwoStepVerification"

    const-string p2, "Android-AppLogin-Failure-403-TwoStepVerification"

    goto :goto_2

    :cond_5
    const/16 v0, -0x7de

    const-string p1, "FailureLoginNullPasswordSocialLogin"

    const-string p2, "Android-AppLogin-Failure-403-NullPassword"

    goto :goto_2

    .line 2
    :cond_6
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/f;->l()V

    .line 3
    invoke-interface {p2}, Lcom/roblox/client/login/mvp/f$b;->e()V

    const-string p1, "FailureResetPasswordRequired"

    const-string p2, "Android-AppLogin-Failure-403-PasswordResetRequired"

    goto :goto_2

    .line 4
    :cond_7
    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/f;->l()V

    const/16 v0, -0x7e5

    const-string p1, "Captcha"

    const-string p2, "Android-AppLogin-Failure-403-Captcha"

    goto :goto_2

    .line 5
    :cond_8
    iget p1, p0, Lcom/roblox/client/login/mvp/f;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/roblox/client/login/mvp/f;->a:I

    .line 6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->y0()I

    move-result v1

    if-le p1, v1, :cond_9

    .line 7
    invoke-interface {p2}, Lcom/roblox/client/login/mvp/f$b;->f()V

    goto :goto_1

    :cond_9
    const/16 p1, -0x7dd

    const/16 v0, -0x7dd

    :goto_1
    const-string p1, "FailureInvalidUsernamePassword"

    const-string p2, "Android-AppLogin-Failure-403-Credentials"

    .line 8
    :goto_2
    new-instance v1, Lcom/roblox/client/login/mvp/e;

    invoke-direct {v1, p1, p2, v0}, Lcom/roblox/client/login/mvp/e;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1
.end method

.method private n()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/f;->e:Lc9/p;

    invoke-virtual {v0}, Lc9/p;->f()Landroid/content/SharedPreferences;

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


# virtual methods
.method c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/login/mvp/f$b;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p2, p1, p3}, Lcom/roblox/client/login/mvp/f;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/roblox/client/login/mvp/f$a;

    invoke-direct {v0, p0, p6}, Lcom/roblox/client/login/mvp/f$a;-><init>(Lcom/roblox/client/login/mvp/f;Lcom/roblox/client/login/mvp/f$b;)V

    .line 3
    new-instance p6, Li7/d;

    move-object v1, p6

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Li7/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance p1, Lh7/h;

    invoke-direct {p1}, Lh7/h;-><init>()V

    .line 5
    invoke-static {}, Lcom/roblox/client/p0;->s0()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    .line 6
    invoke-virtual {p1, p2, p6, p3, v0}, Lh7/h;->a(Ljava/lang/String;Li7/c;[Lh7/b$a;Lh7/l;)Lh7/d;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lh7/a;->c()V

    return-void
.end method

.method protected d(Lorg/json/JSONObject;)Lcom/roblox/client/login/mvp/e;
    .locals 3

    :try_start_0
    const-string v0, "user"

    .line 1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/roblox/client/login/mvp/f;->c:Lb9/c;

    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb9/c;->u(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/roblox/client/login/mvp/f;->c:Lb9/c;

    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lb9/c;->t(J)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :catch_0
    new-instance p1, Lcom/roblox/client/login/mvp/e;

    const/16 v0, -0x7da

    const-string v1, "MissingUserInfo"

    const-string v2, "Android-AppLogin-Failure-UnknownError"

    invoke-direct {p1, v1, v2, v0}, Lcom/roblox/client/login/mvp/e;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object p1
.end method

.method e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/f;->d:Lb9/b;

    invoke-virtual {v0}, Lb9/b;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/f;->d:Lb9/b;

    invoke-virtual {v0}, Lb9/b;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected j(Lorg/json/JSONObject;Lcom/roblox/client/login/mvp/f$b;)Lcom/roblox/client/login/mvp/e;
    .locals 3

    const-string v0, "rbx.authlogin"

    const-string v1, "callLoginWithAuthV1(). errorCode=200. requires 2 step verification"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    const-string v1, "twoStepVerificationData"

    .line 2
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "ticket"

    .line 3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mediaType"

    .line 4
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v2, p0, Lcom/roblox/client/login/mvp/f;->c:Lb9/c;

    invoke-virtual {v2}, Lb9/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v1, p1, v2}, Lcom/roblox/client/login/mvp/f$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    const-string p1, "callLoginWithApi. Error parsing 2SV response."

    .line 6
    invoke-static {v0, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    new-instance p1, Lcom/roblox/client/login/mvp/e;

    const/16 p2, -0x7da

    const-string v0, "Failure2SVJSON"

    const-string v1, "Android-AppLogin-Failure-UnknownError"

    invoke-direct {p1, v0, v1, p2}, Lcom/roblox/client/login/mvp/e;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object p1
.end method

.method k()V
    .locals 3

    const-string v0, "rbx.authlogin"

    const-string v1, "onLoginOK."

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/login/mvp/f;->c:Lb9/c;

    invoke-virtual {v1}, Lb9/c;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lx7/g;->s(J)V

    .line 3
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lx7/g;->p(Z)V

    .line 4
    invoke-direct {p0}, Lcom/roblox/client/login/mvp/f;->n()V

    .line 5
    invoke-static {}, Lb9/b;->c()Lb9/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/f;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/roblox/client/login/mvp/f;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lb9/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method l()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/roblox/client/login/mvp/f;->a:I

    return-void
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/roblox/client/login/mvp/f;->d:Lb9/b;

    invoke-virtual {v0, p2, p1}, Lb9/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iput-object p3, p0, Lcom/roblox/client/login/mvp/f;->b:Ljava/lang/String;

    return-void
.end method
