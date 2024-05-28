.class public Lb7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field private b:Lb7/c;

.field private c:I


# direct methods
.method public constructor <init>(Lb7/c;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.appshell"

    .line 2
    iput-object v0, p0, Lb7/a;->a:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Lb7/a;->b:Lb7/c;

    .line 4
    iput p2, p0, Lb7/a;->c:I

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 1

    const-class v0, Lb7/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Lh9/c;
    .locals 1

    new-instance v0, Lh9/d;

    invoke-direct {v0, p1}, Lh9/d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected b(J)Lh9/b;
    .locals 3

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance p2, Lh9/b;

    const-string v0, "AppShellNotifications"

    const-string v1, "StartConversationWithId"

    const-string v2, "Chat"

    invoke-direct {p2, v0, p1, v1, v2}, Lh9/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method protected c(J)Lh9/b;
    .locals 3

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance p2, Lh9/b;

    const-string v0, "AppShellNotifications"

    const-string v1, "StartConversationWithUserId"

    const-string v2, "Chat"

    invoke-direct {p2, v0, p1, v1, v2}, Lh9/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public d()Lcom/roblox/client/game/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/a;->b:Lb7/c;

    invoke-direct {p0}, Lb7/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lb7/c;->Z(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/roblox/client/game/a;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/roblox/client/game/a;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Z
    .locals 1

    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/b;->r()V

    const/4 v0, 0x1

    return v0
.end method

.method public g(Lcom/roblox/client/feature/FeatureState;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb7/a;->d()Lcom/roblox/client/game/a;

    move-result-object v0

    const-string v1, "rbx.appshell"

    if-nez v0, :cond_0

    const-string v0, "onShow: Create a GL fragment for LuaApp..."

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Lcom/roblox/client/game/a;

    invoke-direct {v0}, Lcom/roblox/client/game/a;-><init>()V

    .line 4
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onShow: ... state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", IsLoggedIn = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v3

    invoke-virtual {v3}, Lx7/g;->f()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v1, v2}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v1

    invoke-virtual {v1}, Lx7/g;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p0, p1}, Lb7/a;->i(Lcom/roblox/client/feature/FeatureState;)V

    .line 9
    :cond_1
    iget-object p1, p0, Lb7/a;->b:Lb7/c;

    iget v1, p0, Lb7/a;->c:I

    invoke-direct {p0}, Lb7/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v0, v2}, Lb7/c;->y(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    return-void
.end method

.method protected h(Lh9/c;)V
    .locals 1

    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/client/game/b;->A(Lh9/c;)V

    return-void
.end method

.method protected i(Lcom/roblox/client/feature/FeatureState;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CHAT_TAG"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "rbx.appshell"

    if-eqz v0, :cond_1

    const-string v0, "sendAppEvents() start chat"

    .line 2
    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Chat"

    .line 3
    invoke-virtual {p0, v0}, Lb7/a;->a(Ljava/lang/String;)Lh9/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb7/a;->h(Lh9/c;)V

    const-string v0, "USER_ID_EXTRA"

    const-wide/16 v2, -0x1

    .line 4
    invoke-virtual {p1, v0, v2, v3}, Lcom/roblox/client/feature/FeatureState;->b(Ljava/lang/String;J)J

    move-result-wide v4

    const-string v0, "CHAT_CONVERSATION_ID"

    .line 5
    invoke-virtual {p1, v0, v2, v3}, Lcom/roblox/client/feature/FeatureState;->b(Ljava/lang/String;J)J

    move-result-wide v6

    cmp-long p1, v4, v2

    if-eqz p1, :cond_0

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "sendAppEvents() userId:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-virtual {p0, v4, v5}, Lb7/a;->c(J)Lh9/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb7/a;->j(Lh9/b;)V

    goto :goto_0

    :cond_0
    cmp-long p1, v6, v2

    if-eqz p1, :cond_4

    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "sendAppEvents() conversationId:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    invoke-virtual {p0, v6, v7}, Lb7/a;->b(J)Lh9/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb7/a;->j(Lh9/b;)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->c()Ljava/lang/String;

    move-result-object v0

    const-string v2, "AVATAR_EDITOR_TAG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "sendAppEvents() start avatar"

    .line 11
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "AvatarEditor"

    .line 12
    invoke-virtual {p0, p1}, Lb7/a;->a(Ljava/lang/String;)Lh9/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb7/a;->h(Lh9/c;)V

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->c()Ljava/lang/String;

    move-result-object v0

    const-string v2, "HOME_TAG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "sendAppEvents() start home"

    .line 14
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Home"

    .line 15
    invoke-virtual {p0, p1}, Lb7/a;->a(Ljava/lang/String;)Lh9/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb7/a;->h(Lh9/c;)V

    goto :goto_0

    .line 16
    :cond_3
    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->c()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GAMES_TAG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "sendAppEvents() start games"

    .line 17
    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Games"

    .line 18
    invoke-virtual {p0, p1}, Lb7/a;->a(Ljava/lang/String;)Lh9/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb7/a;->h(Lh9/c;)V

    :cond_4
    :goto_0
    return-void
.end method

.method protected j(Lh9/b;)V
    .locals 1

    invoke-static {}, Lcom/roblox/client/game/b;->i()Lcom/roblox/client/game/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/client/game/b;->C(Lh9/b;)V

    return-void
.end method
