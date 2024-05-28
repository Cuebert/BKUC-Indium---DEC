.class public Lcom/roblox/client/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "notificationType"

    invoke-direct {v1, v2, p0}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance p0, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v1, "notificationId"

    invoke-direct {p0, v1, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance p0, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p1, "version"

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Ln6/c;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ln6/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ln6/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ln6/c;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Ln6/c;->g(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/roblox/client/f0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ln6/c;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ln6/c;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p3, p2}, Ln6/c;->k(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ln6/c;->j(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "type"

    invoke-direct {v1, v2, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p1, "logout"

    .line 3
    invoke-static {p0, p1, v0}, Lcom/roblox/client/f0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static m(I)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const-string v2, "property"

    invoke-direct {v1, v2, p0}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p0, "nsOpenContent"

    const-string v1, "touch"

    .line 3
    invoke-static {p0, v1, v0}, Lcom/roblox/client/f0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static n(Ljava/lang/String;Z)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ln6/c;->l(Ljava/lang/String;Z)V

    return-void
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/roblox/client/f0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    .line 2
    new-instance p1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p2, "url"

    invoke-direct {p1, p2, p3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p1, "pushNotificationAction"

    const-string p2, "deepLink"

    .line 3
    invoke-static {p1, p2, p0}, Lcom/roblox/client/f0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 4
    invoke-static {}, Lcom/roblox/client/f0;->y()V

    return-void
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p2, p3, p7}, Lcom/roblox/client/f0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    .line 2
    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p7, "actionTaken"

    invoke-direct {p3, p7, p4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p4, "clientState"

    invoke-direct {p3, p4, p5}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    if-eqz p6, :cond_0

    const-string p4, "true"

    goto :goto_0

    :cond_0
    const-string p4, "false"

    :goto_0
    const-string p5, "openedClient"

    invoke-direct {p3, p5, p4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p4, "platformType"

    invoke-direct {p3, p4, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->g0()Z

    move-result p1

    const-string p3, "pushNotificationInteracted"

    if-eqz p1, :cond_1

    .line 7
    invoke-static {p3, p0, p2}, Lcom/roblox/engine/jni/NativeReportingInterface;->pushNotificationInteracted(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 8
    :cond_1
    invoke-static {p3, p0, p2}, Lcom/roblox/client/f0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 9
    invoke-static {}, Lcom/roblox/client/f0;->y()V

    :goto_1
    return-void
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 8

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-static/range {v0 .. v7}, Lcom/roblox/client/f0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public static r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v5, "0"

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-static/range {v0 .. v6}, Lcom/roblox/client/f0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/roblox/client/datastructures/NameValuePair;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p2, p3, p5}, Lcom/roblox/client/f0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    .line 2
    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p5, "clientState"

    invoke-direct {p3, p5, p4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance p3, Lcom/roblox/client/datastructures/NameValuePair;

    const-string p4, "platformType"

    invoke-direct {p3, p4, p1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-interface {p2, p6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const-string p1, "pushNotificationReceived"

    .line 5
    invoke-static {p1, p0, p2}, Lcom/roblox/client/f0;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 6
    invoke-static {}, Lcom/roblox/client/f0;->y()V

    return-void
.end method

.method public static t(Ljava/lang/String;)V
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "splash"

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/roblox/client/f0;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fireScreenLoaded() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.eventstream"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    sput-object p0, Lcom/roblox/client/f0;->a:Ljava/lang/String;

    .line 5
    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Ln6/c;->m(Ljava/lang/String;)V

    return-void
.end method

.method public static u(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ln6/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/roblox/client/f0;->y()V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ln6/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/roblox/client/f0;->y()V

    return-void
.end method

.method public static w(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Ln6/c;->p(Ljava/lang/String;)V

    return-void
.end method

.method public static x()V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0}, Ln6/c;->q()V

    return-void
.end method

.method public static y()V
    .locals 1

    invoke-static {}, Ln6/c;->s()Ln6/c;

    move-result-object v0

    invoke-virtual {v0}, Ln6/c;->u()V

    return-void
.end method
