.class Ll7/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ll7/f;


# direct methods
.method private constructor <init>(Ll7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll7/f$b;->a:Ll7/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll7/f;Ll7/f$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll7/f$b;-><init>(Ll7/f;)V

    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "Settings"

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "SETTINGS_TAG"

    return-object p1

    :cond_0
    const-string v0, "Friends"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "FRIENDS_TAG"

    return-object p1

    :cond_1
    const-string v0, "Games"

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "GAMES_TAG"

    return-object p1

    :cond_2
    const-string v0, "Home"

    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "HOME_TAG"

    return-object p1

    :cond_3
    const-string v0, "Messages"

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, "MESSAGES_TAG"

    return-object p1

    :cond_4
    const-string v0, "Avatar"

    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p1, "AVATAR_EDITOR_TAG"

    return-object p1

    :cond_5
    const-string v0, "Abuse Report"

    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string p1, "ABUSE_REPORT_TAG"

    return-object p1

    :cond_6
    const-string v0, "Friend Finder"

    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string p1, "FRIEND_FINDER_TAG"

    return-object p1

    :cond_7
    const-string v0, "Universal Friends"

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string p1, "UNIVERSAL_FRIENDS_TAG"

    return-object p1

    :cond_8
    const-string v0, "GameDetails"

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string p1, "GAME_DETAILS_TAG"

    return-object p1

    :cond_9
    const-string v0, "CaptchaSuccess"

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string p1, "CAPTCHA_SUCCESS_TAG"

    return-object p1

    :cond_a
    const-string v0, "CaptchaShown"

    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    const-string p1, "CAPTCHA_SHOWN_TAG"

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, "params"

    .line 2
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "feature"

    .line 3
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "urlPath"

    .line 4
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v2, v1

    goto :goto_0

    :cond_1
    move-object v0, v1

    move-object v2, v0

    :goto_0
    move-object v3, v2

    .line 5
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Navigation"

    invoke-static {v5, v4}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    .line 6
    invoke-direct {p0, v2}, Ll7/f$b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 7
    new-instance v4, La7/i;

    invoke-direct {v4, v2}, La7/i;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v4, v3}, La7/i;->i(Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v4, v0}, La7/i;->h(Lorg/json/JSONObject;)V

    .line 10
    :cond_2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lbc/c;->j(Ljava/lang/Object;)V

    const/4 v4, 0x1

    .line 11
    :cond_3
    invoke-virtual {p1, v4, v1}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
