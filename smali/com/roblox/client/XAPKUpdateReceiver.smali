.class public Lcom/roblox/client/XAPKUpdateReceiver;
.super Lcom/roblox/client/l0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/l0;-><init>()V

    return-void
.end method

.method public static synthetic a(I)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/XAPKUpdateReceiver;->b(I)V

    return-void
.end method

.method private static synthetic b(I)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "Assets have been updated with status code %d"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "rbx.xapkmanager"

    invoke-static {v0, p0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/roblox/client/l0;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    const-string v0, "rbx.xapkmanager"

    const-string v1, "Unpack after update is enabled."

    .line 2
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v1, "android.intent.action.MY_PACKAGE_REPLACED"

    .line 4
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p2, "Roblox app has been updated"

    .line 5
    invoke-static {v0, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-static {}, Lf9/g;->i()Lf9/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lf9/g;->p(Landroid/content/Context;)V

    .line 7
    sget-object p1, Lcom/roblox/client/e1;->a:Lcom/roblox/client/e1;

    invoke-static {p1}, Lz6/a;->b(Lz6/a$a;)Lcom/roblox/client/components/k;

    move-result-object p1

    .line 8
    invoke-interface {p1}, Lcom/roblox/client/components/k;->a()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, p1, v1

    const-string p2, "Unauthorized intent action %s has triggered APK updater receiver"

    .line 9
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lc9/k;->c(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
