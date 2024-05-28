.class public Lf7/x;
.super Lf7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/x$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lf7/x$a;

.field private final c:J

.field private final d:Lf7/h0;


# direct methods
.method public constructor <init>(Lf7/x$a;Lf7/h0;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lf7/f;-><init>()V

    const-string v0, "rbx.game.callback"

    .line 2
    iput-object v0, p0, Lf7/x;->a:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Lf7/x;->b:Lf7/x$a;

    .line 4
    iput-wide p3, p0, Lf7/x;->c:J

    .line 5
    iput-object p2, p0, Lf7/x;->d:Lf7/h0;

    return-void
.end method

.method private s(I)I
    .locals 2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(Game failed to start) Unexpected errorId=["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "]."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.game.callback"

    invoke-static {v0, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    sget p1, Lcom/roblox/client/c0;->H3:I

    return p1

    .line 3
    :pswitch_0
    sget p1, Lcom/roblox/client/c0;->F3:I

    return p1

    .line 4
    :pswitch_1
    sget p1, Lcom/roblox/client/c0;->G3:I

    return p1

    .line 5
    :pswitch_2
    sget p1, Lcom/roblox/client/c0;->I3:I

    return p1

    .line 6
    :cond_0
    sget p1, Lcom/roblox/client/c0;->E3:I

    return p1

    .line 7
    :cond_1
    sget p1, Lcom/roblox/client/c0;->D3:I

    return p1

    .line 8
    :cond_2
    sget p1, Lcom/roblox/client/c0;->C3:I

    return p1

    .line 9
    :cond_3
    sget p1, Lcom/roblox/client/c0;->B3:I

    return p1

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exitGameWithError: errorID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game.callback"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-wide v0, p0, Lf7/x;->c:J

    const-string v2, "SessionReporterState_GameLoaded"

    invoke-static {v2, v0, v1}, Lq8/a;->b(Ljava/lang/String;J)V

    .line 3
    iget-object v0, p0, Lf7/x;->b:Lf7/x$a;

    invoke-direct {p0, p1}, Lf7/x;->s(I)I

    move-result p1

    invoke-interface {v0, p1}, Lf7/x$a;->d(I)V

    return-void
.end method

.method public b(J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameLoadedCallback() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game.callback"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/x;->b:Lf7/x$a;

    invoke-interface {v0, p1, p2}, Lf7/x$a;->h(J)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lf7/x;->b:Lf7/x$a;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lf7/x$a;->b(Z)V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDataModelNotification() type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " data:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game.callback"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "OPEN_CUSTOM_WEBVIEW"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 3
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "url"

    .line 4
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "URL must not be empty onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW"

    .line 6
    invoke-static {v1, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v0, "title"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "searchParams"

    .line 8
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 9
    iget-object v2, p0, Lf7/x;->b:Lf7/x$a;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-interface {v2, p2, v0, p1}, Lf7/x$a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p1, "Exception parsing data onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW"

    .line 10
    invoke-static {v1, p1}, Lc9/k;->j(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_2
    return-void
.end method

.method public j(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf7/x;->b:Lf7/x$a;

    invoke-interface {v0, p1, p2, p3}, Lf7/x$a;->j(JLjava/lang/String;)V

    return-void
.end method

.method public k(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf7/x;->b:Lf7/x$a;

    invoke-interface {v0, p1, p2, p3, p4}, Lf7/x$a;->k(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lf7/x;->b:Lf7/x$a;

    invoke-interface {v0, p1, p2, p3, p4}, Lf7/x$a;->c(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public n(I)V
    .locals 3

    const-string v0, "MaquettesDisableScreenRotation"

    .line 1
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeGetFFlag(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "rbx.game.orientation"

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roblox/client/p0;->m0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "screenOrientationChanged: ignoring screen orientation change request on Quest"

    .line 2
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v2, 0x3

    if-eq p1, v2, :cond_2

    const/4 v2, 0x4

    if-eq p1, v2, :cond_1

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "screenOrientationChanged: newOrientation ="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_USER"

    .line 4
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object p1, p0, Lf7/x;->b:Lf7/x$a;

    invoke-interface {p1, v0}, Lf7/x$a;->a(I)V

    goto :goto_0

    :cond_2
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_PORTRAIT"

    .line 6
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    iget-object p1, p0, Lf7/x;->b:Lf7/x$a;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lf7/x$a;->a(I)V

    goto :goto_0

    :cond_3
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE"

    .line 8
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-object p1, p0, Lf7/x;->b:Lf7/x$a;

    const/4 v0, 0x6

    invoke-interface {p1, v0}, Lf7/x$a;->a(I)V

    goto :goto_0

    :cond_4
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_LANDSCAPE"

    .line 10
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    iget-object p1, p0, Lf7/x;->b:Lf7/x$a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lf7/x$a;->a(I)V

    goto :goto_0

    :cond_5
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_REVERSE_LANDSCAPE"

    .line 12
    invoke-static {v1, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    iget-object p1, p0, Lf7/x;->b:Lf7/x$a;

    const/16 v0, 0x8

    invoke-interface {p1, v0}, Lf7/x$a;->a(I)V

    :goto_0
    return-void
.end method

.method public p()Lf7/h0;
    .locals 1

    iget-object v0, p0, Lf7/x;->d:Lf7/h0;

    return-object v0
.end method
