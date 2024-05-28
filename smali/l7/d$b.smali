.class Ll7/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ll7/d;


# direct methods
.method private constructor <init>(Ll7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll7/d$b;->a:Ll7/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll7/d;Ll7/d$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll7/d$b;-><init>(Ll7/d;)V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 19

    move-object/from16 v0, p1

    .line 1
    invoke-virtual/range {p1 .. p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "rbx.hybrid"

    if-eqz v1, :cond_0

    const-string v4, "request"

    .line 2
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "requestType"

    .line 3
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "RequestGame"

    .line 4
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "placeId"

    .line 5
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 6
    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v14, "WebView"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 7
    invoke-static/range {v6 .. v18}, Lf7/z;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lf7/z;

    move-result-object v1

    .line 8
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "game_init_params"

    .line 9
    invoke-static {v1}, Lf7/z;->G(Lf7/z;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 10
    invoke-static {}, Lx7/d;->c()Lx7/d;

    move-result-object v1

    const/16 v5, 0x65

    invoke-virtual {v1, v5, v4}, Lx7/d;->f(ILandroid/os/Bundle;)V

    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1, v2}, Ll9/a;->a(ZLorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v1, "Unsupported launchGame request"

    .line 12
    invoke-static {v3, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string v1, "launchGame request failed"

    .line 13
    invoke-static {v3, v1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1, v2}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
