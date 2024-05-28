.class public Lcom/roblox/client/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/h;->a:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method static synthetic a(Lcom/roblox/client/h;Lq7/d$c;)Lq7/d$c;
    .locals 0

    invoke-direct {p0, p1}, Lcom/roblox/client/h;->c(Lq7/d$c;)Lq7/d$c;

    move-result-object p0

    return-object p0
.end method

.method private c(Lq7/d$c;)Lq7/d$c;
    .locals 7

    const-string v0, "rbx.catalog"

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->D0()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 3
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "assetId"

    .line 4
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 5
    invoke-virtual {p1}, Lq7/d$c;->a()J

    move-result-wide v5

    cmp-long v1, v5, v3

    if-nez v1, :cond_4

    const-string v1, "locales"

    .line 6
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v2, 0x0

    .line 7
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 8
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "locale"

    .line 9
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    .line 11
    :cond_0
    invoke-static {v4}, Ls7/f;->b(Ljava/lang/String;)Ls7/f;

    move-result-object v5

    if-nez v5, :cond_1

    .line 12
    invoke-static {v4}, Ls7/f;->a(Ljava/lang/String;)Ls7/f;

    move-result-object v5

    .line 13
    :cond_1
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v4

    invoke-virtual {v4, v5}, Ls7/b;->k(Ls7/f;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v1, "name"

    .line 14
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 15
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 16
    invoke-virtual {p1, v1}, Lq7/d$c;->f(Ljava/lang/String;)V

    const-string v1, "Using localized promo name"

    .line 17
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    const-string v1, "description"

    .line 18
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 20
    invoke-virtual {p1, v1}, Lq7/d$c;->e(Ljava/lang/String;)V

    const-string v1, "Using localized promo description"

    .line 21
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    const-string v1, "Could not parse catalog promo localization data"

    .line 22
    invoke-static {v0, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_2
    return-object p1
.end method


# virtual methods
.method public b()V
    .locals 6

    .line 1
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->p()J

    move-result-wide v0

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v3

    invoke-virtual {v3}, Lx7/g;->g()J

    move-result-wide v3

    const-string v5, "PREF_NAME_CATALOG_PROMO_SHOWN"

    invoke-static {v5, v2, v3, v4}, Lcom/roblox/client/p0;->q0(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v2

    if-nez v2, :cond_1

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCatalogPromo() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rbx.catalog"

    invoke-static {v3, v2}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    new-instance v2, Lq7/d;

    new-instance v3, Lcom/roblox/client/h$a;

    invoke-direct {v3, p0}, Lcom/roblox/client/h$a;-><init>(Lcom/roblox/client/h;)V

    invoke-direct {v2, v0, v1, v3}, Lq7/d;-><init>(JLq7/d$b;)V

    .line 6
    invoke-static {}, Lx7/f;->b()Lcom/birbit/android/jobqueue/g;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/birbit/android/jobqueue/g;->c(Lcom/birbit/android/jobqueue/e;)V

    :cond_1
    return-void
.end method

.method protected d(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-class v0, Le7/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->p()J

    move-result-wide v1

    cmp-long v3, v1, p1

    if-nez v3, :cond_0

    iget-object v1, p0, Lcom/roblox/client/h;->a:Landroidx/fragment/app/Fragment;

    .line 3
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->r0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roblox/client/h;->a:Landroidx/fragment/app/Fragment;

    .line 4
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roblox/client/h;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->n0()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/roblox/client/h;->a:Landroidx/fragment/app/Fragment;

    .line 5
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->E()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roblox/client/h;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->E()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/fragment/app/FragmentManager;->j0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showPromo() title:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " description:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.catalog"

    invoke-static {v2, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    new-instance v1, Le7/a;

    invoke-direct {v1}, Le7/a;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 8
    invoke-virtual {v1, v2, v3}, Landroidx/fragment/app/c;->m2(II)V

    .line 9
    iget-object v2, p0, Lcom/roblox/client/h;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->Q()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roblox/client/w;->b:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 10
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "dialogWidth"

    .line 11
    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/4 v2, -0x2

    const-string v4, "dialogHeight"

    .line 12
    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "assetId"

    .line 13
    invoke-virtual {v3, v2, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v2, "title"

    .line 14
    invoke-virtual {v3, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "description"

    .line 15
    invoke-virtual {v3, p3, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "thumbnail"

    .line 16
    invoke-virtual {v3, p3, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1, v3}, Landroidx/fragment/app/Fragment;->H1(Landroid/os/Bundle;)V

    .line 18
    iget-object p3, p0, Lcom/roblox/client/h;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->E()Landroidx/fragment/app/FragmentManager;

    move-result-object p3

    invoke-virtual {v1, p3, v0}, Landroidx/fragment/app/c;->o2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 19
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object p2

    invoke-virtual {p2}, Lx7/g;->g()J

    move-result-wide p2

    const-string p4, "PREF_NAME_CATALOG_PROMO_SHOWN"

    invoke-static {p4, p1, p2, p3}, Lcom/roblox/client/p0;->E0(Ljava/lang/String;Ljava/lang/String;J)V

    :cond_0
    return-void
.end method
