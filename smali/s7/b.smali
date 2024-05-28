.class public Ls7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls7/b$b;
    }
.end annotation


# static fields
.field private static j:Ls7/b;


# instance fields
.field private a:Ls7/f;

.field private b:Ls7/f;

.field private c:Ljava/util/Locale;

.field private d:Ls7/f;

.field private e:Ljava/lang/String;

.field private f:Ls7/b$b;

.field private g:Ls7/c;

.field private h:Lcom/roblox/universalapp/messagebus/Connection;

.field private i:Ls7/c$a;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ls7/b;->a:Ls7/f;

    .line 3
    iput-object v0, p0, Ls7/b;->b:Ls7/f;

    .line 4
    iput-object v0, p0, Ls7/b;->c:Ljava/util/Locale;

    .line 5
    iput-object v0, p0, Ls7/b;->d:Ls7/f;

    .line 6
    iput-object v0, p0, Ls7/b;->e:Ljava/lang/String;

    .line 7
    new-instance v0, Ls7/b$a;

    invoke-direct {v0, p0}, Ls7/b$a;-><init>(Ls7/b;)V

    iput-object v0, p0, Ls7/b;->i:Ls7/c$a;

    return-void
.end method

.method public static synthetic a(Ls7/b;Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls7/b;->l(Landroid/content/Context;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/util/Locale;
    .locals 3

    const-string v0, "_"

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 3
    new-instance v0, Ljava/util/Locale;

    const/4 v1, 0x0

    aget-object v1, p0, v1

    const/4 v2, 0x1

    aget-object p0, p0, v2

    invoke-direct {v0, v1, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/util/Locale;

    invoke-direct {v0, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private c()Ls7/f;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ls7/b;->e()Ljava/util/Locale;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 7
    :cond_0
    invoke-static {v0}, Ls7/f;->a(Ljava/lang/String;)Ls7/f;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    sget-object v0, Ls7/f;->d:Ls7/f;

    :goto_0
    return-object v0

    .line 9
    :cond_2
    sget-object v0, Ls7/f;->d:Ls7/f;

    return-object v0
.end method

.method public static f()Ls7/b;
    .locals 2

    .line 1
    sget-object v0, Ls7/b;->j:Ls7/b;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Ls7/b;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Ls7/b;->j:Ls7/b;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ls7/b;

    invoke-direct {v1}, Ls7/b;-><init>()V

    sput-object v1, Ls7/b;->j:Ls7/b;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Ls7/b;->j:Ls7/b;

    return-object v0
.end method

.method private h(Landroid/content/Context;)Ls7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ls7/b;->g:Ls7/c;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Ls7/b;->i:Ls7/c$a;

    invoke-interface {v0, p1}, Ls7/c$a;->a(Landroid/content/Context;)Ls7/c;

    move-result-object p1

    iput-object p1, p0, Ls7/b;->g:Ls7/c;

    .line 3
    :cond_0
    iget-object p1, p0, Ls7/b;->g:Ls7/c;

    return-object p1
.end method

.method private synthetic l(Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 4

    :try_start_0
    const-string v0, "localeId"

    .line 1
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 2
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {p2}, Ls7/f;->b(Ljava/lang/String;)Ls7/f;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls7/b;->k(Ls7/f;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "rbx.locale"

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Receive new locale value from LUA "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ls7/f;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ls7/f;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-virtual {p0, v0, p1}, Ls7/b;->o(Ls7/f;Landroid/content/Context;)V

    .line 7
    invoke-virtual {p0, v0}, Ls7/b;->r(Ls7/f;)V

    .line 8
    invoke-virtual {p0, p1, p2}, Ls7/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0, v0, p1}, Ls7/b;->n(Ls7/f;Landroid/content/Context;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    const-string p1, "MessageBus"

    const-string p2, "Failed to get QR code image userId"

    .line 10
    invoke-static {p1, p2}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private v(Landroid/content/Context;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/res/Configuration;)Landroid/content/Context;
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 1
    invoke-static {p2}, Ls7/b;->b(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p2

    .line 2
    invoke-static {p2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 3
    invoke-virtual {p4, p2}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 4
    invoke-virtual {p4, p2}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 5
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    invoke-virtual {p3, p4, p2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 6
    invoke-virtual {p1, p4}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method private w(Landroid/content/Context;Ls7/f;)Landroid/content/Context;
    .locals 3

    .line 1
    iput-object p2, p0, Ls7/b;->a:Ls7/f;

    .line 2
    invoke-virtual {p2}, Ls7/f;->c()Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {p0, p1, p2, v0, v1}, Ls7/b;->v(Landroid/content/Context;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {p0, p1, p2, v0, v1}, Ls7/b;->x(Landroid/content/Context;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method private x(Landroid/content/Context;Ljava/lang/String;Landroid/content/res/Resources;Landroid/content/res/Configuration;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-static {p2}, Ls7/b;->b(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p2

    .line 2
    invoke-static {p2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 3
    iput-object p2, p4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 4
    invoke-virtual {p4, p2}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 5
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    invoke-virtual {p3, p4, p2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    return-object p1
.end method


# virtual methods
.method public d(Landroid/content/Context;)Ls7/f;
    .locals 1

    .line 1
    iget-object v0, p0, Ls7/b;->b:Ls7/f;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Ls7/b;->h(Landroid/content/Context;)Ls7/c;

    move-result-object p1

    invoke-interface {p1}, Ls7/c;->a()Ls7/f;

    move-result-object p1

    if-nez p1, :cond_1

    .line 3
    invoke-direct {p0}, Ls7/b;->c()Ls7/f;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public e()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Ls7/b;->c:Ljava/util/Locale;

    return-object v0
.end method

.method public g()Ls7/b$b;
    .locals 1

    iget-object v0, p0, Ls7/b;->f:Ls7/b$b;

    return-object v0
.end method

.method public i(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ls7/b;->e:Ljava/lang/String;

    const-string v1, "rbx.locale"

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    const-string v2, "mUGCLocaleCode is Empty"

    .line 2
    invoke-static {v1, v2}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-direct {p0, p1}, Ls7/b;->h(Landroid/content/Context;)Ls7/c;

    move-result-object p1

    invoke-interface {p1}, Ls7/c;->f()Ls7/f;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Ls7/f;->d()Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    const-string p1, "No stored value for mUGCLocaleCode. Use English"

    .line 5
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    sget-object p1, Ls7/f;->d:Ls7/f;

    invoke-virtual {p1}, Ls7/f;->d()Ljava/lang/String;

    move-result-object v0

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mUGCLocaleCode value is: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public j()Ls7/f;
    .locals 1

    iget-object v0, p0, Ls7/b;->a:Ls7/f;

    return-object v0
.end method

.method public k(Ls7/f;)Z
    .locals 1

    iget-object v0, p0, Ls7/b;->a:Ls7/f;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public m(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    new-instance v1, Ls7/a;

    invoke-direct {v1, p0, p1}, Ls7/a;-><init>(Ls7/b;Landroid/content/Context;)V

    const-string p1, "Locale.RobloxLocaleIdChanged"

    invoke-virtual {v0, p1, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Ls7/b;->h:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public n(Ls7/f;Landroid/content/Context;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Ls7/b;->k(Ls7/f;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 2
    invoke-direct {p0, p2}, Ls7/b;->h(Landroid/content/Context;)Ls7/c;

    move-result-object v1

    invoke-interface {v1, p1}, Ls7/c;->d(Ls7/f;)V

    .line 3
    invoke-direct {p0, p2, p1}, Ls7/b;->w(Landroid/content/Context;Ls7/f;)Landroid/content/Context;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public o(Ls7/f;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ls7/b;->p(Ls7/f;)V

    .line 2
    invoke-direct {p0, p2}, Ls7/b;->h(Landroid/content/Context;)Ls7/c;

    move-result-object p1

    iget-object p2, p0, Ls7/b;->b:Ls7/f;

    invoke-interface {p1, p2}, Ls7/c;->e(Ls7/f;)V

    return-void
.end method

.method p(Ls7/f;)V
    .locals 0

    iput-object p1, p0, Ls7/b;->b:Ls7/f;

    return-void
.end method

.method public q(Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, Ls7/b;->c:Ljava/util/Locale;

    return-void
.end method

.method public r(Ls7/f;)V
    .locals 0

    iput-object p1, p0, Ls7/b;->d:Ls7/f;

    return-void
.end method

.method public s(Ls7/b$b;)V
    .locals 0

    iput-object p1, p0, Ls7/b;->f:Ls7/b$b;

    return-void
.end method

.method public t(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Ls7/b;->e:Ljava/lang/String;

    .line 2
    invoke-direct {p0, p1}, Ls7/b;->h(Landroid/content/Context;)Ls7/c;

    move-result-object p1

    iget-object p2, p0, Ls7/b;->e:Ljava/lang/String;

    invoke-interface {p1, p2}, Ls7/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public u(Landroid/content/Context;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ls7/b;->a:Ls7/f;

    const-string v1, "rbx.locale"

    if-nez v0, :cond_0

    const-string v0, "mUserLocale is empty"

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-direct {p0, p1}, Ls7/b;->h(Landroid/content/Context;)Ls7/c;

    move-result-object v0

    invoke-interface {v0}, Ls7/c;->c()Ls7/f;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "No stored value for mUserLocale."

    .line 4
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-direct {p0}, Ls7/b;->c()Ls7/f;

    move-result-object v0

    .line 6
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Updating App configuration based on locale = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-direct {p0, p1, v0}, Ls7/b;->w(Landroid/content/Context;Ls7/f;)Landroid/content/Context;

    return-void
.end method
